import java.awt.Point;

/**
 * Write a description of class Shi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shi extends Chess_pieces
{


    /**
     * Default constructor for objects of class Shi
     */
    public Shi(String side,String type,String filename,Chess_pieces[][] array, int x, int y,Point[][] location)
    {
        super(side,type,filename,array,x,y,location);
        
    }
    
    public boolean valid_move(int col, int row)
    {
        
        if(col == coL && row == roW)
        {
            return true;
        }
        
        if(Math.abs(col - coL) == 0 || Math.abs(row - roW) == 0)
        {
            return false;
        }
        
        
        if(Math.abs(col - coL) != 1 && Math.abs(row - roW) != 1)
        {
            return false;
        }
        
        if(side.equals("red"))
        {
            if( (col >=3 && col <= 5) && (row <= 2))
            {
                if(Math.abs(col-coL)!=1 && Math.abs(row-roW) != 1)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            if( (col >=3 &&col <= 5) && (row >=7 ))
            {
                if(Math.abs(col-coL)!=1 && Math.abs(row-roW) != 1)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }            
        }
        
        if(array[row][col] == null)
        {
            return true;
        }
        
        if(array[row][col].getSide().equals(side))
        {
            return false;
        }             
        return true;
        
        
    }
    
    public boolean check_take(int col, int row)
    {
        if(col == coL && row == roW)
        {
            return false;
        }
        return valid_move(col,row);
    }



}
