import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private Counter vidas;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Crab(){
        vidas = new Counter("Vidas ");
        vidas.setValue(5);
    }
    
    protected void addedToWorld(World world){
        world.addObject(vidas, 500, 20);
    }
    
    public void act() 
    {
       super.move(4);
       if(Greenfoot.isKeyDown("right")){
           turn(3);
       }
       if(Greenfoot.isKeyDown("left")){
           turn(-3);
       }
       if(isTouching(Worm.class)){
           removeTouching(Worm.class);
           Greenfoot.playSound("eating.wav");
       }
       if(isTouching(Lobster.class)){
           vidas.setValue(vidas.getValue() - 1);
           setLocation(250,250);
           getWorldOfType(CrabWorld.class).accedeLangosta().setLocation(250,500);
       }
    }    
}
