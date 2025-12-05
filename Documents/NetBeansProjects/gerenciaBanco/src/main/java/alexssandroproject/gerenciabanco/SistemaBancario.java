package alexssandroproject.gerenciabanco;


import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("=== Cadastro de Conta ===");
        String nome = lerLinha(sc, "Nome: ");
        String sobrenome = lerLinha(sc, "Sobrenome: ");
        String cpf = lerLinha(sc, "CPF: ");

        DadosPessoais dados = new DadosPessoais(nome, sobrenome, cpf);
        Conta conta = new Conta(dados, 0.0);

        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro(sc, "Escolha: ");

            switch (opcao) {
                case 1: {
                    double valor = lerDecimal(sc, "Valor do deposito: ");
                    conta.depositar(valor);
                    break;
                }
                case 2: {
                    double valor = lerDecimal(sc, "Valor do saque: ");
                    conta.sacar(valor);
                    break;
                }
                case 3: {
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                }
                case 4: {
                    System.out.println(conta.getDadosCompletos());
                    break;
                }
                case 0: {
                    System.out.println("Encerrando o sistema...");
                    System.out.println("Obrigado por utilizar o Aula Pratica Banco! ");
                    break;
                }
                default: {
                    System.out.println("Opcao invalida!");
                    break;
                }
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println();
        System.out.println("=== GERENCIA BANCO ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Exibir dados do usuario");
        System.out.println("0 - Interromper execucao (sair)");
    }

    private static String lerLinha(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        if (s == null) return "";
        return s.trim();
    }

    private static int lerInteiro(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro valido.");
            }
        }
    }

    
    private static double lerDecimal(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. (ex.: 100.50).");
            }
        }
    }
}

    class DadosPessoais {
    private String nome;
    private String sobrenome;
    private String cpf;

    public DadosPessoais(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getResumo() {
        String ls = System.lineSeparator();
        return "Nome: " + getNomeCompleto() + ls +
               "CPF: " + cpf;
    }
}

class Conta {
    private DadosPessoais dados;
    private double saldo;

    public Conta(DadosPessoais dados, double saldoInicial) {
        this.dados = dados;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque realizado!");
    }

    public double getSaldo() {
        return saldo;
    }

    

    public String getDadosCompletos() {
        String ls = System.lineSeparator();
        return dados.getResumo() + ls +
               "Saldo: R$ " + getSaldo();
    }
}
