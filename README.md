# Sistema de Restaurante em Java

Projeto simples em **Java (console/terminal)** que simula o funcionamento básico de um restaurante, permitindo o cadastro de pratos, abertura de pedidos por mesa, adição de itens e fechamento do pedido com cálculo do valor total.

Este projeto foi desenvolvido com foco em **Programação Orientada a Objetos (POO)**, boas práticas e uso de coleções.

---

##  Funcionalidades

* Cadastro de pratos no cardápio
* Listagem do cardápio
* Abertura de pedido por número da mesa
* Adição de itens ao pedido
* Cálculo do total do pedido
* Fechamento do pedido
* Validações básicas (pedido inexistente, prato inválido, etc.)

---

##  Estrutura do Projeto

```text
src/
 ├── modelo/
 │   ├── Prato.java
 │   ├── ItemPedido.java
 │   └── Pedido.java
 │
 ├── servicos/
 │   └── Restaurante.java
 │
 └── Main.java
```

---

##  Classe Principal – Restaurante

A classe `Restaurante` é responsável por gerenciar:

* O **cardápio** (`List<Prato>`)
* Os **pedidos** (`List<Pedido>`)

Principais métodos:

* `cadastrarPedido(String nome, double preco)` – cadastra um prato no cardápio
* `listarCardapio()` – exibe os pratos disponíveis
* `abrirPedido(int numeroMesa)` – abre um pedido para uma mesa
* `adicionarItemPedido(int numeroMesa, int indicePrato, int quantidade)` – adiciona itens ao pedido
* `fecharPedido(int numeroMesa)` – fecha o pedido e mostra o total

---

##  Como Executar

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code)

3. Execute a classe `Main.java`

4. Interaja pelo terminal conforme o menu implementado

---

##  Tecnologias Utilizadas

* Java
* Java Collections (`ArrayList`, `List`)
* Programação Orientada a Objetos (POO)

---

##  Objetivo do Projeto

Projeto desenvolvido para fins de **aprendizado**, praticando:

* Encapsulamento
* Relacionamento entre classes
* Organização em pacotes
* Lógica de negócio em aplicações de terminal

---

##  Próximas Melhorias (Sugestões)

* Implementar formas de pagamento
* Aplicar taxa adicional para cartão
* Persistência de dados (arquivo ou banco)
* Interface gráfica ou API REST

---

 *Projeto ideal para iniciantes em Java e POO.*
