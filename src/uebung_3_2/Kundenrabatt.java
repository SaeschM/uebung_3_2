package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {

		double bestellwert = 5000;
		double bisherigesKundenbestellVolumen = 20000;
		boolean istPremiumKunde = false;
		double bestellprozent1 = 0;
		double bestellprozent2 = 0;
		double bestellprozent3 = 0;
		double gesamtProzent;

		{
			if (istPremiumKunde == true) {
				if (bestellwert >= 100) {
					bestellprozent1 = 2;
				}
				if (bestellwert >= 500) {
					bestellprozent1 = 4;
				}
				if (bestellwert >= 2000) {
					bestellprozent1 = 6;
				}
				if (bestellwert >= 5000) {
					bestellprozent1 = 10 ;
				}
			
			} else {

				if (bestellwert >= 100) {
					bestellprozent1 = 1;
				}
				if (bestellwert >= 500) {
					bestellprozent1 = 2;
				}
				if (bestellwert >= 2000) {
					bestellprozent1 = 3;
				}
				if (bestellwert >= 5000) {
					bestellprozent1 = 5 ;
				}
			}
		}
		{
			if (bisherigesKundenbestellVolumen >= 10000) {
				bestellprozent2 = 7.5;
			}
			if (bisherigesKundenbestellVolumen >= 50000) {
				bestellprozent2 = 12.5;
			}

		}

		{
			if (bestellwert >= 2 * bisherigesKundenbestellVolumen) {
				bestellprozent3 = 3;
			}
		}

		gesamtProzent = bestellprozent1 + bestellprozent2 + bestellprozent3;

		if (istPremiumKunde = false) {
			if (gesamtProzent > 15) {
				gesamtProzent = 15;
			}
		}
		if (istPremiumKunde = true) {
			if (gesamtProzent > 20) {
				gesamtProzent = 20;
			}
		}
		System.out.println(gesamtProzent);
		
		bestellwert = bestellwert*( 1 -gesamtProzent/100 );
				
				System.out.println(bestellwert);	
	}
}
