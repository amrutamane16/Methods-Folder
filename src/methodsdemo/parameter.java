package methodsdemo;

public class parameter 
{
  public static void main(String[] args)
  {
	 add(6,1); 
	 parameter p=new parameter();
	 p.mult(7, 1);
  }
  public static void add(int a,int b)
  {
	  int sum=a+b;
	  System.out.println("addition="+sum);
  }
  public void mult(int a,int b)
  {
	 int mul=a*b; 
	 System.out.println("multiplication="+mul);
	 
  }
  
}
