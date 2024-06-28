import java.util.Scanner;
public class Student
{
 String Name;
 String Sub1;
 String Sub2;
 String Sub3;
 int Rollno;
 Details()
 {
 Name=null;
 Sub1=null;
 Sub2=null;
 Sub3=null;
 Rollno=0;
 }
 
 public void getData()
 {
 Scanner in=new Scanner(System.in);
 System.out.print("Enter Student RollNo:"); Rollno=in.nextInt(); in.nextLine();
 System.out.print("Enter Student Name:"); Name=in.nextLine();
 System.out.print("Enter Subject 1 Name:"); Sub1=in.nextLine();
 System.out.print("Enter Subject 2 Name:"); Sub2=in.nextLine();
 System.out.print("Enter Subject 3 Name:"); Sub3=in.nextLine();
 System.out.println();
 }
 public void Display()
 {
 System.out.println("Student RollNo:"+Rollno); 
 System.out.println("Student Name:"+Name); 
 System.out.println("Subject 1 Name:"+Sub1); 
 System.out.println("Subject 2 Name:"+Sub2); 
 System.out.println("Subject 3 Name:"+Sub3); 
 }
 public int getR_no()
 {
 return Rollno;
 }
 public static void main(String args[])
 {
 Scanner in=new Scanner(System.in);
 Student ob[]=new Student[5];
 int i; 
 for(i=0; i<5; i++)
 {
 ob[i]=new Student();
 ob[i].getData();
 }
 System.out.print("Enter roll no to be searched for:");
 int rno=in.nextInt();
 
 for(i=0; i<5; i++)
 if(ob[i].getR_no()==rno)
 {
 ob[i].Display(); 
 break;
 }
 
 if(i==5)
 System.out.print("Record not found!!.."); 
 }
}