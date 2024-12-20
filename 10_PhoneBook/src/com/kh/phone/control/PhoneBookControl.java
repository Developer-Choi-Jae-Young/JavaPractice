package com.kh.phone.control;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.phone.model.vo.PhoneBook;

public class PhoneBookControl {
	public static final String FILE_NAME = "PhoneBook.txt"; 
	private static final String FILE_PATH = "./resources";
	private static final int MAX_NUM = 100;
	private PhoneBook[] pbList = new PhoneBook[MAX_NUM];
	private int currentPhoneListCount = 0;
	
	public void updatePhoneName(int index, String Name) {
		pbList[index].setName(Name);
		wrtieFile(FILE_NAME, pbList);
	}
	
	public void updatePhoneInfo(int index, String Phone) {
		pbList[index].setPhone(Phone);
		wrtieFile(FILE_NAME, pbList);
	}
	
	public void updatePhoneBelong(int index, String Belong) {
		pbList[index].setBelong(Belong);
		wrtieFile(FILE_NAME, pbList);
	}
	
	public void updatePhoneEmail(int index, String Email) {
		pbList[index].setEmail(Email);
		wrtieFile(FILE_NAME, pbList);
	}
	
	public void updatePhoneMemo(int index, String Memo) {
		pbList[index].setMemo(Memo);
		wrtieFile(FILE_NAME, pbList);
	}

	public void deletePhone(int index) {
		for(int i = index; i < currentPhoneListCount; i++) {
			pbList[i] = pbList[i + 1]; 
		}
		
		currentPhoneListCount =  currentPhoneListCount - 1 < 0 ? currentPhoneListCount : currentPhoneListCount--;
		wrtieFile(FILE_NAME, pbList);
	}

	public void makeFile(String fileName) {
		File f = new File(FILE_PATH, fileName);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public PhoneBook[] readFile(String fileName) {
		int count = 0;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream( new File(FILE_PATH, fileName)));		
			
			while(true) {
				PhoneBook pb = (PhoneBook)ois.readObject();
				pbList[count++] = pb;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException e) {
			//file read is end
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		currentPhoneListCount = count;
		return pbList;
	}

	public void wrtieFile(String fileName, PhoneBook[] phoneBook) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream( new File(FILE_PATH, fileName)));		
			
			for(PhoneBook pb : phoneBook) {		
				if(pb != null) {
					oos.writeObject(pb);
					oos.flush();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		currentPhoneListCount = currentPhoneListCount + 1 > MAX_NUM ? currentPhoneListCount : currentPhoneListCount++;
	}
	
	public int getCurrentPhoneListCount() {
		return this.currentPhoneListCount; 
	}
}
