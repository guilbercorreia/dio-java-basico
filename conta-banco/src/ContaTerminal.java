import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = sc.next();    
        System.out.print("Por favor, digite seu numero: ");
        numero = sc.nextInt();    
        System.out.print("Por favor, digite sua agêcia: ");
        agencia = sc.next();    
        System.out.print("Por favor, digite seu saldo: ");
        saldo = sc.nextFloat();
        
        sc.close();

        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numero +
        " e seu saldo " + saldo +" já está disponível para saque");
    }
}
