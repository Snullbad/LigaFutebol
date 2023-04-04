package liga;

public class jogador  {
    private int numero;
    private String nome;
    private boolean titular;
    private String posicao;
  
    
    public jogador(int numero, String nome, boolean titular, String posicao) {
        this.numero = numero;
        this.nome = nome;
        this.titular = titular;
        this.posicao = posicao;
    }
    public int getnumero() {
    	return numero;    	
    }
    public void setnumero(int numero) {
      this.numero = numero;
    }
    public String getnome() {
    	return nome;
    }
    public void setnome(String nome) {
    	this.nome = nome;
    	
    }
    public boolean istitular() {
    	return titular;
    }
    public void settitular(boolean titular) {
    	this.titular= titular;
    }
    public String getposicao() {
        return posicao;        
    }
    public void setposicao(String posicao) {
    	this.posicao = posicao;
    }
}
  
    







