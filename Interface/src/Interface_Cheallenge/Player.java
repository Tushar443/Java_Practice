package Interface_Cheallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	public Player(String name,int hitPoints,int strength) {
		this.setHitPoints(hitPoints);
		this.setName(name);
		this.setStrength(strength);
		this.setWeapon("Sword");
	}
	
	@Override
	public String toString() {
		return "Player{"+
				" Name = '"+name+'\''+
				" hitPoints = "+hitPoints+
				" strength = "+strength+
				" weapon '"+weapon+'\''+
				'}';
	}
	
	@Override
	public List<String> write() {
		List<String> values= new ArrayList<String>(); 
		values.add(0,this.name);
		values.add(1,""+this.hitPoints);
		values.add(2, ""+this.strength);
		values.add(3,""+this.weapon);
		
		return values;
	}

	@Override
	public void read(List<String> saveValues) {
		if(saveValues !=null && saveValues.size() >=0) {
			this.name=saveValues.get(0);
			this.hitPoints=Integer.parseInt(saveValues.get(1));
			this.strength=Integer.parseInt(saveValues.get(2));
			this.weapon=saveValues.get(3);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
