    import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionRobot_1 extends Robot
{
    public FunctionRobot_1(int st, int ave, Direction dir, int num)
    {
        super(st, ave, dir, num);
    }

//  return the number of left turns needed to have this Robot face North
//  Robots current direction is NOT changed!
    public int numberOfLeftTurnsToFaceNorth()
    {
        int LTN=0;
        if (!facingNorth()) {
            turnLeft();
            LTN = LTN + 1;
            if (!facingNorth()) {
                turnLeft();
                LTN = LTN + 1;
                if (!facingNorth()) {
                        turnLeft();
                        LTN = LTN + 1;
            
            
                    }
                  }
                }
        return LTN;
    }

//  return the number of left turns needed to have this Robot face South
//  Robots current direction is NOT changed!
    public int numberOfLeftTurnsToFaceSouth()
    {
        int STN=0;
        if (!facingSouth()) {
            turnLeft();
            STN = STN + 1;
            if (!facingSouth()) {
                turnLeft();
                STN = STN + 1;
                if (!facingSouth()) {
                        turnLeft();
                        STN = STN + 1;
            
            
                    }
                  }
                }
        return STN;
    }

//  return the number of left turns needed to have this Robot face West
//  Robots current direction is NOT changed!
    public int numberOfLeftTurnsToFaceWest()
    {
        return -1;
    }

//  return the number of left turns needed to have this Robot face East
//  Robots current direction is NOT changed!
    public int numberOfLeftTurnsToFaceEast()
    {
        return -1;
    }
}