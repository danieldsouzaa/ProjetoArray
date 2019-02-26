
package es.senac.br;

public class Principal {

    public static void main(String[] args) {
        
    Caneta caneta1 = new Caneta(); // instanciar da classe com a principal
    
        // Atributos - Propriedades
        
        caneta1.modelo ="Bic" ;
        caneta1.cor = "Preta";
        caneta1.ponta = 1.0f; 
        caneta1.carga = 90;
        caneta1.tampar();
        
        // metodos
        caneta1.status();
        caneta1.rabiscar();
        
    System.out.println(""); // pula uma linha
                
    Caneta caneta2 = new Caneta(); // instanciar da classe com a principal

        caneta2.modelo = "Faber Castel";
        caneta2.cor = "Azul";
        caneta2.ponta = 0.5f; 
        caneta2.carga = 50;
        caneta2.destampar();
        
        // metodos
        caneta2.status();
        caneta2.rabiscar();
        
        
          
    }
    
}
