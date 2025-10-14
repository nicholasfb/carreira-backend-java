import java.util.Scanner;

public class Desafio {
    static Scanner rd = new Scanner(System.in);
    static Double saldo = 2500.0;

    public static void main(String[] args) {

    exibeConta();
    exibeOpcoes();
    validaOpcoes();

    }

    private static void exibeOpcoes(){
        System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
    }
    private static void exibeConta(){
        String tipoConta = "Corrente";

        System.out.println("Digite o seu nome: ");
        String nomeCliente = rd.nextLine();

        System.out.println(
                """
                *****// Bem vindo ao Bytebank //*****
                *************************************
                Dados Iniciais do cliente:
                
                Nome:          %s
                Tipo conta:    %s 
                Saldo inicial: %.2f
                *************************************      
                """
                        .formatted(nomeCliente, tipoConta, saldo));
    }

    private static void validaOpcoes(){
        int opcao = 0;

        while(opcao != 4) {
            System.out.println("Digite a opção desejada: ");
            opcao = rd.nextInt();
            rd.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("O saldo atual é R$%.2f".formatted(saldo));
                    System.out.println();

                    exibeOpcoes();
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    Double valorReceber = rd.nextDouble();
                    rd.nextLine();

                    saldo += valorReceber;
                    System.out.println("Saldo atualizado R$ %.2f".formatted(saldo));

                    System.out.println();
                    exibeOpcoes();
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir");
                    Double valorTransferir = rd.nextDouble();

                    if(saldo < valorTransferir) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= valorTransferir;
                        System.out.println("Saldo atualizado R$ %.2f".formatted(saldo));
                    }

                    System.out.println();
                    exibeOpcoes();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");

                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println();

                    exibeOpcoes();
                    break;
            }
        }
        rd.close();
    }
}
