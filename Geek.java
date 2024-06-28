import java.util.*;

class Geek{
    String name;
    int Id;
    Geek(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }
}

class GFG {
    public static void main(String args[]) {
        Geek geek1 = new Geek("Harshit",1);
        System.out.println("Geek name!"+geek1.name+" GeekId:"+geek1.Id);
    }
}