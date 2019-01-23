
public class PremiumKantaAsiakas extends KantaAsiakas {
	
//	CustomerType asiakastyyppi;
//	enum CustomerType {perustaso, keskitaso, huipputaso}
	
	public PremiumKantaAsiakas(String etunimi) {
		super(etunimi);	
	}
	
	
		
	
	public PremiumKantaAsiakas(Asiakas asiakas) {
		super(asiakas.getEtunimi());
	}

}
