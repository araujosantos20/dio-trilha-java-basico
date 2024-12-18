import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner usuario = new Scanner(System.in);

        System.out.println("Digite a agência do seu banco: ");
        String agencia = usuario.nextLine();
        
        System.out.println("Digite o número do seu banco: ");
        int numero = usuario.nextInt();
        usuario.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = usuario.nextLine().toUpperCase();

        System.out.println("Digite seu saldo atual: ");
        Double saldo = usuario.nextDouble();

        usuario.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");
    }
}
