package javaone;

public class Cat
{
	//è������
	private String name;
	//è����ɫ
	private String color;
	public void fanf()
	{
		System.out.println("è��������:"+this.name+",è����ɫ�ǣ�"+this.color);
	}
	public static void main(String[] args)
	{
		Cat q=new Cat();
		q.name="С��";
		q.color="��ɫ";
		q.fanf();
		
	}

}
