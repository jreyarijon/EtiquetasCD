/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleComputer;

/**
 * In this class we'll create the attributes, constructors and methods needed
 * for an object.
 *
 * @author jreyarijon
 */
public class Computer {

    private Mouse mouse;
    private Screen screen;
    private Cpu cpu;

    /**
     * Parameterless constructor
     */
    public Computer() {

    }

    /**
     * Constructor with parameters
     *
     * @param mouse Variable type Mouse
     * @param screen Variable type Screen
     * @param cpu Variable type Cpu
     */
    public Computer(Mouse mouse, Screen screen, Cpu cpu) {
        this.mouse = mouse;
        this.screen = screen;
        this.cpu = cpu;
    }

    /**
     * This method is used to assign a Mouse value to mouse.
     *
     * @param mouse
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Method that returns us a mouse's Mouse value
     *
     * @return Returns mouse's value.
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * This method is used to assign a Screen value toscreen.
     *
     * @param screen
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    /**
     * Method that returns us a screen's Screen value
     *
     * @return Returns screen's value.
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * This method is used to assign a Cpu value to cpu.
     *
     * @param cpu
     */
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Method that returns us a cpu's Cpu value
     *
     * @return Returns cpu's value.
     */
    public Cpu getCpu() {
        return cpu;
    }
}
