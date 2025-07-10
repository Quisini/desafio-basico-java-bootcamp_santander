import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nome;
        float saldo;
        System.out.print("Olá, para começarmos a criar a sua conta, digite o número da sua conta: ");
        numero = scanner.nextInt();
        System.out.print("Digite o número da agência: ");
        agencia = scanner.next();
        System.out.print("Escreva o seu nome: ");
        nome = scanner.next();
        System.out.print("Digite o seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, numero, saldo);

    }
}