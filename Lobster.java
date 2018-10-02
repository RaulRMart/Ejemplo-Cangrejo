import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    private int paso;
    
    public Lobster(){
        paso = 0;
    }
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        paso++;
        if( paso == 5){
            turn(Greenfoot.getRandomNumber(180) - 90);
            paso = 0;
        }
        /*if(isTouching(Crab.class)){
            removeTouching(Crab.class);
        }*/
    }    
}
