package javaone;

public class Cat
{
	//猫的名字
	private String name;
	//猫的颜色
	private String color;
	public void fanf()
	{
		System.out.println("猫的名字是:"+this.name+",猫的颜色是："+this.color);
	}
	public static void main(String[] args)
	{
		Cat q=new Cat();
		q.name="小花";
		q.color="黄色";
		q.fanf();
		
	}

}
