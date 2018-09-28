import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,326,113);
        Lobster lobster = new Lobster();
        addObject(lobster,230,332);
        Worm worm = new Worm();
        addObject(worm,493,46);
        Worm worm2 = new Worm();
        addObject(worm2,528,201);
        Worm worm3 = new Worm();
        addObject(worm3,453,487);
        Worm worm4 = new Worm();
        addObject(worm4,423,344);
        Worm worm5 = new Worm();
        addObject(worm5,136,157);
        Worm worm6 = new Worm();
        addObject(worm6,213,51);
        Worm worm7 = new Worm();
        addObject(worm7,116,521);
        Worm worm8 = new Worm();
        addObject(worm8,370,528);
        Worm worm9 = new Worm();
        addObject(worm9,122,381);
        Worm worm10 = new Worm();
        addObject(worm10,283,240);
        Worm worm11 = new Worm();
        addObject(worm11,519,521);
        Worm worm12 = new Worm();
        addObject(worm12,242,440);
        Worm worm13 = new Worm();
        addObject(worm13,43,47);
    }
}
