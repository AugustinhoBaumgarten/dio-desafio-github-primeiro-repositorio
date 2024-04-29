import java.util.Scanner;
public class mediaNota {

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     System.out.println(" - Calculadora de média entre duas avaliações - ");
     System.out.println("Digite a primeira nota: ");
     double nota1 = sc.nextDouble();

     System.out.println("Digite a segunda nota: ");
     double nota2 = sc.nextDouble();

     double media = (nota1 + nota2)/2;

     System.out.println("A média do aluno será de " + media + " pontos.");


     if (media < 5){
          System.out.println("Reprovado!!");
     }else if(media >= 5 && media < 7){
          System.out.println("Em recuperação!!");
     }else{
          System.out.println("Aprovado!!");
     }

     
     sc.close();


     }
}