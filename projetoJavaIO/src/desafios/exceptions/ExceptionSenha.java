package desafios.exceptions;

import java.util.Scanner;

public class ExceptionSenha {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Digite uma senha com pelo menos 8 caractéres");
        String senha = rd.nextLine();

        try{
            validaSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        }
    }

    public static void validaSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caractéres");
        }
    }
}
