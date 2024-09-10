package main;  
import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;  
import javax.crypto.SecretKey;  
public class Blowfish {  
KeyGenerator keygenerator;  
SecretKey secretkey;  
Cipher cipher;  

public Blowfish() throws Exception{  
keygenerator = KeyGenerator.getInstance("Blowfish");  
secretkey = keygenerator.generateKey();  
cipher = Cipher.getInstance("Blowfish");  
}  

public byte[] encrypt(String msg) throws Exception{  
cipher.init(Cipher.ENCRYPT_MODE, secretkey);  
byte[] encrypted = cipher.doFinal(msg.getBytes());  
return encrypted;  
}  

public String decrypt(byte[] msg) throws Exception{  
cipher.init(Cipher.DECRYPT_MODE, secretkey);  
byte[] decrypted = cipher.doFinal(msg);  
String d = new String(decrypted);  
return d;  
}  
}  
