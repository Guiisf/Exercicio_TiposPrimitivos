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
public class exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int total;
        System.out.println("Subtração de dois numeros\n");
        System.out.println("Digite um numero");
        num1 = sc.nextInt();
        System.out.println("Digite outro numero para ser subtraido");
        num2 = sc.nextInt();
        total = num1 - num2;
        System.out.println("Total " + total);
    }
}
