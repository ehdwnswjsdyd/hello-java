import java.util.Scanner;

public class HellowWorld {
	public static void main(String[] args) 
	{
	int[] result = new int[9];
	System.out.println("������ �� ����� ����? : ");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println("number : " + number);

	if (number < 2 ) {
		System.out.println("2�� �̻��� ���� �Է����ּ��� ");
	}
	else if (number > 9) {
		System.out.println("9�� ������ ���� �Է����ּ���");
	}
	else {
		
	
		for (int i= 1 ; i <10; i++) 
		{
			result[i-1] = i*number;
			System.out.println(number+"*"+i+" �� "+result[i-1]+" �Դϴ�");
			
		}
	}
	}
}