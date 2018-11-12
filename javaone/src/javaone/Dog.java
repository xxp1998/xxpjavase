package javaone;

public class Dog
{
	//狗的颜色
	String coulor;
	 
	//狗喜欢吃骨头，所有的狗都喜欢吃骨头，所以设置成静态
	//静态方法又叫类方法
	public static void eat()
	{
		System.out.println("所有的狗都喜欢吃骨头");
	}
	public void setCoulor(String coulor)
	{
		this.coulor=coulor;
	}
	public String getCoulor()
	{
		return this.coulor;
	}
	
}
