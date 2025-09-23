package uzdevums5;

public class Figuras {
	
	public static void main (String[] args) {
		// izveido Centrds objektu
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKoordinatas());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKoordinatas());
		
		// izveido Cetrsturis objektu
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		// izvadīt šī četrstūra atrašanās vietu
		centraP1.parvietot(5, -10);
		System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
	}	
}
