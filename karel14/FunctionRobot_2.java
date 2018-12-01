import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Karel14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FunctionRobot_2 extends FunctionRobot_1
{
	public FunctionRobot_2(int st, int ave, Direction dir, int num)
	{
	    super(st, ave, dir, num);
	}

//  returns true if Robot is on a corner with two or more Beepers
//  return false otherwise (i.e., there is zero or one beeper on this corner)
	public boolean twoOrMoreBeepersOnCorner()
	{
        return false;
    }

//  returns true if Robot is on a corner with exactly two Beepers
//  return false otherwise (i.e., there is zero, one or three or more beepers on this corner)
	public boolean exactlyTwoBeepersOnCorner()
	{
        return false;
    }

//  returns true if Robot is on a corner with exactly one Beepers
//  return false otherwise (i.e., there is zero, two or more beepers on this corner)
	public boolean nextToExactlyOneBeeper()
	{
       return false;
	}

//  returns true if Robot is on a corner with one or two Beepers
//  return false otherwise (i.e., there is zero or three or more beepers on this corner)
	public boolean oneOrTwoBeepersOnCorner()
	{
       return true;
	}
}