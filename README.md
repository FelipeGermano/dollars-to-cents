# Conversor de Dólares para Moedas

Este é um projeto simples em Java que permite ao usuário inserir um valor em dólares (incluindo valores decimais, como $2,75) e converte esse valor para o número total de centavos, além de calcular a quantidade mínima de moedas (quarters, dimes, nickels e pennies) necessárias para formar esse valor.

## Funcionalidades

- **Entrada de Valor em Dólares**: O usuário pode inserir um valor decimal representando a quantidade em dólares.
- **Conversão para Centavos**: O valor inserido é convertido para centavos como um número inteiro.
- **Cálculo de Moedas**: O programa calcula a quantidade mínima de moedas necessárias para formar o valor em centavos.
- **Interface Gráfica (UI)**: O programa utiliza Java Swing para criar uma interface amigável para interação com o usuário.

## Tecnologias Utilizadas

- Linguagem: **Java**
- Biblioteca: **Swing** (para a interface gráfica)

## Como Executar o Projeto

1. **Pré-requisitos**: Certifique-se de ter o Java Development Kit (JDK) instalado no seu sistema.

2. **Clonar ou Baixar o Projeto**: Baixe o código-fonte e salve-o em uma pasta local.

3. **Compilação e Execução**:
   - Abra o terminal ou a IDE de sua preferência.
   - Navegue até o diretório onde o arquivo `DollarToCoins.java` está salvo.
   - Compile o código usando o comando:
     ```bash
     javac DollarToCoins.java
     ```
   - Execute o programa com o comando:
     ```bash
     java DollarToCoins
     ```

4. **Interação**:
   - Insira um valor em dólares no campo de texto exibido na interface.
   - Clique no botão "Converter".
   - Veja o resultado com o total de centavos e a quantidade de cada tipo de moeda.

## Exemplo de Uso

### Entrada:
- Valor: `$2.75`

### Saída:
- Total em centavos: `275`
- Quarters (25¢): `11`
- Dimes (10¢): `0`
- Nickels (5¢): `0`
- Pennies (1¢): `0`

## Estrutura do Código

- **Interface Gráfica**:
  - Utiliza `JFrame`, `JPanel`, `JLabel`, `JTextField`, `JButton` e `JTextArea` para criar a interface.
- **Lógica de Conversão**:
  - Converte o valor decimal para inteiro (centavos) e realiza divisões sucessivas para calcular a quantidade mínima de moedas.

## Possíveis Melhorias

- Adicionar suporte para outros tipos de moeda.
- Melhorar a validação da entrada do usuário.
- Estilizar a interface com bibliotecas como JavaFX.

## Contribuição

Se você quiser contribuir para este projeto, sinta-se à vontade para abrir issues ou enviar pull requests no repositório correspondente.

---
**Criado por**: [Felipe Rocha Germano]

