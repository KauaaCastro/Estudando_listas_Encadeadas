package com.example;

public class Lista {

    // Declarar posteriormente a posição
    Main main = new Main();
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public int quantity;
    public int position;
    public int number;
    private Node lastRemoved = null;
    private boolean removed = false;

    // Declarando itens da Lista Encadeada.
    private Node head, tail;

    public Lista() {
        head = tail = null;
    }

    // Exercicio 6
    public void addinicio(int number) {
        Node newNode = new Node(number);
        newNode.setNext(head);
        head = newNode;

        if (head.getNext() == null) {
            tail = head;
        }
        System.out.println("O elemento foi inserido! ");
    }

    // Exercicio 1
    public int length() {
        int count = 0;
        Node current = this.head;

        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // Exercicio 2
    public int total() {
        int count = 0;
        Node current = this.head;

        while (current != null) {
            count += current.getNumber();
            current = current.getNext();
        }
        return count;
    }

    // Exercicio 3
    public int max() {
        int count = -99999;
        Node current = this.head;

        while (current != null) {
            if (count < current.getNumber()) {
                count = current.getNumber();
            }
            current = current.getNext();
        }
        return count;
    }

    // Exercicio 4
    public int min() {
        int count = 9999;
        Node current = this.head;

        while (current != null) {
            if (count > current.getNumber()) {
                count = current.getNumber();
            }
            current = current.getNext();
        }
        return count;
    }

    // Exercicio 5
    public void doubleX() {
        int count = 0;
        int position = -1;
        Node current = this.head;

        while (current != null) {
            count = current.getNumber();
            count = count * 2;
            position++;

            System.out.println("Posiçao do nó: " + position);
            System.out.println("Elemento inicial do nó: " + current.getNumber());
            System.out.println("Elemento dobrado: " + count);
            System.out.println();
            current.setNumber(count);
            current = current.getNext();
        }
    }

    // Exercicio 7
    public int somaPosImpares() {
        int count = 0;
        Node current = this.head;
        int position = 0;

        while (current != null) {
            if (position % 2 != 0) {
                count += current.getNumber();

            }

            position++;
            current = current.getNext(); // proximo nó
        }
        return count;
    }

    // Exercicio 8
    public void posPares() {
        Node current = this.head;
        int position = 0;

        while (current != null) {
            if (position % 2 == 0) {
                System.out.println();
                System.out.println("Posiçao do elemento: " + position);
                System.out.println("Elemento: " + current.getNumber());
            }
            position++;
            current = current.getNext();
        }
    }

    // Exercicio 9
    public void pos(int postion, int quantity) {
        Node current = this.head;
        int count = 0;

        if (position >= length()) {
            System.out.println("A posiçao inserida nao existe! ");
            System.out.println("Posiçao inseria: " + position);
            System.out.println("Quantidade de nós existentes: " + length() + " Considerando o nó 0");
        }

        if (position < length()) {
            while (current != null) {
                if (count == position) {
                    System.out.println(current.getNumber());
                    current = null;
                } else {
                    count++;
                    current = current.getNext();
                }
            }
        }
    }

    // Exercicio 10
    public void posRemove(int position, int quantity) {
        Node current = this.head;
        int count = 0;

        if (head == null) {
            System.out.println("Nao é possivel exluir o item em questao, a lista se encontra vazia");
        } else if (position == 0) {
            lastRemoved = head;
            head = head.getNext();

            if (head == null) {
                tail = null;
            }
            removed = true;
            System.out.println("Elemento na posiçao: " + position + " Removido com sucesso");
            System.out.println("O elemento removido é " + (current.getNumber()));
        }

        try {
            if (length() <= position) {
                System.out.println("A posiçao inserida nao existe! ");
                System.out.println("Posiçao inseria: " + position);
                System.out.println("Quantidade de nós existentes: " + length());
            }

            if (length() > position) {
                while (current != null) {
                    if (count == position - 1) {
                        lastRemoved = current.getNext();
                        current.setNext(current.getNext().getNext());

                        if (lastRemoved == tail) {
                            tail = current;
                        }
                        removed = true;

                        System.out.println("Elemento na posiçao: " + position + " Removido com sucesso");
                        System.out.println("O elemento removido é " + lastRemoved.getNumber());
                        current = null;

                    } else {
                        current = current.getNext();
                        count++;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Essa posiçao nao existe!");
        }
    }

    // Exercicio 11
    public void deletedNumber() {

        if (removed && lastRemoved != null) {
            System.out.println("O último elemento removido foi: " + lastRemoved.getNumber());
        } else {
            System.out.println("Nenhum elemento foi removido, remova-o e tente novamente...");
        }
    }

    // Exercicio 12
    public void inserePos(int position, int valor) {
        Node newNode = new Node(valor);

        if (head == null || position == 0) {
            newNode.setNext(head);
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }
            System.out.println("Inserido na posiçao 0");
            return;
        }

        Node current = this.head;
        int count = 0;

        // Ir até o nó anterior ao desejado
        while (current.getNext() != null && count < position - 1) {
            current = current.getNext();
            count++;
        }

        // Inserir entre dois nós ou no final
        newNode.setNext(current.getNext());
        current.setNext(newNode);

        // Inserindo no fim e atualizando o tail
        if (newNode.getNext() == null) {
            tail = newNode;
        }

        System.out.println("Valor inserido na posiçao " + position);
    }

    public void exibirLista() {
        if (head == null) {
            System.out.println("Lista vazia!");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.getNumber() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Extras

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public boolean vazio() {
        return head == null;
    }

}
