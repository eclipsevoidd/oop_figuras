package uzdevums5;

import javax.swing.JOptionPane;

public class OIzveide {
	static String ievade;
	
	static int cPIzvele() {
		if (Figuras.centraObjekti.size() < 1)
			return -1;
		
		int izvele = skaitlaParbaude(IzveidotieObjekti.izvadit(Figuras.centraObjekti), 0, Figuras.centraObjekti.size() - 1);
		return izvele;
	}
	
	
	static int cPozicija = 0;
	
	public static int skaitlaParbaude(String zinojums, int min, int max) {
		int skaitlis;
		
		while(true) {
			ievade = JOptionPane.showInputDialog(null, zinojums, "Datu ievade", JOptionPane.INFORMATION_MESSAGE);
			
			if (ievade == null)
				return -1;
			
			try {
				skaitlis = Integer.parseInt(ievade);
				
				if(skaitlis < min || skaitlis > max) {
					JOptionPane.showMessageDialog(null, "Norādīts nederīgs intervāls", "Nekorekti dati", JOptionPane.WARNING_MESSAGE);
					continue;
					
				}
				return skaitlis;
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Netika ievadīts vesels skaitlis\n" + e, "Kļūda", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	static void izveidotObjektu() {
	int x, y, cPNr;
	double p, a;
	int izvele = JOptionPane.showOptionDialog(null, "Kuru objektu veidot?", "Izvēle", 
				 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Figuras.objektuPogas, Figuras.objektuPogas[0]);
	
	if (izvele == -1)
		izvele = 0;
	switch(izvele) {
	case 0:
		x = skaitlaParbaude("Ievadi centra punkta x koordinātas", -100, 100);
		y = skaitlaParbaude("Ievadi centra punkta y koordinātas", -100, 100);
		if (x == -1 || y == -1) {
			JOptionPane.showMessageDialog(null, "Centra punkts netika izveidots!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
			break;
		}
		Figuras.centraObjekti.add(new Centrs(x, y));
		JOptionPane.showMessageDialog(null, "Centra punkts izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		break;
		
	case 1:
		String[] ceIzvelesVeids = {"Noklusējums", "Centra punkts un malas"};
		String veids = (String)JOptionPane.showInputDialog(null, "Izvēlies, kuru konstruktoru izsaukt", "Četrstūra izveide", JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, ceIzvelesVeids[0]);
		
		
		
		if (veids == null)
			veids = ceIzvelesVeids[0];
		
		switch(veids) {
		case "Noklusejuma":
			Figuras.cetrsturaObjekti.add(new Cetrsturis());
			JOptionPane.showMessageDialog(null, "Noklusējuma četrstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "Centra punkts un malas":
			cPNr = cPIzvele();
			if (cPNr == -1) {
				JOptionPane.showMessageDialog(null, "Netika izvēlēts centra punkts.", "Kļūda", JOptionPane.ERROR_MESSAGE);
				break;
			}
			p = skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
			a = skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
			if (p == -1 || a == -1) {
				JOptionPane.showMessageDialog(null, "Četrstūris netika izveidots!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
			}
			Figuras.cetrsturaObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPNr), p, a));
			JOptionPane.showMessageDialog(null, "Četrstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		break;
	case 2:
		cPNr = cPIzvele();
		if (cPNr == -1) {
			JOptionPane.showMessageDialog(null, "Nav centra punkts, ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Aplis izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		int r = skaitlaParbaude("Ievadi apļa rādiusu", 1, 100);
		Figuras.aplaObjekti.add(new Aplis(Figuras.centraObjekti.get(cPNr), r));
		break;
	case 3:
		cPNr = cPIzvele();
		if (cPNr == -1) {
			JOptionPane.showMessageDialog(null, "Nav centra punkts, ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE);
			break;
		}
		int m1 = skaitlaParbaude("Ievadi primās malas garumu", 1, 100);
		int m2 = skaitlaParbaude("Ievadi otrās malas garumu", 1, 100);
		int m3 = skaitlaParbaude("Ievadi trešās malas garumu", 1, 100);
		if (m1 == -1 || m2 == -1 || m3 == -1)
			break;
		Figuras.trijsturaObjekti.add(new Trijsturis(Figuras.centraObjekti.get(cPNr), m1, m2, m3));
		JOptionPane.showMessageDialog(null, "Trijstūris izveidots!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		break;
	case 4:
		JOptionPane.showMessageDialog(null, "Atgriežas uz galveno izvēlni!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		break;
	}
	
	
	}
}
