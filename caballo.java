package chaturanga;
public class caballo extends pieza{
	
	//String nombre = "C";
	
	public caballo(int x, int y,String n){
		super(x,y,n);
	}
	
    @Override
	public boolean validarmovimiento(int xint, int yint){
		if(xint==(x+1)&&yint==(y+2)||xint==(x-1)&&yint==(y+2)||xint==(x-1)&&yint==(y-2)||xint==(x+1)&&yint==(y-2)
		|| xint==(x+2)&&yint==(y+1)||xint==(x+2)&&yint==(y-1)||xint==(x-2)&&yint==(y+1)||xint==(x+2)&&yint==(y-1)){
			y=yint;
			x=xint;
			return true;
			
			
		}else{return false;}
	
	}
}