package com.acorn.ch;

public class ChCalculator {

	public int addCh(int su1, int su2){
		return su1+su2;
	}
	
	public int subCh(int su1, int su2){
		if(su1>=su2) 
			return su1-su2;
		else 
			return su2-su1;
	}
	
	public int multiCh(int su1, int su2) {
		return su1 * su2;
	}
	
	public double divideCh(int su1, int su2) {
		return su1 / (double)su2;
	}
	
	
	//static
	public static int add(int su1, int su2){
		return su1+su2;
	}
	
	public static int sub(int su1, int su2){
		if(su1>=su2) 
			return su1-su2;
		else 
			return su2-su1;
	}
	
	public static int multi(int su1, int su2) {
		return su1 * su2;
	}
	
	public static double divide(int su1, int su2) {
		return su1 / (double)su2;
	}
	
	
}
