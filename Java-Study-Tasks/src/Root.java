import java.util.Scanner;

public class Root {
	//calculate root
	////     Babylonian method     ///////
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		double ceil ;
		double squareRoot = num/2;
		
		do{
			ceil = squareRoot;
			squareRoot = (ceil + (num/ceil)) / 2;
		}while((ceil - squareRoot !=0));
		
		System.out.println(squareRoot);//result
	}
}
