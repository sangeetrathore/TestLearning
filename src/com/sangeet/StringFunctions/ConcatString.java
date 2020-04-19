package com.sangeet.StringFunctions;

public class ConcatString {
	
public static void main(String[] args)
{
	ConcatString obj = new ConcatString();
	String firstarg = args[0];
if ("largest".equalsIgnoreCase(firstarg)) {	
	String firstnumber = args[1];
	String secondnumber = args[2];
	String thirdnumber = args[3];

obj.largestnumber(Integer.parseInt(firstnumber),Integer.parseInt(secondnumber),Integer.parseInt(thirdnumber));


}

}	
	



private void largestnumber(int a ,int b, int c) {
	if (a>b && a>c) {
		System.out.println(a+ " is largest");
	
	}
	
		else if (b>a && b>c){
			System.out.println(b+"is largest");
		}
		else if (c>a && c>b){
			System.out.println(c+"is largest");
		}
	}
	
}