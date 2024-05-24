# Trilha-java-basico
Desafio Conta Bancária (Java) Crie um programa Java que receba dados de uma nova conta bancária (número, agência, nome do cliente, saldo) via terminal. Utilize a classe Scanner para entrada de dados e exiba uma mensagem de boas-vindas personalizada com os dados inseridos.

## Desafio Conta Bancária

**Objetivo:** Criar um programa Java que simule a abertura de uma conta bancária.

**Etapas:**

1.  **Criar projeto:** Crie um projeto Java chamado `ContaBanco`.
2.  **Criar classe:** Dentro do projeto, crie a classe `ContaTerminal.java`.
3.  **Receber dados:** A classe deve receber os seguintes dados do usuário via terminal:
    *   Número da conta (inteiro)
    *   Agência (texto)
    *   Nome do cliente (texto)
    *   Saldo (decimal)
4.  **Exibir mensagem:** Após receber os dados, o programa deve exibir uma mensagem de boas-vindas personalizada, como:

    ```
    Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia],
    conta [Numero] e seu saldo [Saldo] já está disponível para saque.
    ```

**Tecnologias:**

*   Java
*   Classe `Scanner` (para entrada de dados)
*   Concatenação de strings

**Observações:**

*   Use a classe `Scanner` para ler os dados inseridos pelo usuário no terminal.
*   Utilize concatenação de strings para construir a mensagem de boas-vindas personalizada.
*   Substitua os campos entre colchetes `[]` pelos valores inseridos pelo usuário.

