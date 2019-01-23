package tehtavat;

public class CAjoneuvo {
	private int iIskutilavuus;
	private int iHinta;
	private int iOvienLkm;
	private boolean bKattoIkkuna;
	private int iAjetutKilometrit;
	private String sMerkki;
	private int iValmistusvuosi;
	private double dMoottorinIskutilavuusLtr;
	
	
	
	public CAjoneuvo(String sMerkki, int iValmistusvuosi) {
		
		this.sMerkki = sMerkki;
		this.iValmistusvuosi = iValmistusvuosi;
	}
	/**
	 * @return the iIskutilavuus
	 */
	public int getiIskutilavuus() {
		return iIskutilavuus;
	}
	/**
	 * @param iIskutilavuus the iIskutilavuus to set
	 */
	public void setiIskutilavuus(int iIskutilavuus) {
		this.iIskutilavuus = iIskutilavuus;
	}
	/**
	 * @return the iHinta
	 */
	public int getiHinta() {
		return iHinta;
	}
	/**
	 * @param iHinta the iHinta to set
	 */
	public void setiHinta(int iHinta) {
		this.iHinta = iHinta;
	}
	/**
	 * @return the iOvienLkm
	 */
	public int getiOvienLkm() {
		return iOvienLkm;
	}
	/**
	 * @param iOvienLkm the iOvienLkm to set
	 */
	public void setiOvienLkm(int iOvienLkm) {
		this.iOvienLkm = iOvienLkm;
	}
	/**
	 * @return the bKattoIkkuna
	 */
	public boolean isbKattoIkkuna() {
		return bKattoIkkuna;
	}
	/**
	 * @param bKattoIkkuna the bKattoIkkuna to set
	 */
	public void setbKattoIkkuna(boolean bKattoIkkuna) {
		this.bKattoIkkuna = bKattoIkkuna;
	}
	/**
	 * @return the iAjetutKilometrit
	 */
	public int getiAjetutKilometrit() {
		return iAjetutKilometrit;
	}
	/**
	 * @param iAjetutKilometrit the iAjetutKilometrit to set
	 */
	public void setiAjetutKilometrit(int iAjetutKilometrit) {
		this.iAjetutKilometrit = iAjetutKilometrit;
	}
	/**
	 * @return the sMerkki
	 */
	public String getsMerkki() {
		return sMerkki;
	}
	/**
	 * @param sMerkki the sMerkki to set
	 */
	public void setsMerkki(String sMerkki) {
		this.sMerkki = sMerkki;
	}
	/**
	 * @return the iValmistusvuosi
	 */
	public int getiValmistusvuosi() {
		return iValmistusvuosi;
	}
	/**
	 * @param iValmistusvuosi the iValmistusvuosi to set
	 */
	public void setiValmistusvuosi(int iValmistusvuosi) {
		this.iValmistusvuosi = iValmistusvuosi;
	}
	/**
	 * @return the dMoottorinIskutilavuusLtr
	 */
	public double getdMoottorinIskutilavuusLtr() {
		return dMoottorinIskutilavuusLtr;
	}
	/**
	 * @param dMoottorinIskutilavuusLtr the dMoottorinIskutilavuusLtr to set
	 */
	public void setdMoottorinIskutilavuusLtr(double dMoottorinIskutilavuusLtr) {
		this.dMoottorinIskutilavuusLtr = dMoottorinIskutilavuusLtr;
	}
	
	

}
