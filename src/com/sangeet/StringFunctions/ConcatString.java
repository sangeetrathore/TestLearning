package com.sangeet.StringFunctions;
import java.util.*;
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
			HashMap hm=new HashMap();
			hm=obj.stateDataFid(hm);
			//obj.findState(hm,Integer.parseInt(firstnumber));
			System.out.println("State name is : "+obj.findState(hm,Integer.parseInt(firstnumber)));	
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
	
	
	private HashMap stateDataFid(HashMap hm)
	{
		int AlabamaPin[]		={205, 251, 256, 334, 938};
		int ArizonaPin	[]		={480, 520, 602, 623, 928,123};
		int AlaskaPin[]			=	{907};
		int ArkansasPin[]		={	479, 501, 870};
		int CaliforniaPin[]		={	209, 213, 279, 310, 323, 408, 415, 424, 442, 510, 530, 559, 562, 619, 626, 628, 650, 657, 661, 669, 707, 714, 747, 760, 805, 818, 820, 831, 858, 909, 916, 925, 949, 951};
		int ColoradoPin[]		={	303, 719, 720, 970};
		int ConnecticutPin[]	={	203, 475, 860, 959};
		int DelawarePin[]		={	302};
		int FloridaPin[]		={	239, 305, 321, 352, 386, 407, 561, 727, 754, 772, 786, 813, 850, 863, 904, 941, 954};
		int GeorgiaPin[]		={	229, 404, 470, 478, 678, 706, 762, 770, 912};
		int HawaiiPin[]			={	808};
		int IdahoPin[]			={	208, 986};
		int IllinoisPin[]		={	217, 224, 309, 312, 331, 618, 630, 708, 773, 779, 815, 847, 872};
		int IndianaPin[]		={	219, 260, 317, 463, 574, 765, 812, 930};
		int IowaPin[]			={	319, 515, 563, 641, 712};
		int KansasPin[]			={	316, 620, 785, 913};
		int KentuckyPin[]		={	270, 364, 502, 606, 859};
		int LouisianaPin[]		={	225, 318, 337, 504, 985};
		int MainePin[]			={	207};
		int MarylandPin[]		={	240, 301, 410, 443, 667};
		int MassachusettsPin[]	={	339, 351, 413, 508, 617, 774, 781, 857, 978};
		int MichiganPin[]		={	231, 248, 269, 313, 517, 586, 616, 734, 810, 906, 947, 989};
		int MinnesotaPin[]		={	218, 320, 507, 612, 651, 763, 952};
		int MississippiPin[]	={	228, 601, 662, 769};
		int MissouriPin[]		={	314, 417, 573, 636, 660, 816};
		int MontanaPin[]		={	406};
		int NebraskaPin[]		={	308, 402, 531};
		int NevadaPin[]			={	702, 725, 775};
		int NewHampshirePin[]	={	603};
		int NewJerseyPin[]		={	201, 551, 609, 640, 732, 848, 856, 862, 908, 973};
		int NewMexicoPin[]		={	505, 575};
		int NewYorkPin[]		={	212, 315, 332, 347, 516, 518, 585, 607, 631, 646, 680, 716, 718, 838, 845, 914, 917, 929, 934};
		int NorthCarolinaPin[]	={	252, 336, 704, 743, 828, 910, 919, 980, 984};
		int NorthDakotaPin[]	={	701};
		int OhioPin[]			={	216, 220, 234, 330, 380, 419, 440, 513, 567, 614, 740, 937};
		int OklahomaPin[]		={	405, 539, 580, 918};
		int OregonPin[]			={	458, 503, 541, 971};
		int PennsylvaniaPin[]	={	215, 223, 267, 272, 412, 445, 484, 570, 610, 717, 724, 814, 878};
		int RhodeIslandPin[]	={	401};
		int SouthCarolinaPin[]	={	803, 843, 854, 864};
		int SouthDakotaPin[]	={	605};
		int TennesseePin[]		={	423, 615, 629, 731, 865, 901, 931};
		int TexasPin[]			={	210, 214, 254, 281, 325, 346, 361, 409, 430, 432, 469, 512, 682, 713, 726, 737, 806, 817, 830, 832, 903, 915, 936, 940, 956, 972, 979};
		int UtahPin[]			={	385, 435, 801};
		int VermontPin[]		={	802};
		int VirginiaPin[]		={	276, 434, 540, 571, 703, 757, 804};
		int WashingtonPin[]		={	206, 253, 360, 425, 509, 564};
		int WashingtonDCPin[]	={	202};
		int WestVirginiaPin[]	={	304, 681};
		int WisconsinPin[]		={	262, 414, 534, 608, 715, 920};
		int WyomingPin[]		={	307};
		int AmericanSamoaPin[]	={	684};
		int GuamPin[]			={	671};
		int NorthernMarianaIslandsPin[]={	670};
		int PuertoRicoPin[]		={	787, 939};
		int VirginIslandsPin[]	={	340};
		hm.put("Alabama",AlabamaPin);
		hm.put("Arizona",ArizonaPin);
		hm.put("Alaska",AlaskaPin);
		hm.put("Arkansas",ArkansasPin);
		hm.put("California",CaliforniaPin);
		hm.put("Colorado",ColoradoPin);
		hm.put("Connecticut",ConnecticutPin);
		hm.put("Delaware",DelawarePin);
		hm.put("Florida",FloridaPin);
		hm.put("Georgia",GeorgiaPin);
		hm.put("Hawaii",HawaiiPin);
		hm.put("Idaho",IdahoPin);
		hm.put("Illinois",IllinoisPin);
		hm.put("Indiana",IndianaPin);
		hm.put("Iowa",IowaPin);
		hm.put("Kansas",KansasPin);
		hm.put("Kentucky",KentuckyPin);
		hm.put("Louisiana",LouisianaPin);
		hm.put("Maine",MainePin);
		hm.put("Maryland",MarylandPin);
		hm.put("Massachusetts",MassachusettsPin);
		hm.put("Michigan",MichiganPin);
		hm.put("Minnesota",MinnesotaPin);
		hm.put("Mississippi",MississippiPin);
		hm.put("Missouri",MissouriPin);
		hm.put("Montana",MontanaPin);
		hm.put("Nebraska",NebraskaPin);
		hm.put("Nevada",NevadaPin);
		hm.put("NewHampshire",NewHampshirePin);
		hm.put("NewJersey",NewJerseyPin);
		hm.put("NewMexico",NewMexicoPin);
		hm.put("NewYork",NewYorkPin);
		hm.put("NorthCarolina",NorthCarolinaPin);
		hm.put("NorthDakota",NorthDakotaPin);
		hm.put("Ohio",OhioPin);
		hm.put("Oklahoma",OklahomaPin);
		hm.put("Oregon",OregonPin);
		hm.put("Pennsylvania",PennsylvaniaPin);
		hm.put("RhodeIsland",RhodeIslandPin);
		hm.put("SouthCarolina",SouthCarolinaPin);
		hm.put("SouthDakota",SouthDakotaPin);
		hm.put("Tennessee",TennesseePin);
		hm.put("Texas",TexasPin);
		hm.put("Utah",UtahPin);
		hm.put("Vermont",VermontPin);
		hm.put("Virginia",VirginiaPin);
		hm.put("Washington",WashingtonPin);
		hm.put("WashingtonDC",WashingtonDCPin);
		hm.put("WestVirginia",WestVirginiaPin);
		hm.put("Wisconsin",WisconsinPin);
		hm.put("Wyoming",WyomingPin);
		hm.put("AmericanSamoa",AmericanSamoaPin);
		hm.put("Guam",GuamPin);
		hm.put("NorthernMarianaIslands",NorthernMarianaIslandsPin);
		hm.put("PuertoRico",PuertoRicoPin);
		hm.put("VirginIslands",VirginIslandsPin);

		return hm;
		
	}
	public String findState(HashMap hm,int pin)
	{
		boolean found=false;
		
		Set set= hm.entrySet();
		Iterator  it =set.iterator();
				       
		while(it.hasNext())  
		{  
			Map.Entry record=(Map.Entry)it.next();    
			int statePinList[]=(int[])record.getValue();
			for(int z=0;z<statePinList.length;z++)
			{
				if(statePinList[z]==pin)
				{
					found=true;
					return (String)record.getKey();
				}
					
			}
		}  
		if(found==false)
			System.out.println("Pin not found");
		return "not found";
		
		
	}

}
	



	
