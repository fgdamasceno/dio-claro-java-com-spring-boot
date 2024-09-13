package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;

public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora1 = new Deskjet();
		Impressora impressora2 = new Laserjet();
		Impressora multifuncional = new EquipamentoMultifuncional();
		
		impressora1.imprimir();
		impressora2.imprimir();
		multifuncional.imprimir();
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Copiadora copiadora = em;
		Digitalizadora digitalizadora = em;
		
		digitalizadora.digitalizar();
		copiadora.copiar();
		
		
	}

}
