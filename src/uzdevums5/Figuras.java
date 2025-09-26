package uzdevums5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Figuras {
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturaObjekti = new ArrayList<>();
	
	public static Object[] objektuPogas = {"Centrs", "Četrstūris", "Aplis", "Trijstūris", "Atgriezties"};

	public static void main (String[] args) {
		/*
		// izveido Centrds objektu
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKoordinatas());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKoordinatas());
		
		// izveido Cetrsturis objektu
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		// izvadīt šī četrstūra atrašanās vietu
		System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
		
		Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
		System.out.println(cetrsturis2.izvaditCetrsturaInfo() + "\n" + cetrsturis2.punkts.izvaditKoordinatas() + "\ns = " + cetrsturis2.LaukumaAprekinasana());
		
		Centrs punkts2 = new Centrs(5, 23);
		Aplis aplis1 = new Aplis(punkts2, 5);
		System.out.println(aplis1.izvaditAplaInfo() + "\ns = " + aplis1.rLaukums() + "\nc = " + aplis1.rLinijasGarums());
		*/
		
		
		
		int izvele, poga;
		String[] objektuPogas = {"Centrs", "Četrstūris", "Aplis", "Trijstūris", "Atgriezties"};
		
		do {
			izvele = OIzveide.skaitlaParbaude("Ko vēlies darīt?\n0 - Apturēt\n1 - Izveidot objektu\n2 - Aplūkot objektus\n3 - Izsaukt metodi", 0, 3);
			if (izvele == -1)
				izvele = 0;
			switch(izvele) {
			case 0:
				JOptionPane.showMessageDialog(null, "Programma apturēta!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			case 1:
				OIzveide.izveidotObjektu();
			}
		} while(izvele != 0);
		
	}	
}
