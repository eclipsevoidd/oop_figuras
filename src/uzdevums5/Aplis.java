package uzdevums5;

public class Aplis {
	public Centrs punkts;
	public double rad;
	
	public Aplis(Centrs p, double r) {
		punkts = p;
		rad = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss: " + rad;
	}
	
	// izveidot metodi riņķa līnijas aprēķināšanai
	
	public double rLinijasGarums() {
		return Math.round((2.0 * Math.PI * rad) * 100.0) / 100.0; // smukāk, jo tikai divi cipari aiz komata
	}
	
	// riņķa laukuma aprēķināšanai
	
	public double rLaukums() {
		return Math.round((Math.PI * Math.pow(rad, 2)) * 100.0) / 100.0;
	}
}
