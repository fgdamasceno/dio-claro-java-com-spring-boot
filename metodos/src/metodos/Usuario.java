package metodos;

public class Usuario {
	
	public static void main(String [] args) {
		
		ExercicioSmartTV smartTv = new ExercicioSmartTV();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual: " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("Canal Atual: " + smartTv.canal);
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		System.out.println("Canal Atual: " + smartTv.canal);
		
		smartTv.ligar();
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume Atual: " + smartTv.volume);
		
		
	}

}
