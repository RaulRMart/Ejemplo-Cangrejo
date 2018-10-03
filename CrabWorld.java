import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private Lobster lobster;
    private Crab crab;
    private GreenfootSound musica;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        
        this.crab = new Crab();
        addObject(crab,326,113);
        
        this.lobster = new Lobster();
        addObject(lobster,230,332);
        
        Tiempo tiempo = new Tiempo();
        addObject(tiempo, 5,5);
        
        musica = new GreenfootSound("ufo-t-balt.mp3");
       
        int n = 20;
        prepare(n);
    }
    public void started(){
        musica.playLoop();
    }
    public void stopped(){
        musica.pause();
    }
    public Lobster accedeLangosta(){
        return lobster;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int gusanos)
    {
        for(int i = 0; i < gusanos ; i++){
            Worm worm = new Worm();
            addObject(worm,10+Greenfoot.getRandomNumber(500),10+Greenfoot.getRandomNumber(500));
        }
        
    }
}
