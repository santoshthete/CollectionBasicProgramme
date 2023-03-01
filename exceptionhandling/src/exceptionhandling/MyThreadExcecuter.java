package exceptionhandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreas implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	//System.out.println("hi you doing thread operation");
	try {
		//Thread.sleep(100);
		System.out.println("*****************");
	}catch (Exception e) {
		System.out.println(e);// TODO: handle exception
	}
	
	}

	

public class MyThreadExcecuter {
public static void main(String[] args){
	
	ExecutorService es=Executors.newFixedThreadPool(22522);
	MyThreas mt=new MyThreas();
  
	es.execute(mt);
//   for(int i=0;i<=1066;i++)
//	{
//		
//		
//		//System.out.println(i);
//	}
 
	es.shutdown();
	
	
}
}}