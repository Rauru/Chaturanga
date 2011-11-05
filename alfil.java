package chaturanga;
public class alfil extends pieza{
	
	//String nombre = "A";
	
	public alfil(int x, int y,String n){
		super(x,y,n);
	}
	
    @Override
	public boolean validarmovimiento(int xint, int yint){
		int ur=xint-x;
		int ul=x-xint;
		int dr=xint-x;
		int dl=x-xint;
		if(yint==(y-ur)||yint==(y-ul)||yint==(y+dr)||yint==(y+dl)){
			x=xint;
			y=yint;
			return true;
			
			}else{return false;}
	
	}

}