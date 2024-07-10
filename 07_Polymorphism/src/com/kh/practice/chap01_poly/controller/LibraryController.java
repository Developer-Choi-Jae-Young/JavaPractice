package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return this.mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] returnList = new Book[5];
		int count = 0; 
		
		for(Book book : bList) {
			if(book.getTitle().contains(keyword)) {
				returnList[count++] = book;
			}
		}
		return returnList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result = 1;	
			} 
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		
		return result;
	}
}