package chaturanga;
public class visir extends pieza{//else{return false;}
	
	//String nombre = "D";
	
	public visir(int x, int y,String n){
		super(x,y,n);
	}
        
    @Override
        public boolean validarmovimiento(int xint,int yint){
            if (xint == (x + 1) && yint == (y + 1)
                    || xint == (x - 1) && yint == (y + 1)
                    || xint == (x + 1) && yint == (y - 1)
                    || xint == (x - 1) && yint == (y - 1)) {
                if(tablero.tbl[xint][yint]!=null){
                    if(tablero.tbl[xint][yint].codigo!=this.codigo){
                        x=xint;
                        y=yint;
                        return true;
                    }
                }else if(tablero.tbl[xint][yint]==null){
                    x=xint;
                    y=yint;
                    return true;
                }
            }
            return false;
        }

	
//    @Override
//	public boolean validarmovimiento(int x,int y){
//		int ur=xint-x;
//		int ul=x-xint;
//		int dr=xint-x;
//		int dl=x-xint;
//		int v=x-x;
//		if(x==x&&y!=y){
//			return true;
//		}else if(x!=x&&y==y){
//			return true;
//		}else if(yint==(y-ur)||yint==(y-ul)||yint==(y+dr)||yint==(y+dl)){
//			x=xint;
//			y=yint;
//			return true;
//			
//		}else{return false;}
//	
//	}
}