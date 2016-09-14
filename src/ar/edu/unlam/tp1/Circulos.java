
// Ramos Laura Turno Noche

package ar.edu.unlam.tp1;


public class Circulos {
    private Double radio;
    private Double perimetro;
    private Double area;
    
//contructor
    public Circulos(Double radio) { 
    	this.radio = radio;
		this.perimetro = 0.0;
		this.area = 0.0;
    }
	
    
    public Double obtenerRadio(){  
    	return radio=radio;
    	
    }
    
    public Double calcularPerimetro(){  
    	return perimetro=2 * 3.14 * this.radio;
    	
    	
    }
    
    public Double calcularArea(){ 
    	
    	return area=3.14 * this.radio * this.radio;
    }
	

	
	
}
