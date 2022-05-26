package Pedido;

import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private long id;
    private String telefone;
    private List<ItemPedido> itens = new ArrayList();
    private double valorTotal;
    
    public Pedido(Long id, String telefone, List<ItemPedido> itens, double valorTotal){
        this.id = id;
        this.telefone = telefone;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public List<ItemPedido> getItens(){
        return itens;
    }
    
    public void setItens(List<ItemPedido> itens){
        this.itens = itens;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    
}
