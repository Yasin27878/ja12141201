//抽象的狗
//dog 某种品种的狗
public class Dog{
	//属性
	
	int age;
	String color;
	static String type;//品种
	
	//方法
	
	Dog(){
	
	}
	Dog(int age,String color){
		this.age = age;
		this.color = color;
	}
	voidbarking(){}
	System.out.println("barking.....");
	
}