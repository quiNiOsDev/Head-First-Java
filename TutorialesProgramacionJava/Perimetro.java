package TutorialesProgramacionJava;

import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) {
        int lado,perimetro;
        System.out.println("Ingresa la medida del cuadrado:");
        Scanner teclado= new Scanner(System.in);
        lado=teclado.nextInt();
        perimetro=lado*4;
        System.out.println("El perímetro del cuadro es: "+perimetro );



    }
}
