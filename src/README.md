# Sistema de Controle de Estoque e de Vendas para Loja de Vestuários

## Descrição do Projeto

Este projeto é um Sistema de Controle de Estoque e de Vendas desenvolvido para uma loja de vestuários. O sistema permite a inserção e armazenamento de dados dos produtos, além de oferecer diversas funcionalidades para gerenciar o estoque e registrar vendas de forma eficiente e organizada.

## Funcionalidades Básicas

### 1. Adicionar Novos Usuários

O sistema permite a adição de diferentes tipos de usuários, cada um com permissões específicas:
- Gerente
- Vendedor
- Cliente
- Fornecedor

### 2. Gerenciar Produtos

O gerenciamento de produtos inclui a capacidade de adicionar, editar e remover produtos. Atributos essenciais de um produto:
- Nome
- Categoria
- Fornecedor
- Preço
- Quantidade em Estoque
- Descrição

### 3. Registrar Vendas

O registro de vendas é uma funcionalidade crucial do sistema. Atributos essenciais de uma venda:
- Data
- Produto(s)
- Vendedor
- Cliente
- Valor Total

### 4. Oferta de Descontos

O sistema permite a aplicação de descontos em produtos ou vendas específicas, facilitando promoções e ofertas especiais.

### 5. Pesquisar Produtos

A funcionalidade de pesquisa permite localizar produtos no estoque rapidamente, utilizando diversos critérios de busca.

### 6. Gerar Relatórios

O sistema pode gerar relatórios detalhados de vendas e de estoque, auxiliando na análise de desempenho e na tomada de decisões.

## Estrutura do Sistema

### Classes

O sistema é estruturado em torno de diversas classes, cada uma representando um elemento fundamental do sistema:

- **Usuario (abstrata)**: Classe base para diferentes tipos de usuários.
  - **Gerente**
  - **Vendedor**
  - **Cliente**
  - **Fornecedor**

- **Produto**: Representa os produtos disponíveis na loja.
  - **ProdutoComDesconto**: Subclasse de Produto que permite a aplicação de descontos.

- **Venda**: Representa uma venda realizada.

- **SistemaDeControle**: Classe principal que gerencia os usuários, produtos e vendas.

### Métodos

Cada classe possui métodos específicos para realizar suas respectivas funções, como adicionar, editar e remover produtos, registrar vendas, aplicar descontos, etc. Alguns exemplos de métodos:
- **SistemaDeControle**
  - `adicionarUsuario(Usuario usuario)`
  - `adicionarProduto(Produto produto)`
  - `registrarVenda(Venda venda)`
  - `gerarRelatorioDeVendas()`
  - `gerarRelatorioDeEstoque()`
- **ProdutoComDesconto**
  - `aplicarDesconto(double percentual)`

### Encapsulamento, Herança e Polimorfismo

O sistema utiliza os princípios de encapsulamento, herança e polimorfismo para garantir a modularidade, reutilização e flexibilidade do código. Classes abstratas e interfaces são utilizadas para definir comportamentos comuns e garantir a implementação consistente das funcionalidades.

### Exceções

O sistema inclui tratamento de exceções para garantir a robustez e a estabilidade do programa, fornecendo mensagens de erro claras e orientações para o usuário.

## Requisitos Não-Funcionais

- **Facilidade de Utilização**: O programa é projetado para ser intuitivo e fácil de usar, mesmo para usuários com pouca experiência técnica.
- **Interação Programa/Usuário**: O sistema exibe mensagens de erro e orientação de forma clara e amigável.
- **Apresentação de Dados**: Os dados são apresentados de forma organizada, facilitando a leitura e a análise.


