package desafios.exceptions;

import java.util.Scanner;

public class ExceptionDivisao {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        Integer num1 = rd.nextInt();

        System.out.println("Digite outro número inteiro: ");
        Integer num2 = rd.nextInt();

        try {
            double divisao = num1 / num2;
            System.out.println("O resultado de " + num1 + " dividido por " + num2 + " é igual a " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Houve um erro! Não é possível dividir por 0");
            System.out.println("Mensagem do erro: " + e.getMessage());
        }
    }
}
