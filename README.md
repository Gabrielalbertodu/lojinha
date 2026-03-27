# 🛒 Lojinha Online (Simulação em Java)

## 📌 Sobre o projeto

Esse projeto foi desenvolvido com base no diagrama N0 apresentado em aula. A ideia foi simular o funcionamento de uma lojinha online simples, seguindo o modelo de arquitetura cliente-servidor monolítica.

A aplicação roda no console e representa as principais etapas de uma compra: escolha de produtos, criação de pedido e pagamento.

## 🗂️ Estrutura do código

O projeto foi organizado em pacotes para facilitar a separação das responsabilidades:

* 📦 `model` → classes que representam os dados (Cliente, Produto, Pedido)
* ⚙️ `service` → onde fica a lógica principal do sistema
* 🔒 `singleton` → responsável pela integração com o sistema de pagamento
* ▶️ `app` → classe principal que executa o sistema

## 🚀 Funcionalidades

* 👤 Listagem de clientes (pré-cadastrados)
* 📋 Listagem de produtos
* 🧾 Criação de pedidos
* 💳 Simulação de pagamento (podendo aprovar ou falhar)

## 🏗️ Sobre a arquitetura

Foi utilizada uma arquitetura monolítica, ou seja, toda a lógica do sistema está em uma única aplicação. Isso deixa o projeto mais simples e fácil de entender, já que não há separação em vários serviços.

## 🔐 Uso do Singleton

A classe `SistemaPagamentoExterno` foi implementada usando o padrão Singleton.

A ideia foi garantir que exista apenas uma instância responsável pelo pagamento durante toda a execução do programa. Isso evita criar várias conexões desnecessárias com o sistema externo e centraliza essa responsabilidade em um único ponto.

## 📊 Diagramas

* 🧭 Diagrama de Atividades → mostra o fluxo da compra no sistema
* 🗄️ DER → representa as entidades e os relacionamentos da lojinha

Os arquivos estão na raiz do projeto.
