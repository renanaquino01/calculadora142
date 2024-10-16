// 1 - bibliotecas / Imports

// 1.5 - Pacotes
package com.iterasys; // pacote de classe (varias classe dentro de um pacote) 

// 2 - Classe
public class Main {
    // 2.1 Atributos

    // 2.2 Métodos e Funcções
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        // float resultado = somar(5,7)
        // System.out.println("a soma de 5 + 7 =" + resultado);
    }

    public static float somar(Float num1, float num2){
        float resultado = num1 + num2;
        System.out.println("Soma de " + num1 + " + " + num2 + " = " + resultado); // "soma de 5 + 7 = 12"
        return resultado;
    }

    public static float subtrair(float num1, float num2){
        float resultado = num1 - num2;
        System.out.println("Subtração de " + num1 + " - " + num2 + " = " + resultado );
        return resultado;
    }

    public static float multiplicar(float num1, float num2){
        return num1 * num2;
    }

    public static float dividirIF(float num1, float num2){
        if (num2 != 0){
            return num1 / num2;
        }
        else {
            System.out.println("nao e possivel dividir por zero");
            return 0;
        }      
    }
        
    public static String dividirTry(float num1, float num2){
        try{
            return String.valueOf(num1 / num2);
        } catch(Exception e){
            return "nao e possivel dividir por zero";
        }

    }

    





}