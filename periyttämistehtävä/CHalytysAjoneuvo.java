package tehtavat;
public class CHalytysAjoneuvo extends CAjoneuvo {
	
	private boolean bH‰lytys‰‰ni;
	private boolean bRadiopuh;
	private double dKorkeus;
	
	
	
	public CHalytysAjoneuvo(String sMerkki, int iValmistusvuosi, boolean bH‰lytys‰‰ni, boolean bRadiopuh,
			double dKorkeus) {
		super(sMerkki, iValmistusvuosi);
		this.bH‰lytys‰‰ni = bH‰lytys‰‰ni;
		this.bRadiopuh = bRadiopuh;
		this.dKorkeus = dKorkeus;
	}


	/**
	 * @return the bH‰lytys‰‰ni
	 */
	public boolean isbH‰lytys‰‰ni() {
		return bH‰lytys‰‰ni;
	}

	/**
	 * @param bH‰lytys‰‰ni the bH‰lytys‰‰ni to set
	 */
	public void setbH‰lytys‰‰ni(boolean bH‰lytys‰‰ni) {
		this.bH‰lytys‰‰ni = bH‰lytys‰‰ni;
	}

	/**
	 * @return the bRadiopuh
	 */
	public boolean isbRadiopuh() {
		return bRadiopuh;
	}

	/**
	 * @param bRadiopuh the bRadiopuh to set
	 */
	public void setbRadiopuh(boolean bRadiopuh) {
		this.bRadiopuh = bRadiopuh;
	}

	/**
	 * @return the dKorkeus
	 */
	public double getdKorkeus() {
		return dKorkeus;
	}

	/**
	 * @param dKorkeus the dKorkeus to set
	 */
	public void setdKorkeus(double dKorkeus) {
		this.dKorkeus = dKorkeus;
	}

	

}
