/*
 *  Criar um algoritmo onde digita-se:
- Nome do aluno
- Disciplina;
-  Nota1, nota2 e nota3;
- Frequência do aluno;
O programa deverá retornar o nome, a disciplina, a média final (n1 + n2 + n3 / 3) 
e se o aluno está aprovado (aprovado com frequência igual e superior a 75% e média >= 6).
 */import java.util.Scanner;
 public class exercicio4{
     public static void main(String[] args){
        String nome;
        String Disciplina;
        double Nota1,nota2, nota3;
        double Frequencia;
        double media;
        Scanner ler = new Scanner(System.in);
         
         System.out.println("digite o nome do aluno:");
         nome = ler.nextLine();
         
         System.out.println("digite a frequência do aluno");
        Frequencia = ler.nextDouble();
         
         System.out.println("digite a média do aluno");
         media = ler.nextDouble();
         
         if(media>=6 && Frequencia>=75){
             System.out.println("o aluno está APROVADO");
             
         }else{System.out.println("o aluno está REPROVADO");
             
         }
    
     }
 }