
package tiposprimitivos;

import java.util.Scanner;//BIBLIOTECA PARA ENTRADA DE DADOS//

public class TiposPrimitivos {

    public static void main(String[] args) {
        // ENTRADA DE DASDOS//
        Scanner teclado = new Scanner(System.in);//CRIADO OBJETO PARA ENTRADA DE DADOS//
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %,1f \n", nome, nota);//%s PORQUE TIPO STRING, %,1F TIPO FLOAT//
        System.out.println("------------------------");
        
        //SAIDA DE DADOS//
        float nota2 = 8.5f;//VARIAVEL//
        float nota1 = (float)9.5; //VARIAVEL CONCATENADA//
        System.out.println("A nota é " + nota2); //ESCREVER NA TELA//
        System.out.printf("A nota é %.2f \n", nota1);//ESCREVE TEXTO FORMATADO//
        nota2+=10;//nota2 = nota2 + 10//
        System.out.println("valor de nota2: "+nota2);
        System.out.println("------------------------");
        
        //TIPOS PRIMITIVOS DE DADOS//
        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        
        f=10f;//f 64bits
        d=20d;//d 32bites
        c = 65;//65 REFERENTE A TABELA UNICODE//
        System.out.println("Valor de Char é: "+ c);
        System.out.println("Valor inteiro de char: "+ (int)c);
        
        
    }
    
}
