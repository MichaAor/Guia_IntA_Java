package com.company;

import java.io.InputStream;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	/*Ej 1:
        int N = 8;
        double A = 99;
        char C = 'M';
        double suma = N+A , diferencia= A-N;
        int valornum = C;

        System.out.println("El valor de las siguientes operaciones es la siguiente: [SUMA= " + suma + "]  "  +
                "[DIFERENCIA= "+ diferencia + "]  [VALOR NUMERICO=" + C "]");

    //Ej 2:
          int x = 1, y = 2;
          double NN = 3, M = 4;
          double suma4  = x + y + NN + M;
          double multiplicacion = x * y * NN * M;
          System.out.printf("\nSuma (x + y + NN + M) = " + suma4 + "\nMultiplicacion (x * y * NN * M) = " + multiplicacion);

    //Ej 3:
         int NNN = 1;
         NNN = NNN + 77;
            while (NNN!=3){
                NNN--;
                                 }
         NNN = NNN * 2;
         System.out.printf("NNN = " + NNN);

    //Ej 4:
        int A=1, B=2, C=3, D=4, aux;
        aux = B; B=C;  C=A; A=D; D = aux;

    //Ej 5:
        int AA = 42;
        if(AA%2==0){
            System.out.printf("\nEl valor es par!");
        }else{
            System.out.printf("\nEL valor es impar!");
             }

    //Ej 6:
        int BB = 20;
        if(BB>=0){
            System.out.printf("\nEl valor es positivo!");
        }else {
            System.out.printf("\nEL valor es negativo!");
        }

    //Ej 7:
        int CC = 75;
        if(CC>=0){
            System.out.printf("\nEl valor CC es positivo!");
        }else {
            System.out.printf("\nEL valor CC es negativo!");
        }
        if(CC%2==0){
            System.out.printf("\nEl valor CC es par!");
        }else{
            System.out.printf("\nEL valor CC es impar!");
        }
        if(CC%5==0){
            System.out.printf("\nEl valor CC es multiplo de 5!");
        }else{
            System.out.printf("\nEL valor CC no es multiplo de 5!");
        }
        if(CC%10==0){
            System.out.printf("\nEl valor CC es multiplo de 10!");
        }else{
            System.out.printf("\nEL valor CC no es multiplo de 10!");
        }
        if(CC<100){
            System.out.printf("\nEl valor CC es menor que 100");
        }else{
            System.out.printf("\nEl valor CC es mayor a 100");
        }
    //Ej 8:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre porfis: ");
        String nombre = sc.nextLine();
        System.out.println("Buenos dias "+nombre);


     //Ej 9:
        Scanner scc = new Scanner(System.in);
        System.out.printf("Ingrese un valor: ");
        int valor = scc.nextInt();
        int doble = valor *2, triple = valor * 3;
        System.out.printf("El doble de su valor es " + doble + "\nEl triple de su valor es " + triple);

    //Ej 10:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura que decia convertir: ");
        float tempF = sc.nextFloat();
        float tempC = (((tempF - 32) * 5)/9);
        System.out.println("Su temperatura en FAHRENHEIT ingresada fue de : " + tempF + ". Su valor en Celsius es de: " + tempC);

    //Ej 11:
        Scanner sc = new Scanner(System.in);
        float pi = 3.14159265359f;
        System.out.println("Ingrese el radio de su circunferencia: ");
        float radio = sc.nextFloat();
        System.out.println("La longitud de su circunferencia es de " + (2 * pi * radio) +
         " y su area es de: " + (pi * (radio * radio)));

    //Ej 12:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad a convertir (km/h): ");
        float velocidad = sc.nextFloat();
        System.out.println("Su velocidad ingresada convertida a m/s es igual a :  " + (velocidad * 5/18));

    //Ej 13:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de cateto 1 y luego de cateto 2: ");
        float cat1 = sc.nextFloat(), cat2 = sc.nextFloat();
        System.out.println("El valor de la hipotenusa de su triangulo es igual a: "
                + Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2)));

    //Ej 14:
        Scanner sc = new Scanner(System.in);
        float pi = 3.14159265359f;
        System.out.println("Ingrese el radio de su esfera: ");
        float volumen = (float) ((4 * pi * Math.pow(sc.nextFloat(),3) / 3));
        System.out.println("El volumen de su esfera es de "+ volumen);

    //Ej 15:
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores de los lados de su triangulo: ");
        float ladoA=sc.nextFloat(),ladoB=sc.nextFloat(),ladoC=sc.nextFloat();
        //Se aplica formula de Heron
        float semiPerimetro = (ladoA + ladoB + ladoC) / 2 ;

        System.out.println("El area de su triangulo conociendo solo los lados es: "
                + Math.sqrt(semiPerimetro * (semiPerimetro-ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC)));

    //Ej 16:
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ingrese un numero ");
        n=sc.nextInt();

        System.out.println("Primera cifra  "+(n/100));
        System.out.println("Segunda cifra  "+(n/10%10));
        System.out.println("Tercera cifra  "+(n%10));

    //Ej 17:
        Scanner sc = new Scanner(System.in);
        int N=0,flag =0;
        while(flag ==0){
            System.out.println("Ingrese su numero entero de 5 cifras");
            N = sc.nextInt();
            if(N < 10000){
                System.out.println("Ingreso un numero menor a 5 cifras");
            }
            flag =1;
        }

        System.out.println( "Los numeros correspondientes a las posiciones impares son: ");
        System.out.println("Primera cifra impar  "+(N/10000));
        System.out.println("Segunda cifra  "+(N/100%10));
        System.out.println("Tercera cifra  "+(N%10));*/

    //Ej 18
        Scanner sc = new Scanner(System.in);
        int H=0,M=0,S=0,flag=0;
        while(flag ==0){
            System.out.println("Ingrese la hora,minutos y segundos en el orden correspondientemente mencionado: ");
            H= sc.nextInt();    M= sc.nextInt();    S= sc.nextInt();
            if(H > 24 || M > 60 || S > 60){
                System.out.println("Ingreso mal alguno de los datos requeridos,por favor,reintente");
            }
            flag =1;
        }
        LocalTime date = LocalTime.of(H,M,S);
        System.out.println("Su fecha ingresada es: " + date);
    }
}
