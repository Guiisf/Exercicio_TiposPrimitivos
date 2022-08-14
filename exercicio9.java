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
public class exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double total;
        System.out.println("Multiplicação de dois numeros ponto flutuante\n");
        System.out.println("Digite um numero");
        num1 = sc.nextDouble();
        System.out.println("Digite outro numero para ser multiplicado");
        num2 = sc.nextDouble();
        total = num1 * num2;
        System.out.println("Total " + total);
    }
}
