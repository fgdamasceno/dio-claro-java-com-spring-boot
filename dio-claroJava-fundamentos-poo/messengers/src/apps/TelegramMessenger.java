package apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {
	
	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram Messengeer");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Telegram Messenger");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Historico de mensagens Telegram Messenger salvo");
	}

	
}
