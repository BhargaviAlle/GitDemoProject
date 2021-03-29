import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		findEven(num);
		
	}

	public static void findEven(int num) {
		
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
