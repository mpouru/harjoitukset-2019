package tehtavat;
public class Main {
		public static void main (String[]args) {
			
		CAjoneuvo batmobile =new CAjoneuvo("lepakkoauto", 2018);
		batmobile.setbKattoIkkuna(false);
		batmobile.setdMoottorinIskutilavuusLtr(1.6);
		batmobile.setiAjetutKilometrit(5600);
		batmobile.setiHinta(1000000);
		batmobile.setiOvienLkm(2);
		
		
		CAjoneuvo kitt=new CAjoneuvo("firebird", 1982);
		kitt.setbKattoIkkuna(true);
		kitt.setdMoottorinIskutilavuusLtr(2.5);
		kitt.setiAjetutKilometrit(150000);
		kitt.setiHinta(1500);
		kitt.setiOvienLkm(2);
		
		//printtaa batmobilen tiedot, eli setterit ja getterit toimii
		System.out.println(batmobile.getsMerkki()+" "+ batmobile.getiValmistusvuosi()+" "+
									batmobile.getdMoottorinIskutilavuusLtr()+" "+ batmobile.getiOvienLkm()+" "+
									batmobile.getiAjetutKilometrit()+" "+ batmobile.isbKattoIkkuna()+" "+ batmobile.getiHinta());	
		
		//Luodaan paloh�lytysajoneuvo jolla on kaikki mahdolliset tiedot ajoneuvo, halytysajoneuvo ja paloh�lytysajoneuvo-luokista. On hieno. Tai sitten ei.
		CPaloHalytysAjoneuvo paloauto=new CPaloHalytysAjoneuvo("Iveco", 2007, true, true, 3,4,6,5000, 0, false);
		paloauto.setbKattoIkkuna(false);
		paloauto.setdMoottorinIskutilavuusLtr(5.9);
		paloauto.setiAjetutKilometrit(49000);
		paloauto.setiHinta(30000);
		paloauto.setiOvienLkm(2);
	
		boolean vesi= paloauto.bOnkoVett�();
		System.out.println("Onko vett� true/false: "+vesi);
		
		paloauto.dT�yt�S�ili�();
		
		vesi= paloauto.bOnkoVett�();
		System.out.println("Onko vett� true/false: "+vesi);
		System.out.println("Paljonko s�ili�ss� on vett� "+ paloauto.getdVesis�ili�Ltr()+ " litraa");
		
		
			
			
			
			
			
			
			
		}//Main
}//Luokka
