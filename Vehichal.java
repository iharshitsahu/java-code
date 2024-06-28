class Vehicle {
    public String brand;
    protected String model;
    private double price;
    int numWheels;
    int yearOfManufactor;
    String color;
    public double getPrice(){
        return price;
    }
    public void printDescription(){
        System.out.println(brand +" " + model +" "+price+" "+numWheels);
    }
    public static void main(String args[]) {
        printdesc = printDescription();
        System.out.println(printdesc);
    }
}


