import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Vector3D vector1 = new Vector3D();
		Vector3D vector2 = new Vector3D();
		vector1.X = sc.nextDouble();
		vector1.Y = sc.nextDouble();
		vector1.Z = sc.nextDouble();
		vector2.X = sc.nextDouble();
		vector2.Y = sc.nextDouble();
		vector2.Z = sc.nextDouble();
		
		Vector3D result = vector1.add(vector2);
		System.out.println(result.X);
		System.out.println(result.Y);
		System.out.println(result.Z);
		
		double r2 = vector1.dot(vector2);
		System.out.println(r2);
		
		result = vector1.minus(vector2);
		System.out.println(result.X);
		System.out.println(result.Y);
		System.out.println(result.Z);
		
		result = vector1.unit();
		System.out.println(result.X);
		System.out.println(result.Y);
		System.out.println(result.Z);
		
		r2 = vector1.size();
		System.out.println(r2);
		
		sc.close();
	}

}
