package metodos;

/* Exercicio; SmartTV
 * 1. Ela tenha característcas: ligada (boolean), canal (int) e volume (int);
 * 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
 * 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
 * 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente 
 * */

public class ExercicioSmartTV {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void aumentarVolume () {
		volume++;
	}
	
	public void diminuirVolume () {
		volume--;
	}
	
	public void ligar () {
		ligada = true;
	}
	
	public void desligar () {
		ligada = false;
	}

}
