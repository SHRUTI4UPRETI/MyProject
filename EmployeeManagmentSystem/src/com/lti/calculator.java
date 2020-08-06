package com.lti;

public class calculator {
	public static int add(int a, int b){
		int Sum =0;
	    Sum = a+b;
	    return Sum;
	  }
	public static int sub(int a, int b){
		int dif =0;
	    dif = a-b;
	    return dif;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(add(3,5));
		System.out.print(sub(30,5));
	}

}
