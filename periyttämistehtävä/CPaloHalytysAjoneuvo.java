package tehtavat;
public class CPaloHalytysAjoneuvo extends CHalytysAjoneuvo {
	
	private double dTikkaatKorkeus;
	private int iSammutusletkuLiittimet;
	private double dVesis�ili�MAX;
	private double dVesis�ili�Ltr;
	private boolean bVett�S�ili�ss�;



	public CPaloHalytysAjoneuvo(String sMerkki, int iValmistusvuosi, boolean bH�lytys��ni, boolean bRadiopuh,
			double dKorkeus, double dTikkaatKorkeus, int iSammutusletkuLiittimet, double dVesis�ili�MAX,
			double dVesis�ili�Ltr, boolean bVett�S�ili�ss�) {
		super(sMerkki, iValmistusvuosi, bH�lytys��ni, bRadiopuh, dKorkeus);
		this.dTikkaatKorkeus = dTikkaatKorkeus;
		this.iSammutusletkuLiittimet = iSammutusletkuLiittimet;
		this.dVesis�ili�MAX = dVesis�ili�MAX;
		this.dVesis�ili�Ltr = dVesis�ili�Ltr;
		this.bVett�S�ili�ss� = bVett�S�ili�ss�;
	}


	public CPaloHalytysAjoneuvo(String sMerkki, int iValmistusvuosi, double dTikkaatKorkeus,
			int iSammutusletkuLiittimet, double dVesis�ili�MAX, double dVesis�ili�Ltr, boolean bVett�S�ili�ss�, boolean bH�lytys��ni, boolean bRadiopuh, double dKorkeus) {
		super(sMerkki, iValmistusvuosi, bH�lytys��ni, bRadiopuh, dKorkeus);
		this.dTikkaatKorkeus = dTikkaatKorkeus;
		this.iSammutusletkuLiittimet = iSammutusletkuLiittimet;
		this.dVesis�ili�MAX = dVesis�ili�MAX;
		this.dVesis�ili�Ltr = dVesis�ili�Ltr;
		this.bVett�S�ili�ss� = bVett�S�ili�ss�;
	}


	public boolean bOnkoVett�() {
		if (dVesis�ili�Ltr == 0) {
			bVett�S�ili�ss� = false;
		}
		else bVett�S�ili�ss� = true;
		return bVett�S�ili�ss�;
	}
	
	public double dT�yt�S�ili�() {
		while(dVesis�ili�Ltr<dVesis�ili�MAX) {
			dVesis�ili�Ltr= dVesis�ili�Ltr + 1.0;
		}
		return dVesis�ili�Ltr;
	}
	public double dRuiskutaVett�Ltr(double dVedenTarveLtr) {
		dVesis�ili�Ltr=(dVesis�ili�Ltr-dVedenTarveLtr);
		return dVesis�ili�Ltr;
	}
	public double dRuiskutaVett�Gal(double dVedenTarveGal) {
		double gallonakerroin=0.22;
		double dVedenTarveLtr= dVedenTarveGal*gallonakerroin;
		dVesis�ili�Ltr=(dVesis�ili�Ltr-dVedenTarveLtr);
		return dVesis�ili�Ltr;
	}
	public double dRuiskutaVett�USGal(double dVedenTarveUSGal) {
		double dUSGallonakerroin= 0.26;
		double dVedenTarveLtr= dVedenTarveUSGal*dUSGallonakerroin;
		dVesis�ili�Ltr=(dVesis�ili�Ltr-dVedenTarveLtr);
		return dVesis�ili�Ltr;
	}
	
	
	/**
	 * @return the dVesis�ili�Ltr
	 */
	public double getdVesis�ili�Ltr() {
		return dVesis�ili�Ltr;
	}



	/**
	 * @param dVesis�ili�Ltr the dVesis�ili�Ltr to set
	 */
	public void setdVesis�ili�Ltr(double dVesis�ili�Ltr) {
		this.dVesis�ili�Ltr = dVesis�ili�Ltr;
	}



	/**
	 * @return the dTikkaatKorkeus
	 */
	public double getdTikkaatKorkeus() {
		return dTikkaatKorkeus;
	}

	/**
	 * @param dTikkaatKorkeus the dTikkaatKorkeus to set
	 */
	public void setdTikkaatKorkeus(double dTikkaatKorkeus) {
		this.dTikkaatKorkeus = dTikkaatKorkeus;
	}

	/**
	 * @return the iSammutusletkuLiittimet
	 */
	public int getiSammutusletkuLiittimet() {
		return iSammutusletkuLiittimet;
	}

	/**
	 * @param iSammutusletkuLiittimet the iSammutusletkuLiittimet to set
	 */
	public void setiSammutusletkuLiittimet(int iSammutusletkuLiittimet) {
		this.iSammutusletkuLiittimet = iSammutusletkuLiittimet;
	}
	

}
