import java.util.Scanner;

class Student 
{
    int roll;
    String name;
    float m1, m2, m3, per;
    String result;
    Student(int r, String n, float m11, float m22, float m33)
    {
        roll = r;
        name = n;
        m1 = m11;
        m2 = m22;
        m3 = m33;
        per = (m1+m2+m3)/3;
        if(per < 33)
        {
            result="Failed";
        } 
        else if(per<=44) 
        {
            result="Third Division";
        }
        else if(per<=60)
        {
            result="Second Division";
        }
        else 
        {
            result="First Division";
        }
    }
    void disp()
    {           
            System.out.println(roll+" " +name+ " " +m1+ " " +m2+ " " +m3+ " " +per+"  "+result);
    }
    static void disp(Student s[],int roll)
    {
        int i;
        for(i=0;i<s.length;i++)
        {

            if(roll==s[i].roll)
            {
                System.out.println(s[i].roll+" " +s[i].name+ " " +s[i].m1+ " " +s[i].m2+ " " +s[i].m3+ " " +s[i].per+"  "+s[i].result);
                break;
            }
        }
        if(i==s.length)
        {
            System.out.println("Sorry your rocrod does not exist");
        }
        
    }
    public static void main(String a[]) 
    {
        Student s[] = new Student [3];
        int roll;
        String name;
        float m1, m2, m3;
        System.out.println("enter Students Record");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<s.length; i++)
        {
            roll = sc.nextInt();
            name = sc.next();
            m1 = sc.nextFloat();
            m2 = sc.nextFloat();
            m3 = sc.nextFloat();
            s[i] = new Student (roll, name, m1, m2, m3);
            s[i].disp();   
        } 
        System.out.println("Enter your roll NO.");
        roll=sc.nextInt();
        sc.close();
        disp(s,roll);
    }
}
