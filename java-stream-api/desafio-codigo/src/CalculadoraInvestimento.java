
public class CalculadoraInvestimento {
	// Atributos
	private double aporteInicial;
	private double aporteMensal;
	private double taxaAnual; // implementar metodo para converter em taxa mensal
	private int periodoMeses;

	// Constructor
	public CalculadoraInvestimento(double aporteInicial, double aporteMensal, double taxaAnual, int periodoMeses) {
		this.aporteInicial = aporteInicial;
		this.aporteMensal = aporteMensal;
		this.taxaAnual = taxaAnual;
		this.periodoMeses = periodoMeses;
	}

	// Getters and Setters
	public double getAporteInicial() {
		return aporteInicial;
	}

	public void setAporteInicial(double aporteInicial) {
		this.aporteInicial = aporteInicial;
	}

	public double getAporteMensal() {
		return aporteMensal;
	}

	public void setAporteMensal(double aporteMensal) {
		this.aporteMensal = aporteMensal;
	}

	public double getTaxaAnual() {
		return taxaAnual;
	}

	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}

	public int getPeriodoMeses() {
		return periodoMeses;
	}

	public void setPeriodoMeses(int periodoMeses) {
		this.periodoMeses = periodoMeses;
	}

	// Métodos
	public double converterTaxaAnualParaMensal() {
		return Math.pow(1 + this.taxaAnual / 100, 1.0 / 12) - 1;
	}

	public double calcularMontanteAplicado() {
		return this.aporteInicial + (this.aporteMensal * this.periodoMeses);
	}

	public double calcularValorBrutoInvestimento() {
		double valorBruto = this.aporteInicial * Math.pow(1 + converterTaxaAnualParaMensal(), this.periodoMeses)
				+ this.aporteMensal * ((Math.pow(1 + converterTaxaAnualParaMensal(), this.periodoMeses) - 1)
						/ converterTaxaAnualParaMensal());
		return valorBruto;
	}

	public double calcularLucroLiquido() {
		return calcularValorBrutoInvestimento() - (this.aporteInicial + (this.aporteMensal * this.periodoMeses));
	}
	
	public double calcularValorPagoImposto() {
		return calcularValorBrutoInvestimento() - calcularValorLiquidoInvestimento();
	}

	public double calcularValorLiquidoInvestimento() {
		double valorTotalLiquidoInvestimento = 0.0;
		double lucroBruto = calcularValorBrutoInvestimento()
				- (this.aporteInicial + (this.aporteMensal * this.periodoMeses));
		if (this.periodoMeses <= 6) {
			valorTotalLiquidoInvestimento = calcularMontanteAplicado() + lucroBruto * (1 - 0.2250);
		} else if (this.periodoMeses <= 12) {
			valorTotalLiquidoInvestimento = calcularMontanteAplicado() + lucroBruto * (1 - 0.2000);
		} else if (this.periodoMeses <= 18) {
			valorTotalLiquidoInvestimento = calcularMontanteAplicado() + lucroBruto * (1 - 0.1750);
		} else if (this.periodoMeses >= 24) {
			valorTotalLiquidoInvestimento = calcularMontanteAplicado() + lucroBruto * (1 - 0.1500);
		}
		return valorTotalLiquidoInvestimento;
	}

	@Override
	// TODO: implementar toString para mostrar valores e resultados
	public String toString() {
		return String.format(
				"RESULTADO:%n" + "Investimento inicial: R$ %.2f%n" + "Investimento mensal:  R$ %.2f%n"
						+ "Prazo: %d meses%n" + "Rentabilidade: %.2f%% a.a.%n" + "====================%n"
						+ "Valor Total Bruto: R$ %.2f%n" + "Valor investido: R$ %.2f%n" + "Valor em juros: R$ %.2f%n"
						+ "Valor pago em imposto: R$ %.2f%n"
						+ "Valor Total liquido: R$ %.2f%n",
				this.aporteInicial, this.aporteMensal, this.periodoMeses, this.taxaAnual,
				calcularValorBrutoInvestimento(), calcularMontanteAplicado(), calcularLucroLiquido(), calcularValorPagoImposto(),
				calcularValorLiquidoInvestimento());
	}

}
