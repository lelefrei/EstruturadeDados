
package filmes;


public class Filmes {

  
    private String titulo;
    private String diretor;
    
    private String genero;

    public Filmes(String titulo) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
