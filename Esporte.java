public class Esporte {
    private String nome;
    private int numItegrantes;

    public Esporte(String nome, int numItegrantes) {
        this.nome = nome;
        this.numItegrantes = numItegrantes;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumItegrantes() {
        return numItegrantes;
    }
    public void setNumIntegrantes(int numItegrantes) {
        this.numItegrantes = numItegrantes;
    }
}
