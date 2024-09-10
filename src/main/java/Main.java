package main;  
import java.awt.Color;
import java.awt.Dimension;  
import java.awt.Toolkit;  
import javax.swing.JOptionPane;  

public class main extends javax.swing.JFrame {  
private String order = "", en = "", de = "", temp2;  
private byte[] temp, temp1, end;  
public main() {  
initComponents();  
Toolkit tk = getToolkit();  
Dimension size = tk.getScreenSize();  
setLocation(size.width / 2 - getWidth() / 2, size.height / 2  - getHeight() / 2);  
}  

@SuppressWarnings("unchecked")  
// <editor-fold defaultstate="collapsed" desc="Generated Code">  
private void initComponents() {  
jPanel1 = new javax.swing.JPanel();  
jButton1 = new javax.swing.JButton();  
jButton2 = new javax.swing.JButton();  
jButton3 = new javax.swing.JButton();  
jButton4 = new javax.swing.JButton();  
jLabel1 = new javax.swing.JLabel();  
jButton5 = new javax.swing.JButton();  
jButton6 = new javax.swing.JButton();  
jScrollPane1 = new javax.swing.JScrollPane();  
jTextArea1 = new javax.swing.JTextArea();  
jScrollPane2 = new javax.swing.JScrollPane();  
jTextArea2 = new javax.swing.JTextArea();  
jLabel2 = new javax.swing.JLabel();  
jTextField1 = new javax.swing.JTextField();  
jLabel3 = new javax.swing.JLabel();  
jLabel4 = new javax.swing.JLabel();  
jLabel5 = new javax.swing.JLabel();  
jButton7 = new javax.swing.JButton();  
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
setTitle("Hybrid Encryption");  
jPanel1.setBackground(new java.awt.Color(0, 255, 255));  
jButton1.setBackground(new java.awt.Color(102, 102, 102));  
jButton1.setForeground(new java.awt.Color(204, 255, 255));  
jButton1.setText("AES");  
jButton1.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton1ActionPerformed(evt);  
}  
});  
jButton2.setBackground(new java.awt.Color(102, 102, 102));  
jButton2.setForeground(new java.awt.Color(204, 255, 255));  
jButton2.setText("DES");  
jButton2.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton2ActionPerformed(evt);  
}  
});  
jButton3.setBackground(new java.awt.Color(102, 102, 102));  
jButton3.setForeground(new java.awt.Color(204, 255, 255));  
jButton3.setText("Blowfish");  
jButton3.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton3ActionPerformed(evt);  
}  
});  
jButton4.setBackground(new java.awt.Color(102, 102, 102));  
jButton4.setForeground(new java.awt.Color(204, 255, 255));  
jButton4.setText("RSA");  
jButton4.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton4ActionPerformed(evt);  
}  
});  
jLabel1.setBackground(new java.awt.Color(255, 255, 255));  
jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N  
jLabel1.setForeground(new java.awt.Color(255, 0, 0));  
jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  
jLabel1.setText("Data Leakage Prevention using Hybrid Encryption");  
jButton5.setBackground(new java.awt.Color(0, 0, 0));  
jButton5.setForeground(new java.awt.Color(255, 255, 255));  
jButton5.setText("Encrypt");  
jButton5.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton5ActionPerformed(evt);  
}  
});  
jButton6.setBackground(new java.awt.Color(0, 0, 0));  
jButton6.setForeground(new java.awt.Color(255, 255, 255));  
jButton6.setText("Decrypt");  
jButton6.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton6ActionPerformed(evt);  
}  
});  
jTextArea1.setBackground(new java.awt.Color(0, 0, 0));  
jTextArea1.setColumns(20);  
jTextArea1.setForeground(new java.awt.Color(255, 0, 102));  
jTextArea1.setLineWrap(true);  
jTextArea1.setRows(5);  
jScrollPane1.setViewportView(jTextArea1);  
jTextArea2.setBackground(new java.awt.Color(0, 0, 0));  
jTextArea2.setColumns(20);  
jTextArea2.setForeground(java.awt.SystemColor.desktop);  
jTextArea2.setLineWrap(true);  
jTextArea2.setRows(5);  
jScrollPane2.setViewportView(jTextArea2);  
jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N  
jLabel2.setForeground(new java.awt.Color(255, 0, 102));  
jLabel2.setText("Message goes here:");  
jLabel3.setBackground(new java.awt.Color(255, 255, 255));  
jLabel3.setForeground(new java.awt.Color(0, 102, 102));  
jLabel3.setText("Encrypted Text");  
jLabel4.setBackground(new java.awt.Color(255, 255, 255));  
jLabel4.setForeground(new java.awt.Color(0, 102, 102));  
jLabel4.setText("Decrypted Text");  
jLabel5.setForeground(new java.awt.Color(0, 153, 51));  
jLabel5.setText("FOR IMAGE ENCRPYTION ");  
jButton7.setBackground(new java.awt.Color(102, 0, 102));  
jButton7.setForeground(new java.awt.Color(255, 255, 255));  
jButton7.setText("Click here...");  
jButton7.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton7ActionPerformed(evt);  
}  
});  
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);  
jPanel1.setLayout(jPanel1Layout);  
jPanel1Layout.setHorizontalGroup(  
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(38, 38, 38)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)  
.addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
Short.MAX_VALUE)  
.addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, 
javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
.addComponent(jButton6)  
.addGap(338, 338, 338))))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(326, 326, 326)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)  
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, 
javax.swing.GroupLayout.PREFERRED_SIZE)))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(107, 107, 107)  
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, 
javax.swing.GroupLayout.PREFERRED_SIZE))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(82, 82, 82)  
.addComponent(jButton7))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(59, 59, 59)  
.addComponent(jLabel5)))  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addComponent(jLabel3)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, 
javax.swing.GroupLayout.PREFERRED_SIZE))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addComponent(jLabel4)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, 
javax.swing.GroupLayout.PREFERRED_SIZE)))  
.addGap(60, 60, 60))  
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()  
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()  
.addComponent(jButton5)  
.addGap(346, 346, 346))  
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()  
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addGap(405, 405, 405))))  
);  
jPanel1Layout.setVerticalGroup(  
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addContainerGap()  
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
.addComponent(jButton5)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addGap(18, 18, 18)  
.addComponent(jButton6)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)  
.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addGap(19, 19, 19))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(24, 24, 24)  
.addComponent(jLabel2)  
.addGap(18, 18, 18)  
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addGap(64, 64, 64)  
.addComponent(jLabel3)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addComponent(jButton2)  
.addComponent(jButton4))  
.addGap(28, 28, 28)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addComponent(jButton3)  
.addComponent(jButton1))  
.addGap(122, 122, 122)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addComponent(jLabel4)  
.addComponent(jLabel5))  
.addGap(20, 20, 20)  
.addComponent(jButton7)  
.addGap(150, 150, 150))))  
);  
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
getContentPane().setLayout(layout);  
layout.setHorizontalGroup(  
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
);  
layout.setVerticalGroup(  
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
);  
pack();  
}// </editor-fold>  
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {    
try {   
final String secretKey = "ssshhhhhhhhhhh!!!!";  
AES Encryptor = new AES();  
String pt = jTextField1.getText();  
en = Encryptor.encrypt(pt, secretKey);  
de = Encryptor.decrypt(en, secretKey);  
jTextArea1.setText(en);  
jTextArea2.setText(de);
jTextArea2.setForeground(Color.GREEN);
}  
catch(Exception e) {  
JOptionPane.showMessageDialog(this, e);  
}  
}  

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {  
try {    
final String secretKey = "ssshhhhhhhhhhh!!!!";  
AES myEncryptor1 = new AES();  
DESedeEncryption myEncryptor2 = new DESedeEncryption();  
Blowfish myEncryptor3 = new Blowfish();  
RSA myEncryptor4 = new RSA();  
Hybridizer hy = new Hybridizer();  
 
String pt = jTextField1.getText();   
String output = "";  
// generating random encryption sequence  
order = hy.form_comb();  
System.out.println("\nEncrypting Order : " + order  + "\n");  
int len = order.length();  
int i = 0;  
while (i < len) {  
if (i == 0) {  
if (order.charAt(i) == '1') {  
en = myEncryptor1.encrypt(pt, secretKey);  
output = output + "Stage 1 Encrytion : " + en;  
i = i + 1;  
} else if (order.charAt(i) == '2') {  
en = myEncryptor2.encrypt(pt);  
output = output + "Stage 1 Encryption : " + en;  
i = i + 1;  
} else if (order.charAt(i) == '3') {  
temp2 = pt;  
temp = myEncryptor3.encrypt(pt);  
en = new String(temp);  
output = output + "Stage 1 Encryption : "  + en;  
i = i + 1;  
}  
} else {  
if (order.charAt(i) == '1') {  
en = myEncryptor1.encrypt(en, secretKey);  
output = output + "\n\nStage " + (i + 1) + " Encryption : " + en;  
i = i + 1;  
} else if (order.charAt(i) == '2') {  
en = myEncryptor2.encrypt(en);  
output = output + "\n\nStage " + (i + 1) + " Encryption : " + en;  
i = i + 1;  
} else if (order.charAt(i) == '3') {  
temp2 = en;  
temp = myEncryptor3.encrypt(en);  
en = new String(temp);  
output = output + "\n\nStage " + (i + 1) + " Encryption : " + en;  
i = i + 1;  
}  
}  
}  
temp1 = en.getBytes();  
end = myEncryptor4.encrypt(temp1);  
output = output + "\n\n Final Encrypted Text : " + myEncryptor4.bytesToString(end);  
jTextArea1.setText(output);  
jTextArea2.setText(""); 
jTextArea2.setForeground(Color.GREEN);
} catch (Exception e) {  
JOptionPane.showMessageDialog(this, e);  
}  
}

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {   
try {  
final String secretKey = "ssshhhhhhhhhhh!!!!";  
AES myEncryptor1 = new AES();  
DESedeEncryption myEncryptor2 = new DESedeEncryption();  
Blowfish myEncryptor3 = new Blowfish();  
RSA myEncryptor4 = new RSA();  
StringBuilder sb = new StringBuilder();  
sb.append(order);  
order = sb.reverse().toString();    
String output = "";   
de = en;  
output = output + "Stage 1 Decryption : " + de;  
int len = order.length();  
int i = 0;  
while (i < len) {  
if (i == (len - 1)) {  
if (order.charAt(i) == '1') {  
de = myEncryptor1.decrypt(de, secretKey);  
output = output + "\n\nPlain Text : " + de;  
i = i + 1;  
} else if (order.charAt(i) == '2') {  
de = myEncryptor2.decrypt(de);  
output = output + "\n\nPlain Text : " + de;  
i = i + 1;  
} else if (order.charAt(i) == '3') {    
de = temp2;  
output = output + "\n\nPlain Text : " + de;  
i = i + 1;  
}  
} else {  
if (order.charAt(i) == '1') {  
de = myEncryptor1.decrypt(de, secretKey);  
output = output + "\n\nStage " + (i + 2) + " Decryption : " + de;  
i = i + 1;  
} else if (order.charAt(i) == '2') {  
de = myEncryptor2.decrypt(de);  
output = output + "\n\nStage " + (i + 2) + " Decryption : " + de;  
i = i + 1;  
} else if (order.charAt(i) == '3') {    
de = temp2;  
output = output + "\n\nStage " + (i + 2) + " Decryption : " + de;  
i = i + 1;  
}  
}  
}  
jTextArea2.setText(output);  
} catch (Exception e) {  
JOptionPane.showMessageDialog(this, e);  
}  
}

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {   
try {  
final String secretKey = "ssshhhhhhhhhhh!!!!";  
DESedeEncryption Encryptor = new DESedeEncryption();  
String pt = jTextField1.getText();  
en = Encryptor.encrypt(pt);  
de = Encryptor.decrypt(en);  
jTextArea1.setText(en);  
jTextArea2.setText(de);
jTextArea2.setForeground(Color.GREEN);
}  
catch(Exception e) {  
JOptionPane.showMessageDialog(this, e);  
}  
}

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {    
try {  
byte[] ene;  
Blowfish Encryptor = new Blowfish();  
String pt = jTextField1.getText();  
ene = Encryptor.encrypt(pt);  
String enc = new String(ene);  
en = enc;  
de = Encryptor.decrypt(ene);  
jTextArea1.setText(en);  
jTextArea2.setText(de);
jTextArea2.setForeground(Color.GREEN);
}  
catch(Exception e) {  
JOptionPane.showMessageDialog(this, e);  
}  
}  

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {    
RSA Encryptor = new RSA();  
String pt = jTextField1.getText();  
byte[] tmp = pt.getBytes();  
end = Encryptor.encrypt(tmp);  
en = Encryptor.bytesToString(end);  
byte[] ded = Encryptor.decrypt(end);  
de = Encryptor.bytesToString(ded);  
jTextArea1.setText(en);  
jTextArea2.setText(de + "\nDecrpyted String: " + pt); 
jTextArea2.setForeground(Color.GREEN);
}

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {   
new AES_Demo().setVisible(true);  
this.setVisible(false);  
}  

public static void main(String args[]) {  
java.awt.EventQueue.invokeLater(new Runnable() {  
public void run() {  
new main().setVisible(true);  
}});  
}  
 
private javax.swing.JButton jButton1;  
private javax.swing.JButton jButton2;  
private javax.swing.JButton jButton3;  
private javax.swing.JButton jButton4;  
private javax.swing.JButton jButton5;  
private javax.swing.JButton jButton6;  
private javax.swing.JButton jButton7;  
private javax.swing.JLabel jLabel1;  
private javax.swing.JLabel jLabel2;  
private javax.swing.JLabel jLabel3;  
private javax.swing.JLabel jLabel4;  
private javax.swing.JLabel jLabel5;  
private javax.swing.JPanel jPanel1;  
private javax.swing.JScrollPane jScrollPane1;  
private javax.swing.JScrollPane jScrollPane2;  
private javax.swing.JTextArea jTextArea1;  
private javax.swing.JTextArea jTextArea2;  
private javax.swing.JTextField jTextField1;  
} 
