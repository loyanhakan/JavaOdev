
public class Test {

	public static void main(String[] args) {
		
		Shape sk = new Shape("Şekil");
		System.out.println(sk.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Triangle ug = new Triangle("Üçgen", 3,4);
		System.out.println(ug.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Square kr = new Square("Kare", 5);
		System.out.println(kr.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		Tetrahedron dy = new Tetrahedron("Dört Yüzlü", 4);
		System.out.println(dy.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Cube kp = new Cube("Küp", 6);
		System.out.println(kp.toString());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

				
		
		
	}
}
