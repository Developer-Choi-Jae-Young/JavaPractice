package com.kh.practice.list.library.controller;

import java.util.Comparator;
import com.kh.practice.list.library.model.vo.Book;

public class CompareImpl implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
