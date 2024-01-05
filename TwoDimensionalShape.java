
public abstract class TwoDimensionalShape extends Shape {
	
	//constructor
	public TwoDimensionalShape(String isim) 
	{
		super(isim);
	}
	
	//soyut metod
	public abstract double getArea();
	
	
	//override
	public String toString()
	{
		return super.toString() + " 2 boyutludur. ";
	}

}
