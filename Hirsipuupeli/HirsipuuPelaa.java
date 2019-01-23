import java.util.Scanner;

// ei toimi
public class HirsipuuPelaa {
	public static void main (String[] args) {
		
	Hirsipuu uusi = new Hirsipuu();	
	Scanner lue = new Scanner(System.in);
	char arvaus;
	String kirjoitus;
	int maxarvaukset=8;
	int laskuri=0;
	
		
	System.out.println("Pelataan hirsipuuta!");	
	System.out.println(uusi.getPiilosana());
	
	do {
			System.out.println("Arvaa kirjain");
	
			kirjoitus= lue.nextLine();
			arvaus= kirjoitus.charAt(0);
			
			uusi.getTulos(arvaus);
			uusi.naytaKirjain(arvaus);
			System.out.println(arvaus +" on " +uusi.getTulos(arvaus));
			System.out.println (uusi.getPiilosana());
			uusi.lisaaArvaus(arvaus); //lis‰‰ arvaus listalle
			System.out.println("Olet jo arvannut kirjaimet: "+uusi.getArvatutkirj());
			laskuri++;
	}
	while (laskuri<= maxarvaukset);
	boolean voitto=uusi.Voitto();
	if (havio= true) {
		System.out.println("H‰visit");
	} 
	else {
		System.out.println("Voitit");
		}
			
	System.out.println("Oikea sana on: "+uusi.getSana());
	
	
	
	
	
	lue.close();
	
		
		
	
		
	}
}
