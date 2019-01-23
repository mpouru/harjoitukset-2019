import java.util.ArrayList;
import java.util.Random;

public class Hirsipuu {
	
	private static final String[] sanoja= {"kissa", "koira", "varis", "kahvi", "kuppi", 
											"leipä", "ruutu", "matto","mänty","kuusi",
											"hiiri","hamsteri","kirjallisuus","järjestelmä","silmälasit",
											"ohjelmisto","koodari","jonne", "megaforce", "hirsipuu"};
	
	private String sana;//listalta valittu sana
	private ArrayList<Character> piilosana= new ArrayList<Character>(); //sana josta on merkit korvattu alaviivalla
	private ArrayList<Character> arvatutkirj= new ArrayList<Character>(); //lista arvatuista kirjaimista
	public enum Tulokset {oikein, vaarin, jo_arvattu}// mahdolliset tulokset
	
	public Hirsipuu () { //konstruktori, aloittaa pelin
		setPiilosana();
	}
	public ArrayList<Character> getArvatutkirj(){ 
		return arvatutkirj;
	}
	
	private void setSana() {
		sana = sanoja[new Random().nextInt(19)];		//valitsee random sanan
	}

	public String getSana() {  // hakee arvotun sanan
		return sana;
	}
	
	private void setPiilosana() {
		setSana();
		for (char kirjain: sana.toCharArray()) {  //tekee sanasta piilotetun
			piilosana.add('_');
		}
		
	}
	public ArrayList<Character> getPiilosana(){  //hakee piilotetun version sanasta
		return piilosana;
	}
	
	private ArrayList<Integer> getIndeksit(char kirjain){
		ArrayList<Integer> ilmentymat =new ArrayList<Integer>();
		for (int i = sana.indexOf(kirjain); i>=0; i =sana.indexOf(kirjain,i+1)){
			ilmentymat.add(i);
		}
		return ilmentymat;  // tekee listan sanan jokaisen kirjaimen paikasta
	}
	
	public void naytaKirjain (char kirjain) {
		for (int i: getIndeksit(kirjain)) {
			piilosana.set(i, sana.charAt(i));
		}
	}
	
	public void lisaaArvaus(char kirjain) {//lisää arvaukset
		arvatutkirj.add(kirjain);		
	}
	
	private boolean onArvattu(char kirjain) {
		return arvatutkirj.indexOf(kirjain) != -1;
	}
	
	public Tulokset getTulos(char kirjain) {
		if (!onArvattu(kirjain)) {
			if(getIndeksit(kirjain).size()>0) {
				return Tulokset.oikein;
			}
				else {
					return Tulokset.vaarin;	
				}
		}
		else {
			return Tulokset.jo_arvattu;	
		}
	}
	
	public boolean Voitto() {
	 
			if (piilosana.contains('_')) {
				return false;
			}
		return true;		
	}
	
	
}

}