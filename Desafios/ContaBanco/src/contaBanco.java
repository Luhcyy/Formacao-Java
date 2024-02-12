import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Por favor, digite o número da sua agência: ");
            int conta = input.nextInt();
            input.nextLine(); // Consome a nova linha após nextInt()
            
            System.out.print("Digite o número da sua agência: ");
            String agencia = input.nextLine();
            
            System.out.print("Agora, digite o seu nome: ");
            String cliente = input.nextLine();
            
            System.out.print("Por último, digite o seu saldo: ");
            float saldo = input.nextFloat();
            input.nextLine(); // Consome a nova linha após nextFloat()
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", cliente, agencia, conta, saldo);
        }
    }

