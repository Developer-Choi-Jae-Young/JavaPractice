package com.kh.practice.file.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) throws FileNotFoundException, IOException {
		fd.fileSave(file, sb.toString());
	}
	
	public StringBuilder fileOpen(String file) throws FileNotFoundException, IOException {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) throws FileNotFoundException, IOException {
		fd.fileEdit(file, sb.toString());
	}
}
