
# 🎤 Sistema de Shows

Este projeto foi desenvolvido como parte de um trabalho acadêmico, com o objetivo de simular um sistema de automação para gerenciamento de eventos musicais e venda de ingressos. A ideia é proporcionar uma ferramenta simples e funcional para gerenciar shows, controlar a bilheteria e acompanhar as vendas.



## 🚀 Funcionalidades

- **Cadastro de Shows**: Criação e listagem de eventos com dados como artista, data, local e capacidade.
- **Gestão de Ingressos**: Controle de ingressos disponíveis, vendidos e seus tipos.
- **Venda de Ingressos**: Processo de compra com atualização do estoque.
- **Relatórios**: Visualização de vendas e situação de shows.



## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **IntelliJ IDEA**: Ambiente de desenvolvimento utilizado.
- **Git**: Versionamento do código-fonte.
- **Orientação a Objetos (POO)**: Estruturação do sistema com classes e modularização.



## 📦 Estrutura de Pastas

```plaintext
Sistema-De-Shows/
├── ProjetoFacul/
│   └── src/
│       └── br/
│           └── com/
│               └── modulos/     # Contém as classes que modelam as entidades do sistema
│           └── principal/       # Contém a classe Main, ponto de entrada da aplicação
├── .gitignore
├── aps de poo.iml
````

---

## 📚 Descrição das Classes

### `Show`

Responsável por representar um evento musical.

**Atributos esperados:**

* `nomeArtista`
* `data`
* `local`
* `capacidade`
* `ingressosDisponiveis`

**Métodos esperados:**

* `cadastrarShow()`
* `listarShows()`
* `atualizarInformacoes()`

---

### `Ingresso`

Modela os ingressos vendidos ou disponíveis para os shows.

**Atributos esperados:**

* `codigo`
* `preco`
* `tipo` (inteira, meia, VIP)
* `status` (disponível, vendido)

**Métodos esperados:**

* `venderIngresso()`
* `cancelarVenda()`
* `verificarDisponibilidade()`

---

### `Venda`

Gerencia as transações de venda de ingressos.

**Atributos esperados:**

* `idVenda`
* `listaIngressos`
* `valorTotal`
* `dataVenda`

**Métodos esperados:**

* `realizarVenda()`
* `emitirComprovante()`
* `listarVendas()`



## ▶️ Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/ZNitr0/Sistema-De-Shows.git
   ```

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues com sugestões ou relatar bugs, e envie um pull request se quiser colaborar.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

*Desenvolvido para fins educacionais com foco em orientação a objetos e boas práticas de desenvolvimento em Java.*

