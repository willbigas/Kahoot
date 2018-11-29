package br.com.kahoot.entidade;

/**
 * Classe servidor que estabele uma padrão de conexão via socket entre aplicacao
 * cliente e aplicacao servidor.
 *
 * @author William
 */
public class Servidor {

    private String ip;
    private Integer porta;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

}
