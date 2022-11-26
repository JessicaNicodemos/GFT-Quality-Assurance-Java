package Map;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
*/

public class ExemploMap{
    public static void main(String[] args) {
        
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares2020 = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares2020.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares2020.put("gol", 15.2);
        System.out.println(carrosPopulares2020);

        System.out.println("Confira se o modelo tcson está no dicionário: " + carrosPopulares2020.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares2020.get("uno"));

        System.out.println("exiba os modelos: ");
        Set<String> modelos = carrosPopulares2020.keySet();
        System.out.println(modelos);

        System.out.println("exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares2020.values();
        System.out.println(consumos);

        System.out.println("exiba o modelos mais economico e o seu consumo: ");
        Double consumoMaisEficiencia = Collections.max(carrosPopulares2020.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares2020.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> Entry : entries){
            if (Entry.getValue().equals(consumoMaisEficiencia))
            modeloMaisEficiente = Entry.getKey();
    
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiencia);
    }

    System.out.println("Exiba o modelo menos economico e seu consumo: ");
    Double consumoMenosEficiente = Collections.min(carrosPopulares2020.values());
    String modeloMenosEficiente = "";
    for (Map.Entry<String, Double> Entry : carrosPopulares2020.entrySet()){
        if(Entry.getValue().equals(consumoMenosEficiente)){
            modeloMenosEficiente = Entry.getKey();
            System.out.println("modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
        
        }
    }

    Iterator<Double> iterator = carrosPopulares2020.values().iterator();
    Double soma = 0d;
    while(iterator.hasNext()){
        soma += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma/carrosPopulares2020.size());

    System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
    Iterator<Double> iterator1 = carrosPopulares2020.values().iterator();
    while(iterator1.hasNext()){
        if(iterator1.next().equals(15.6)) iterator1.remove();
    }
    System.out.println(carrosPopulares2020);

    System.out.println("Exiba todos os carros na ordem em que eles foram informados: ");
    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
        put("gol", 14.4);
        put("uno", 15.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.6);

    }};
    System.out.println(carrosPopulares1.toString());

    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
    System.out.println(carrosPopulares2.toString());
    
    System.out.println("Apague o dicionário de carros: ");
    carrosPopulares2020.clear();

    System.out.println("Confira se o diconário está vazio: " + carrosPopulares2020.isEmpty());

    }
}