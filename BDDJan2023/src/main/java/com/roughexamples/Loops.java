package com.roughexamples;

public class Loops {
	
	public void forloop(){
		int a=10;
		for( int i=1; i<=a; i++) {
			System.out.print(" * ");	
		}
		for (int j=1; j<=a; j++) {
			System.out.println(" $ ");
			for( int k=1; k<=j; k++)
			{
				System.out.print(" k ");
			}
		}
		
	}
		
		public void foreach() {
			String[] names = {"Java","C","C++","Python","JavaScript"};
			for(String name:names) {
				System.out.println(name);
			}
		}
		
		public void whilelop() {
			int i=0;
			while(i<=10)
			{
				System.out.println(" * ");
				i=i+1;
			}
		}
		
		public void dowhillp() {
			 int j=0;
			do {
				j=j+1;
				System.out.println(" & ");
			}while(j<=10);
		}
		
		public void breaklop() {
			for ( int i=0; i<=10; i++) {
				System.out.println(i);
				if(i==6)
				{
					break;
				}
			}
		}
		
		public void contullop() {
			for ( int i=0; i<=5; i++) {
				System.out.println("***");
				for ( int j=i; j<=15; j++) {
					if(j==5) {
						continue;
					}
					System.out.println(j);
				}
				
			
			}
		}
		public enum Day{ sun, mon, tue, wed, thur, fri, sat};	
		public void enumswitch() {
			//Day val=Day.thur;
			Day[] Daynow=Day.values();
			for( Day now: Daynow) {
				switch(now) {
				case sun: System.out.println("today is sunday");
				break;
				case mon: System.out.println("today is mon");
				break;
				case tue: System.out.println("today is tue");
				break;
				case wed: System.out.println("today is wed");
				break;
				case thur: System.out.println("today is thur");
				break;
				case fri: System.out.println("today is fri");
				break;
				case sat: System.out.println("today is sat");
				break;
				}
			}
			
		}

	public static void main(String[] args) {
	
		Loops lp= new Loops();
		//lp.foreach();
		//lp.whilelop();
		//lp.dowhillp();
		//lp.contullop();
		lp.enumswitch();
	}

}
