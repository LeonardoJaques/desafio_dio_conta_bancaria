
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeTitular;
        double saldo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            numeroConta = scanner.nextInt();
            System.out.println("Digite a agência: ");
            agencia = scanner.next();
            System.out.println("Digite o nome do titular: ");
            nomeTitular = scanner.next();
            System.out.println("Digite o saldo inicial: ");
            saldo = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Erro ao ler os dados da conta. Por favor, tente novamente.");
            return;
        }
        
        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}