package com.kh.practice.file.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f = new File("./resources", file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) throws FileNotFoundException, IOException {
		BufferedOutputStream dos = new BufferedOutputStream(new FileOutputStream(new File("./resources", file)));
		dos.write(s.getBytes());
		dos.flush();
		dos.close();
	} 
	
	public StringBuilder fileOpen(String file) throws FileNotFoundException, IOException {
		BufferedInputStream dis = new BufferedInputStream(new FileInputStream(new File("./resources", file)));
		StringBuilder sb = new StringBuilder();
		byte[] data = new byte[9999];
		int len = 0;
		
		len = dis.read(data);
		sb.append(new String(data, 0, len));

		dis.close();
		
		return sb;
	}
	
	public void fileEdit(String file, String s) throws FileNotFoundException, IOException {
		/*
		BufferedInputStream dis = new BufferedInputStream(new FileInputStream(new File("./resources", file)));
		StringBuilder sb = new StringBuilder();
		byte[] data = new byte[9999];
		int len = 0;
		
		len = dis.read(data);
		sb.append(new String(data, 0, len));
		sb.append(s);
		*/
		BufferedOutputStream dos = new BufferedOutputStream(new FileOutputStream(new File("./resources", file), true));
		//dos.write(sb.toString().getBytes());
		dos.write(s.getBytes());
		dos.flush();
		
		dos.close();
		//dis.close();
	}
}
