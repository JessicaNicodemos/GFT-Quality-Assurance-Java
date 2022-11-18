import javax.swing.Spring;

public class operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;

            numero = - numero; 

            System.out.println(numero);

            numero = numero * -1;
            System.out.println(numero);

 
        int numero1 = 5;

            System.out.println( ++ numero1);
            System.out.println(numero1);

    boolean variavel = true;
    System.out.println(!variavel);
    System.out.println(variavel);

/*Aula 5 - comparações também podem ser feitas a nomes e objetoos, não só a números 
* Quando fot para nomes o bjetos é legal usar "equals"
*/
 
     int numero2 = 1;
     int numero3 = 2; 

     boolean simNao = numero2 == numero3;
     
     if(numero2 < numero3){
        System.out.println(("a mossa condição é verdadeira"));
     }

     System.out.println ("numeroDois é igual a numeroTres?" + simNao );

     simNao = numero2 != numero3;
     System.out.println ("numeroDois é diferente de numeroTres?" + simNao );

     simNao = numero2 > numero3;
     System.out.println ("numeroDois é maior que numeroTres?" + simNao );




boolean condicao1=true;

boolean condicao2=false;

if(condicao1 || condicao2){
    System.out.println("uma das condições é verdadeira");
}

System.out.println("fim");

}
    
    }
// Feito