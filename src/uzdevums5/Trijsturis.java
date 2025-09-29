package uzdevums5;

public class Trijsturis {
	public int mala1, mala2, mala3;
	public Centrs punkts;
	
	public Trijsturis(Centrs p, int m1, int m2, int m3) {
		punkts = p;
		mala1 = m1;
		mala2 = m2;
		mala3 = m3;
	}
	
	public String izvaditTrijsturaInfo() {
		return "Mala1: " + mala1 + " cm\n"
			 + "Mala2: " + mala2 + " cm\n"
			 + "Mala3: " + mala3 + " cm";
	}
	
	// uztaisīt metodi laukuma aprēķinam
	public double tLaukums() {
		return  Math.round(Math.sqrt((mala1 + mala2 + mala3) / 2 * ((mala1 + mala2 + mala3) / 2 - mala1) * ((mala1 + mala2 + mala3) / 2 - mala2) * ((mala1 + mala2 + mala3) / 2 - mala3)) * 100.0) / 100.0;
	}
}
