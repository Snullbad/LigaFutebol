package liga;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAIN { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean adicionarDados = true;
   
    List<estadio> estadios = new ArrayList<>();
    List<jogador> jogadores = new ArrayList<>();
    List<time> times = new ArrayList<>();

    while (adicionarDados) {      
        System.out.println("=== Criando um estádio ===");
        System.out.print("Nome: ");
        String nomeEstadio = sc.nextLine();
        System.out.print("Data de inauguração: ");
        String dataInauguracao = sc.nextLine();
        System.out.print("Localização: ");
        String localizacao = sc.nextLine();
        System.out.print("Capacidade: ");
        int capacidade = sc.nextInt();
        sc.nextLine(); // 

        estadio estadio = new estadio(nomeEstadio, dataInauguracao, localizacao, capacidade);
        System.out.println("Estádio criado: " + estadio);
        estadios.add(estadio);
      
        System.out.println("\n=== Criando um jogador ===");
        System.out.print("Número da camisa: ");
        int numeroCamisa = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nomeJogador = sc.nextLine();
        System.out.print("Titular (s/n): ");
        boolean titular = sc.nextLine().equalsIgnoreCase("s");
        System.out.print("Posição: ");
        String posicao = sc.nextLine();

        jogador jogador = new jogador(numeroCamisa, nomeJogador, titular, posicao);
        System.out.println("Jogador criado: " + jogador);
        jogadores.add(jogador);
    
        System.out.println("\n=== Criando um time ===");
        System.out.print("Nome: ");
        String nomeTime = sc.nextLine();
        System.out.print("Data de fundação: ");
        String dataFundacao = sc.nextLine();

        List<jogador> elenco = new ArrayList<>();
        elenco.add(jogador);

        time time = new time(nomeTime, dataFundacao, estadio, elenco);
        System.out.println("Time criado: " + time);
        times.add(time);
       
        System.out.print("Deseja adicionar mais dados? (s/n): ");
        adicionarDados = sc.nextLine().equalsIgnoreCase("s");
    }

        System.out.println("\nEstádios cadastrados: ");
    for (estadio est : estadios) {
        System.out.println(est);
    }

    System.out.println("\nJogadores cadastrados: ");
    for (jogador jog : jogadores) {
        System.out.println(jog);
    }

    System.out.println("\nTimes cadastrados: ");
    for (time time : times) {
        System.out.println(time);
    }
}
}





