
class Cube extends ThreeDimensionalShape {

	private double kenar;
	
	public Cube(String isim, double kenar) 
	{
		super(isim);
		this.kenar = kenar;
	}
	
	//get ve set
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
	 
	 public double getVolume()
	 {
		 return (kenar*kenar*kenar);
	 }
	 
	 public String toString()
	 {
		 return super.toString() + "\n şekil: " + getIsim() + "\n kenar uzunluğu: " + getKenar() + "\n alan: " + getArea() + "\n hacim: " + getVolume();
	 }

}
