
public class FightEntity {
	public String name;
	public int iMaxHit;
	public int iHitPoints;
	public int iSpeed;
	public int rest;
	
	public FightEntity(String n,int a, int b, int c) {
		name = n;
		iMaxHit = a;
		iHitPoints = b;
		iSpeed = c;
		rest = 0;
	}
	
	public void executeRound() {
		if(rest>0) {
			rest--;
		}else {
			System.out.println(name + " acts\n");
		}
		
	}
	
}
