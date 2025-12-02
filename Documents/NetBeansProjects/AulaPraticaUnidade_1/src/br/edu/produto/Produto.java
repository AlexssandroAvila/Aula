/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.produto;

/**
 *
 * @author Alexssandro Ávila
 */
public class Produto {
   private String nome;
    private double preco;
    private static int quantidadeTotal = 0;
    public Produto() {
        quantidadeTotal++;
}
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeTotal++;
    }
public void exibirDados() {
        System.out.println("Produto: " + nome + ", Preco: R$" + String.format("%.2f", preco));
    }
public static void exibirQuantidadeTotal() {
        System.out.println("Total de produtos cadastrados: " + quantidadeTotal);
}
}

 