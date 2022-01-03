import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 정사각형의 크기를 말해봐");
		int check = scan.nextInt();
		
		for(int a = 0; a < check ; a++) 
		{
			for (int b = 0 ; b < check ; b++ )
			{
				System.out.printf("*");	
			}
			System.out.println("");			
		}
	}
}
