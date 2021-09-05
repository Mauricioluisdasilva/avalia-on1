/*
 *  Crie um programa que leia o nome e a idade digitada pelo usuário, mais o valor do ingresso de cinema. 
 *  Se a pessoa for idosa (idade maior ou igual a 60),  pagará a metade do ingresso.
 */
import java.util.Scanner;

public class exercicio2{
    public static void mais(String[] args) { 
    
    Scanner ler = new Scanner(System.in);
        
     String nome;
     System.out.println("digite seu nome: ");
     nome= ler.nextLine();
     
     System.out.println("digite sua idade:");
      int idade = ler.nextInt();
    System.out.println("digite o valor do ingresso:");
      double valor;
    
    valor = ler.nextDouble();
     
        if(idade>=60){
        System.out.println("valor do ingresso é:"+(valor - (valor * 0.50)));
        }else{
        System.out.println("o valor dos ingressos é:"+ valor);
    }
}}  
