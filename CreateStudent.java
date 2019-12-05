import java.io.*;
import java.util.*;
public class CreateStudent { 
	CreateStudent(){}
		
    public void CreateStudents() throws IOException
    { 
    	Scanner scan = new Scanner(System.in);
    	Student stud;
		int size,enrol,classnum;
		String name;
		double mobile;

		System.out.println("Enter in which class you want to enter Students Details::");
		classnum = scan.nextInt();

		File file = new File(classnum+".txt");
    	//Scanner sc = new Scanner(file); 
		
		//FileOutputStream f = new FileOutputStream(File(classnum".txt"));
		//ObjectOutputStream o = new ObjectOutputStream(f);
             //fout.write(65);    
          
          FileOutputStream fos = new FileOutputStream(file);
		  ObjectOutputStream oos = new ObjectOutputStream(fos);

		System.out.println("Enter the size of Student in a Class::");
		size = scan.nextInt();
		if(size>0)
		{
			for(int i=0;i<size;i++)
			{
				try
					{
						System.out.println("Enter Student Enrollment Number::Student Name:: Mobile Number");
						enrol = scan.nextInt();
						//System.out.println("Enter Student Name::");
						name = scan.next();
						//System.out.println("Enter Student Mobile Number::");
						mobile = scan.nextInt();		         
						stud = new Student(enrol, name, mobile);
			            oos.writeObject(stud);
						System.out.println("\nEnrollment"+ enrol+"\tName::"+ name + "\tMobile::"+ mobile);
					} 
				catch(Exception e)
					{
						System.out.println(e);
					}
			}
		}
		oos.close();    
		fos.close();
	} 
}