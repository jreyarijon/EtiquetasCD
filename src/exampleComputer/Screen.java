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
public class Screen {

    private String brand;
    private float inches;

    /**
     * Parameterless contructor
     */
    public Screen() {

    }

    /**
     * Contructor with parameters
     *
     * @param brand Screen's creator.
     * @param inches Screen's diameter.
     */
    public Screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    /**
     * This method is used to assign a String value to brand.
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Method that returns us a brand's String value
     *
     * @return Returns brand's value.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method is used to assign a float value to inches.
     *
     * @param inches
     */
    public void setInches(float inches) {
        this.inches = inches;
    }

    /**
     * Method that returns us a inches's float value.
     *
     * @return Returns inches's value.
     */
    public float getInches() {
        return inches;
    }

    /**
     * Method that will show us all parameters's value
     */
    public void parameters() {
        System.out.println("Marca :" + brand + "\tTamaño :" + inches);
    }
}
