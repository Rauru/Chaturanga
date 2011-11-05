package chaturanga;
public class peon extends pieza{
	
	//String nombre = "P";
	
	tablero tb = new tablero();
	public peon(int x, int y,String n){
		super(x,y,n);

	}
	
	
	
    @Override
	public boolean validarmovimiento(int xint, int yint){
		if(activo()){
			if(tablero.tbl[x][yint]==null){
				//if(color()){
                            if(yint==(y+1) && xint==x){
                                y=yint;
                                return true;
                            }else if(yint>=(y+2)){
                                return false;
                            }else if(yint==(y-1) && xint==x){
                                y=yint;
                                return true;
                            }
					
				
                        }

                }

    return validarcomer(xint,yint);

    }
	public boolean validarcomer(int xint,int yint){
            if(this.codigo==1){
                if(yint==(y-1)&&xint==(x+1)||yint==(y-1)&&xint==(x-1)){
                    if(tablero.tbl[xint][yint]!=null){
                        if(tablero.tbl[xint][yint].codigo!=this.codigo){
                            x=xint;
                            y=yint;
                            return true;
                        }
                    }
                }
            }else{
                if(yint==y+1&&xint==x+1||yint==y+1&&xint==x-1){
                    if(tablero.tbl[xint][yint]!=null){
                        if(tablero.tbl[xint][yint].codigo!=this.codigo){
                            x=xint;
                            y=yint;
                            return true;
                        }
                    }
                }
            }
	return false;
        }

}