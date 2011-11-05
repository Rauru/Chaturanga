package chaturanga;
public class pieza{
	
	final int xini;
	final int yini;
	int xint;
	int yint;
	int codigo;
	int x;
	int y;
	
	String nombre;
	
	public pieza(int x, int y, String n){
		
		xini=x;
		yini=y;
                nombre=n+color();
		this.x=x;
		this.y=y;
		
	
	}
	public boolean activo(){
		return true;
	}
	
	public String color(){
		String color="";
		if(yini<=2){
			color="V";
			codigo=2;
		}
		else if(yini>=7){
			color="R";
			codigo=1;
		}
	return color ;
	}
	
	public boolean validarcomer(){
	return false;
	}

	public boolean validarmovimiento(int x, int y){
	return false;
	}
	
	void imprimir(){
		System.out.print(x+y);
	}

        public  String nombre(){
        return nombre;
        }
}