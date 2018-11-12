package javaone;

public class Qwer
{
	String host;
	String name;
	String pwd;

	//构造函数
	//构造函数的作用：给类中的属性进行初始化赋值
	public Qwer(String host,String name,String pwd)
	{
		this.host=host;
		this.name=name;
		this.pwd=pwd;
		System.out.println("这是一个有参数的函数");
	}
	//构造函数
	Qwer()
	{
		System.out.println("这是一个没有参数的函数");
	}
	public static void main(String[] args)
	{
		//1.一个类中如果没有提供任何的构造函数，
    	//java编译器会隐式自动提供一个没有参数的构造函数
    	//给创建对象使用。
    	//2.如果一个类中提供了构造函数，创建对象必须依赖这个构造函数。
    	
		//创建对象
    	
    	//如果一个类有多个构造函数，那么就给创建对象提供了多个访问机制。
    	
    	//多个构造函数形成了重载---->同一个方法名，不同的实现结果。
		//Qwer q=new Qwer("127.0.0.1","曹峰","123456");
		Qwer q=new Qwer();
	}
}
