public class BaseTest{
	
	private 	String pri_str = "˽�б���";
				String def_str = "Ĭ�ϱ���";
	protected 	String pro_str = "protected����";
	public 		String pub_str = "public����";
	
	private void pri_show(){
		System.out.println("˽�з���");
	}
	 void def_show(){
		System.out.println("Ĭ�Ϸ���");
	}
	protected void pro_show(){
		System.out.println("protected����");
	}
	public void pub_show(){
		System.out.println("public����");
	}
	
}

 class BeseDemo{
	public static void main (String [] args){
		BeseTest bese = new BeseTest();
		best.pri_show();
		best.def_show();
		best.pro_show();
		best.pub_show();
		
	}
 }