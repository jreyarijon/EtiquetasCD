/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleComputer;

/**
 * In this class we'll create the attributes, constructors and methods needed
 * for an object (Computer).
 *
 * @author jreyarijon
 */
public class Mouse {

    private String type;

    /**
     * Parameterless constructor.
     */
    public Mouse() {

    }

    /**
     * Constructor with parameters
     *
     * @param type Sort of mouse.
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     * This method is used to assign a String value to type.
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Method that returns us a type's String value.
     *
     * @return Returns type's value.
     */
    public String getType() {
        return type;
    }

    /**
     * Method that will show us all parameters's value.
     */
    public void parameters() {
        System.out.println("Rato tipo :" + type);
    }
}
