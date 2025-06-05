import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da classe BeeWorld:
 * 
 * @author Rafael Lopes 
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,33,39);
        Mosca mosca = new Mosca();
        addObject(mosca,92,328);
        Abelha abelha = new Abelha();
        addObject(abelha,443,273);
        abelha.setLocation(59,199);
        abelha.setLocation(31,211);
        mosca.setLocation(152,268);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,448,336);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,444,84);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,332,211);
        mosca2.setLocation(565,380);
        mosca.setLocation(210,329);
        mosca3.setLocation(573,25);
        mosca4.setLocation(368,150);
        mosca.setLocation(92,318);
        mosca4.setLocation(332,207);
        mosca3.setLocation(457,34);
        mosca3.setLocation(141,448);
        mosca4.setLocation(315,379);
    }
}
