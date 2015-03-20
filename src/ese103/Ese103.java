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
		Triangle t1 = new Triangle(2,4,6);
		Triangle t2 = new Triangle(2,4,6);
		Triangle t3 = new Triangle(2,5,7); 
		Triangle t4 = new Triangle(2,4,6);
		
		System.out.println("C1 contiene C2? " +c1.contains(c2));
		System.out.println("C2 contiene C1? " +c2.contains(c1));
		System.out.println("C1 contiene C3? " +c1.contains(c3));
		System.out.println("C1 contiene C4? " +c1.contains(c4));
		
		System.out.println("T1 contiene T2? " +t1.contains(t2));
		System.out.println("T2 contiene T1? " +t2.contains(t1));
		System.out.println("T1 contiene T3? " +t1.contains(t3));
		System.out.println("T1 contiene T4? " +t1.contains(t4));
		
		System.out.println("C1 contiene T1? " +c1.contains(t1));
		System.out.println("T1 contiene C1? " +t1.contains(c1));
		System.out.println("C3 contiene T3? " +c3.contains(t3));
		System.out.println("C3 contiene T4? " +c3.contains(t4)); 
		

	}

}