/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double total;
        double resto;
        System.out.println("Resto da divisão\n");
        System.out.println("Digite um numero");
        num1 = sc.nextDouble();
        System.out.println("Digite outro numero para ser dividido");
        num2 = sc.nextDouble();

        total = num1 / num2;
        resto = num1 % num2;
        System.out.println("O resto da divisao e: " + resto);
    }
}
