package uzdevums5;

import javax.swing.JOptionPane;

public class OIzveide {
	static int cPozicija = 0;
	
	public static int skaitlaParbaude(String zinojums, int min, int max) {
		String ievade;
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
	int izvele = JOptionPane.showOptionDialog(null, "Kuru objektu veidot?", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Figuras.objektuPogas, Figuras.objektuPogas[0]);
	
	if (izvele == -1)
		izvele = 0;
	switch(izvele) {
	case 0:
		x = skaitlaParbaude("Ievadi centra punkta x koordinātas", -100, 100);
		y = skaitlaParbaude("Ievadi centra punkta y koordinātas", -100, 100);
		Figuras.centraObjekti.add(new Centrs(x, y));
		break;
		
	case 1:
		String[] ceIzvelesVeids = {"Noklusējums", "Centra punkts un malas"};
		
		String veids = (String)JOptionPane.showInputDialog(null, "Izvēlies, kuru konstruktoru izsaukt", "Četrstūra izveide", JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, ceIzvelesVeids[0]);
		
		
		
		if (veids == null)
			veids = ceIzvelesVeids[0];
		
		switch(veids) {
		case "Noklusejuma":
			Figuras.cetrsturaObjekti.add(new Cetrsturis());
			break;
			
		case "Centra punkts un malas":
			//cPNr = cPIzvele();
			cPNr = 0;
			p = skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
			a = skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
			Figuras.cetrsturaObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPNr), p, a));
			break;
		}
		break;
		
	case 4:
		JOptionPane.showMessageDialog(null, "Atgriežas uz galveno izvēlni!", "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		break;
	}
	
	
	}
}
