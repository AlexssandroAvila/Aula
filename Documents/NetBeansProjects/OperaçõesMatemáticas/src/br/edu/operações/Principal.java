/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.operações;

/**
 *
 * @author Alexssandro Ávila
 */
public class Principal {
     public static void main(String[] args) {
        OperaçõesMatematicas Soma = new Soma();
        OperaçõesMatematicas Divisão = new Divisão();

        double valorA = 5.0;
        double valorB = 0.0;
        

         try {
            double resultadoDivisao = Divisão.calcular(valorA, valorB);
            System.out.println(valorA + " / " + valorB + " = " + resultadoDivisao);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Ocorreu um erro ao dividir: " + e.getMessage());
        }

        System.out.println("----------------------------------");
}
}
