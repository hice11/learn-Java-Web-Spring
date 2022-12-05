package com.acorn.prj5.di3;

import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayList extends ArrayList<Score> {
	
	Comparator<Score> comparator;
	
	public MyArrayList() {
		// TODO Auto-generated constructor stub
	}
	public MyArrayList(Comparator<Score> comparator) {
		super();
		this.comparator = comparator;
	}

	public void setComparator(Comparator<Score> comparator) {
		this.comparator = comparator;
	}
	
	public void sortScore() {
		// TODO Auto-generated method stub
		sort(comparator);
	}
	
}
