
import java.util.ArrayList;
import java.util.List;

public class Asiakas {
	
	protected String etunimi; //private muuttujia ei voi k�sitell� ilman metodeja
	protected String sukunimi;
	protected String huoltajanS�hk�postiosoite;
	//private long asiakaNumero;
	protected List ostokset =new ArrayList<OstoTapahtuma>();
	
	
	
	public void lis��Pisteit�() {
	//	bonuspisteet ++;
	}
	
	
	public String huoltajanS�hk�postiosoite() {
		return huoltajanS�hk�postiosoite;
	}
	public void SetHuoltajanS�hk�postiosoite(String huoltajanS�hk�postiosoite) {
		this.huoltajanS�hk�postiosoite = huoltajanS�hk�postiosoite;
	}
	public Asiakas (String etunimi) {
		this.etunimi=etunimi;
	}
	
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getEtunimi(){
		return etunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getSukunimi(){
		return sukunimi;
	}
	public void setIk�(int ik�) {
		this.ik� = ik� ;
	}
	public int getIk�(int ik�){
		return ik�;
	}

	public List getOstokset() {
		return ostokset;
	}

	public void setOstokset(List ostokset) {
		this.ostokset = ostokset;
	}
	
	
}//Ihminen
	
	
