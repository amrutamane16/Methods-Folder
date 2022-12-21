package methodsdemo;

public class staticmethod 
{ 
	public static void main(String args[])
	{
		m1();
		staticotherclass.m3();
		nonstatic ns=new nonstatic();
		ns.m5();
		ns.m6();
	}
	public static void m1()
	{
		System.out.println("running static method m1");
	}
	public static void m2()
	{
		System.out.println("running static method m2");
	}

}
