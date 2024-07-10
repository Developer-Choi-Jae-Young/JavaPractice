package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList<>();

	public BookController() {
		list.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		list.add(new Book("���� ���� �˰�����", "������", "��Ÿ", 15000));
		list.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		list.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));

	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>)list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> arrayList = new ArrayList<Book>();
		
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				arrayList.add(b);
			}
		}
		
		return arrayList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		int count = 0;
		for(Book b : list) {
			if(b.getAuthor().equals(author) && b.getTitle().equals(title)) {
				removeBook = new Book(b.getTitle(), b.getAuthor(), b.getCategory(), b.getPrice());
				break;
			}
			count++;
		}
		
		list.remove(count);
		
		return removeBook;
	}
	
	public int ascBook() {
		int returnValue = 1;
		Collections.sort(list);
		
		//list.sort(new CompareImpl());
		
		//list.sort(Book::compareTo);
		
		/*
		list.sort(new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		*/
		return returnValue;
	}
	
}