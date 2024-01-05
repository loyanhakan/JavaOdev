
public class Square extends TwoDimensionalShape {
	
	private double kenar;
	
	
	public Square (String isim, double kenar )
	{
		super(isim);
		this.kenar = kenar;
	}
	
	//get set
	public double getKenar()
	{
		return kenar;
	}
	
	public void setKenar(double kenar)
	{
		this.kenar = kenar;
	}
	
	//override
	public double getArea()
	{
		return (kenar*kenar);
	}
	
	public String toString()
	{
		return super.toString() + "\n şekil: " + getIsim() + "\n kenar uzunluğu: " + getKenar() + "\n alan: " + getArea();
	}

}
