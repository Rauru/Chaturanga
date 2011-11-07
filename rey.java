package chaturanga;
public class rey extends pieza{
    
	//String nombre ="R";
	int cont=0;
	public rey(int x, int y,String n){
		super(x,y,n);
	}
	
    @Override
	public boolean validarmovimiento(int xint, int yint){
		if(cont==0){
                    if(xint==(x+1)&&yint==(y+2)||xint==(x-1)&&yint==(y+2)||xint==(x-1)&&yint==(y-2)||xint==(x+1)&&yint==(y-2)
                    || xint==(x+2)&&yint==(y+1)||xint==(x+2)&&yint==(y-1)||xint==(x-2)&&yint==(y+1)||xint==(x+2)&&yint==(y-1)){
                        if(tablero.tbl[xint][yint]!=null){
                            if(tablero.tbl[xint][yint].codigo!=this.codigo){
                                y=yint;
                                x=xint;
                                return true;
                            }
                        }else if(tablero.tbl[xint][yint]==null){
                            y=yint;
                            x=xint;
                            return true;
                        }
                    }
                }if(xint==x+1&&yint==y+1
                        ||xint==x+1&&yint==y
                        ||xint==x+1&&yint==y-1
                        ||xint==x&&yint==y+1
                        ||xint==x&&yint==y-1
                        ||xint==x-1&&yint==y+1
                        ||xint==x-1&&yint==y
                        ||xint==x-1&&yint==y-1){
			if(tablero.tbl[xint][yint]!=null){
                            if(tablero.tbl[xint][yint].codigo!=this.codigo){
                                x=xint;
                                y=yint;
                                return true;
                            }
                        }
			
                }
                return false;
    }
}