
package es.senac.br;

public class Caneta { // nome da classe
    
    // Atributos / Variaveis / Propriedades
    
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
       
    // Metodos
    void status(){
        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada: " + this.tampada);
    }    
    
    void rabiscar(){
        if(this.tampada == true){
            
            System.out.println("Erro, Caneta Tampada");
        }else
            System.out.println("Escrevendo");
    }
    
    void tampar(){
        this.tampada = true;
    
    }
    
    void destampar(){
        this.tampada = false;
        
        
    }
    
    
    
}
