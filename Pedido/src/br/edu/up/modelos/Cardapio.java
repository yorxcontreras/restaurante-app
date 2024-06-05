package br.edu.up.modelos;

public class Cardapio {

    private String bebidas;
    private String entrada;
    private float conta;
    private String cliente;
    private String pratos;
    private int comanda;

    public Cardapio(String bebidas,String entrada,float conta, String cliente, String pratos, int comanda) {
        
        public String getBebidas() {
            return bebidas;
        }
        
        public void setBebidas(String bebidas) {
            this.bebidas = bebidas;
        }
        
        public String getEntrada() {
            return entrada;
        }
        
        public void setEntrada(String entrada) {
            this.entrada = entrada;
        }
        
        public float getConta() {
            return conta;
        }
        
        public void setConta(float conta) {
            this.conta = conta;
        }
        
        public String getCliente() {
            return cliente;
        }
        
        public void setCliente(String cliente) {
            this.cliente = cliente;
        }
        
        public String getPratos() {
            return pratos;
        }
        
        public void setPratos(String pratos) {
            this.pratos = pratos;
        }
        
        public int getComanda() {
            return comanda;
        }
        
        public void setComanda(int comanda) {
            this.comanda = comanda;
        }	
    }
}
