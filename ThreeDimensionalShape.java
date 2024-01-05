
public abstract class ThreeDimensionalShape extends Shape{
	
	public ThreeDimensionalShape(String isim) 
	{
		super(isim);
	}
	
	
	//soyut metodlar
	public abstract double getArea();
	public abstract double getVolume();
	
	
	//override
	public String toString()
	{
		return super.toString() + "3 boyutludur. ";
	}

}
