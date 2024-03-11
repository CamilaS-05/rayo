package Principal;

public class Ejer01 {
        
	public static void main(String[] args) {
		/*
		for (int i=1000; i >=50;i -=50) {
			System.out.println(i);	
		}
		
	int i=1000;
	
	while(i>=50){
		System.out.println(i);
		i-=50;
	}
        */
		for(int i=1; i<=10;i++){
		   for(int j=1; j<=10;j++){
			System.out.printf("%4d", i*j);
			System.out.print(" ");
			   
            }
		    System.out.println();
		}
	}
}