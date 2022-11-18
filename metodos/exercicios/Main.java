import java.util.Scanner;

/*Classe principal a aula 1 de métodos */
public class Main {
    public static void main(String[] args) {
       

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtração(9, 1.8);
        Calculadora.multiplicação(7, 8);
        Calculadora.divisao(5, 2.5);


        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);


        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, 5);
        
    }
}
