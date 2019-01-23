
import java.util.ArrayList;
import java.util.List;

public class Asiakas {
	
	protected String etunimi; //private muuttujia ei voi käsitellä ilman metodeja
	protected String sukunimi;
	protected String huoltajanSähköpostiosoite;
	//private long asiakaNumero;
	protected List ostokset =new ArrayList<OstoTapahtuma>();
	
	
	
	public void lisääPisteitä() {
	//	bonuspisteet ++;
	}
	
	
	public String huoltajanSähköpostiosoite() {
		return huoltajanSähköpostiosoite;
	}
	public void SetHuoltajanSähköpostiosoite(String huoltajanSähköpostiosoite) {
		this.huoltajanSähköpostiosoite = huoltajanSähköpostiosoite;
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
	public void setIkä(int ikä) {
		this.ikä = ikä ;
	}
	public int getIkä(int ikä){
		return ikä;
	}

	public List getOstokset() {
		return ostokset;
	}

	public void setOstokset(List ostokset) {
		this.ostokset = ostokset;
	}
	
	
}//Ihminen
	
	
