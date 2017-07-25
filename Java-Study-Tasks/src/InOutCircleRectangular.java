import java.util.Scanner;

public class InOutCircleRectangular {

	/*	Write a program that checks whether a point O (x, y) is inside
	    a circle K ((0,0), 5) and if it's outside the rectangle ((-1, 1), (5, 5).
	    
	    Pythagoras Circle: (x-center_x)^2 + (y - center_y)^2 < radius^2
            Rectangle:
            A "point-in-axis-aligned-rectangle test" is just:
            bool Inisde( x, y, l, r, b, t )		 //x,y are the point, l,r,b,t are the extents of the rectangle
            {
                return x > l && x < r && y > b && y < t;
            }                               
             */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int x = reader.nextInt();
		int y = reader.nextInt();

		boolean inCircle = ( (x * x) + (y * y) ) <= 25; //fine
		boolean outRect = ( (x < -1 || x > 5 ) || (y < 1 ||y >5) ); //fine
		
		if ( inCircle && outRect == true) {
			System.out.println("It\'s within the circle and outside ot the reactangle");
		} else {
			System.out.println("not the case");
		}
	}
}
