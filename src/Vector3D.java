
public class Vector3D
{
	public double X,Y,Z;
	
	public Vector3D add(Vector3D other) {
		
		Vector3D v = new Vector3D();
		v.X = this.X + other.X;
		v.Y = this.Y + other.Y;
		v.Z = this.Z + other.Z;
		return v;
	}
	public Vector3D minus(Vector3D other) {
		
		Vector3D v = new Vector3D();
		v.X = this.X - other.X;
		v.Y = this.Y - other.Y;
		v.Z = this.Z - other.Z;
		return v;
	}
	public double dot(Vector3D other) {
		
		double sum = 0.0;
		
		sum = this.X * other.X + this.Y * other.Y + this.Z * other.Z;
		
		return sum;
		
	}
	public double size() {
		double sum = 0.0;
		
		sum = Math.sqrt(X*X+Y*Y+Z*Z);
		
		return sum;		
	}
	
	public Vector3D unit() {
		
		double s = size();
		Vector3D result = new Vector3D();
		
		result.X = this.X/s;
		result.Y = this.Y/s;
		result.Z = this.Z/s;
		
		return result;
		
	}
	
	
}
