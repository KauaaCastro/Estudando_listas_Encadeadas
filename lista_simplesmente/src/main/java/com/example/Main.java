package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\033\143");
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();

        System.out.print("Digite a quantidade de nós que deseja: ");
        lista.quantity = sc.nextInt();

        for (int i = 0; i < lista.quantity; i++) {
            System.out.println();
            System.out.println("Digite o valor do nó " + i + ": ");
            int newNumber = sc.nextInt();

            Node newNo = new Node(newNumber);

            if (lista.vazio()) {
                lista.setHead(newNo);
                lista.setTail(newNo);
            } else {
                lista.getTail().setNext(newNo);
                lista.setTail(newNo);
            }
        }

        // Nó funcionando normalmente
        System.out.println();
        System.out.println("Conteudo inserido na lista!");
        System.out.println("Pessione ***enter*** para continuar!");

        sc.nextLine();
        sc.nextLine();

        System.out.println("Iniciando o menu...");
        // Thread.sleep(1000);
        Menu.Menu(lista);

        sc.close();
    }
}