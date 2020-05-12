/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoHerencia;

/**
 *
 * @author piero
 */
public class Cuadrado implements Figura{
    private double lado;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 3 * lado;
    }
    
    @Override
    public double calcularArea(){
        double resultado;        
        resultado = (lado * lado);        
        return resultado;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un cuadrado");
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
        return "Este es un cuadrado de lado " + lado;
    }
}
