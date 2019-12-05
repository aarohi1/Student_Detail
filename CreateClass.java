import java.io.*;
import java.util.*;
public class CreateClass { 
		
   CreateClass(){}
   public void classCreate() throws IOException
    { 
    	//CreateStudent cs = new CreateStudent();
    	//ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Students_details.txt",true));
        int size;
       	System.out.println("Enter class of your school::");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		File f;
		f = new File(size + ".txt");
		f.createNewFile();
	} 
}