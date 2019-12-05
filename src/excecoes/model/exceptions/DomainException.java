package excecoes.model.exceptions;

public class DomainException extends RuntimeException {
	
	// RuntimeException -> � um tipo de exce��o que o compilador n�o obriga vc a tratar. 
	// como DomainException � sube classe de RuntimeException o compilador obriga o Dev a tratar a exce��o.
	// Serializable -> pricisa ter um numero de vers�o, classes que s�o Serializable os objetos dessa classe podem ser convertidos para Bits,
	//   				trafegar em redes, ser gravados em arquivos.

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);

	}
}
