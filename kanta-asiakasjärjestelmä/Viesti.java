
public class Viesti {
	private String vastaanottaja;
	private String sis�lt�;
	
	
	public Viesti(String sis�lt�, String vastaanottaja) {
		this.vastaanottaja =vastaanottaja;
		this.sis�lt� =sis�lt�;
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
	 * @return the sis�lt�
	 */
	public String getSis�lt�() {
		return sis�lt�;
	}
	/**
	 * @param sis�lt� the sis�lt� to set
	 */
	public void setSis�lt�(String sis�lt�) {
		this.sis�lt� = sis�lt�;
	}
		
	

}
