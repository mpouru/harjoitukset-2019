import java.time.LocalDateTime;

public class OstoTapahtuma {
	private Asiakas asiakas;
	private Tuote tuote;
	private double m‰‰r‰; // lasketaan hinta m‰‰r‰n mukaan
	double hinta;
	LocalDateTime ostohetki;
	
	public OstoTapahtuma(Asiakas asiakas, Tuote tuote, double m‰‰r‰) {
		
		this.asiakas= asiakas;
		this.tuote = tuote;
		this.m‰‰r‰ = m‰‰r‰;
		this.hinta = tuote.getYksikkˆhinta()*m‰‰r‰;
	
		this.getAsiakas().lis‰‰Pisteit‰();
		 
	}

	/**
	 * @return the asiakas
	 */
	public Asiakas getAsiakas() {
		return asiakas;
	}

	/**
	 * @param asiakas the asiakas to set
	 */
	public void setAsiakas(Asiakas asiakas) {
		this.asiakas = asiakas;
	}

	/**
	 * @return the tuote
	 */
	public Tuote getTuote() {
		return tuote;
	}

	/**
	 * @param tuote the tuote to set
	 */
	public void setTuote(Tuote tuote) {
		this.tuote = tuote;
	}

	/**
	 * @return the m‰‰r‰
	 */
	public double getM‰‰r‰() {
		return m‰‰r‰;
	}

	/**
	 * @param m‰‰r‰ the m‰‰r‰ to set
	 */
	public void setM‰‰r‰(double m‰‰r‰) {
		this.m‰‰r‰ = m‰‰r‰;
	}

	/**
	 * @return the hinta
	 */
	public double getHinta() {
		return hinta;
	}

	/**
	 * @param hinta the hinta to set
	 */
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	/**
	 * @return the ostohetki
	 */
	public LocalDateTime getOstohetki() {
		return ostohetki;
	}

	/**
	 * @param ostohetki the ostohetki to set
	 */
	public void setOstohetki(LocalDateTime ostohetki) {
		this.ostohetki = ostohetki;
	}

	
	
	
	}
	
}
