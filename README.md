# Verifica se Dois Valores Inteiros São Múltiplos em Java

Este programa Java solicita ao usuário que digite dois valores inteiros e, em seguida, exibe uma mensagem informando se um dos números é múltiplo do outro.

## Como Executar

1.  **Salve o código:** Salve o código Java fornecido como `Main.java` dentro de um diretório chamado `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório que contém a pasta `principal` e compile o código utilizando o compilador Java:
    ```bash
    javac principal/Main.java
    ```
    Este comando irá gerar um arquivo chamado `Main.class` dentro da pasta `principal`.
3.  **Execute o programa:** Ainda no terminal ou prompt de comando, execute o programa utilizando a Máquina Virtual Java:
    ```bash
    java principal.Main
    ```
    Duas caixas de diálogo pop-up aparecerão, uma após a outra, solicitando que você digite o primeiro e o segundo valor inteiro, respectivamente, e pressione "OK" em cada uma. Após a entrada, outra caixa de diálogo exibirá o resultado.

## Explicação do Código

O programa realiza as seguintes ações:

1.  **Importa a classe JOptionPane:** A linha `import javax.swing.*;` permite que o programa utilize a classe `JOptionPane` para interagir com o usuário através de caixas de diálogo.
2.  **Lê os valores de entrada do usuário:**
    * `int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));` exibe uma caixa de diálogo solicitando que o usuário digite o primeiro valor inteiro. O valor digitado é convertido para um inteiro e armazenado na variável `a`.
    * `int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));` exibe uma segunda caixa de diálogo solicitando que o usuário digite o segundo valor inteiro. O valor digitado é convertido para um inteiro e armazenado na variável `b`.
3.  **Verifica se os números são múltiplos:**
    * `if(a % b == 0 || b % a == 0){ ... } else { ... }` é uma estrutura condicional que utiliza o operador módulo (`%`).
    * `a % b == 0` verifica se o resto da divisão de `a` por `b` é igual a zero, o que significa que `a` é múltiplo de `b`.
    * `b % a == 0` verifica se o resto da divisão de `b` por `a` é igual a zero, o que significa que `b` é múltiplo de `a`.
    * O operador `||` (OR lógico) garante que a condição seja verdadeira se pelo menos uma das verificações for verdadeira.
4.  **Exibe a mensagem de resultado:**
    * `JOptionPane.showMessageDialog(null,"São Multiplos");` exibe uma caixa de diálogo com a mensagem "São Multiplos" se a condição do `if` for verdadeira (ou seja, se um dos números for múltiplo do outro).
    * `JOptionPane.showMessageDialog(null,"Não são multiplos");` exibe uma caixa de diálogo com a mensagem "Não são multiplos" se a condição do `if` for falsa (ou seja, se nenhum dos números for múltiplo do outro).

Este programa ilustra um exemplo simples de como obter dois valores inteiros do usuário e utilizar o operador módulo com uma estrutura condicional para determinar se eles são múltiplos um do outro, exibindo o resultado através de caixas de diálogo Swing em Java.
