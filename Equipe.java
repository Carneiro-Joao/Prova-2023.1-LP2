import java.util.ArrayList;

public class Equipe {
    private String nome;
    private Esporte modalidade;
    private ArrayList<Atleta> atletas;

    public Equipe(String nome, Esporte modalidade) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.atletas = new ArrayList<>();
    }

    public boolean adicionarAtleta(Atleta a) {
        if (atletas.contains(a)) {
            System.out.println("O atleta já está na equipe.");
            return false;
        }

        atletas.add(a);
        System.out.println("Atleta " + a.getNome() + " adicionado a equipe " + nome + ".");
        return true;
    }

    public boolean removerAtleta(String nomeAtleta, int numCamisa) {
        for (Atleta a : atletas) {
            if (a.getNome().equals(nomeAtleta) && a.getNumCamisa() == numCamisa) {
                atletas.remove(a);
                System.out.println("Atleta " + nomeAtleta + " removido da equipe " + nome + ".");
                return true;
            }
        }

        System.out.println("Atleta " + nomeAtleta + " não encontrado na equipe " + nome + ".");
        return false;
    }

    public void mostrarEquipe() {
        System.out.println("Equipe: " + nome);
        System.out.println("Modalidade: " + modalidade.getNome());
        System.out.println("Número de Atletas: " + atletas.size());
        System.out.println("Lista de Atletas:");

        for (Atleta a : atletas) {
            System.out.println("- Nome: " + a.getNome() + ", Altura: " + a.getAltura() + 
                               ", Peso: " + a.getPeso());
        }
    }
}
