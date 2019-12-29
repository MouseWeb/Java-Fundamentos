import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;  
import java.security.KeyStore;  
import java.security.KeyStoreException;  
import java.security.NoSuchAlgorithmException;   
import java.security.cert.CertificateException;  
import java.security.cert.X509Certificate;   
   
import java.util.Enumeration;
   
public class LerArquivoJKS {

    public static void main(String[] args) throws KeyStoreException, FileNotFoundException, IOException, NoSuchAlgorithmException, CertificateException{
        
        System.out.println("Texto desencriptado: ---   "+LerArquivoJKS.readJKS(KEYPASS, KEYSTORE));
    }
 
    private static final String KEYSTORE = "C:\\Douglas\\ANDROID APP\\ChavesApps\\teste.jks";  
    private static final String KEYPASS = "senhateste";  
   
    private static X509Certificate readJKS(String keyname, String keystore) throws IOException, KeyStoreException,  
       NoSuchAlgorithmException, CertificateException {  
   
       KeyStore ks = KeyStore.getInstance("JKS");  
       ks.load(new FileInputStream(keystore), KEYPASS.toCharArray());  
       
       X509Certificate result = (X509Certificate) ks.getCertificate(getAliases()); 
     
       return result;
    }  
  
    private static String getAliases() throws KeyStoreException, FileNotFoundException, IOException, NoSuchAlgorithmException, CertificateException{
        
        String path = "C:\\Douglas\\ANDROID APP\\ChavesApps\\teste.jks";
        KeyStore ks = KeyStore.getInstance("JKS");
            FileInputStream fis = new FileInputStream(path);
            ks.load(fis, "cienciCert".toCharArray());
            
            Enumeration<?> aliasesEnum = ks.aliases();
            String alias = "";
            while (aliasesEnum.hasMoreElements()) {
                alias = (String) aliasesEnum.nextElement();
                if (ks.isKeyEntry(alias)) {
                    
                    break;
                }
            }
            
            return alias;
    }
    
}