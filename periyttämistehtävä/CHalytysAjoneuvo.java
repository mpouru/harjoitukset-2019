package tehtavat;
public class CHalytysAjoneuvo extends CAjoneuvo {
	
	private boolean bHälytysääni;
	private boolean bRadiopuh;
	private double dKorkeus;
	
	
	
	public CHalytysAjoneuvo(String sMerkki, int iValmistusvuosi, boolean bHälytysääni, boolean bRadiopuh,
			double dKorkeus) {
		super(sMerkki, iValmistusvuosi);
		this.bHälytysääni = bHälytysääni;
		this.bRadiopuh = bRadiopuh;
		this.dKorkeus = dKorkeus;
	}


	/**
	 * @return the bHälytysääni
	 */
	public boolean isbHälytysääni() {
		return bHälytysääni;
	}

	/**
	 * @param bHälytysääni the bHälytysääni to set
	 */
	public void setbHälytysääni(boolean bHälytysääni) {
		this.bHälytysääni = bHälytysääni;
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
