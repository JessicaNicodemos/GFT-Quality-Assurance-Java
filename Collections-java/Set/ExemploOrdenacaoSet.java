package Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
 crie um conjunto e ordene este conjunto exibindo:
 (nome, genero, tempi de episódio)

 Série 1 = got, genero: fantasia, tempo de episódio: 60
 Série 2 = Nome: Friends, genero: comédia, tempoEpisodio: 25
 Série 3 = Nome: The Office, genero: comédia, TempoEpisodio: 25;
 */
public class ExemploOrdenacaoSet {

    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhaSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Friends", "comedia", 25));
            add(new Serie("The Office", "comedia", 25));
        }};
        for (Serie serie : minhaSeries) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Friends", "comedia", 25));
            add(new Serie("The Office", "comedia", 25));
        }};
        for (Serie serie : minhaSeries1) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio());
            
        System.out.println("--\tOrdem natrural (TempoEpisodio\t--");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhaSeries1);
        for (Serie serie : minhaSeries2) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

    System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Serie> mminhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroEpisodio);
        minhasSeries3.addAll(minhas/series);
        for (Serie serie : minhaSeries3) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
    


class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), Serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
    
}

class ComparatorNomeGeneroEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;
      
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        

        
    }
    }

