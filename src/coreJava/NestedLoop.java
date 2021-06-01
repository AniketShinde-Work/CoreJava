package coreJava;

public class NestedLoop {
	
	public void sequence() {
		int k=1;
		for(int i = 0;i<4;i++) {
		
			for(int j=1;j<=4-i;j++) {
				System.out.print(k);
				System.out.print(" ");
				k++;
				
			
			}
			System.out.println();
		}
	}
	
	
	public void reverseSequence() {
		int k=10;
		for(int i = 1;i<5;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				System.out.print(" ");
				k--;
				
			
			}
			System.out.println();
		}
	}
	
	public void reverseSequenceNormal() {
		int k=1;
		for(int i = 1;i<5;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print(" ");
				//k++;
				
			
			}
			System.out.println();
		}
	}
	
	
	public void reverseSequenceNormalThree() {
		int k=3;
		for(int i = 1;i<4;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				System.out.print(" ");
				k+=3;
				
			
			}
			System.out.println();
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NestedLoop seq = new NestedLoop();
		//seq.sequence();
		System.out.println("");
		//seq.reverseSequence();
		//seq.reverseSequenceNormal();
		seq.reverseSequenceNormalThree();
	}

}


/* 		int k=1;
	for(int i = 0;i<4;i++) {
	
		for(int j=1;j<=4-i;j++) {
			System.out.print(k);
			System.out.print(" ");
			k++;
		}
		System.out.println();
	}*/
//1 2 3 4
//5 6 7
//8 9
//10
