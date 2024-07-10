package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO03_CopyOfBufferd {

	public static void main(String[] args) {
		File src = new File("./resources/src.txt");
		File dst = new File("./resources/dst.txt");
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] data = new byte[1024];
		int len = 0;
		int total  = 0;
		
		try {
			bis = new BufferedInputStream( new FileInputStream(src) );
			bos = new BufferedOutputStream( new FileOutputStream(dst) );
			
			while((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
				bos.flush();
				
				total += len;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) bos.close();
				if(bis != null) bis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("√—±Ê¿Ã : " + total);
	}
}
