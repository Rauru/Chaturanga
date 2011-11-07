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
	 
	
//         void incluirjugadores(String n1, String n2){
//            jugadores[0]=new jugador(n1);
//            jugadores[0]=new jugador(n1);
//        }
         
         public static void main(String arg[]){
                jugador[] jugadores = new jugador[2];
                int puntuacion1=0;
                int puntuacion2=0;
		tablero tb= new tablero();
		Scanner sc = new Scanner (System.in);
		int op=0;
		int x;
		int y;
		int xmover;
		int ymover;
			do{
				
				System.out.println("Elija una opcion");
				System.out.println("1.Jugar chaturanga");
				System.out.println("2.ranking");
				System.out.println("3.Salir");
				op=sc.nextInt();
				if(op==1){
				tb.ordenarpiezas();
				//tb.imprimirtbl();
					
                                            System.out.println("Ingrese nombre del jugador 1");
                                            
                                            String no1=sc.next();
                                            
                                            System.out.println("Ingrese nombre del jugador 2");
                                            String no2=sc.next();
                                           // incluirjugadores(no1, no2);
                                            //jugadores[0].nombre=no1;
                                            //jugadores[1].nombre=no2;
                                            //.out.println(jugadores[0].nombre+jugadores[1].nombre);
                                do{
                                            
                                            
                                            
						tb.imprimirtbl();
						
                                                System.out.println("");
                                                if(turno==1){
                                                    System.out.println("es el turno del jugador "+no1);
                                                    
                                                }else{
                                                    System.out.println("es el turno del jugador "+no2);
                                                }
						System.out.println("Selecione una pieza a mover");
						x=sc.nextInt();
						y=sc.nextInt();
                                                if(x==-1&&y==-1){
                                                    System.out.println("Realmente desea abandonar?");
                                                    String sn=sc.next();
                                                    if(sn.equalsIgnoreCase("si")
                                                            ||sn.equalsIgnoreCase("s")
                                                            ||sn.equalsIgnoreCase("y")){
                                                        break;
                                                    }
                                                }

                                                System.out.println("Selecione un espacio a mover");
						xmover=sc.nextInt();
						ymover=sc.nextInt();
                                                

                                                if(tablero.tbl[x][y].codigo==turno){
                                                    if (tablero.tbl[x][y].validarmovimiento(xmover,ymover)){
                                                        if(x<0
                                                                ||x>9
                                                                ||y<0
                                                                ||y>9
                                                                ||xmover<0
                                                                ||xmover>9
                                                                ||ymover<0
                                                                ||ymover>9){
                                                            System.out.println("coordenadas incorrectas");
                                                        }
                                                        if(tablero.tbl[xmover][ymover]!=null){
                                                            if(tablero.tbl[xmover][ymover].codigo==1){
                                                                puntuacion1+=1;
                                                            }else{
                                                                puntuacion2+=1;
                                                            }
                                                        }
                                                        if(tablero.tbl[xmover][ymover]instanceof rey){
                                                            if(tablero.tbl[xmover][ymover].codigo==1){
                                                                puntuaciones.agregarp(no1, no2,puntuacion1);
                                                                tablero.ganar=1;
                                                            }else{
                                                                puntuaciones.agregarp(no2, no1,puntuacion2);
                                                                tablero.ganar=2;
                                                            }
                                                        }
                                                        tablero.tbl[xmover][ymover]=tablero.tbl[x][y];
                                                        tablero.tbl[x][y]=null;
                                                        
                                                        
                                                        
                                                        validarturno();
                                                    
                                                    }else{
                                                        System.out.println("Movimiento no Valido");
                                                    }

                                               }else{
                                                    System.out.println("Esta moviendo una ficha que no le corresponde");
                                               }
					}while(tablero.ganar==0);
				}else if(op==2){
                                    puntuaciones.puntuacion();
		
				}
			}while(op!=3);
	
	}
}