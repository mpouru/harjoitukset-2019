import KantaAsiakas.CustomerType;

public class PerusBonuslaskija implements BonusLaskija{
	
	@Override
	public void lisääPisteitä(CustomerType type, int bonuspisteet) {
		switch (type){
		
		case perustaso:
			bonuspisteet ++;
			break;
		case  keskitaso:
			bonuspisteet ++;
			bonuspisteet ++;
			break;
		case huipputaso:
			bonuspisteet ++;
			bonuspisteet ++;
			bonuspisteet ++;
		
		}
	}
}