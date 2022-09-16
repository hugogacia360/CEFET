import java.util.Objects;

public class Serie implements Comparable<Serie> {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie [genero=" + genero + ", nome=" + nome + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() { // hashCode() e equals() são necessários para que o TreeSetpossa comparar os
                            // objetos
        return Objects.hash(genero, nome, tempoEpisodio);
    }

    @Override
    public boolean equals(Object obj) { // verifica se o objeto é igual a outro
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
                && Objects.equals(tempoEpisodio, other.tempoEpisodio);
    }

    @Override
    public int compareTo(Serie s) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), s.getTempoEpisodio());
        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        } else {
            return this.getGenero().compareTo(s.getGenero());
        }

    }

}
