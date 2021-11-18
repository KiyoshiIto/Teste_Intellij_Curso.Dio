package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        int sum = sum(a, b);
        int sub = sub(a, b);
        int mult = mult(a, b);
        int div = div(a, b);

        System.out.println("Soma : " + sum);
        System.out.println("Subitração : " + sub);
        System.out.println("Multiplicação : " + mult);
        System.out.println("Divisão : " + div);
    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}
