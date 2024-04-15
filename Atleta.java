public class Atleta {
    private String nome;
    private float altura;
    private float peso;
    private int numCamisa;

    public Atleta(String nome, float altura, float peso, int numCamisa) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso()  {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getNumCamisa() {
        return numCamisa;
    }
    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }
}
