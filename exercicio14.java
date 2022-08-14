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
public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        
        int total;
        System.out.println("Media de notas\n");
        System.out.println("Digite a nota 1");
        num1 = sc.nextInt();
        System.out.println("Digite a nota 2");
        num2 = sc.nextInt();
        System.out.println("Digite a nota 3");
        num3 = sc.nextInt();
        total = (num1 + num2 + num3) / 3;
        System.out.println("Media " + total);
    }
}

