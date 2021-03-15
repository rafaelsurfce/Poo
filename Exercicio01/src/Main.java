
public class Main {

	public static void main(String[] args) {
		
		
		Lutador lutador[]= new Lutador[6];
		
		 lutador[0]=new Lutador("Pretty boy", "Fraça", 31, 1.75, 68.9, 11, 2, 1);
		 lutador[1]=new Lutador("Putscript", "brasil", 29, 1.68, 57.8, 14, 2, 3);
		 lutador[2]=new Lutador("Snapshadow", "EUA",35, 1.65, 80.9, 12, 2, 1);
		 lutador[3]=new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
		 lutador[4]=new Lutador("UFCOCobol","Brasil", 37, 1.70, 119.3, 5, 4, 3);
		 lutador[5]=new Lutador("Nerdaart","EUA", 30, 1.81, 105.7, 12,2 ,4);
		
		
		
		 
		//lutador[0].status();
		/*lutador[1].status();
		lutador[2].status();
		lutador[3].status();
		lutador[4].status();
		lutador[5].status();*/
		
		Luta luta1= new Luta();
		luta1.marcarLuta(lutador[4], lutador[5]);
		luta1.lutar();
		
		lutador[0].status();
	
		lutador[1].status();
		


	}

}
