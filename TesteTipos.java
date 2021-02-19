package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        //CONVERÇÃO DE VALORES DE VARIAVEIS//
        int idade = 30;
        String valor = Integer.toString(idade);//CLASSE INVOLUCRO, TRANFORMA INTEIRO EM STRING//
        System.out.println(valor);
        
        String valor1 = "30";
        int idade1 = Integer.parseInt(valor1);//STRING EM INTEIRO//
        System.out.println(idade1);
        
        String valor2 = "30";
        float idade2 = Float.parseFloat(valor2);//STRING EM REAL//
        System.out.printf("%.3f \n", idade2);
    }
    
}
