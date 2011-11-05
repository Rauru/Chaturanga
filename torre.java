package chaturanga;
public class torre extends pieza{
	
	//String nombre = "T";
	
	public torre(int x, int y,String n){
		super(x,y,n);
	}
	
	
	public boolean validarmoviemiento(int xint,int y){
		if(xint==x&&yint!=y){
                    y=yint;
                    return true;
		}else if(xint!=x&&yint==y){
                    x=xint;
                    return true;
		}else{return false;}
	}
        
    @Override
        public boolean validarsalto(int xint,int yint){
            
        }
	
}

