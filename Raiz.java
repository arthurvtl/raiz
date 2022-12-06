/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.raiz;

import java.util.Scanner;

/**
 *
 * @author tuffv
 */
public class Raiz {

    public static void main(String[] args){
        String texto = "Qual numero vc deseja calcular a raiz?";
        double x = 0;// Raiz        
        double auX = 0; // double auxiliar de substituição
        double num = numeroUsuario(texto); // numero que o usuario deu 
        x = maisProximo(num); // chamando a função numero mais proximo
        while((x * x) != num){
            x = (x + (num/x))/2;
            if(x == auX){
                System.out.println("A raiz quadrada aproximada de " + num + " é " + x);
                break;
            }
            auX= x;
        }
        if((x * x) == num){
            System.out.println("A raiz quadrada exata de " + num + " é " + x);
        }
   }
   public static double numeroUsuario(String texto){
       Scanner in = new Scanner(System.in);
       double num;
       System.out.println(texto);
       num = in.nextDouble();
       if (num < 0) {
           num = -num;
       }
       return num;
       
   }
    public static double maisProximo(double vet){
        double raiz = 1;
        int aux = 0;
        for(int i = 0; i < vet; i++){
            aux = (i - 1) * (i - 1);
            if((i * i) > vet){
                raiz = aux;
                break;
            }
        }
        return raiz;
    }
}
