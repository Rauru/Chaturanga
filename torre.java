package chaturanga;
public class torre extends pieza{
	
	//String nombre = "T";
	
	public torre(int x, int y,String n){
		super(x,y,n);
	}
	
	
	public boolean validarmoviemiento(int xintint,int y){
		if(xint==x&&yint!=y){
			return true;
		}else if(xint!=x&&yint==y){
			return true;
		}else{return false;}
	}
	
}

