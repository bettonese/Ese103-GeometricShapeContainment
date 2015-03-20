/**
 * @author Luca Giovannetti
 */
package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) {
		Circle c1 = new Circle(2,4,6);
		Circle c2 = new Circle(2,4,6);
		Circle c3 = new Circle(2,5,6);
		Circle c4 = new Circle(2,4,8);

		
		System.out.println("C1 contiene C2? " +c1.contains(c2));
		System.out.println("C2 contiene C1? " +c2.contains(c1));
		System.out.println("C1 contiene C3? " +c1.contains(c3));
		System.out.println("C1 contiene C4? " +c1.contains(c4));

	}

}