package com.sangeet.StringFunctions;

public class ConcatString {

	public static void main(String[] args) {
		ConcatString obj = new ConcatString();
		String firstarg = args[0];
		
		if ("largest".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			String secondnumber = args[2];
			String thirdnumber = args[3];

			obj.largestnumber(Integer.parseInt(firstnumber), Integer.parseInt(secondnumber),
					Integer.parseInt(thirdnumber));

		}

		else if ("reverse".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			
			obj.reversenumber(firstnumber);

		}
		
		
	}

	private void largestnumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is largest");

		}

		else if (b > a && b > c) {
			System.out.println(b + "is largest");
		} else if (c > a && c > b) {
			System.out.println(c + "is largest");
		}
	}

	private void reversenumber(String a) {
		int d=a.length();
		for (int i=1;i <= d;i++)  {
		
		int	c=Integer.parseInt(a);
			
		int b = c%10;
		
		System.out.print(b);
		c=(c-b)/10;
		a=c+"";
		
		}
		}
			
		
	}
