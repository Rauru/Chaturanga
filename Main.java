package chaturanga;
import java.util.Scanner;
public class Main{
	static int turno=1;
	static void validarturno(){
		
		if(turno==1){
			turno++;
		}else{
			turno--;
		}
	}
	
	public static void main(String arg[]){
		
		tablero tb= new tablero();
		Scanner sc = new Scanner (System.in);
		int op=0;
		int x;
		int y;
		int xmover;
		int ymover;
			do{
				
				System.out.println("Elija una opcion");
				System.out.println("1.Jugar ajedrez");
				System.out.println("2.ranking");
				System.out.println("3.Salir");
				op=sc.nextInt();
				if(op==1){
				tb.ordenarpiezas();
				tb.imprimirtbl();
					do{
						
						
						tb.imprimirtbl();
						
                                                System.out.println("");
                                                if(turno==1){
                                                    System.out.println("es el turno del jugador 1");
                                                    
                                                }else{
                                                    System.out.println("es el turno del jugador 2");
                                                    
                                                }
						System.out.println("Selecione una pieza a mover");
						x=sc.nextInt();
						y=sc.nextInt();
						System.out.println("Selecione un espacio a mover");
						xmover=sc.nextInt();
						ymover=sc.nextInt();
//			tb.tbl[x][y].validarmovimiento(xmover,ymover);
                                                if(tb.tbl[x][y].codigo==turno){
                                                    if (tb.tbl[x][y].validarmovimiento(xmover,ymover)){
                                                        tb.tbl[xmover][ymover]=tb.tbl[x][y];
                                                        tb.tbl[x][y]=null;
                                                        validarturno();
                                                    }
                                               }else{
                                                    System.out.println("Esta moviendo una fichaa que no le corresponde");
                                               }
					}while(tb.ganar==0);
				}else if(op==2){
				break;
		
				}
			}while(op!=3);
	
	}
}