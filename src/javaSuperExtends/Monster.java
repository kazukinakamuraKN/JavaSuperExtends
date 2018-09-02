package javaSuperExtends;

public class Monster {
	final int MAXHP = 10;
	int hp = 10;
	int mp = 100;
	String name;
	Monster(String name,int hp ,int mp){
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}
	Monster(int hp,int mp){
		this("無名",hp,mp);
	}
	Monster(){
		this(10,20);
	}
}
