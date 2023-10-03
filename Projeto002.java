//Sistema Gerenciamento Estoque Simples Java:
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;

    Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    void exibirInformacoes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidade);
    }

    void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque.");
    }

    void retirarQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades retiradas do estoque.");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}

public class Projeto002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto("Produto A", 10);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Exibir Informações do Produto");
            System.out.println("2. Adicionar Quantidade");
            System.out.println("3. Retirar Quantidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    produto.exibirInformacoes();
                    break;
                case 2:
                    System.out.print("Quantidade a ser adicionada: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    produto.adicionarQuantidade(quantidadeAdicionar);
                    break;
                case 3:
                    System.out.print("Quantidade a ser retirada: ");
                    int quantidadeRetirar = scanner.nextInt();
                    produto.retirarQuantidade(quantidadeRetirar);
                    break;
                case 4:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
        
        scanner.close();
    }
}
