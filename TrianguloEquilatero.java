
package RepasoHerencia;


public class TrianguloEquilatero implements Figura{
    
    private double lado;
    
    public TrianguloEquilatero(){
        
    }
    
    public TrianguloEquilatero(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 3 * lado;
    }
    
    @Override
    public double calcularArea(){
        double resultado;        
        resultado = (lado * lado) * (Math.sqrt(3) / 4);        
        return resultado;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triángulo equilátero");
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override 
    public String toString(){
        return "Este es un triángulo equilátero de lado " + lado;
    }
}
