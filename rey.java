package chaturanga;
public class rey extends pieza{
    
	//String nombre ="R";
	
	public rey(int x, int y,String n){
		super(x,y,n);
	}
	
    @Override
	public boolean validarmovimiento(int xint, int yint){
		if(xint==x+1||yint==y+1){
			x=xint;
			y=yint;
			return true;
			
		}else{return false;}
	}
}