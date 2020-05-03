
package RepasoHerencia;


public class Rectangulo implements Figura{
    private double base;
    private double altura;
    
    public Rectangulo(){
        
    }
    
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public double calcularArea(){
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return (2 * base + 2 * altura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un rectángulo");
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override 
    public String toString(){
        return "Este es un rectángulo de base " + base+ " y altura "+ altura;
    }
    
    
}
