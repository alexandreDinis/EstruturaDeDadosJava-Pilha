import java.util.Scanner;
import Pilha.Pilha;

public class App {
    public static void main(String args[])  {
       
       Scanner sc = new Scanner(System.in);
       Pilha p = new Pilha();
       int resto;
       int numero;

       System.out.println("Conversor de numeros para Binario");
       System.out.println("Digite o numero : ");
       numero = sc.nextInt();

       // fase 1 : Empilhamento     
       while(numero !=0 ){        
           resto = numero % 2;    // resto da divisao de numero por dois vale 0 ou 1.
           p.push(resto);         // armazena na pilha.
           numero = numero /2;    // gera novo numero, resultado da divisao dele por 2.
       }
        
       // fase 2 : exibicao ou desempilhar.
       while(!p.isEmpyt()){
           resto = p.pop();        // remover da pilha.
           System.out.print(resto);

       }
    System.out.println("\nFim do Programa");
    sc.close();
    }
    
    

}
 