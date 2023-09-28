package Exercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        System.out.println("Ejercicio 01");
        double numero01=20,numero02=3;
        double suma= numero01+numero02;
        double resta= numero01-numero02;
        double multi= numero01*numero02;
        double div= numero01/numero02;
        double res= numero01%numero02;
        System.out.println("La suma es " +suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multi);
        System.out.println("La division es "+div);
        System.out.println("El residuo es "+res);

        System.out.println("\nEjercicio 02");
        int number01=5, number02=4;
        if (number01<number02){
            System.out.println(number02+" es mayor que "+number01);
        }else if (number01>number02){
            System.out.println(number02+" es menor que "+number01);
        }else if (number01==number02){
            System.out.println("Son iguales");
        }

        System.out.println("\nEjercicio 03");
        System.out.println("Ingresa tu nombre : ");
        Scanner sc =new Scanner(System.in);
        String ejercicio3 = sc.nextLine();
        System.out.println("Bienvenido "+ ejercicio3 );

        System.out.println("Ingresa tu edad : ");
        int age = sc.nextInt();
        System.out.println("Tienes  "+ age );

        System.out.println("\nEjercicio 04");





        System.out.println("\nEjercicio xx");
        int[] codigo= new int[9];
        codigo[0]=1;
        codigo[1]=2;
        codigo[2]=3;
        codigo[3]=4;
        codigo[4]=5;
        codigo[5]=6;
        codigo[6]=7;
        codigo[7]=8;
        codigo[8]=9;
        for (int i:codigo
        ) {
            System.out.println(i);
        }
    }


}
