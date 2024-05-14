

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        
        System.out.print("Digite o numero da conta: ");
        conta.setNumConta(sc.nextInt());

        System.out.println("");
        
        System.out.print("Digite o numero da agência: ");
        sc.nextLine();
        conta.setAgencia(sc.nextLine());

        System.out.println("");
        
        System.out.print("Digite o nome do cliente: ");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("");
        
        System.out.print("Digite o saldo do cliente: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println("");

        System.out.println(conta.toString());


        sc.close();
    }
}
