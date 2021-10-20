package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);
        int a = 0, b = 1, c, n;

        System.out.print("Por favor ingrese el numero de veces que desea repetir la secuencia de fibonacci: ");
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }
    }
}
