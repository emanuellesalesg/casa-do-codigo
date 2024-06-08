# Projeto: Sistema de Gerenciamento de Produtos Promocionais

## Descrição

Este projeto implementa um sistema de gerenciamento de produtos promocionais, focado em livros e revistas. O sistema é estruturado em diversas classes que modelam produtos, suas variações e funcionalidades associadas.

## Estrutura do Projeto

### Classes

- **Produto**
  - Interface que representa um produto genérico.
  - **Métodos:**
    - `double getValor()`: Retorna o valor do produto.

- **Promocional**
  - Interface para produtos promocionais.
  - **Métodos:**
    - `boolean aplicaDescontoDe(double porcentagem)`: Aplica um desconto ao produto.

- **Livro (Produto)**
  - Classe abstrata que representa um livro.
  - **Atributos:**
    - `private String nome`
    - `private String descricao`
    - `private double valor`
    - `private String isbn`
    - `private Autor autor`
  - **Métodos:**
    - `double getValor()`: Implementação do método da interface Produto.
    - Outros métodos abstratos e concretos, conforme necessário.

- **Revista (Produto)**
  - Classe que representa uma revista.
  - **Atributos:**
    - `private String nome`
    - `private String descricao`
    - `private double valor`
    - `private Editora editora`
  - **Métodos:**
    - `double getValor()`: Implementação do método da interface Produto.

- **LivroFisico (Livro, Promocional)**
  - Classe que representa um livro físico.
  - **Métodos:**
    - `boolean aplicaDescontoDe(double porcentagem)`: Implementação do método da interface Promocional.

- **Ebook (Livro, Promocional)**
  - Classe que representa um livro digital (eBook).
  - **Métodos:**
    - `boolean aplicaDescontoDe(double porcentagem)`: Implementação do método da interface Promocional.

- **MiniLivro (Livro)**
  - Classe que representa um mini livro.
  - **Métodos:**
    - Herda e implementa os métodos de Livro.

- **CarrinhoDeCompras**
  - Classe responsável por gerenciar os produtos adicionados ao carrinho e calcular o total.
  - **Atributos:**
    - `private double total`: Armazena o valor total dos produtos no carrinho.
  - **Métodos:**
    - `public void adiciona(Produto produto)`: Adiciona um produto ao carrinho.
    - `public double getTotal()`: Retorna o valor total dos produtos no carrinho.