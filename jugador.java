package chaturanga;
public class jugador{
	
	public jugador(){}
	
	boolean validarganador(){
		for(int cont=0;cont<16;cont++){
			if(comidas[cont] instanceof rey){
				return false;
			}
		}return true;
	}
	
	pieza[] comidas = new pieza[16];
	int Jugador;
	String nombre ;
	
	public jugador(String n, int nj){
		nombre = n;
		Jugador = nj;
		
	}
	
	boolean validarcolor(){
		if(Jugador==1){
			return true;
		}else{
			return false;
		}
	}
	
}