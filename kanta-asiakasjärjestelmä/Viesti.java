
public class Viesti {
	private String vastaanottaja;
	private String sisältö;
	
	
	public Viesti(String sisältö, String vastaanottaja) {
		this.vastaanottaja =vastaanottaja;
		this.sisältö =sisältö;
	}
	/**
	 * @return the vastaanottaja
	 */
	public String getVastaanottaja() {
		return vastaanottaja;
	}
	/**
	 * @param vastaanottaja the vastaanottaja to set
	 */
	public void setVastaanottaja(String vastaanottaja) {
		this.vastaanottaja = vastaanottaja;
	}
	/**
	 * @return the sisältö
	 */
	public String getSisältö() {
		return sisältö;
	}
	/**
	 * @param sisältö the sisältö to set
	 */
	public void setSisältö(String sisältö) {
		this.sisältö = sisältö;
	}
		
	

}
