package javaone;

public class Qwer
{
	String host;
	String name;
	String pwd;

	//���캯��
	//���캯�������ã������е����Խ��г�ʼ����ֵ
	public Qwer(String host,String name,String pwd)
	{
		this.host=host;
		this.name=name;
		this.pwd=pwd;
		System.out.println("����һ���в����ĺ���");
	}
	//���캯��
	Qwer()
	{
		System.out.println("����һ��û�в����ĺ���");
	}
	public static void main(String[] args)
	{
		//1.һ���������û���ṩ�κεĹ��캯����
    	//java����������ʽ�Զ��ṩһ��û�в����Ĺ��캯��
    	//����������ʹ�á�
    	//2.���һ�������ṩ�˹��캯�������������������������캯����
    	
		//��������
    	
    	//���һ�����ж�����캯������ô�͸����������ṩ�˶�����ʻ��ơ�
    	
    	//������캯���γ�������---->ͬһ������������ͬ��ʵ�ֽ����
		//Qwer q=new Qwer("127.0.0.1","�ܷ�","123456");
		Qwer q=new Qwer();
	}
}
