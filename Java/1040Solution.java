import java.io.IOException;
import java.util.Scanner;
/*
*
* Solution for URI - problem 1040 
*
*
*
*/

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        float[] notas = new float[4];
        for(int i = 0; i < notas.length; i++){
            notas[i] = sc.nextFloat();
        }
        
        float media = (notas[0]* 2 + notas[1] * 3 + notas[2] * 4 + notas[3]) / 10;
        
        if(media >= 7){
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno aprovado.");
        }
        else if (media >= 5){
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            media = (media+notaExame)/2;
            System.out.println("Nota do exame: " + String.format("%.1f", notaExame));
            if(media >= 5){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + String.format("%.1f", media));
        }
        
        else{
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno reprovado.");
        }
        
        sc.close();
 
    }
 
}