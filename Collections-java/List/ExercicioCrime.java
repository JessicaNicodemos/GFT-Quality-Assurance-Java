package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente". */

public class ExercicioCrime {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.println("\nTelefonou para a vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("\nEsteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("\nMora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("\nDevia para a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("\nJá trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s"));{
                count++;
            }
        }

        switch(count){
            case 2: 
            System.out.println(">> SUESPEITA <<"); break;
            case 3:
            case 4:
            System.out.println(">> CUMPLICE <<"); break;
            case 5:
            System.out.println(">> ASSASSINO <<"); break;
            default:
            System.out.println(">> INOCENTE <<"); break;
        }

    }
    
}
