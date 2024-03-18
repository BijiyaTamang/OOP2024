package week5;

public class MultiSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere spher1= new Sphere(7.0);
		Sphere spher2= new Sphere(10.0);
		
		System.out.println("Initial Information");
		System.out.println("First Sphere: "+spher1);
		System.out.println("Second Sphere: "+spher2);

		
		System.out.println("First Sphere");
		System.out.printf("Volume: %.3f\n",spher1.calculateVolume());
		System.out.printf("Surface Area: %.3f\n" , spher1.calculateSurfaceArea());
		
		System.out.println("Second Sphere");
		System.out.printf("Volume: %.3f\n", spher2.calculateVolume());
		System.out.printf("Surface Area: %.3f\n" , spher2.calculateSurfaceArea());
		

	}

}
