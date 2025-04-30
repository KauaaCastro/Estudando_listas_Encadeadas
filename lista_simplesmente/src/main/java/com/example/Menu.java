package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String clear = "\033\143";

    public static void Menu(Lista lista) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int selected = 0;
        int reset = 0;
        while (reset == 0) {
            System.out.println(clear);
            System.out.println(ANSI_BLUE + "\n        Menu atividade sobre lista encadeada         " + ANSI_RESET);
            System.out.println("--------------------------------------");
            System.out.println();
            System.out.println(ANSI_CYAN + "1." + ANSI_RESET + "Exibir tamanho");
            System.out.println(ANSI_CYAN + "2." + ANSI_RESET + "Soma dos valores armazenados");
            System.out.println(ANSI_CYAN + "3." + ANSI_RESET + "Exibir o maior valor armazenado na lista");
            System.out.println(ANSI_CYAN + "4." + ANSI_RESET + "Exibir o menor valor armazenado na lista");
            System.out.println(ANSI_CYAN + "5." + ANSI_RESET + "Exibir o dobro dos valores armazenados na lista");
            System.out.println(ANSI_CYAN + "6." + ANSI_RESET + "Adicionar valor ao inicio da lista");
            System.out.println(ANSI_CYAN + "7." + ANSI_RESET + "Soma dos valores nas casas impares");
            System.out.println(ANSI_CYAN + "8." + ANSI_RESET + "Soma dos valores nas casas pares");
            System.out.println(ANSI_CYAN + "9." + ANSI_RESET + "Selecionar item que deseja ver");
            System.out.println(ANSI_CYAN + "10." + ANSI_RESET + "Remover nó");
            System.out.println(ANSI_CYAN + "11." + ANSI_RESET + "Exibir valor removido do nó");
            System.out.println(ANSI_CYAN + "12." + ANSI_RESET + "Inserir na classe de maneira especifica");

            System.out.println();
            System.out.println(ANSI_BLUE + "0." + ANSI_RESET + "Sair");
            System.out.println();
            System.out.print(ANSI_GREEN + "Escolha uma opçao: " + ANSI_CYAN);

            try {
                selected = sc.nextInt();
                System.out.println(ANSI_RESET);
                reset = 1;

            } catch (InputMismatchException e) {
                System.out.println(clear);
                System.out.println(
                        "Você digitou algo que nao pode ser reconhecido na tabela, por favor tente novamente...");
                System.out.println();
                System.out.println(ANSI_RED + "Redirecionando até a tabela" + ANSI_RESET);

                Thread.sleep(1500);
                reset = 0;
            }

            switch (selected) {
                case 1:
                    lista.length(); // Funcionando
                    break;

                case 2:
                    System.out.println("Soma dos elementos (total): " + lista.total());
                    lista.exibirLista(); // Funcionando
                    break;

                case 3:
                    System.out.println("Maior elemento: " + lista.max());
                    break; // Funcionando

                case 4:
                    System.out.println("Menor elemento: " + lista.min());
                    break; // Corrigido e pronto para teste

                case 5:
                    System.out.println(clear);
                    lista.doubleX();
                    break; // Funcionando

                case 6:
                    System.out.print("Digite o número para adicionar: ");
                    lista.number = sc.nextInt();
                    lista.addinicio(lista.number);
                    break; // Funcionando

                case 7:
                    lista.somaPosImpares();
                    System.out.println(lista.somaPosImpares());
                    break; // Funcionando

                case 8:
                    System.out.println(clear);
                    lista.posPares();
                    break; // Funcionando

                case 9:
                    System.out.print("Digite a posiçao: ");
                    lista.position = sc.nextInt();
                    lista.pos(lista.position, lista.quantity);
                    break; // Funcionando

                case 10:
                    System.out.print("Digite a posiçao para remover: ");
                    int position = sc.nextInt();
                    lista.posRemove(position, lista.quantity);
                    break; // Funcionando

                case 11:
                    lista.deletedNumber();
                    break; // Funcionando

                case 12:
                    System.out.println(clear);
                    System.out.print("Digite a posiçao para inserir: ");
                    int newPosition = sc.nextInt();
                    System.out.print("Digite o valor a ser inserido: ");
                    int valor = sc.nextInt();
                    lista.inserePos(newPosition, valor);
                    break; // Funcionando

                case 0:
                    System.out.println("Tem certeza de que deseja sair?" + ANSI_RED + "(s/n)");
                    String confirm = sc.next();
                    confirm.toLowerCase();

                    if (confirm.equalsIgnoreCase("s")) {
                        System.out.println("Saindo do programa..." + ANSI_RESET);
                        Thread.sleep(1000);
                        System.exit(0);

                    } else {
                        System.out.println(clear);
                        System.out.println(ANSI_RESET + "Voltando ao menu...");
                        break;
                    }

                default:
                    System.out.println();
                    System.out.println("Opçao inválida!");
            }
            System.out.println();
            System.out.println("Pressione " + ANSI_RED + "enter " + ANSI_RESET + "para que possamos retornar ao menu:");
            sc.nextLine();
            sc.nextLine();
            reset = 0;
        }

        sc.close();
    }
}
