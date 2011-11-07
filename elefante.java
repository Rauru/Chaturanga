package chaturanga;

public class elefante extends pieza {

    //String nombre = "A";
    public elefante(int x, int y, String n) {
        super(x, y, n);
    }

    @Override
    public boolean validarmovimiento(int xint, int yint) {
        if (xint == (x + 2) && yint == (y + 2)
                || xint == (x - 2) && yint == (y + 2)
                || xint == (x + 2) && yint == (y - 2)
                || xint == (x - 2) && yint == (y - 2)) {
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
//	public boolean validarmovimiento(int xint, int yint){
//		int ur=xint-x;
//		int ul=x-xint;
//		int dr=xint-x;
//		int dl=x-xint;
//		if(yint==(y-ur)||yint==(y-ul)||yint==(y+dr)||yint==(y+dl)){
//			x=xint;
//			y=yint;
//			return true;
//			
//			}else{return false;}
//	
//	}
}