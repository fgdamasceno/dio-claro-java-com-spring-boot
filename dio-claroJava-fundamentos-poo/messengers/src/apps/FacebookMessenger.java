package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	
	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Historico de mensagens Facebook Messenger salvo");
	}

	
	
	
}
