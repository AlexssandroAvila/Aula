/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.produto;

/**
 *
 * @author Alexssandro Ávila
 */
public class Principal {
   public static void main(String[] args) { 
       Produto A = new Produto("cafe", 40.00);
       Produto B = new Produto("acucar", 20.00);
       Produto C = new Produto("leite", 4.0);
       A.exibirDados();
       B.exibirDados();
       C.exibirDados();
       
     Produto.exibirQuantidadeTotal();
   }
} 

