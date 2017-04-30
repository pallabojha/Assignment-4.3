
public class A extends B{
	void test(){System.out.println("I am A");}
    void display(){test(); }	// invoke class A test(); mathod
}
 class B extends C{ void test(){System.out.println("I am B");} }
 class C{void test(){System.out.println("I am C");} }
 
  class Foroutput{
	 public static void main(String arg[]){
		 A obj=new A();
		 obj.display();
	 }
 }
