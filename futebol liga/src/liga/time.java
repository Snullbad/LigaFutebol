package liga;
import java.util.Date;
import java.util.List;



public class time {
    private String nome;
    private String dataFundacao;
    private estadio estadio;
    private List<jogador> elenco;

    public time(String nome, String dataFundacao, estadio estadio, List<jogador> elenco) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estadio = estadio;
        this.elenco = elenco;
    }

    public String getNome() {
        return nome;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public estadio getEstadio() {
        return estadio;
    }

    public List<jogador> getElenco() {
        return elenco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setestadio(estadio estadio) {
        this.estadio = estadio;
    }

    public void setElenco(List<jogador> elenco) {
        this.elenco = elenco;
    }
}
   
  

	
