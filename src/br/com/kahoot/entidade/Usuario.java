package br.com.kahoot.entidade;

import java.io.Serializable;

/**
 *
 * @author William
 */
public class Usuario implements Serializable {

    private Integer id;
    private String nome;
    private Integer pontos;
    private String ip;

    public Usuario() {
        this.pontos = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", pontos=" + pontos + ", ip=" + ip + '}';
    }

}
