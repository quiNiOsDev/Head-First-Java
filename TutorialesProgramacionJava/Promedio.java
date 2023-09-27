package TutorialesProgramacionJava;

import java.util.Scanner;

public class Promedio {
    public static void main (String[]args){
        int num1,num2,num3,num4;
        double promedio;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el 1er numero : ");
        num1 =teclado.nextInt();
        System.out.println("Ingrese el 2do numero : ");
        num2 =teclado.nextInt();
        System.out.println("Ingrese el 3ero numero : ");
        num3 =teclado.nextInt();
        System.out.println("Ingrese el 4to numero : ");
        num4 =teclado.nextInt();
        promedio=((double)num1+(double)num2+(double)num3+(double)num4)/4;
        System.out.println("El promedio de los 4 numeros es : " + promedio);

    }
}
