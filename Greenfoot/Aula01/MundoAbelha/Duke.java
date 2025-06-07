import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duke extends Actor
{
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("ouch.wav");
            Greenfoot.ask("Digite seu nome:");
    
        }
        //Obtem informações sobre o mouse se teve ações
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //Button 1 = esquerdo; 2 = centro, 3 = direito
        if (mouse != null && mouse.getButton() == 3){
            setLocation(mouse.getX(), mouse.getY());
        }
    }
}
