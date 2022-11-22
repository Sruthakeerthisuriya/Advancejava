package Assignment;




interface A{
	static void m1() {
		System.out.println("This is m1 method");
	}
	static void m2() {
		System.out.println("This is m2 method");
	}
	static void m3() {
		System.out.println("This is m3 method");
	}
	
}
abstract class B implements A {
	public abstract void m1();
	
	public static void m2() {
		// TODO Auto-generated method stub
		System.out.println("This is B implements m2");
	}	
}
abstract class C implements A{
	public abstract void m1();
	public abstract void m3();
}
/*class D {
	D a=new D();
	//D.m1();
	//D.m2();
	
	
	
}*/
public class D{
	public static void main(String[] args) {
		
		//A.m1();
		
	    //A.m2();
	    //A.m3();
	    
		B.m2();
		
		
	}

	


	

}
/*interface Printable{
	
}  
class A implements Printable{  
	public void a()
	{
		System.out.println("a method");
	}  
}  
class B implements Printable{  
	public void b()
	{
		System.out.println("b method");
	}  
}  
  
class Call{  
	void invoke(Printable p)
	{//upcasting  
		if(p instanceof A){  
			A a=(A)p;//Downcasting   
			a.a();  
			}  
		if(p instanceof B)
		{  
			B b=(B)p;//Downcasting   
			b.b();  
		}  
	}	  
}//end of Call class  
  
class Test4{  
	public static void main(String args[]){  
		Printable p=new B();  
		Call c=new Call();  
c.invoke(p);  
}  
}  */

