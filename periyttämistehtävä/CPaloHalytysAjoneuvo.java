package tehtavat;
public class CPaloHalytysAjoneuvo extends CHalytysAjoneuvo {
	
	private double dTikkaatKorkeus;
	private int iSammutusletkuLiittimet;
	private double dVesisäiliöMAX;
	private double dVesisäiliöLtr;
	private boolean bVettäSäiliössä;



	public CPaloHalytysAjoneuvo(String sMerkki, int iValmistusvuosi, boolean bHälytysääni, boolean bRadiopuh,
			double dKorkeus, double dTikkaatKorkeus, int iSammutusletkuLiittimet, double dVesisäiliöMAX,
			double dVesisäiliöLtr, boolean bVettäSäiliössä) {
		super(sMerkki, iValmistusvuosi, bHälytysääni, bRadiopuh, dKorkeus);
		this.dTikkaatKorkeus = dTikkaatKorkeus;
		this.iSammutusletkuLiittimet = iSammutusletkuLiittimet;
		this.dVesisäiliöMAX = dVesisäiliöMAX;
		this.dVesisäiliöLtr = dVesisäiliöLtr;
		this.bVettäSäiliössä = bVettäSäiliössä;
	}


	public CPaloHalytysAjoneuvo(String sMerkki, int iValmistusvuosi, double dTikkaatKorkeus,
			int iSammutusletkuLiittimet, double dVesisäiliöMAX, double dVesisäiliöLtr, boolean bVettäSäiliössä, boolean bHälytysääni, boolean bRadiopuh, double dKorkeus) {
		super(sMerkki, iValmistusvuosi, bHälytysääni, bRadiopuh, dKorkeus);
		this.dTikkaatKorkeus = dTikkaatKorkeus;
		this.iSammutusletkuLiittimet = iSammutusletkuLiittimet;
		this.dVesisäiliöMAX = dVesisäiliöMAX;
		this.dVesisäiliöLtr = dVesisäiliöLtr;
		this.bVettäSäiliössä = bVettäSäiliössä;
	}


	public boolean bOnkoVettä() {
		if (dVesisäiliöLtr == 0) {
			bVettäSäiliössä = false;
		}
		else bVettäSäiliössä = true;
		return bVettäSäiliössä;
	}
	
	public double dTäytäSäiliö() {
		while(dVesisäiliöLtr<dVesisäiliöMAX) {
			dVesisäiliöLtr= dVesisäiliöLtr + 1.0;
		}
		return dVesisäiliöLtr;
	}
	public double dRuiskutaVettäLtr(double dVedenTarveLtr) {
		dVesisäiliöLtr=(dVesisäiliöLtr-dVedenTarveLtr);
		return dVesisäiliöLtr;
	}
	public double dRuiskutaVettäGal(double dVedenTarveGal) {
		double gallonakerroin=0.22;
		double dVedenTarveLtr= dVedenTarveGal*gallonakerroin;
		dVesisäiliöLtr=(dVesisäiliöLtr-dVedenTarveLtr);
		return dVesisäiliöLtr;
	}
	public double dRuiskutaVettäUSGal(double dVedenTarveUSGal) {
		double dUSGallonakerroin= 0.26;
		double dVedenTarveLtr= dVedenTarveUSGal*dUSGallonakerroin;
		dVesisäiliöLtr=(dVesisäiliöLtr-dVedenTarveLtr);
		return dVesisäiliöLtr;
	}
	
	
	/**
	 * @return the dVesisäiliöLtr
	 */
	public double getdVesisäiliöLtr() {
		return dVesisäiliöLtr;
	}



	/**
	 * @param dVesisäiliöLtr the dVesisäiliöLtr to set
	 */
	public void setdVesisäiliöLtr(double dVesisäiliöLtr) {
		this.dVesisäiliöLtr = dVesisäiliöLtr;
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
