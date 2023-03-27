package liga;
import java.util.Date;

public class estadio {
    private String nome;
    private Date dataInauguracao;
    private String localizacao;
    private int capacidade;
    
    public estadio(String nome, Date dataInauguracao, String localizacao, int capacidade) {
        this.nome = nome;
        this.dataInauguracao = dataInauguracao;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
    }
    
    
}


