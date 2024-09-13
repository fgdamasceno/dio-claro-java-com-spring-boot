import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		// abrindo MSN Messenger
//		MSNMessenger msn = new MSNMessenger();		
//		msn.enviarMensagem();		
//		msn.receberMensagem();
//		
//		FacebookMessenger fb = new FacebookMessenger();		
//		fb.enviarMensagem();		
//		fb.receberMensagem();
//		
//		TelegramMessenger tg = new TelegramMessenger();		
//		tg.enviarMensagem();		
//		tg.receberMensagem();

		// POLIMORFISMO
		ServicoMensagemInstantanea smi = null;

		String appEscolhido = "msn";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fb"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("tg"))
			smi = new TelegramMessenger();

		smi.enviarMensagem();
		smi.receberMensagem();

	}
}
