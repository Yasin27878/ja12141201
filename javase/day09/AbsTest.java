public class AbsTest{
	public static void main(String[] args){
		Shape s1= new Triangle("黑色",3,4,5);
		Shape s2 = new Circle("黄色",4);
		System.out.println(s1.getType());
		System.out.println("周长是"+s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println("周长是"+s2.calPerimeter());
		System.out.println("--------------------------");
		
		 
		Triangle s11 = new Triangle();
		Circle s22 = new Circle();
		s11.setColor("黄");
		s11.setSides(3,4,5);
		
		s22.setColor("绿");
		s22.setR(10);
		System.out.println(s11.getType());
		System.out.println("周长是"+s11.calPerimeter());
		System.out.println(s22.getType());
		System.out.println("周长是"+s22.calPerimeter());
	}
}