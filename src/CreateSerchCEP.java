import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CreateSerchCEP {
	
	// Buscar cep = consumo (formato XML) api do site https://buscarcep.com.br/site.php?secao=api_ceps
	// API de teste pode fazer uma requisição por minuto. 

	public static void main(String[] args) {


		// Define o CEP
		String cep = JOptionPane.showInputDialog(null,"Informe o CEP");
		
		// String da url		
		String urlString = "https://buscarcep.com.br/?cep="+cep+"&formato=xml&chave=Chave_Gratuita_BuscarCep&identificador=CLIENTE1";

		// Parametros a serem enviados
		Properties parameters = new Properties();
		parameters.setProperty("cep", cep);
		parameters.setProperty("formato", "xml");

		// Iterador
		Iterator<?> i = parameters.keySet().iterator();
		// Contador
		int counter = 0;

		// Enquanto ainda existir parametros
		while (i.hasNext()) {

			// Nome
			String name = (String) i.next();
			// Valor
			String value = parameters.getProperty(name) ;

			// Adiciona com um conector (? ou &)
			// Separa a url por ?, e as variáveis com &
			urlString += (++counter == 1 ? "?" : "&") + name + "=" + value;
			
		}

		try {
			// Objeto URL
			URL url = new URL(urlString);

			// Objeto HttpURLConnection
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Método
			connection.setRequestProperty("Request-Method", "GET");

			// Váariavel do resultado
			connection.setDoInput(true);
			connection.setDoOutput(false);

			// Faz a conexão
			connection.connect();

			// Abre a conexão
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			// Lê a conexão
			StringBuffer newData = new StringBuffer();
			String s = "";
			while (null != ((s = br.readLine()))) {
				newData.append(s);
			}
			br.close();

                        String comHtml = new String(newData);
                        Pattern p = Pattern.compile("<.*?>");
                        Matcher m = p.matcher(comHtml);
                        String semHtml = m.replaceAll(" ");
                        String endereco[] = semHtml.split("  ");
                        
                        String busc_estado   = endereco[3];
                        String busc_cidade   = endereco[4];
                        String busc_bairro   = endereco[5];
                        String busc_endereco = endereco[6] + " " + endereco[7];
                        
                        //System.out.println(endereco[8] + " " + endereco[9]);
                                        
                        System.out.println("CEP: "      + cep);
                        System.out.println("ESTADO: "   + busc_estado);
                        System.out.println("CIDADE: "   + busc_cidade);
                        System.out.println("BAIRRO: "   + busc_bairro);      
                        System.out.println("ENDEREÇO: " + busc_endereco);

                        
		} catch (Exception e) {
			 JOptionPane.showMessageDialog(null,"CEP não consta no banco de dados");
			 System.out.println("Código de retorno do serviço WebService: " + e.getMessage());

		}

	}

}

