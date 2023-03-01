package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//unchecked type.
public class ThrowDemo {
static void readFile() throws FileNotFoundException
{
	FileInputStream fis= new FileInputStream("C:\\Users\\user\\Downloads");
	throw new FileNotFoundException("plz pass correct file path");
	
}
public static void main(String args[]) {
	try {
		readFile();
	}catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	System.out.println("other code");
}
}
