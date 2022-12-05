package com.acorn.prj5.di3;

import java.util.Comparator;

public class KorComparator implements Comparator<Score> {

	@Override
	public int compare(Score o1, Score o2) {
		// TODO Auto-generated method stub
		return o1.kor - o2.kor;
	}

}
