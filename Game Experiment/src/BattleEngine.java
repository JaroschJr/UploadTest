import java.util.ArrayList;
public class BattleEngine {
	public static void main(String args[]) {
		//System.out.println("THIS");
		ArrayList<FightEntity> fighters = new ArrayList<FightEntity>();
		fighters.add(new FightEntity("Rogue", 20, 20, 20));
		fighters.add(new FightEntity("Warrior", 30, 30, 35));
		fighters.add(new FightEntity("Mage", 15, 15, 30));
		fighters.add(new FightEntity("Beast", 50, 50, 25));
		//System.out.println("HERE");
		FightRound fr = new FightRound();
		//System.out.println("IS");
		for(int i = 0; i<fighters.size(); i++) {
			//System.out.println("LOOK HERE");
			fr.insertCharacterActions(fighters.get(i));;
		}
		fr.sort();
		//System.out.println("WHAT");
		for(int i = 0; i<fr.size(); i++) {
			//System.out.println("AND HERE");
			System.out.println(fr.get(i).fighterName + " " + fr.get(i).time);
		}
		
	}
}
