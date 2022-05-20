
public class Mage extends Character {
	
	public Mage(String name) {
	this.name = name;
	this.life = "70";
	this.agility = "10";
	this.strength = "3";
	this.wit = "10";
	this.RpgClass="Mage";
	System.out.println(name+" May the gods be with me.");
	}
	
	public void attack(String s) {
		if((s=="magic")||(s=="wand")) {
		System.out.println(this.name+" : "+"Rrrrrrrrrrrr..");
		System.out.println(this.name+" : "+"Feel the power of my "+s+" !");
		}
			else {
				System.out.println("he doesn't attack");
			}
		
	}
	@Override
	public void moveRight() {
		System.out.println(this.name+ ": moves right furtively .");
	};
	@Override
	public void moveLeft() {
		System.out.println(this.name+ ": moves left furtively .");
	};
	@Override
	public void moveBack() {
		System.out.println(this.name+ ": moves back furtively .");
	};
	@Override
	public void moveForward() {
		System.out.println(this.name+ ": moves forward furtively .");
	};
	
}
