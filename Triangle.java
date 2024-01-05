
public class Triangle extends TwoDimensionalShape{
	
	private double taban;
	private double yukseklik;
	
	
	public Triangle(String isim, double taban, double yukseklik)
	{
		super(isim);
		this.taban = taban;
		this.yukseklik = yukseklik;
	}
	
	//twodiamensionalshape'ten get area override 
	
	public double getArea()
	{
		return ( taban * yukseklik / 2);
	}
	
	//get ve set metodları
	
	public double getTaban() {
		return taban;
	}

	public void setTaban(double taban) {
		this.taban = taban;
	}

	public double getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	public String toString()
	{
		return super.toString() + "\nŞekil: " + getIsim() + "\nTaban uzunluğu: " + getTaban() + "\nYükseklik: " + getYukseklik() + "\nAlan: " + getArea();
	}
	
}
