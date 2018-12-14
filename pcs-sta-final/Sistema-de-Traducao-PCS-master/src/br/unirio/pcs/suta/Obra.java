package br.unirio.pcs.suta;

import java.io.File;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import com.thoughtworks.xstream.XStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.*;
import org.w3c.dom.NodeList;

/**
 *
 * @author Tiago Melo
 */

public class Obra {

    private String nome;
    private String autor;
    private int nota;
    private double preco;
    private String editora;
    private String sinopse;
    private float desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    
    public Obra(String nome, String autor, int nota, double preco, String editora, String sinopse) {

        this.nome = nome;
        this.autor = autor;
        this.nota = nota;
        this.preco = preco;
        this.editora = editora;
        this.sinopse = sinopse;

    }

    public Obra() {

    }
    public static void main(String[] args) {
//
//       Obra obra = new Obra("tiago", "melo", "10", "abc", "zmshsa", "iassa");
//        Obra obra2 = new Obra("Lucas", "Azevedo", "10", "abcde", "fghij", "lmnop");
//        obra.registraObra();
//        obra2.registraObra();
//        obra.deletarObra();
//        //obra2.selecionarObra("tiago");
    }
}
