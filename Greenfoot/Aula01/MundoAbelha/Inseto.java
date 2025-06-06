import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Inseto.
 * 
 * @author Rafael Lopes 
 * @version 2025-06-05
 */
public class Inseto extends Actor
{
    /**
     * Act - do whatever the Inseto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void verificarCanto(){
        if (isAtEdge()){
            turn(180);
        }
    }
}
