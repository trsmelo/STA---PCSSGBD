package br.unirio.pcs.suta;

import java.util.List;
import lombok.*;
/**
 *
 * @author Tiago Melo
 */
public class Pedido {
    
    @Getter @Setter
    private List<Obra> obras;
    private double ordem_compra;
    private String nome_cliente;
    private int id;
    
    /**
     * Adiciona uma obra a uma lista de obras
     * 
     * @param obra 
     */
    public void addObraPedido(Obra obra){
        obras.add(obra);
    }
    /**
     * Deleta uma obra da lista
     */
    public void deleteObraPedido(Obra obra){
        
        for (Obra obra1 : obras) {
            
            if (obra1.getNome().equals(obra.getNome())){
                obras.remove(obra1);
            }   
        }
    }
    public double getOrdem_compra() {
        return ordem_compra;
    }

    public void setOrdem_compra(double obra_compra) {
        this.ordem_compra = obra_compra;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
