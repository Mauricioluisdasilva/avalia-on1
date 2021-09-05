
/**
 * Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
ACESSO PERMITIDO caso a senha seja válida.
ACESSO NEGADO caso a senha seja inválida.
 */
import java.util.Scanner;
public class exercicio5{
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite a senha do usuario: ");
       int senha = 0;
       senha = ler.nextInt();
        if (senha == 1234) { 
    System.out.printf("Senha aceita. Aceso liberado\n");
  } else {
    System.out.printf("Senha inválida. Nada feito\n");
  }
      
}}

