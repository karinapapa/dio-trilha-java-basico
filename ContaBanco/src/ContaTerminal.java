import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nomeCliente = ler.next();

        System.out.print("Informe sua agência: ");
        String agencia = ler.next();

        System.out.print("Informe seu saldo: ");
        float saldo = ler.nextFloat();

        System.out.print("Informe número da sua conta: ");
        int numeroConta = ler.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponivel para saque");
    }
}
