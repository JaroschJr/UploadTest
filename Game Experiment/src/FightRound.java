import java.util.ArrayList; // I should comment more in these.
public class FightRound extends ArrayList<FightAction> {
	public int roundTime = 200;
	public void insertCharacterActions(FightEntity e) {
		for(int i = 1; i*e.iSpeed <= roundTime; i++) {
			add(new FightAction(e.name, i*e.iSpeed));
		}
		
	}
	
	public void sortIntoOrder() {
			
	}
	
	public void sort() {
		for(int i = 0; i < size(); i++) {
			for(int j = 0; j < size()-1; j++) {
				if(get(j).time>get(j+1).time) {
					FightAction temp = get(j);
					set(j, get(j+1));
					set(j+1, temp);
				}
			}
		}
	}
	
	
	
}
