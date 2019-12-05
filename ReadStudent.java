import java.io.*;
import java.util.*;
public class ReadStudent 
{
   ReadStudent(){   }
   public void readDetails () throws IOException, FileNotFoundException, ClassNotFoundException
   {
    int classnum;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Class Name::");
    classnum = scan.nextInt();

    File file = new File(classnum+".txt");
    ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
    Student stud;
    try
    {
      while(true)
      {
       stud = (Student)in.readObject();
       stud.display();
      }
   }
   catch(EOFException e)
      {
        in.close();
      }
  }
}
// public void readAllFile() throws IOException, FileNotFoundException, ClassNotFoundException
//{
//     File folder = new File("G:/Mirror_Tech/student");
//     File[] listOfFiles = folder.listFiles();

//     for (int i = 0; i < listOfFiles.length; i++) 
  //   {
//       File file = listOfFiles[i];
//       if (file.isFile() && file.getName().endsWith(".txt")) 
 //         {
//         String content = FileUtils.readFileToString(file);
//         /* do somthing with content */
//       } 
// }
//}