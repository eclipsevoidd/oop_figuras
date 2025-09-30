package uzdevums5;

import java.util.ArrayList;

public class IzveidotieObjekti {
	
	static String izvadit(ArrayList<Centrs> centruSaraksts) {
		String str = "";
		for (int i = 0; i < centruSaraksts.size(); i++) {
			str += i + " . objekts " + centruSaraksts.get(i).izvaditKoordinatas() + "\n";
		}
		return str;
	}
	
	static String izvaditCetrsturi(ArrayList<Cetrsturis> cetrsturaObjekti) {
		String str = "";
		for (int i = 0; i < cetrsturaObjekti.size(); i++) {
			str += i + " . objekts \n" + cetrsturaObjekti.get(i).izvaditCetrsturaInfo() + "\nPunkti: " + cetrsturaObjekti.get(i).punkts.izvaditKoordinatas() + "\n";
		}
		return str;
	}
	
	static String izvaditApli(ArrayList<Aplis> aplaObjekti) {
		String str = "";
		for (int i = 0; i < aplaObjekti.size(); i++) {
			str += i + " . objekts \n" + aplaObjekti.get(i).izvaditAplaInfo() + "\nPunkti: " + aplaObjekti.get(i).punkts.izvaditKoordinatas() + "\n";
		}
		return str;
	}
	
	static String izvaditTrijsturi(ArrayList<Trijsturis> trijsturaObjekti) {
		String str = "";
		for (int i = 0; i < trijsturaObjekti.size(); i++) {
			str += i + " . objekts \n" + trijsturaObjekti.get(i).izvaditTrijsturaInfo() + "\nPunkti: " + trijsturaObjekti.get(i).punkts.izvaditKoordinatas() + "\n";
		}
		return str;
	}
	
}
