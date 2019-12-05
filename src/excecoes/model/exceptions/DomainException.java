package excecoes.model.exceptions;

public class DomainException extends RuntimeException {
	
	// RuntimeException -> é um tipo de exceção que o compilador não obriga vc a tratar. 
	// como DomainException é sube classe de RuntimeException o compilador obriga o Dev a tratar a exceção.
	// Serializable -> pricisa ter um numero de versão, classes que são Serializable os objetos dessa classe podem ser convertidos para Bits,
	//   				trafegar em redes, ser gravados em arquivos.

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);

	}
}
