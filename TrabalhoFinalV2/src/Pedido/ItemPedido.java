package Pedido;

public class ItemPedido {
    private Long id;
    private String forma;
    private String tipoDaPizza;
    private double tamanho;
    private double precoItem;
    private double precoSimples = 10.00;
    private double precoEspecial = 16.00;
    private double precoPremium = 25.00;
    
    public ItemPedido(Long id, String forma, String tipoDaPizza, double tamanho, double precoItem){
        this.id = id;
        this.forma = forma;
        this.tipoDaPizza = tipoDaPizza;
        this.tamanho = tamanho;
        this.precoItem = precoItem;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getForma(){
        return forma;
    }
    
    public void setForma(String forma){
        this.forma = forma;
    }
    
    public String getTipoDaPizza(){
        return tipoDaPizza;
    }
    
    public void setTipoDaPizza(String material){
        this.tipoDaPizza = material;
    }
    
    public double getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    
    public void atualizaPrecos(double precoNovo){
        if(getTipoDaPizza().equals("Simples")){
            precoSimples = precoNovo;
        }else if(getTipoDaPizza().equals("Especial")){
            precoEspecial = precoNovo;
        }else{
            precoPremium = precoNovo;
        }
    }
    
    public double getPrecoSimples(){
        return precoSimples;
    }
    
    public void setPrecoSimples(double precoSimples){
        this.precoSimples = precoSimples;
    }
    
    public double getPrecoEspecial(){
        return precoEspecial;
    }
    
    public void setPrecoEspecial(double precoEspecial){
        this.precoEspecial = precoEspecial;
    }
    
    public double getPrecoPremium(){
        return precoPremium;
    }
    
    public void setPrecoPremium(double precoPremium){
        this.precoPremium = precoPremium;
    }
    
    public double getPrecoItem(){
        return precoItem;
    }
    
    public void setPrecoItem(double precoItem){
        this.precoItem = precoItem;
    }
    
    public void calculaPrecoItem(double precoItem){
        this.precoItem = precoItem * this.tamanho;
    }
}
