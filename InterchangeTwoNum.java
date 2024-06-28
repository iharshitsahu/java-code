class InterchangeTwoNum {
    public static void main(String args[]) {
       int x=5;
       int y=9;
       System.out.println("Before Interchange Numbers: x="+x+" y="+y);
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("After interchange Numbers: x="+x+" y="+y);
    }
}