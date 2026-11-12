package com.seduc_dest1.delivery.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {
@Id

    private String nome;
    private int preco;
    private String descricao;
    private String categoria;
    private String email;
    private String telefone;
    private String endereço;

    public Food(){

    }


    public Food(String nome, String endereço, String telefone, String email, String categoria, String descricao, int preco) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
