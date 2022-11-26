package Map;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
(Nome Autor - Nome Livro exibindo);
Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas: 408
Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432
*/
public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleat´roia\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Lewis Carroll", new Livro("Alice", 320));
            put("Ali Hazelwood", new Livro("A hipótese do amor", 336));
            put("Colleen Hoover", new Livro("É assim que começa ", 336));            
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--\tOrdem de inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Lewis Carroll", new Livro("Alice", 320));
            put("Ali Hazelwood", new Livro("A hipótese do amor", 336));
            put("Colleen Hoover", new Livro("É assim que começa ", 336));            
        }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        
        System.out.println("--/tOrdem alfabetica autores:\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("--/tOrdem alfabetica nome dos livros:\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3)
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


    }
    
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
    
    
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
    

}