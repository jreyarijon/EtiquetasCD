/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *
 * @author jreyarijon
 */
public class Pantalla {
    private String marca;
    private float pulgadas;
    /**
     * Constructor sin parámetros
     */
    public Pantalla(){
        
    }
    /**
     * Contructor con parámetros
     * @param marc
     * @param pulg 
     */
    public Pantalla(String marc, float pulg){
        marca = marc;
        pulgadas = pulg;
    }
    /**
     * Creo un método de acceso el cual no me va adevolver nada y atribuye a marc un valor de tipo String
     * @param marc 
     */
    public void setMarca(String marc){
        marca = marc;
    }
    /**
     * Utiliz un método de acceso para que me devuelva un valor de marc de tipo String
     * @return Devuelve un valor de tipo String de marca
     */
    public String getMarca(){
        return marca;
    }
    /**
     * Creo un método de acceso el cual no devuelve nada y asigna un valor de tipo float a pulg
     * @param pulg 
     */
    public void setPulgadas(float pulg){
        pulgadas = pulg;
    }
    /**
     * Utilizo un método de acceso el cual me devuelve el valor de pulg de tipo float
     * @return 
     */
    public float getPulgadas(){
        return pulgadas;
    }
    /**
     * Creo un método de acceso el cual me mostrará los valores de los parámetros
     */
    public void Amosar(){
        System.out.println("Marca :"+ marca+"\tTamaño :"+ pulgadas);
    }
}
