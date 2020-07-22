package com.vinicius.webservice.entities;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String outro;

    public User(){
    }

    public User(String nome, String outro) {
        this.nome = nome;
        this.outro = outro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }
}
