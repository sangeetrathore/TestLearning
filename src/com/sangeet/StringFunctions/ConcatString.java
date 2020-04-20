package com.sangeet.StringFunctions;

public class ConcatString {

		public static void main(String[] args) {
		
			System.out.println("enter term 'largest' and then three numbers  to get the largest number"
			+"\n"+"enter term 'reverse' and then enter number which you want to reverse "
			+"\n"+"enter term 'smallest' and then three numbers  to get the smallest number"
			+"\n"+"enter term 'table' and then number  to get the table of that number"
			+"\n"+"enter term 'areacode' and then number  to get the name of state of that state code");
			
			ConcatString obj = new ConcatString();
		String firstarg = args[0];
		
		if ("largest".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			String secondnumber = args[2];
			String thirdnumber = args[3];

			obj.largestnumber(Integer.parseInt(firstnumber), Integer.parseInt(secondnumber),
					Integer.parseInt(thirdnumber));

		}

		else if ("smallest".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			String secondnumber = args[2];
			String thirdnumber = args[3];

			obj.smallestnumber(Integer.parseInt(firstnumber), Integer.parseInt(secondnumber),
					Integer.parseInt(thirdnumber));

		}

		else if ("reverse".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			
			obj.reversenumber(firstnumber);

		}
		
		else if ("table".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			obj.table(Integer.parseInt(firstnumber));

		}

		else if ("areacode".equalsIgnoreCase(firstarg)) {
			String firstnumber = args[1];
			obj.areacode(Integer.parseInt(firstnumber));

		}

		else {
			
			System.out.println("Enter valid argument");	}	
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
		else {System.out.println("numbers are equal");};
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
		
	private void smallestnumber(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println(a + " is smallest");
		}
    	else if (b < c && b < a ) {
			System.out.println(b + "is smallest");
		} else if (c < a && c < b) {
			System.out.println(c + "is smallest");
		}
		else {System.out.println("numbers are equal");
		}
		
	}

	private void table(int a) {

		for (int i=1;i <= 10;i++)  {
		
System.out.println(a+ "  multiplied by  "+i+ "  is  =>  " +a*i);
	
		}
		}
	
	private void areacode(int a) {
		
		if (a==205||a== 251||a==256||a==334||a==938){
			System.out.println("state of given state area code is Alabama ");
		}
		else if (a==907){
			System.out.println("state of given state area code is Alaska ");
		}
		else if (a==480||a==520||a==602||a==623||a==928){
			System.out.println("state of given state area code is Arizona ");}
	

		else if (a==479||a==501||a==870){
				System.out.println("state of given state area code is Arkansas ");}
		
		else if (a==209||a==213||a==279||a==310||a==323||a==408||a==415||a==424||a==442||a==510||a==530||a==559||a==562||a==619||a==626||a==628||a==650||a==657||a==661||a==669||a==707||a==714||a==747||a==760||a==805||a==818||a==820||a==831||a==858||a==909||a==916||a==925||a==949||a==951){
			System.out.println("state of given state area code is California ");}
	
		else if (a==303||a==719||a==720||a==970){
			System.out.println("state of given state area code is Colorado ");}
	
		else if (a==203||a==475||a==860||a==959){
			System.out.println("state of given state area code is Connecticut ");}
		
		else if (a==302){
			System.out.println("state of given state area code is Delaware ");}
		
		else if (a==239||a==305||a==321||a==352||a==386||a==407||a==561||a==727||a==754||a==772||a==786||a==813||a==850||a==863||a==904||a==941||a==954){
			System.out.println("state of given state area code is Florida ");}
		
		else if (a==229||a==404||a==470||a==478||a==678||a==706||a==762||a==770||a==912){
			System.out.println("state of given state area code is Georgia ");}
		
		else if (a==808){
			System.out.println("state of given state area code is Hawaii ");}
		
		else if (a==208||a==986){
			System.out.println("state of given state area code is Idaho ");}
		
		else if (a==217||a==224||a==309||a==312||a==331||a==618||a==630||a==708||a==773||a==779||a==815||a==847||a==872){
			System.out.println("state of given state area code is Illinois ");}
		
		else if (a==219||a==260||a==317||a==463||a==574||a==765||a==812||a==930){
			System.out.println("state of given state area code is Indiana ");}
		
		else if (a==319||a==515||a==563||a==641||a==712){
			System.out.println("state of given state area code is Iowa ");}
		
		else if (a==316||a==620||a==785||a==913){
			System.out.println("state of given state area code is Kansas ");}
		
		else if (a==270||a==364||a==502||a==606||a==859){
			System.out.println("state of given state area code is Kentucky ");}
		
		else if (a==225||a==318||a==337||a==504||a==985){
			System.out.println("state of given state area code is Louisiana ");}
		
		else if (a==207){
			System.out.println("state of given state area code is Maine ");}
		
		else if (a==240||a==301||a==410||a==443||a==667){
			System.out.println("state of given state area code is Maryland ");}
		
		else if (a==339||a==351||a==413||a==508||a==617||a==774||a==781||a==857||a==978){
			System.out.println("state of given state area code is Massachusetts ");}
		
		else if (a==231||a==248||a==269||a==313||a==517||a==586||a==616||a==734||a==810||a==906||a==947||a==989){
			System.out.println("state of given state area code is Michigan ");}
		
		else if (a==218||a==320||a==507||a==612||a==651||a==763||a==952){
			System.out.println("state of given state area code is Minnesota ");}
		
		else if (a==228||a==601||a==662||a==769){
			System.out.println("state of given state area code is Mississippi ");}
		
		else if (a==314||a==417||a==573||a==636||a==660||a==816){
			System.out.println("state of given state area code is Missouri ");}
		
		else if (a==406){
			System.out.println("state of given state area code is Montana ");}
		
		else if (a==308||a==402||a==531){
			System.out.println("state of given state area code is Nebraska ");}
		
		else if (a==702||a==725||a==775){
			System.out.println("state of given state area code is Nevada ");}
		
		else if (a==603){
			System.out.println("state of given state area code is New Hampshire ");}
		
		else if (a==201||a==551||a==609||a==640||a==732||a==848||a==856||a==862||a==908||a==973){
			System.out.println("state of given state area code is New Jersey ");}
		
		else if (a==505||a==575){
			System.out.println("state of given state area code is New Mexico ");}
		
		else if (a==212||a==315||a==332||a==347||a==516||a==518||a==585||a==607||a==631||a==646||a==680||a==716||a==718||a==838||a==845||a==914||a==917||a==929||a==934){
			System.out.println("state of given state area code is New York ");}
		
		else if (a==252||a==336||a==704||a==743||a==828||a==910||a==919||a==980||a==984){
			System.out.println("state of given state area code is North Carolina ");}
		
		else if (a==701){
			System.out.println("state of given state area code is North Dakota ");}
	
		else if (a==216||a==220||a==234||a==330||a==380||a==419||a==440||a==513||a==567||a==614||a==740||a==937){
			System.out.println("state of given state area code is Ohio"); }
		
		else if (a==405||a==539||a==580||a==918){
			System.out.println("state of given state area code is Oklahoma ");}
		
		else if (a==458||a==503||a==541||a==971){
			System.out.println("state of given state area code is Oregon ");}
		
		else if (a==215||a==223||a==267||a==272||a==412||a==445||a==484||a==570||a==610||a==717||a==724||a==814||a==878){
			System.out.println("state of given state area code is Pennsylvania ");}
		
		else if (a==401){
			System.out.println("state of given state area code is Rhode Island ");}
		
		
		else if (a==803||a==843||a==854||a==864){
			System.out.println("state of given state area code is South Carolina ");}
		
		else if (a==605){
			System.out.println("state of given state area code is South Dakota ");}
		
		else if (a==423||a==615||a==629||a==731||a==865||a==901||a==931){
			System.out.println("state of given state area code is Tennessee ");}
		
		else if (a==210||a==214||a==254||a==281||a==325||a==346||a==361||a==409||a==430||a==432||a==469||a==512||a==682||a==713||a==726||a==737||a==806||a==817||a==830||a==832||a==903||a==915||a==936||a==940||a==956||a==972||a==979){
			System.out.println("state of given state area code is Texas ");}
		
		else if (a==385||a==435||a==801){
			System.out.println("state of given state area code is Utah ");}
		
		else if (a==802){
			System.out.println("state of given state area code is Vermont ");}
		
		else if (a==276||a==434||a==540||a==571||a==703||a==757||a==804){
			System.out.println("state of given state area code is Virginia ");}
		
		else if (a==206||a==253||a==360||a==425||a==509||a==564){
			System.out.println("state of given state area code is Washington ");}
		
		else if (a==202){
			System.out.println("state of given state area code is Washington, DC ");}
		
		else if (a==304||a==681){
			System.out.println("state of given state area code is West Virginia ");}
		
		else if (a==262||a==414||a==534||a==608||a==715||a==920){
			System.out.println("state of given state area code is Wisconsin	 ");}
		
		else if (a==307){
			System.out.println("state of given state area code is Wyoming ");}
		
		else if (a==684){
			System.out.println("state of given state area code is American Samoa ");}
		
		else if (a==671){
			System.out.println("state of given state area code is Guam	 ");}
		
		else if (a==670){
			System.out.println("state of given state area code is Northern Mariana Islands ");}
		
		else if (a==787||a==939){
			System.out.println("state of given state area code is Puerto Rico	 ");}
		
		else if (a==671){
			System.out.println("state of given state area code is Guam	 ");}
		
		else if (a==340){
			System.out.println("state of given state area code is Virgin Islands	 ");}
		
		else {
			System.out.println("Enter valid state area code");}
		
		
	}
}
	
