package javaone;

public class School
{
	//ѧ������   ��ʽ��  ������    ȫ�ֱ���
		//ʵ������: ʵ����������ܷ��ʵı���
		String name;
		//static ��̬����:
		 static String schoolname;
		 byte age;
		 static int count;
		 double gzqwe;
		 //���� ��void����û�з���ֵ
		 void sdfg()
		 {
			 double addgzs=100;
			 gzqwe=addgzs+gzqwe;
			 System.out.println("ѧ����������:"+name+"���ӵĽ���"+addgzs+"ѧ���Ĺ�����:"+gzqwe);
			 
		 }
		
		public static void main(String[] args)
		{
			//��main�����У���ʵ������ĵ��� �����ȴ�������
			//static��������ֱ�ӵ������ȫ��ʵ������
			//ʵ��������
			School a = new School();
			
			
			schoolname="�Ͼ��Ƽ�ְҵѧԺ";
			//������һ
			count++;
			//StringĬ��ֵ��:null 
			System.out.println(a.name+","+a.age+","+schoolname+","+count);
			a.name="�ܷ�";
			a.age=21;
			a.gzqwe=1000;
			a.sdfg();
			//System.out.println(a.name+","+a.age+","+schoolname+","+count);
			
			School b = new School();
			b.name="������";
			b.age=20;
			b.gzqwe=100;
			//System.out.println(b.name+","+b.age+","+schoolname+","+count);
			b.sdfg();
			System.out.println(a.name+"����Ϊ:"+a.gzqwe);
			System.out.println(b.name+"����Ϊ:"+b.gzqwe);
		}

}
