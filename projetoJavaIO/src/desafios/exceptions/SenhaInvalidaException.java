package desafios.exceptions;

public class SenhaInvalidaException extends RuntimeException{
    private String mensagem;

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
