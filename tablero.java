package chaturanga;
  public class tablero{
	 static pieza [][] tbl = new pieza[9][9];
         
	
	static int ganar=0;
	public tablero(){}
		
	
	
	void ordenarpiezas(){
		for(int y=1;y<9;y++){
			for(int x=1;x<9;x++){
				if(y==2||y==7){
					tbl[x][y]=new peon(x,y," P");
					tbl[x][y].color();
				}else if(y==1&&x==1||y==8&&x==1||y==1&&x==8||y==8&&x==8){
					tbl[x][y]=new torre(x,y," T");
					tbl[x][y].color();
				}else if(y==1&&x==2||y==8&&x==2||y==1&&x==7||y==8&&x==7){
					tbl[x][y]=new caballo(x,y," C");
					tbl[x][y].color();
				}else if(y==1&&x==3||y==8&&x==3||y==1&&x==6||y==8&&x==6){
					tbl[x][y]=new elefante(x,y," E");
					tbl[x][y].color();
				}else if(y==1&&x==4||y==8&&x==4){
					tbl[x][y]= new visir(x,y," V");
					tbl[x][y].color();
				}else if(y==1&&x==5||y==8&&x==5){
					tbl[x][y]= new rey(x,y," R");
					tbl[x][y].color();
				}
			
			}
		}
		

					
			
	}
	

	
	void imprimirtbl(){

		for(int y=0;y<9;y++){
			System.out.println("");
			for(int x=0;x<9;x++){
				if(x==0&&y==0){
					System.out.print("  ");
				}else if(y==0){
					System.out.print(x+"  ");
				}else if(x==0){
					System.out.print(y);
				}else if(tbl[x][y]==null){
					System.out.print(" - ");
					
        			}else if(tbl[x][y]!=null){
                                System.out.print(tbl[x][y].nombre());
                                }
			}
		}
		
	}
}
