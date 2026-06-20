#  FinTrack

Sistema de controle financeiro pessoal desenvolvido em Java para praticar os conceitos fundamentais de Programação Orientada a Objetos (POO).

##  Sobre o Projeto

O FinTrack é uma aplicação de console que permite ao usuário gerenciar suas finanças pessoais de forma simples e organizada.

O sistema possibilita:

* Cadastrar receitas
* Cadastrar despesas
* Listar transações
* Calcular saldo atual
* Remover transações
* Cadastrar transações mensais recorrentes

##  Funcionalidades

### Adicionar Transação

Permite cadastrar receitas e despesas informando:

* Descrição
* Valor
* Tipo (Receita ou Despesa)

### Listar Transações

Exibe todas as transações cadastradas.

### Calcular Saldo

Calcula automaticamente o saldo com base nas receitas e despesas registradas.

### Remover Transação

Permite excluir uma transação existente através do índice informado.

### Transações Mensais

Implementação de herança através da classe `TransacaoMensal`, utilizada para representar transações recorrentes.

## Tecnologias Utilizadas

* Java
* NetBeans IDE
* Git
* GitHub

##  Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Herança
* Polimorfismo
* Construtores
* Pacotes Java
* ArrayList
* Scanner
* Estruturas de decisão (if/switch)
* Estruturas de repetição (do-while/for)
* Tratamento de exceções (try/catch)
* Exceções personalizadas

##  Estrutura do Projeto

```text
FinTrack
│
├── app
│   └── Main.java
│
├── controller
│   └── FinTracker.java
│
├── model
│   ├── Transacao.java
│   └── TransacaoMensal.java
│
└── exceptions
    └── EntradaInvalidaException.java
```

##  Como Executar

1. Clone o repositório
2. Abra o projeto no NetBeans
3. Execute a classe Main
4. Utilize o menu interativo no console

##  Autora

**Somgeane Dias Sombra**

Projeto desenvolvido como atividade prática da disciplina de Java, aplicando conceitos fundamentais de desenvolvimento orientado a objetos.
