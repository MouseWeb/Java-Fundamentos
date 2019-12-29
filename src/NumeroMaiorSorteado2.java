
public class NumeroMaiorSorteado2 {

	private static int totalUltimaOcorrencia = 0;
    private static int numeroMaiorOcorrencia = 0;
    private static final int QUANTIDADE_MAXIMA_NUMEROS = 10000;
    private static int numeros[] = new int[QUANTIDADE_MAXIMA_NUMEROS];

    public static void main(String[] args) {

        for (int i = 0; i < QUANTIDADE_MAXIMA_NUMEROS; i++) {
            numeros[i] = (int)(1 + (Math.random() * 100));
        }

        for (int i = 0; i < numeros.length; i++) {
            setNumeroMaiorOcorrencia(numeros[i]);
        }

        System.out.println(numeroMaiorOcorrencia);

    }

    private static void setNumeroMaiorOcorrencia(int numero) {

        int ocorrenciaInterna = 0;

        for (int i = 0; i < QUANTIDADE_MAXIMA_NUMEROS; i++) {
            if(numero == numeros[i]) {
                ocorrenciaInterna++;
            }
        }

        if(ocorrenciaInterna > totalUltimaOcorrencia) {
            totalUltimaOcorrencia = ocorrenciaInterna;
            numeroMaiorOcorrencia = numero;
        }

    }
    
}
