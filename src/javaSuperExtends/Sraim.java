package javaSuperExtends;

public class Sraim extends Monster {
	int MAXHP = 20;
	void sleep() {
		this.hp = super.MAXHP;
		System.out.println(this.hp + "ここでhpが10なら親クラスのMAXHP20なら子クラスのMAXHP");
	}
	void attack() {
		this.mp -= 4;
	}
}
