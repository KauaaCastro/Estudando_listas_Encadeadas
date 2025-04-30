# Lista Encadeada em Java

Este projeto é uma implementação de uma **Lista Encadeada Simples** utilizando a linguagem Java. O objetivo é explorar e praticar conceitos fundamentais de estruturas de dados, por meio de exercícios que envolvem inserção, remoção, busca, soma e manipulação de elementos da lista.

## 📌 Sobre o Projeto

A estrutura foi construída manualmente, sem o uso de bibliotecas externas. A classe `Lista` representa a lista encadeada, enquanto a classe auxiliar `Node` (ou "nó") representa cada elemento individual da lista, contendo um valor inteiro e a referência para o próximo nó.

A classe `Main` serve para definir a quantidade e os valores dos nós, enquanto a classe `Menu` se trata da interface de execução para os testes dos métodos.

## ⚙️ Funcionalidades Implementadas

- Inserção de elementos no início da lista
- Cálculo do tamanho total da lista
- Soma dos valores armazenados
- Determinação do maior e menor valor
- Dobragem de todos os elementos
- Soma de elementos em posições ímpares
- Impressão dos elementos em posições pares
- Busca de elemento por posição
- Remoção de elemento por posição
- Armazenamento e exibição do último elemento removido
- Inserção em uma posição específica
- Impressão de todos os elementos da lista

## 📚 Sobre Listas Encadeadas

Uma **lista encadeada** é uma estrutura de dados dinâmica composta por nós que armazenam dados e referências (ponteiros) para o próximo nó da lista. Diferente de arrays, listas encadeadas **não exigem um tamanho fixo** e permitem inserções e remoções de forma mais eficiente em posições específicas, sem necessidade de realocação de memória.

### Características principais:
- Crescimento dinâmico (sem tamanho fixo)
- Fácil inserção/remoção no início ou meio da lista
- Acesso sequencial (sem índice direto como arrays)

### Aplicações:
- Implementação de filas, pilhas e grafos
- Sistemas que precisam de gerenciamento dinâmico de memória
- Softwares que realizam muitas inserções e remoções em tempo de execução

## 🚧 Melhorias Futuras

Ainda há ajustes a serem feitos para otimizar o código e torná-lo mais robusto:

- Melhor tratamento de erros e exceções
- Implementação de uma versão com **lista duplamente encadeada**
- Adição de testes automatizados
- Modularização de trechos repetitivos
- Remoção de declarações não utilizadas
- Refatoração de métodos para melhor legibilidade

---

Este repositório está em constante evolução como parte do aprendizado em estruturas de dados e Java. Contribuições e sugestões são bem-vindas!

## 📎 Licença

Este projeto é de uso educacional. Sinta-se livre para estudar, modificar e reutilizar.
