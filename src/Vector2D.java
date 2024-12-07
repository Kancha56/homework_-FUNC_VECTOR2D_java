
public class Vector2D
{

	public double X;
	public double Y;

	public Vector2D add(Vector2D v)
	{

		Vector2D result = new Vector2D();
		result.X = this.X + v.X;
		result.Y = this.Y + v.Y;

		return result;

	}

	public Vector2D minus(Vector2D v)
	{

		Vector2D result = new Vector2D();
		result.X = this.X - v.X;
		result.Y = this.Y - v.Y;

		return result;

	}

	public double dot(Vector2D v)
	{
		double sum = 0.0;

		sum = this.X * v.X + this.Y * v.Y;

		return sum;
	}
	
	public double size()
	{
		double sumsize = 0.0;
		
		sumsize = Math.sqrt(X*X+Y*Y);
		
		return sumsize;	
		
	}
	public Vector2D unit() {
		
		double s =size();
		Vector2D result = new Vector2D();
		result.X = this.X/s;
		result.Y = this.Y/s;
		
		return result;
		
	}

}
