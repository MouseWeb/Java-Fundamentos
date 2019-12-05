package interfaces.model.services;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

// • Acoplamento fraco 
// • A classe RentalServicenão conhece a dependência concreta 
// • Se a classe concreta mudar, a classe RentalServicenão muda nada.

// Inversão de controle
//		• Inversãodecontrole: Padrão de desenvolvimento que consiste em retirar da classe a responsabilidadedeinstanciarsuasdependências.
//		• Injeçãodedependência: É uma forma de realizar a inversão de controle: um componente externo instancia a dependência,
//			que é então injetada no objeto "pai". Pode ser implementadadeváriasformas: 
//				• Construtor 
//				• Classedeinstanciação(builder/factory) 
//				• Container/framework

//	Aspectos em comum entre herança e interfaces
//		• Relação é-um 
//		• Generalização/especialização 
//		• Polimorfismo

//	Diferença fundamental
//		• Herança => reuso 
//		• Interface => contrato a ser cumprido

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
