
public class TestCharacter extends Character{
	public TestCharacter(String name) {
		
		this.name = name;
		this.life = "50";
		this.agility = "2";
		this.strength = "2";
		this.wit = "2";
		this.RpgClass="Character";
	}
	public void attack(String s) {
		System.out.println(this.name+" : "+"Rrrrrrrrrrrr..");
	}

}
