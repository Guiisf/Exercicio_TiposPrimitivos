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
public class exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        float total;

        System.out.println("Soma de dois numeros ponto flutuante\n");
        System.out.println("Digite um numero");
        num1 = sc.nextFloat();
        System.out.println("Digite outro numero para ser somado");
        num2 = sc.nextFloat();

        total = num1 + num2;

        System.out.println("Total " + total);
    }
}
