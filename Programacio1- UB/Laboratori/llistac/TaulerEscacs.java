
public class TaulerEscacs{
	private Peo[] threaten=new Peo[2];
	private char color='\0';
	private int x=0,y=0,i=0;
	private Peo[][] taulell= new Peo[8][8];
	private boolean ocupat=false, perill=false;
	public void PosaPeo(Peo a){
		x=a.GetX();
		y=a.GetY();
		//System.out.println(x+","+y);
		ocupat=(taulell[x][y]!=null);
		if (ocupat) {
			System.out.println("Position at "+a.GetPosit()+" is already occupied");
		}else{
			color=a.GetColor();
			i=0;
			taulell[x][y]=a;
		/*
		perill=(((taulell[x][y]=='w')&&((taulell[x-1][y-1]=='b') || (taulell[x-1][y+1]=='b')))||((taulell[x][y]=='b')&&((taulell[x+1][y-1]=='w') || (taulell[x+1][y+1]=='w'))));*/
			if((x==0)&&(y==0)){
				if(color=='b'){
					if((taulell[x+1][y+1]!=null)&&(taulell[x+1][y+1].GetColor()!='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y+1].GetColour()+" at "+taulell[x+1][y+1].GetPosit());
						//i++;
					}
				}
			}else if((x==0)&&(y==7)){
				if(color=='b'){
					if((taulell[x+1][y-1]!=null)&&(taulell[x+1][y-1].GetColor()=='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y-1].GetColour()+" at "+taulell[x+1][y-1].GetPosit());
						//i++;
					}
				}
			}else if((x==7)&&(y==0)){
			
				if(color=='w'){
					if ((taulell[x-1][y+1]!=null)&&(taulell[x-1][y+1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y+1].GetColour()+" at "+taulell[x-1][y+1].GetPosit());
						//i++;
					}
				}

			}else if((x==7)&&(y==7)){
			
				if(color=='w'){
					if((taulell[x-1][y-1]!=null)&&(taulell[x-1][y-1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y-1].GetColour()+" at "+taulell[x-1][y-1].GetPosit());
						//i++;
					}
				}
			}else if(x==0){
				if(color=='b'){
					if((taulell[x+1][y-1]!=null)&&(taulell[x+1][y-1].GetColor()=='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y-1].GetColour()+" at "+taulell[x+1][y-1].GetPosit());
						//i++;
					}
					if((taulell[x+1][y+1]!=null)&&(taulell[x+1][y+1].GetColor()!='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y+1].GetColour()+" at "+taulell[x+1][y+1].GetPosit());
						//i++;
					}
				}
			}else if(x==7){
			
				if(color=='w'){
					if((taulell[x-1][y-1]!=null)&&(taulell[x-1][y-1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y-1].GetColour()+" at "+taulell[x-1][y-1].GetPosit());
						//i++;
					}
					if ((taulell[x-1][y+1]!=null)&&(taulell[x-1][y+1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y+1].GetColour()+" at "+taulell[x-1][y+1].GetPosit());
						//i++;
					}
				}
			}else if(y==0){
			
				if(color=='w'){
					if ((taulell[x-1][y+1]!=null)&&(taulell[x-1][y+1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y+1].GetColour()+" at "+taulell[x-1][y+1].GetPosit());
						//i++;
					}
				}
				if(color=='b'){
					if((taulell[x+1][y+1]!=null)&&(taulell[x+1][y+1].GetColor()!='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y+1].GetColour()+" at "+taulell[x+1][y+1].GetPosit());
						//i++;
					}
				}
			}else if(y==7){
				if(color=='w'){
					if((taulell[x-1][y-1]!=null)&&(taulell[x-1][y-1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y-1].GetColour()+" at "+taulell[x-1][y-1].GetPosit());
						//i++;
					}
				}
				if(color=='b'){
					if((taulell[x+1][y-1]!=null)&&(taulell[x+1][y-1].GetColor()=='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y-1].GetColour()+" at "+taulell[x+1][y-1].GetPosit());
						//i++;
					}
				}

			}else{
			
				if(color=='w'){
					if((taulell[x-1][y-1]!=null)&&(taulell[x-1][y-1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y-1].GetColour()+" at "+taulell[x-1][y-1].GetPosit());
						//i++;
					}
					if ((taulell[x-1][y+1]!=null)&&(taulell[x-1][y+1].GetColor()=='b')){
						//perill=true;
						//threaten[i]=taulell[x-1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x-1][y+1].GetColour()+" at "+taulell[x-1][y+1].GetPosit());
						//i++;
					}
				}
				if(color=='b'){
					if((taulell[x+1][y-1]!=null)&&(taulell[x+1][y-1].GetColor()=='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y-1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y-1].GetColour()+" at "+taulell[x+1][y-1].GetPosit());
						//i++;
					}
					if((taulell[x+1][y+1]!=null)&&(taulell[x+1][y+1].GetColor()!='w')){
						//perill=true;
						//threaten[i]=taulell[x+1][y+1];
						System.out.println(taulell[x][y].GetColour()+" at "+taulell[x][y].GetPosit()+" threatens "+taulell[x+1][y+1].GetColour()+" at "+taulell[x+1][y+1].GetPosit());
						//i++;
					}
				}
			}
		}
	}
	public boolean EstaOcupat(){return ocupat;}
	public boolean EsPerillos(){return perill;}
	public Peo GetPeo(int x,int y){return taulell[x][y];}
	public Peo GetThreaten(int i){return threaten[i];}
	public int GetNumThreaten(){return i;}
		
}
			
		
	