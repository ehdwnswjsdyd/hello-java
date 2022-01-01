import java.util.Scanner;

public class HellowWorld {
	public static void main(String[] args) 
	{
	int[] result = new int[9];
	System.out.println("구구단 중 출력할 단은? : ");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println("number : " + number);

	if (number < 2 ) {
		System.out.println("2단 이상의 단을 입력해주세요 ");
	}
	else if (number > 9) {
		System.out.println("9단 이하의 단을 입력해주세요");
	}
	else {
		
	
		for (int i= 1 ; i <10; i++) 
		{
			result[i-1] = i*number;
			System.out.println(number+"*"+i+" 는 "+result[i-1]+" 입니다");
			
		}
	}
	}
}