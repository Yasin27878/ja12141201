public class PlayerTest{
	public static void  main (String[] args){
		//����
		System.out.println("-----------˫�ι���-----------------");
		PingpangCoach c1 = new PingpangCoach("����Ƽ",36);
		c1.eat();
		c1.speak();
		c1.teach();
		
		PingpangPlayer p1 = new PingpangPlayer("��־��",27);
		p1.eat();
		p1.speak();
		p1.study();
		System.out.println("----------------------------");
		
		basketCoach c2 = new basketCoach("Ҧ��",32);
		c1.eat();
		c1.teach();
	
		basketPlayer p2 = new basketPlayer("С��",20);
		p1.eat();
		p1.study();
		System.out.println("---------------------�޲ι���-------------------------");
		PingpangCoach c11 = new PingpangCoach();
		
		c11.eat();
		c11.speak();
		c11.teach();
		
		PingpangPlayer p11 = new PingpangPlayer();
		p11.eat();
		p11.speak();
		p11.study();
		System.out.println("----------------------------");
		
		basketCoach c22 = new basketCoach();
		c22.eat();
		c22.teach();
	
		basketPlayer p22 = new basketPlayer();
		p22.eat();
		p22.study();
	}
}