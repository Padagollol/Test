abstract class Shape
{
 public abstract void print Area(int a,int b)
}
class Triangle extend shape
{
 public vooid print Area(int a,int b)
 {
  double c=0.5*a*b;
  System.out.prontln("  "+a);
 }
}
class Rectangle extend Shape
{
 public void print Area(int a,int b)
 {
  int c;
  c=a*b;
  System.out.println(c);
 }
}
class Circle extend Shape
{
 public void print Area(int a,int b)
 {
  double.d;
  d=3.14*a*b;  
  System.out.println(d);
 }
}
public static void main(String []args)
{
 Triangle.T=new Triangle ();
 T.print Area(10,20);
 Rectangle R= new Rectangle();
 R.print Area(10,20);
 Circle C=new Circle();
 C.print Area (10,10);
}
 
  
