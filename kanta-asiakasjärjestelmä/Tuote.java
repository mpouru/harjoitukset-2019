
public class Tuote {

	private double yksikköhinta;
	private String nimi;
	public Tuote(String nimi, double yksikköhinta) {
		this.nimi=nimi;
		this.yksikköhinta=yksikköhinta;
	}
	/**
	 * @return the yksikköhinta
	 */
	public double getYksikköhinta() {
		return yksikköhinta;
	}
	/**
	 * @param yksikköhinta the yksikköhinta to set
	 */
	public void setYksikköhinta(double yksikköhinta) {
		this.yksikköhinta = yksikköhinta;
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
