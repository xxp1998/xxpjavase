package javaone;

public class Lianxi
{
	//����
	 private String name;
	//����
	private int age;
	//java��ͨ��set��get���������ݵķ��ʣ�������ݷ��ʵİ�ȫ��
	//�����ķ������η�������public �����ε�
	
	//����ֵ
	public void setAge(int age)
	{
		if(age>0 && age<300)
		{
			this.age=age;
		}
		else
		{
			System.out.println("������䲻�Ϸ�");
		}
	}
	//��ȡֵ
	public int getAge()
	{
		//this ��ǰ������������Ķ���
		if(this.age>0 && this.age<500)
		{
			return this.age;
		}
		else
		{
			return 0;
		}
	}
	//����ֵ
	public void setName(String name)
	{
	   this.name=name;
	}
	//��ȡֵ
	public  String getName()
	{
		return this.name;
	}

}
