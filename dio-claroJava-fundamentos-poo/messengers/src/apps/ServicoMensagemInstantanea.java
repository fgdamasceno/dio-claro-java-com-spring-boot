package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();	
	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectatdo a internet");
	};
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Historico salvo");
	};
	
}