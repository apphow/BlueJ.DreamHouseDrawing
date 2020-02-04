
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Square porch;
    private Square treeTrunk;
    private Triangle treeTop;
    private Triangle treeTop1;
    private Triangle treeTop2;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(140);
        wall.changeSize(140);
        wall.makeVisible();
        wall.changeColor("red");

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(100);
        window.moveVertical(155);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(75, 200);
        roof.moveHorizontal(80);
        roof.moveVertical(100);
        roof.makeVisible();
        roof.changeColor("magenta");

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(5);
        sun.moveVertical(-10);
        sun.changeSize(50);
        sun.makeVisible();
        
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(10);
        sun2.moveVertical(-10);
        sun2.changeSize(50);
        sun2.makeVisible();
        
        porch = new Square();
        porch.changeColor("red");
        porch.moveHorizontal(125);
        porch.moveVertical(240);
        porch.changeSize(20);
        porch.makeVisible();
        
        treeTrunk = new Square();
        treeTrunk.changeColor("black");
        treeTrunk.moveHorizontal(-10);
        treeTrunk.moveVertical(240);
        treeTrunk.changeSize(25);
        treeTrunk.makeVisible();
        
        treeTop = new Triangle();
        treeTop.changeColor("green");
        treeTop.moveHorizontal(13);
        treeTop.moveVertical(242);
        treeTop.changeSize(33,55);
        treeTop.makeVisible();
        
        treeTop1 = new Triangle();
        treeTop1.changeColor("green");
        treeTop1.moveHorizontal(13);
        treeTop1.moveVertical(225);
        treeTop1.changeSize(10,20);
        treeTop1.makeVisible();
        
        treeTop2 = new Triangle();
        treeTop2.changeColor("green");
        treeTop2.moveHorizontal(13);
        treeTop2.moveVertical(228);
        treeTop2.changeSize(35,65);
        treeTop2.makeVisible();
        
        
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("blue");
            sun2.changeColor("yellow");
            treeTrunk.changeColor("brown");
            treeTop.changeColor("green");
            treeTop1.changeColor("green");
            treeTop2.changeColor("green");
            
        }
    }
    
    public void sunset(){
    if(wall != null) {
    sun2.makeInvisible();
    sun.slowMoveVertical(250);
}
    }
    

}
