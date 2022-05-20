
public abstract class Character implements Movable {
	protected String name;
	protected String life;
	protected String agility;
	protected String strength; 
	protected String wit;
	static String RpgClass;
	
	public abstract void TestCharacter(String name);
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLife() {
		return life;
	}
	public void setLife(String life) {
		this.life = life;
	}
	public String getAgility() {
		return agility;
	}
	public void setAgility(String agility) {
		this.agility = agility;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getWit() {
		return wit;
	}
	public void setWit(String wit) {
		this.wit = wit;
	}
	public static String getRpgClass() {
		return RpgClass;
	}
	
	public abstract void attack(String s);
	public void moveRight() {
		System.out.println(this.name+ ": moves right");
	};
	public void moveLeft() {
		System.out.println(this.name+ ": moves left");
	};
	public void moveBack() {
		System.out.println(this.name+ ": moves back");
	};
	public void moveForward() {
		System.out.println(this.name+ ": moves forward");
	};
	

}
