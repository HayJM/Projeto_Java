# Projeto Java - Aplicações Console

Este repositório contém dois programas Java desenvolvidos para demonstrar conceitos básicos de programação em Java através de aplicações de console interativas.

## 📋 Programas Incluídos

### 1. HelloWorld.java - Calculadora Interativa
Uma aplicação console que serve como introdução ao Java e implementa uma calculadora básica com as seguintes funcionalidades:

- **Saudação personalizada**: Solicita o nome do usuário
- **Calculadora básica** com operações:
  - Soma
  - Subtração
  - Multiplicação
  - Divisão (com proteção contra divisão por zero)
- **Menu interativo** em loop até o usuário escolher sair

### 2. Estacinamento.java - Sistema de Estacionamento
Sistema de gerenciamento de estacionamento que permite:

- **Adicionar veículos** por placa
- **Remover veículos** com cálculo automático de tarifa
- **Listar veículos** estacionados
- **Controle de capacidade** (máximo 100 veículos)
- **Sistema de tarifação**:
  - Taxa de entrada: R$ 5,00
  - Taxa por hora: R$ 2,00

## 🛠️ Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- Terminal/Console para execução

## 🚀 Como Executar

### Compilação
```bash
# Compilar HelloWorld
javac HelloWorld.java

# Compilar Estacinamento
javac Estacinamento.java
```

### Execução
```bash
# Executar HelloWorld
java HelloWorld

# Executar Sistema de Estacionamento
java Estacinamento
```

## 💡 Funcionalidades Técnicas

### HelloWorld.java
- Uso de `System.console().readLine()` para entrada de dados
- Estruturas condicionais (`if/else`, `switch/case`)
- Loop `do-while` para menu contínuo
- Tratamento de entrada numérica com `Integer.parseInt()`
- Tratamento de divisão por zero

### Estacinamento.java
- Uso de `ArrayList` para gerenciamento dinâmico de dados
- Implementação de CRUD básico (Create, Read, Delete)
- Controle de capacidade máxima
- Cálculo automático de tarifas
- Interface de menu interativa

## 📂 Estrutura do Projeto

```
Projeto_Java/
├── HelloWorld.java      # Calculadora interativa
├── HelloWorld.class     # Arquivo compilado
├── Estacinamento.java   # Sistema de estacionamento
├── Estacinamento.class  # Arquivo compilado
└── README.md           # Este arquivo
```

## 🎯 Objetivos de Aprendizado

Este projeto demonstra conceitos fundamentais de Java:

- **Entrada e saída** de dados via console
- **Estruturas de controle** (loops, condicionais)
- **Collections** (ArrayList)
- **Tratamento de dados** (parsing, validação)
- **Organização de código** (métodos, classes)
- **Lógica de negócio** simples

## 🔧 Melhorias Futuras

- [ ] Implementar validação de placas de veículos
- [ ] Adicionar persistência de dados em arquivo
- [ ] Implementar relatórios de faturamento
- [ ] Adicionar timestamp para controle de tempo
- [ ] Interface gráfica (GUI) com Swing/JavaFX
- [ ] Testes unitários com JUnit

## 👨‍💻 Autor

Desenvolvido como projeto acadêmico para a disciplina de Engenharia da Computação.

## 📝 Licença

Este projeto é de uso acadêmico e está disponível sob a licença MIT.

---

**Nota**: Certifique-se de executar os programas em um terminal que suporte `System.console()` para funcionamento correto da entrada de dados.
