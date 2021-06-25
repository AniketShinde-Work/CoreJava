package coreJava;



public class DifferentMethods {


		public void hello() {
			System.out.println("Hello");
			System.out.println("Aniket");
		}
		
		
		public int add(int a ,int b) {
			 int c= a+b;
			 System.out.println(c);
			 return c;
		}
		
		public void swap() {
			int a=10;
			int b=20;
			
			
			 a = a+b;//30
			 b = a-b;//30-20=10
			 a = a-b;//30-10=20
			
			System.out.println(a +"and "+b);
			
		}
		
		public void conditions() {
			int age=20;
			if(age<18) {
				System.out.println("can't vote");
			}
			else if(age==18) {
				System.out.println("Congrats new to vote");
			}
			else if(age>18) {
				System.out.println("Can vote");
			}
		}
		
		public void evenOrodd() {
			int a=20;
			if(a%2 == 0) {
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("No. is odd");
			}
		}
		
		public void switchcase() {
			int day=3;
			switch(day) {
			case 1:System.out.println("Sunday");
			break;
			case 2:System.out.println("Monday");
			break;
			case 3:System.out.println("Tuesday");
			break;
			case 4:System.out.println("Wednesday");
			break;
			case 5:System.out.println("Thursday");
			break;
			case 6:System.out.println("Friday");
			break;
			case 7:System.out.println("Saturday");
			break;
			default:System.out.println("Invalid");
			}
			
			
		}
		public void loop() {
			int i;
			for(i=0;i<100;i++) {
				System.out.println(i);
			}
		}
		
		
		public void whiles() {
			int i=1;
			while(i<=10) {
				System.out.println(i);
				i++;
			}
			
			}
		
		public void dowhiles() {
			int i=1;
			do {
				System.out.println(i);
				i++;
			}
			while(i<=10);
		}
		

		public static void main(String[] args) {
			DifferentMethods dp=new DifferentMethods();
//			dp.hello();
//			dp.add(20,50);
//			dp.swap();
//			dp.conditions();
			//dp.evenOrodd();
		//	dp.switchcase();
			//dp.loop();
		//	dp.whiles();
			dp.dowhiles();
		}


	

}
