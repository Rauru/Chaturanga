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
			if(tb.tbl[x][yint]==null){
				//if(color()){
				
						if(yint==(y+1) && xint==x){
						y=y;
						return true;
						}else if(yint>=(y+2)){
							return false;
						}else if(yint==(y-1) && xint==x){
							y=y;

							return true;
						}
					
				
	}

                }

return false;

    }
//	public boolean validarcomer(int xint,int yint){
//			if(activo()){
//				if(color()){
//					if(tb.tbl[x-1][y+1]!=null){
//						x=x-1;
//						y=y+1;
//						return true;
//					}else if(tb.tbl[x+1][y-1]!=null){
//						x+=1;
//						y+=1;
//						return true;
//					}
//				}else{
//					if(tb.tbl[x-1][y-1]!=null){
//						x=x-1;
//						y=y-1;
//						return true;
//					}else if(tb.tbl[x+1][y-1]!=null){
//						x+=1;
//						y-=1;
//						return true;
//					}
//				}
//			}else{return false;}
//	return false;
//	}

}