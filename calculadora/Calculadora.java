/*
 * @projTop Meu Projeto de Calculadora Simples
 */
/**
 * Olá! Essa classe aqui é a **minha Calculadora**.
 * Ela faz as quatro operações matemáticas básicas: soma, subtração,
 * multiplicação e divisão. O mais legal é que ela tem um método `calcular`
 * que escolhe qual operação fazer com base em um operador que eu passar.
 *
 * <p>Eu fiz esse projeto para praticar e demonstrar algumas coisas:</p>
 * <ul>
 * <li>Como fazer uma **revisão de código** (caixa branca)</li>
 * <li>Como aplicar técnicas de **refatoração de código** em Java</li>
 * <li>Como documentar tudo bonitinho usando **Javadoc**</li>
 * </ul>
 * <p>Ah, e uma coisa importante: todos os métodos de operação (`somar`, `subtrair`, etc.)
 * são o que chamamos de **métodos puros**. Isso significa que eles só calculam o resultado
 * e não bagunçam nada fora deles, o que deixa o código mais limpo e fácil de testar!</p>
 * @autor Lucas Valentim de Souza
 * @version 1.0
 */
public class Calculadora {

    /**
     * **
     * <p>Essa função aqui é super simples: ela **soma dois números inteiros**.</p>
     * @param a O meu primeiro número
     * @param b O meu segundo número
     * @return O resultado da soma dos meus dois números, `a` e `b`
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * **
     * <p>Esta é para a **subtração**! Ela pega o primeiro número e subtrai o segundo.</p>
     * @param a O número do qual eu quero subtrair
     * @param b O número que eu quero subtrair do primeiro
     * @return O resultado da subtração
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * **
     * <p>Essa função faz a **multiplicação** dos dois números. De novo, bem direto!</p>
     * @param a Meu primeiro fator
     * @param b Meu segundo fator
     * @return O resultado da multiplicação
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * **
     * <p>Esta aqui faz a **divisão**. Eu preciso tomar cuidado para o divisor não ser zero!</p>
     * @param a O número que eu quero dividir (dividendo)
     * @param b O número pelo qual eu vou dividir (divisor)
     * @throws IllegalArgumentException Eu lanço essa exceção **se eu tentar dividir por zero**
     * @return O resultado da divisão inteira
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida. Tentei e não deu!");
        }
        return a / b;
    }

    /**
     * **
     * <p>Este é o meu método principal para calcular! Eu digo para ele **qual operação eu quero**.</p>
     * <p>Eu só aceito os seguintes símbolos de operação:</p>
     * <ul>
     * <li>`+` (Soma)</li>
     * <li>`-` (Subtração)</li>
     * <li>`*` (Multiplicação)</li>
     * <li>`/` (Divisão)</li>
     * </ul>
     * <p>Se eu passar um símbolo que não está na lista, ele vai reclamar com uma exceção.</p>
     * @param a Meu primeiro número
     * @param b Meu segundo número
     * @param operador O símbolo da operação que eu quero fazer (ex: "+", "-", etc.)
     * @return O resultado que a operação correspondente me deu
     * @throws IllegalArgumentException Eu lanço se o `operador` que eu passar não for válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Ops! O operador que eu usei é inválido: " + operador);
        };
    }
}
