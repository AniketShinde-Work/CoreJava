package coreJava;

public class Practise {
	
	public int addition(int a,int b) {
		return a+b;
		
	}
	
	public void star() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
			System.out.println(j);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practise prac = new Practise();
		prac.star();
		
		


	}

}
