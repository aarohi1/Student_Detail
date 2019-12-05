import java.io.*;
import java.util.*;
public class SearchStudent
{
  SearchStudent(){}
  public void searchDetails() throws IOException, ClassNotFoundException
   { 
	   int classnum,num=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("In which class You want to Search::");
     classnum = sc.nextInt();

     File file = new File(classnum+".txt");
     ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
     System.out.println("Enter Student Erollment Number for serch Student Detail:");
	   num = sc.nextInt();
     
     Student stud;
      try
      {
        while(true)
        {
           stud = (Student)in.readObject();
		       if(num==stud.getEnrol())
		        {
           		stud.display();
        	  }
	      }
      }
      catch(EOFException e)
      {
        in.close();
      }
   }
}



