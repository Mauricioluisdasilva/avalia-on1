/**
 * Elabore um algoritmo que leia do teclado o sexo de uma pessoa.
 */
import java.util.Scanner;
    public class exercicio3{
     public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome;
        String sexo;
        String f;
        String m;
        String og;
        System.out.println("qual é seu nome?");
        nome = ler.nextLine();
         
        System.out.println("qual é seu sexo? f/m/og");
        sexo = ler.nextLine();
        f = ler.nextLine();
        m = ler.nextLine();
        og = ler.nextLine();
        if(sexo==f){
        System.out.println("feminino");
         f = ler.nextLine();}
        if(sexo==m){
            System.out.println("masculino");
            m = ler.nextLine();}
        
        if(sexo==og){
            System.out.println("outro genero");
         og = ler.nextLine();}
        
       
}
}