import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϴ� ���簢���� ũ�⸦ ���غ�");
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
