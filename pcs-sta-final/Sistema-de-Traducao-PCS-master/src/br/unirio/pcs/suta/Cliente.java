package br.unirio.pcs.suta;

import br.unirio.pcs.dao.ClienteDAO;
/**
 *
 * @author tiago
 */
public class Cliente{

    private String nome;
    private String senha;
    private String cpf;
    private String telefone;
    private String sobreNome;
    
    public Cliente() {

    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Cliente(String nome, String senha, String cpf, String telefone, String sobreNome) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sobreNome = sobreNome;
    }
} 
