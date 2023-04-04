package liga;


public class estadio {
    private String nome;
    private String dataInauguracao;
    private String localizacao;
    private int capacidade;

    public estadio(String nome, String dataInauguracao, String localizacao, int capacidade) {
        this.nome = nome;
        this.dataInauguracao = dataInauguracao;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataInauguracao() {
        return dataInauguracao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataInauguracao(String dataInauguracao) {
        this.dataInauguracao = dataInauguracao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setCapacidade(int capacidade) {
    	
    }
}
    


