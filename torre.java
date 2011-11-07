package chaturanga;
public class torre extends pieza{
	
	//String nombre = "T";
	
	public torre(int x, int y,String n){
		super(x,y,n);
	}
	
	
    @Override
	public boolean validarmovimiento(int xint,int yint){
		validarsalto();
                if(xint==x&&yint!=y){
                    if(tablero.tbl[xint][yint]!=null){
                        if(tablero.tbl[xint][yint].codigo!=this.codigo){
                            y=yint;
                            return validarsalto(xint, yint);
                        }
                    }
		}else if(xint!=x&&yint==y){
                    if(tablero.tbl[xint][yint]!=null){
                        if(tablero.tbl[xint][yint].codigo!=this.codigo){
                            x=xint;
                            return validarsalto(xint, yint);
                        }
                    }
		}
                return false;
        }
        
        public boolean validarsalto(int xint,int yint){
            if(xint==x&&yint!=y){
                if(yini<y){
                    for(int cont=y;cont>yini;cont--){
                        if(tablero.tbl[x][cont]!=null){
                            return false;
                        }
                    }
                }else if(yini>y){
                    for(int cont=y;cont>yini;cont++){
                        if(tablero.tbl[x][cont]!=null){
                            return false;
                        }
                    }
                }
            }else if(xint!=x&&yint==y){
                if(xini<x){
                    for(int cont=x;cont>(xini-1);cont--){
                        if(tablero.tbl[cont][y]!=null){
                            return false;
                        }
                    }
                }else if(xini>x){
                    for(int cont=x;cont>(xini-1);cont++){
                        if(tablero.tbl[cont][y]!=null){
                            return false;
                        }
                    }
                }
            }
            return true;
    }
}

	

