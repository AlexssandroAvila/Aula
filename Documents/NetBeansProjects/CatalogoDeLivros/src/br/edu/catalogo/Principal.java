/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tst;

/**
 *
 * @author Alexssandro Ávila
 */
public class Principal {
    public static void main(String[] args) {
        
        Livro[] livros = new Livro[5];        
        livros[0] = new Livro("Metodologias ageis: engenharia de software sob medida", "José Henrique", 2012);
        livros[1] = new Livro("Curriculum BE Computer software", "Department of Computer Software Engineering", 2010);
        livros[2] = new Livro("Gestão de riscos em projetos de desenvolvimento de software com Scrum: um estudo de caso", "Bruna Naira Milaire", 2019);
        livros[3] = new Livro("Entenda o conceito de qualidade de software e sua função", "Glenford J. Myers", 1979);
        livros[4] = new Livro("O que é controle de versão?", "Azure DevOps Microsoft", 2023);

      System.out.println("Livros com 'software' no título:");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].titulo.contains("software")) {
                livros[i].exibirInformacoes();
            }
        }
    }
}
