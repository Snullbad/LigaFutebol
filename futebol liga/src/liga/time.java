package liga;
import java.util.Date;
import java.util.List;





public class time  {
    private String nome;
    private Date dataFundacao;
    private String estadio;
    private List<jogador> elenco;

    
    public time(String nome, Date dataFundacao, String estadio, List<jogador> elenco) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estadio = estadio;
        this.elenco = elenco;
    }
    
  
}
	
