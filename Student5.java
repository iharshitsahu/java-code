class Student5 {
    int count;
    void disp() {
        System.out.println("Number of objects:-"+count);
        static int c;
        Student5() {
            c++;
            count = c,
        }
        static void main(String args []) {
            Student5 s1 = new Student5()
            Student5 s2 = new Student5()
            Student5 s3 = new Student5()
            s1.disp();
            s2.disp();
            s3.disp();
        }
    }
}