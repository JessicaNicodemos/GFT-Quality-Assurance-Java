package Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Crie um conjunto contendo as cores do arco-íris e:
Exiba todas as cores uma abaixo da outra
A quantidade de cores que o arco-íris tem
Exiba as cores em ordem alfabética
Exiba as cores na ordem inversa da que foi informada
Exiba todas as cores que começam com a letra ”v”
Remova todas as cores que não começam com a letra “v”
Limpe o conjunto
Confira se o conjunto está vazio */

public class ExSetArcoIris {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-iris: ");
        Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores do arco-iris uma abaixo da outra: ");
        for (String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-iris trm: " + coresArcoIris.size() + " cores.");

        System.out.println("Exiba as cores em ordem alfabetica");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Violeta", "Anil", "Azul", "Verde", "amarelo", "laranja", "vermeljo"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra v: ");
        for (String cor : coresArcoIris){
            if(cor.startsWith("v")) System.out.println(cor);
        }
        
        System.out.println("Remova todas as cores que não começam com a letra v: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()){
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("limpe o conjunto");
        coresArcoIris.clear();
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

    }
}
