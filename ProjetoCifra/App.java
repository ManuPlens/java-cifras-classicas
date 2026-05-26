package ProjetoCifra;

import ProjetoCifra.Desafio.*;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("=================== Solução do Mistério A2 B ===================");

    String local = Decifrador.decifrarCesar("JSYWFIF", 5);
    System.out.println("Local do crime: " + local);

    String horario = Decifrador.decifrarVigenere("U_ZMLE_R_CIVBH", "UNIDERP");
    System.out.println("Horário: " + horario);

    String objeto = Decifrador.decifrarRC4("C8 28 BB FE 97 9D 8B E7 F0 C4 8E 9C", local);
    System.out.println("Objeto do crime: " + objeto);

    System.out.println("\n==================== Solução do Mistério A2 A ====================");

    String protocolo = Decifrador.decifrarVigenere("T_X_N_S_R_L", "MXLINUX");
    System.out.println("O Protocolo de Acesso: " + protocolo);

    String arquivo = Decifrador.decifrarRC4("B1 F4 C6 6C F6 7D 4F", protocolo.replace("_", ""));
    System.out.println("O Arquivo de Configuração: " + arquivo);

    String localizacao = Decifrador.decifrarCesar("VIMXSV", 4);
    System.out.println("A Localização Final: " + localizacao);

    System.out.println("\n==================== Solução do Mistério A2 C ====================");

    String despertar = Decifrador.decifrarCesar("ZPNH WHYH H IPISPVALJH", 7);
    System.out.println("O despertar: " + despertar);

    String arquivoConfiguracao = Decifrador.decifrarVigenere("AZJTICIM RHCIN UC BCVUFZ VJ GSCQJUC XIOLHTVJ", "LIVRO");
    System.out.println("O arquivo de configuração: " + arquivoConfiguracao);

    String objetivo = Decifrador.decifrarRC4("2C D2 AC 57 EB 75 18 CD C0 1B 2C D5 01 72 05 C3 5B 50 3F 33 40 CF FB 7E A4 99 D8 BC 49 7F 44 45 C1 28 55", "SALDO");
    System.out.println("Objetivo final: " + objetivo);

  }
}
