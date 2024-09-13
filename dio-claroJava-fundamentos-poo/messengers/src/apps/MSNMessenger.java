package apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		
	}

	
	
}
