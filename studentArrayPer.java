import java.util.Scanner;
public class studentArrayPer {
    int roll;
    String name;
    float m1, m2, m3, per;
    String result;

    Student(int r, String n, float m11, float m22, float m33)
    {
        roll = r;
        name = n;
        m1= m11;
        m2= m22;
        m3= m33;
        per = (m1+m2+m3)/3;
        
        if(per< 33) 
        result = "FAIL";
        else if (per<= 44)
        result = "THIRD DIVISION";
        else if (per<= 59)
        result = "SECOND DIVISION";
        else 
        result= "FIRST DIVISION";
    }
    
    void disp()
    {
        System.out.println(roll+" "+name+" "+m1+" "+m2+" "+m3+" "+per+" "+result);
    }
    public static void main(String args[]) {
        Student s[] = new Student[3];
       // int i;
        int roll;
        String name;
        float m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<s.length; i++) {
            roll = sc.nextInt();
            name = sc.next();
            m1 = sc.nextFloat();
            m2 = sc.nextFloat();
            m3 = sc.nextFloat();
            s[i]= new Student(roll, name, m1, m2, m3);
            s[i].disp();
        }
    }
}