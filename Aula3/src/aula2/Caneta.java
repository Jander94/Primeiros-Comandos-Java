package aula2;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);  
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Esta tampada: " + this.tampada);
    };
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Destampe a caneta primeiro...");
        }else{
            System.out.println("Rabiscando...");
        }
    };
    
    protected void tampar(){
        this.tampada = true;
    };
    
    protected void destampar(){
        this.tampada = false;
    }
}
