package coreJava;

public class JavaPractise2 {
	
	
	public void getInfo() {
		System.out.println("Inside JavaPractise2 Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello To Java";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("H"));
		System.out.println(a.substring(1));
		System.out.println(a.concat(" World"));
		String arr[] = a.split("To");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(a.replace("To","World"));
		

	}

}
