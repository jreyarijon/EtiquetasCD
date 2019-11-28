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
public class Cpu {

    private int speed;
    private int memory;

    /**
     * Parameterless constructor.
     */
    public Cpu() {

    }

    /**
     * Constructor with parameters.
     *
     * @param speed CPU speed
     * @param memory CPU memory capacity
     */
    public Cpu(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     * This method is used to assign a int value to speed.
     *
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Method that returns us an int value of speed.
     *
     * @return Returns speed's value.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * This method is used to assign a int value to memory.
     *
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Method that returns us an int value of memory.
     *
     * @return Returns memory's value.
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Method that will show us all parameters's value
     */
    public void parameters() {
        System.out.println("Velocidade =" + speed + "\tMemoria =" + memory);
    }

}
