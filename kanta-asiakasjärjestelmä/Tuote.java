
public class Tuote {

	private double yksikk�hinta;
	private String nimi;
	public Tuote(String nimi, double yksikk�hinta) {
		this.nimi=nimi;
		this.yksikk�hinta=yksikk�hinta;
	}
	/**
	 * @return the yksikk�hinta
	 */
	public double getYksikk�hinta() {
		return yksikk�hinta;
	}
	/**
	 * @param yksikk�hinta the yksikk�hinta to set
	 */
	public void setYksikk�hinta(double yksikk�hinta) {
		this.yksikk�hinta = yksikk�hinta;
	}
	/**
	 * @return the nimi
	 */
	public String getNimi() {
		return nimi;
	}
	/**
	 * @param nimi the nimi to set
	 */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
}
