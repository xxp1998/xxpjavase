package javaone;

public class School
{
	//学生名称   隐式：  作用域    全局变量
		//实例变量: 实例化对象才能访问的变量
		String name;
		//static 静态变量:
		 static String schoolname;
		 byte age;
		 static int count;
		 double gzqwe;
		 //方法 （void），没有返回值
		 void sdfg()
		 {
			 double addgzs=100;
			 gzqwe=addgzs+gzqwe;
			 System.out.println("学生的姓名是:"+name+"增加的奖金："+addgzs+"学生的工资是:"+gzqwe);
			 
		 }
		
		public static void main(String[] args)
		{
			//在main方法中，对实例对象的调用 必须先创建对象
			//static方法不能直接调用类的全局实例变量
			//实例化变量
			School a = new School();
			
			
			schoolname="南京科技职业学院";
			//数量加一
			count++;
			//String默认值是:null 
			System.out.println(a.name+","+a.age+","+schoolname+","+count);
			a.name="曹峰";
			a.age=21;
			a.gzqwe=1000;
			a.sdfg();
			//System.out.println(a.name+","+a.age+","+schoolname+","+count);
			
			School b = new School();
			b.name="许晓鹏";
			b.age=20;
			b.gzqwe=100;
			//System.out.println(b.name+","+b.age+","+schoolname+","+count);
			b.sdfg();
			System.out.println(a.name+"工资为:"+a.gzqwe);
			System.out.println(b.name+"工资为:"+b.gzqwe);
		}

}
