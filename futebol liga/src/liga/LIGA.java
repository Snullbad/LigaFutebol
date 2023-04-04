package liga;

public class LIGA {
    private String nome;
    private boolean regional;
    private int numClubes;
    private String nivel;

    public LIGA (String nome, boolean regional, int numClubes, String nivel) {
        this.nome = nome;
        this.regional = regional;
        this.numClubes = numClubes;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public boolean isRegional() {
        return regional;
    }

    public int getNumClubes() {
        return numClubes;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegional(boolean regional) {
        this.regional = regional;
    }

    public void setNumClubes(int numClubes) {
        this.numClubes = numClubes;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}


