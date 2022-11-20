public class RodarAplicacaoClasse {

    public static void main(String[] args) {
        
        //ClasseMae[] = vetor criado e chamado de classe. Colocando 3 objetos nessa classe.
        ClasseMae[] classes = new ClasseMae [] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // metodo for chamando os 3 objetos e executando o metodo 1
        for (ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println(" ");

        for (ClasseMae classe: classes){
            classe.metodo2();
        }
    
        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

    
}
