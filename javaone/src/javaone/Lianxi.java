package javaone;

public class Lianxi
{
	//姓名
	 private String name;
	//年龄
	private int age;
	//java中通过set和get来进行数据的访问，提高数据访问的安全性
	//方法的访问修饰符都是用public 来修饰的
	
	//设置值
	public void setAge(int age)
	{
		if(age>0 && age<300)
		{
			this.age=age;
		}
		else
		{
			System.out.println("你的年龄不合法");
		}
	}
	//获取值
	public int getAge()
	{
		//this 当前调用这个方法的对象
		if(this.age>0 && this.age<500)
		{
			return this.age;
		}
		else
		{
			return 0;
		}
	}
	//设置值
	public void setName(String name)
	{
	   this.name=name;
	}
	//获取值
	public  String getName()
	{
		return this.name;
	}

}
