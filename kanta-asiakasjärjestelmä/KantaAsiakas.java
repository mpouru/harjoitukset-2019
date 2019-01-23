
public class KantaAsiakas extends Asiakas {
	protected int bonuspisteet;
	CustomerType asiakastyyppi;
	enum CustomerType { perustaso, keskitaso, huipputaso}
	BonusLaskija laskija;
	
	public KantaAsiakas(String etunimi) {
		super(etunimi);	
		laskija = new PerusBonuslaskija();
	}
	
	public void lisääPisteitä() {
		//PerusBonuslaskija pbl= new Perusbonuslaskija();
		laskija.lisääPisteitä(asiakastyyppi, bonuspisteet);
	}
		 
	
	public KantaAsiakas(Asiakas asiakas) {
		super(asiakas.getEtunimi());
		
	}

}
