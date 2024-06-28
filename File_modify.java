import java.io.*;
import java.util.*;
class File_Modify
{
    public static void main(String ad[])throws IOException
    {
        String name,reg_no,regd;
        int p=1;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        FileWriter fw=new FileWriter("Eleven.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter Registration Number:");
            reg_no=sc.nextLine();
            System.out.println("Enter name:");
            name=sc.nextLine();
            pw.println(reg_no);
            pw.println(name);
            p++;
        }
        while(p<40);
        pw.close();
        bw.close();
        fw.close();
        System.out.println("The records are:");
        System.out.println("Reg.Number"+"\t"+"Name");
        Scanner sc1=new Scanner(new File("Elven.txt"));
        while(sc1.hasNext())
        {
            reg_no=sc1.nextLine();
            name=sc1.nextLine();
            System.out.println(reg_no+"\t\t"+name);
        }
        sc1.close();
        FileWriter fw1=new FileWriter(" Temp.txt");
        BufferedWriter bw1=new BufferedWriter(fw1);
        PrintWriter pr=new PrintWriter(bw1);
        Scanner sc2=new Scanner(new File("Eleven.txt"));
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Registration Number whose record to be modified:");
        regd=inp.nextLine();
        while(sc2.hasNext())
        {
            reg_no=sc2.nextLine();
            name=sc2.nextLine();
            if(regd.equals(reg_no))
            {
                System.out.println("The record is as under:");
                System.out.println(reg_no+"\t\t"+name);
                System.out.println("Enter corrected name:");
                String name1=in.readLine();
                pr.println(reg_no);
                pr.println(name1);
            }
            else
            {
                pr.println(reg_no);
                pr.println( name);
            }
        }
        pr.close();
        sc2.close();
        fw1.close();
        bw1.close();
        File f1=new File("Eleven.txt");
        if(f1.delete())
        System.out.println("File deleted!");
        else
        System.out.println("File not deleted!");
        File f2=new File("Temp.txt");
        boolean Rename=f2.renameTo(f1);
        if(Rename)
        System.out.println("Renaming of file done!!");
        else
        System.out.println("Renaming of file not done?");
        Scanner sc3=new Scanner(new File("Eleven.txt"));
        System.out.println("Modified records are:");
        System.out.println("Reg.Number"+"\t"+"name");
        while(sc3.hasNext())
        {
            reg_no=sc3.nextLine();
            name=sc3.nextLine();
            System.out.println(reg_no+"\t\t"+name);
        }
        sc3.close();
    }
}
