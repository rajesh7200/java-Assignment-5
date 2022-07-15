class Calculater
{
 static int add()
 {
	int a=10;
	int b=20;
	int c=a+b;
 
	return c;
 }
 
  static int sub()
 {
	int a=50;
	int b=20;
	int c=a-b;
 
	return c;
 }
 
  static int mul()
 {
	int a=10;
	int b=20;
	int c=a*b;
 
	return c;
 }
 
  static int div()
 {
	int a=100;
	int b=20;
	int c=a/b;
 
	return c;
 }
public static void main(String[] args)
{
	int x=add();
	System.out.println("addition is "+x);
	
	int y=sub();
	System.out.println("subtraction is "+y);
	
	int z=mul();
	System.out.println("multipilication is "+z);
	
	int a=div();
	System.out.println("addition is "+a);
	

}


}