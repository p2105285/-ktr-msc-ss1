
public class Warrior extends Character {
public Warrior(String name) {
		this.name = name;
		this.life = "100";
		this.agility = "8";
		this.strength = "10";
		this.wit = "3";
		this.RpgClass="Warrior";
		System.out.println(name+" My name will go down in history!");

	}
public void attack(String s) {
	if((s=="hammer")||(s=="sword")) {
	System.out.println(this.name+" : "+"Rrrrrrrrrrrr..");
	System.out.println(this.name+" : "+"I’ll crush you with my "+s+" !");
	}
	else {
		System.out.println("he doesn't attack");
	}
}
@Override
public void moveRight() {
	System.out.println(this.name+ ": moves right like a bad boy .");
};
@Override
public void moveLeft() {
	System.out.println(this.name+ ": moves left like a bad boy .");
};
@Override
public void moveBack() {
	System.out.println(this.name+ ": moves back like a bad boy .");
};
@Override
public void moveForward() {
	System.out.println(this.name+ ": moves forward like a bad boy .");
};


}
