package javaSuperExtends;

public class KingSraim extends Sraim {
	//MonsterClassではfinal int だが、SraimClassではint なため書きかえれる
	int MAXHP = 1000;
	KingSraim(int hp){
		super.MAXHP = this.MAXHP;//KingSraimのインスタンスのMAXHPは1000になり、ClassのMAXHP仮引数のhpになる
		this.MAXHP = hp;
		super.attack();//KingSraimインスタンスを生み出すとSraimクラスのattack()を呼び出す。
		System.out.println(this.mp);
	}
	void attack() {
		this.mp -= 20;
		System.out.println(this.mp);
	}
}
