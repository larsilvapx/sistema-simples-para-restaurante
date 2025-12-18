import servicos.Restaurante;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Restaurante restaurante = new Restaurante();

        int opcao;

        do {
            System.out.println("\n ==== SISTEMA DE RESTAURANTE ==== ");
            System.out.println();
            System.out.println("1 - Cadastrar Prato");
            System.out.println("2 - Listar cardapio");
            System.out.println("3 - Abrir pedido");
            System.out.println("4 Adicionar item ao pedido");
            System.out.println("5 - Fechar pedido");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção");

            opcao = sc.nextInt();
            sc.nextLine();// serve para limpar o buffer

            switch (opcao) {

                case 1:
                    System.out.println("nome do prato");
                    String nome = sc.next();

                    System.out.println("Preço do prato");
                    double preco = sc.nextDouble();

                    restaurante.cadastrarPedido(nome, preco);
                    break;

                case 2:
                    restaurante.listarCardapio();
                    break;

                case 3:
                    System.out.println("Numero da mesa: ");
                    int mesa = sc.nextInt();

                    restaurante.abrirPedido(mesa);
                    break;

                case 4:
                    System.out.println("numero da mesa: ");
                    int mesaItem = sc.nextInt();

                    restaurante.listarCardapio();

                    System.out.println("Indice do prato: ");
                    int indicePrato = sc.nextInt();

                    System.out.println("Quantidade: ");
                    int quantidade = sc.nextInt();

                    restaurante.adicionarItemPedido(mesaItem, indicePrato, quantidade);
                    break;

                case 5:
                    System.out.println("Numero da mesa: ");
                    int mesaFechar = sc.nextInt();

                    restaurante.fecharPedido(mesaFechar);
                    break;

                case 6:
                    System.out.println("Encerrando o programa");
                    break;

                default:
                    System.out.println("Opção invalida!");



            }
        } while (opcao != 0);
        sc.close();
    }




}