package resolution;

import java.util.Scanner;

public class questions {

    // Questão 1 - Loop While
    public static void q1()
    {
        System.out.println("----------------------------------------");
        System.out.println("Questão 1) Soma dos números inteiros de 0 à 13, exclusivamente.");
        int indice = 13;
        int k = 0;
        int soma = 0;
        while (k < indice)
        {
            soma += k;
            k++;
        }
        System.out.println("Resposta: Soma = " + soma);
    }

    // Questão 2 - Fibonacci
    public static void q2()
    {
        System.out.println("----------------------------------------");
        System.out.println("Questão 2) Verificar se o número informado pertence à sequência de Fibonacci.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite um número inteiro para a verificação: ");
        int number = scanner.nextInt();

        int a = 0, b = 1;
        while (b < number)
        {
            int temp = b;
            b += a;
            a = temp;
        }

        if (b==number) {
            System.out.println("Resposta: O número " + number + " PERTENCE à sequência de Fibonacci.");
        } else {
            System.out.println("Resposta: O número " + number + " NÃO PERTENCE à sequência de Fibonacci.");
        }
    }

    // Questão 5 - Inverter String
    public static void q5()
    {
        System.out.println("----------------------------------------");
        System.out.println("Questão 5) Inverter uma String sem usar métodos built-in.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, escreva uma frase para realizar a inversão: ");
        String originalString = scanner.nextLine();

        // String originalString = "Hello, world!";

        String reverseString = originalString;

        char[] chars = reverseString.toCharArray();

        // Invertendo o array
        for (int i = 0; i < chars.length / 2; i++)
        {
            char temp = chars[i];
            int newIndex = chars.length - 1 - i;
            chars[i] = chars[newIndex];
            chars[newIndex] = temp;
        }

        reverseString = new String(chars);

        System.out.println("Resposta:");
        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + reverseString);
}
}
