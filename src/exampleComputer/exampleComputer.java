/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleComputer;

import java.util.Scanner;

/**
 * This is the main class where we create objects and introduce the values of
 * the differents parameters of that object by keyboard and visualiced them on
 * screen.
 *
 * @author jreyarijon
 */
public class exampleComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a mouse's sort :");
        String type = sc.next();

        System.out.println("Type screen's brand :");
        String brand = sc.next();

        System.out.println("Type ths screen's size :");
        float inches = sc.nextFloat();

        System.out.println("Type any seep of CPU :");
        int speed = sc.nextInt();

        System.out.println("Type a quantity of CPU memory :");
        int memory = sc.nextInt();

        Mouse mouse = new Mouse(type);
        Screen screen = new Screen(brand, inches);
        Cpu cpu = new Cpu(speed, memory);
        Computer pc = new Computer(mouse, screen, cpu);
        System.out.println("COMPUTER INFO" + "\nMouse's type:" + pc.getMouse().getType() + "\nScreen's brand :" + pc.getScreen().getBrand() + "\tScreen's size :" + pc.getScreen().getInches() + "\nCPU speed :" + pc.getCpu().getSpeed() + "\tCPU memory :" + pc.getCpu().getMemory());
    }

}
