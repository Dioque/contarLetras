package org.example;

public class ContarLetras {
    public int contarLetras(String str){
        int contador = 0;

        str = str.toLowerCase();

        for (char c: str.toCharArray()){
            if (c == 'a'){
                contador++;
            }
        }

        return contador;
    }
}
