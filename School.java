import java.io.*;
import java.util.*;
public class School{ 
		
    public static void main(String[] args) throws IOException,ClassNotFoundException,FileNotFoundException
    { 
    	int choise;
    	Scanner scan = new Scanner(System.in);
		do
		{
		System.out.println("Welcome \n Please visit the details::\n 1. Enter Class \n 2. Enter Students Details \n 3. Search Student by Enrollment Number \n4. Show All Students of particular class \n Enter Your Choise::");
		choise = scan.nextInt();	
				
			switch(choise)
			{
				case 1:
				{
					CreateClass createClass = new CreateClass();
					createClass.classCreate();
					System.out.println("Class Created Successfully!!");
					break;
				}
				case 2:
				{
					CreateStudent createStudent = new CreateStudent();
					createStudent.CreateStudents();
					System.out.println("Students Details are added Successfully!!");	
					break;
				}
				case 3:
				{
					SearchStudent searchStudent = new SearchStudent();
					searchStudent.searchDetails();
					System.out.println("Search Successfully!!");
					break;
				}
				case 4:
				{
					ReadStudent readStudent = new ReadStudent();
					readStudent.readDetails();
					System.out.println("\n Read Successfully \n Thank You");	
					break;
				}
				// case 5:
				// {
				// 	ReadStudent readStudent = new ReadStudent();
				// 	readStudent.readAllFile();
				// 	System.out.println("\n Read Successfully \n Thank You");	
				// 	break;
				// }
				default:
				{
					System.out.println("\nPLEASE ENTER VALID Number::");
					break;
				}
			}
		}
		while(choise!=5);
	} 
}