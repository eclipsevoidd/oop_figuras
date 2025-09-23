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
	
	public double RinkaLinijasAprekinasana() {
		return 2.0 * Math.PI * rad;
	}
	
	// riņķa laukuma aprēķināšanai
	
	public double RinkaLaukumaAprekinasana() {
		return Math.PI * Math.pow(rad, 2);
	}
}
