package coreJava;

public class JavaPractise1 {
	int a=5;
	public void getData() {
		System.out.println("Inside Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaPractise1 jp=new JavaPractise1();
		jp.getData();
		System.out.println(jp.a);
		System.out.println("Hello");
		
		JavaPractise2 jp2=new JavaPractise2();
		jp2.getInfo();
		
		

	}

}
