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
public class exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

        int total;

        System.out.println("Subtração de 3\n");
        System.out.println("Digite um numero");
        num1 = sc.nextInt();

        total = num1 - 3;

        System.out.println("Total " + total);
    }
}
