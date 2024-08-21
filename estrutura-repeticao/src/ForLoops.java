
public class ForLoops {

	public static void main(String[] args) {
		
		// FOR LOOP BASICO
		for (int i = 0; i < 10; i++) { // conta de 0 a 9
			System.out.println(i);
		}
		
		// FOR LOOPS EM ARRAYS
		String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
		
		// For Each Loop
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
