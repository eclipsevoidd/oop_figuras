package uzdevums5;

public class Centrs {
	// Atribūti
	public int x, y;
	
	// Konstruktors (nosaukums tāds pats kā klasei)
	public Centrs (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Metodes
	public String izvaditKoordinatas() {
		return "Centra punkta koordinātas: \nx = " + x + " y = " + y;
	}
	
	public void parvietot(int koordX, int koordY) {
		x += koordX;
		y += koordY;
	}
}
