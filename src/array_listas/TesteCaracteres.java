package array_listas;

public class TesteCaracteres {

    private int calcula;
    private String resultado;
    private String resultadoString;

    public static int foo(int number, int digits){
        String str = Integer.toString(number);
        return Integer.valueOf(str.substring(0, digits));
    }

    public static void main(String[] args) {
// (int i = 0; i < b.length; i++)
        System.out.println(foo(1123456789, 3));

        System.out.println("--------------");
        String xy = "1234567890";
        System.out.println(xy.substring(xy.length() - 8));

        System.out.println("--------------");

//        import org.apache.commons.lang3.StringUtils;
//        String x = StringUtils.right("MinhaString", 3);
//        System.out.println(x);

//        for (int i = 0; i < _stringnum.length(); i++) {
//            acumulador += Integer.parseInt(String.valueOf(_stringnum.charAt(i)));
//        }
//
//        _stringnum = String.valueOf(acumulador);
//        acumulador = 0;
//        System.out.println("A soma primária é: " + _stringnum);
//        for (int i=0;i<_stringnum.length();i++) {
//            acumulador+= Integer.parseInt(String.valueOf(_stringnum.charAt(i)));
//        }
        // -----------------------------------------------------

        // alunoRecebido.substring(0, 4)
        String numero = "1234567890";
        numero = numero.replaceAll("/", "");

        //Zera a variavel quando o metodo é chamado
        int calcula = 0;

        for (int i = 0; i < numero.length(); i++) {

            //variaveis para conversao
            char pegaCharDaString;
            String converteCharParaString;

            //atribui o valor da posição na variavel char
            pegaCharDaString = numero.charAt(i);
            //converte o char pata string, pois não é possivel converter char para int direto
            converteCharParaString = String.valueOf(pegaCharDaString);

            //a variavel calcula recebe a string como valor
            calcula += Integer.parseInt(converteCharParaString);

            System.out.println(calcula);

        }
        System.out.println(calcula);
    }

}
