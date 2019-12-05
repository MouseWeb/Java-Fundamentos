package interfaces.model.services;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

// � Acoplamento fraco 
// � A classe RentalServicen�o conhece a depend�ncia concreta 
// � Se a classe concreta mudar, a classe RentalServicen�o muda nada.

// Invers�o de controle
//		� Invers�odecontrole: Padr�o de desenvolvimento que consiste em retirar da classe a responsabilidadedeinstanciarsuasdepend�ncias.
//		� Inje��odedepend�ncia: � uma forma de realizar a invers�o de controle: um componente externo instancia a depend�ncia,
//			que � ent�o injetada no objeto "pai". Pode ser implementadadev�riasformas: 
//				� Construtor 
//				� Classedeinstancia��o(builder/factory) 
//				� Container/framework

//	Aspectos em comum entre heran�a e interfaces
//		� Rela��o �-um 
//		� Generaliza��o/especializa��o 
//		� Polimorfismo

//	Diferen�a fundamental
//		� Heran�a => reuso 
//		� Interface => contrato a ser cumprido

public class RentalServices {
	
	private Double pricePerDay;
	private Double pricePerHour;	
	
	private TaxService taxService;

	public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if (hours > 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
 
}
