package chaturanga;
public class dama extends pieza{//else{return false;}
	
	//String nombre = "D";
	
	public dama(int x, int y,String n){
		super(x,y,n);
	}

	
    @Override
	public boolean validarmovimiento(int x,int y){
		int ur=xint-x;
		int ul=x-xint;
		int dr=xint-x;
		int dl=x-xint;
		int v=x-x;
		if(x==x&&y!=y){
			return true;
		}else if(x!=x&&y==y){
			return true;
		}else if(yint==(y-ur)||yint==(y-ul)||yint==(y+dr)||yint==(y+dl)){
			x=xint;
			y=yint;
			return true;
			
		}else{return false;}
	
	}
}