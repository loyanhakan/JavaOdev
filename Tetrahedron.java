
public class Tetrahedron extends ThreeDimensionalShape {

	private double uzunluk;
	
	public Tetrahedron(String isim, double uzunluk) 
	{
		super(isim);
		this.uzunluk = uzunluk;
	}
	
	public double getUzunluk() 
	{
		return uzunluk;
	}

	public void setUzunluk(double uzunluk) 
	{
		this.uzunluk = uzunluk;
	}

	//override
	public double getArea()
	{
		return Math.pow(uzunluk, 2) * Math.sqrt(3);
	}

	public double getVolume() 
	{
		return (Math.pow(uzunluk, 3) * Math.sqrt(2)) / 12;
	}
	
	public String toString() 
	{
		return super.toString() + "\nŞekil: " + getIsim() + " \nkenar uzunluğu: " + getUzunluk() + "\nAlan: " + getArea() + "\nHacim: " + getVolume();
	}
	

}
