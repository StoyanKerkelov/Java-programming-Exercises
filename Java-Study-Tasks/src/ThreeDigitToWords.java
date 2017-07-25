import java.util.Scanner;

public class ThreeDigitToWords {

	/*Write a program that converts a given number into a space
	 * [0..999] in a text corresponding to the Bulgarian pronunciation. Examples:
	 * - 0 "Нула" - 273 "Двеста седемдесет и три" - 400 "Четиристотин" - 501
	 * "Петстотин и едно" - 711 "Седемстотин и единадесет"
	 */
	
	public static String nested_switch(int input, String second, String third) {
		
		switch (input){
		case 11:
			second = "eдинадесет "; third = ""; break;
		case 12:
			second = "дванадест"; third = ""; 	break;
		case 13:
			second = "тринадесет"; third = ""; break;
		case 14:
			second = "четиринадесет"; third = ""; break;
		case 15:
			second = "петнадесет"; third = ""; 	break;
		case 16:
			second = "шестнадесет"; third = ""; 	break;
		case 17:
			second = "седемнадесет"; third = ""; 	break;
		case 18:
			second = "осемнадесет"; third = ""; 	break;
		case 19:
			second = "деветнадесет"; third = ""; 	break;
		default:
			second = "десет"; third = ""	; break; // X10
		}
		return second;
	}
		
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		int input = reader.nextInt();
		int a, b, c, bc;
			
		a = (input % 1000) / 100;
		bc= input % 100;
		b = (input % 100) / 10;
		c = input % 10;
		
		//System.out.println(bc);
		// System.out.println(a + " " + b+ " " + c); //num check

		String first="", second="", third="";

		switch (a) {

		case 1:
			first = "сто ";break;
		case 2:
			first = "двеста ";break;
		case 3:
			first = "триста ";break;
		case 4:
			first = "четиристотин ";break;
		case 5:
			first = "петстотин ";break;
		case 6:
			first = "шестотин ";break;
		case 7:
			first = "седемстотин ";break;
		case 8:
			first = "осемстотин ";break;
		case 9:
			first = "деветстотин ";break;
		default:
			first = "";break;
		}
		if (b!=1){
			switch (b) {

			/*case 1:
				nested_switch(bc, second, third); break;*/
			case 2:
				second = "двадесет ";	break;
			case 3:
				second = "тридесет ";	break;
			case 4:
				second = "четиридесет ";	break;
			case 5:
				second = "петдесет ";	break;
			case 6:
				second = "шестдесет ";	break;
			case 7:
				second = "седемдесет ";	break;
			case 8:
				second = "осемдесет ";	break;
			case 9:
				second = "деведесет ";	break;
			default:
				second = "";	break;	//X0X
			}
			
			switch (c){
			case 1:
				third += "едно"; break;
			case 2:
				third += "две"; break;
			case 3:
				third += "три"; break;
			case 4:
				third += "четири"; break;
			case 5:
				third += "пет"; break;
			case 6:
				third += "шест"; break;
			case 7:
				third += "седем"; break;
			case 8:
				third += "осем"; break;
			case 9:
				third = "девет"; break;
			default:
				third = ""; break; // XX0
			}
		} else {
			
			switch (bc){
			case 11:
				second = "eдинадесет "; third = ""; break;
			case 12:
				second = "дванадесет"; third = ""; 	break;
			case 13:
				second = "тринадесет"; third = ""; break;
			case 14:
				second = "четиринадесет"; third = ""; break;
			case 15:
				second = "петнадесет"; third = ""; 	break;
			case 16:
				second = "шестнадесет"; third = ""; 	break;
			case 17:
				second = "седемнадесет"; third = ""; 	break;
			case 18:
				second = "осемнадесет"; third = ""; 	break;
			case 19:
				second = "деветнадесет"; third = ""; 	break;
			default:
				second = "десет"; third = ""	; break; // X10
			}
		}
		
		if(a!=0 && b != 0 && c!=0){
			if((b*10+c)>20){
				third = "и " + third;
			} else{
				second = "и "+second ;
			}
		}
		if(a==0 && b > 1 && c!=0){
			second = second +"и " ;
		}
		if(a!=0 && b != 0 && c==0){
			second = "и " + second;
		}
		if(a!=0 && b == 0 && c!=0){
			second = "и " + second;
		}
		
		if(input == 0){
			System.out.println("нула");
		}else{
			System.out.println(first+second+third);
		}
	}
}
