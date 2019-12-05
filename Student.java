import java.io.*;
public class Student implements Serializable,Comparable<Student>
{
   private int enrol;
   String name;
   double mobile;
   public Student(int enrol, String name, double mobile)
   {
      this.enrol = enrol;
      this.name = name;
      this.mobile = mobile;
   }
   public void display()
   {
     System.out.println("Enrollment:: " + enrol + " Name:: " + name + " Mobile: (+91)" + mobile);
   }

   public int getEnrol()
	{
		return this.enrol;
	}
	public int compareTo(Student s)
	{
		return this.enrol - s.enrol;
	}
}    