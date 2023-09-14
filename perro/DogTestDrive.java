package perro;

import java.util.Arrays;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.size=40;
        d.breed="Yorkie";
        d.name="Sticky";
        d.barck();

        System.out.println(d.name+" el "+d.breed+" que pesa "+d.size+" gramos");
    }

}
