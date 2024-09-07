package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContarLetras contarLetras = new ContarLetras();

        System.out.println("Digite uma string para verificar a quantidade de letras 'a' e 'A'.");
        String string = scanner.nextLine();

        int contador = contarLetras.contarLetras(string);

        System.out.println("A letra 'a' e 'A' aparece " + contador + " vez(es) na string.");

        scanner.close();
    }
}