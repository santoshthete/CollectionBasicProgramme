package com.object;

//import com.object;

class Test{
	public void add()
	{
		System.out.println("c"+20+30);
	}
}

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	// by using instance method
	Class c=Class.forName("com.object.Test");
	Test t=(Test) c.newInstance();
	t.add();
	
	//by assigning another object reference 
	Test t1=t;
	t1.add();
	
	//by making clone from from anather object
	
	 Test t2=(Test) t1.clone();
	 t2.add();
	 
	 
	 //by using get class loader
	 
	Test t3=(Test) t2.getClass().getClassLoader().loadClass(object.Test);
	t3.add();
	 

}
}













