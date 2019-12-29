import java.util.Arrays;

public class NumeroMaisSorteado {

	public static void main(String[] args) {
        int M[] = new int[101];

        for (int i = 0; i <= 99; i++) {
            M[i] = (int) (Math.random() * 100);
        }
        
        //ordena o vetor
        Arrays.sort(M);

        System.out.println("########################");
        System.out.println("########################");
        //imprime o vetor ordenado
        for (int i = 0; i <= 99; i++) {
            System.out.println("Vetor Ordenado-> " + M[i]);
        }

        System.out.println("########################");
        System.out.println("########################");
        //verificar se tem e a quantidade de numeros repetidos
        int num = M[0];//numero mais sorteado, inicializado com M[0]
        int s = 1;//numero de vezes em que num foi sorteado
        for(int i = 0; i <= 99; i++){
            int c = 1;//conta quantas vezes M[i] foi sorteado
            for(int j =0; j <=99; j++){
                if(M[i] == M[j] && i != j){
                    c++;
                }
            }
            if(c > s){//M[i] foi sorteado mais que num?
                num = M[i];
                s++;
            }
        }
        System.out.println(String.format("O numero mais sorteado é %d, repetindo-se %d vezes.", num,s));
    }
}
