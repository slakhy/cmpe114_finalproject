package game;
public class MonsterLoc {
 private int id;
 private String name;
 private int damage;
   

public MonsterLoc(int id, String name, int damage) {
	super();
	this.id = id;
	this.name = name;
	this.damage = damage;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getDamage() {
	return damage;
}


public void setDamage(int damage) {
	this.damage = damage;
}
	
}
