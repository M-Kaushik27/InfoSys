package main;
import java.security.spec.KeySpec;  
import java.util.Base64;  
import javax.crypto.Cipher;  
import javax.crypto.SecretKey;  
import javax.crypto.SecretKeyFactory;  
import javax.crypto.spec.DESedeKeySpec;  

public class DESedeEncryption {  
private static final String UNICODE_FORMAT = "UTF8";  
public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";  
private KeySpec myKeySpec;  
private SecretKeyFactory mySecretKeyFactory;  
private Cipher cipher;  
byte[] keyAsBytes;  
private String myEncryptionKey;  
private String myEncryptionScheme;  
SecretKey key;  

public DESedeEncryption() throws Exception {  
myEncryptionKey = "ThisIsSecretEncryptionKey";  
myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;  
keyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);  
myKeySpec = new DESedeKeySpec(keyAsBytes);  
mySecretKeyFactory  = SecretKeyFactory.getInstance(myEncryptionScheme);  
cipher = Cipher.getInstance(myEncryptionScheme);  
key = mySecretKeyFactory.generateSecret(myKeySpec);  
}  

public String encrypt(String unencryptedString) {  
String encryptedString = null;  
try {  
cipher.init(Cipher.ENCRYPT_MODE, key);  
byte[] plainText  = unencryptedString.getBytes(UNICODE_FORMAT);  
byte[] encryptedText = cipher.doFinal(plainText);  

encryptedString = Base64.getEncoder().encodeToString(encryptedText);  
} catch (Exception e) {  
e.printStackTrace();  
}  
return encryptedString;  
}  

public String decrypt(String encryptedString) {  
String decryptedText = null;  
try {  
cipher.init(Cipher.DECRYPT_MODE, key);  
byte[] encryptedText= Base64.getDecoder().decode(encryptedString);  
byte[] plainText = cipher.doFinal(encryptedText);  
decryptedText = bytes2String(plainText);  
} catch (Exception e) {  
e.printStackTrace();  
}  
return decryptedText;  
}  

private static String bytes2String(byte[] bytes) {  
StringBuffer stringBuffer = new StringBuffer();  
for (int i = 0; i < bytes.length; i++) {  
stringBuffer.append((char) bytes[i]);  
}  
return stringBuffer.toString();  
}  
} 