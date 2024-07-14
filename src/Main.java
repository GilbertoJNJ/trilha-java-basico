import model.ContaTerminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do cliente!");
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Por favor, digite o número da Agência!");
        conta.setAgencia(scanner.nextLine());

        System.out.print("Por favor, digite o número da Conta!");
        conta.setNumero(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Por favor, digite o saldo!");
        conta.setSaldo(scanner.nextDouble());

        scanner.close();

        var message = "Olá ".concat(conta.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(conta.getAgencia())
                .concat(", conta ")
                .concat(String.valueOf(conta.getNumero()))
                .concat(" e seu saldo ")
                .concat(String.valueOf(conta.getSaldo()))
                .concat(" já está disponível para saque.");

        System.out.printf(message);
    }
}