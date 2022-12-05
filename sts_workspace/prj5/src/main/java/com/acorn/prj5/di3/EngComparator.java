package com.acorn.prj5.di3;

import java.util.Comparator;

public class EngComparator implements Comparator<Score> {

	@Override
	public int compare(Score o1, Score o2) {
		// TODO Auto-generated method stub
		return o1.eng - o2.eng;
	}

}
