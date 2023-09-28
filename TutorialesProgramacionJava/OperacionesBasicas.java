package TutorialesProgramacionJava;

import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        int num1,num2,num3,num4,suma,producto;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el 1er numero : ");
        num1= teclado.nextInt();
        System.out.println("Ingrese el 2do numero : ");
        num2=teclado.nextInt();
        suma=num1+num2;
        System.out.println("La suma del 1er y 2do numero es :"+suma);

        System.out.println("Ingrese el 3er numero : ");
        num3= teclado.nextInt();
        System.out.println("Ingrese el 4to numero : ");
        num4=teclado.nextInt();
        producto=num3*num4;
        System.out.println("El producto del 3er y 4to numero es :"+producto);




    }
}
