package main;  
import java.io.*;  
import java.awt.image.BufferedImage;  
import java.io.ByteArrayOutputStream;  
import java.io.File;  
import java.io.FileOutputStream;  
import javax.imageio.ImageIO;  
import javax.swing.JFileChooser;  
public class AES_Demo extends javax.swing.JFrame {  
 
public AES_Demo() {  
initComponents();  
}  
 
@SuppressWarnings("unchecked")  
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents  
private void initComponents() {  
jFileChooser1 = new javax.swing.JFileChooser();  
jFileChooser2 = new javax.swing.JFileChooser();  
jPanel1 = new javax.swing.JPanel();  
jTextField1 = new javax.swing.JTextField();  
jButton1 = new javax.swing.JButton();  
jPanel2 = new javax.swing.JPanel();  
jTextField2 = new javax.swing.JTextField();  
jLabel1 = new javax.swing.JLabel();  
jTextField3 = new javax.swing.JTextField();  
jLabel2 = new javax.swing.JLabel();  
jLabel3 = new javax.swing.JLabel();  
jButton2 = new javax.swing.JButton();  
jTextField4 = new javax.swing.JTextField();  
jButton3 = new javax.swing.JButton();  
jRadioButton1 = new javax.swing.JRadioButton();  
jRadioButton2 = new javax.swing.JRadioButton();  
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
setTitle("AES");  
jButton1.setText("Browse Files");  
jButton1.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton1ActionPerformed(evt);  
}  
});  
jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());  
jLabel1.setText("Decryption Time (ms)");  
jLabel2.setText("Encryption Time (ms)");  
jLabel3.setText("Encryption and Decryption");  
jRadioButton2.setText("4 Round AES");  
jButton2.setText("Begin AES");  
jButton2.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton2ActionPerformed(evt);  
}  
});  
jTextField4.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jTextField4ActionPerformed(evt);  
}  
});  
jButton3.setText("Choose Save Directory");  
jButton3.addActionListener(new java.awt.event.ActionListener() {  
public void actionPerformed(java.awt.event.ActionEvent evt) {  
jButton3ActionPerformed(evt);  
}  
});  
javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);  
jPanel2.setLayout(jPanel2Layout);  
jPanel2Layout.setHorizontalGroup(  
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()  
.addGap(100, 100, 100)  
.addComponent(jLabel2)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)  
.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)  
.addComponent(jLabel1)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, 
javax.swing.GroupLayout.PREFERRED_SIZE)  
.addContainerGap(32, Short.MAX_VALUE))  
.addGroup(jPanel2Layout.createSequentialGroup()  
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel2Layout.createSequentialGroup()  
.addGap(17, 17, 17)  
.addComponent(jButton3)  
.addContainerGap()  
.addComponent(jTextField4))  
.addGroup(jPanel2Layout.createSequentialGroup()  
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel2Layout.createSequentialGroup()  
.addGap(200, 200, 200)  
.addComponent(jButton2).addGap(20, 20, 20).addComponent(jRadioButton2))  
.addGroup(jPanel2Layout.createSequentialGroup()  
.addContainerGap()  
.addComponent(jLabel3)))  
.addGap(0, 0, Short.MAX_VALUE)))  
.addContainerGap())  
);  
jPanel2Layout.setVerticalGroup(  
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()  
.addContainerGap()  
.addComponent(jLabel3)  
.addGap(17, 17, 17)  
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addComponent(jButton3)  
.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)  
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addComponent(jButton2).addComponent(jRadioButton2))  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)  
.addGap(30, 30, 30)  
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
.addComponent(jLabel1)  
.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
.addComponent(jLabel2))  
.addGap(20, 20, 20))  
);  
jRadioButton1.setText("Preserve Image Header");  
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);  
jPanel1.setLayout(jPanel1Layout);  
jPanel1Layout.setHorizontalGroup(  
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(200, 200, 200)  
.addComponent(jRadioButton1))  
.addGroup(jPanel1Layout.createSequentialGroup()  
.addGap(95, 95, 95)  
.addComponent(jButton1)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)  
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, 
javax.swing.GroupLayout.PREFERRED_SIZE)))  
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()  
.addContainerGap(11, Short.MAX_VALUE)  
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
.addContainerGap(11, Short.MAX_VALUE))  
);  
jPanel1Layout.setVerticalGroup(  
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(37, Short.MAX_VALUE)  
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)  
.addGap(40, 40, 40)  
.addComponent(jButton1)  
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  
.addComponent(jRadioButton1)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)  
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)  
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)  
.addContainerGap())  
);  
jPanel2.getAccessibleContext().setAccessibleName("Encryption");  
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
} // </editor-fold>//GEN-END:initComponents  

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
double t;  
byte[] k = new byte[16];  
try {  
k = AESS.keygeneration();  
} catch (Exception e) {  
System.out.println(e.getMessage());  
}  
try {  
File inputFile = jFileChooser1.getSelectedFile();  
BufferedImage image = ImageIO.read(inputFile);  
ByteArrayOutputStream baos = new ByteArrayOutputStream();  
ImageIO.write(image, "jpg", baos);  
byte[] b = baos.toByteArray();  
byte[] b2 = new byte[b.length - 620];  
byte[] b1 = new byte[0];  

if (jRadioButton1.isSelected() == true) {  
for (int i = 0; i < (b2.length); i++)  
b2[i] = b[i + 620];  
if (jRadioButton2.isSelected() == true) b2 = AESS.encrypt(b2, k, 4);  
else b2 = AESS.encrypt(b2, k, 10);  
t = Math.round((AESS.t2 - AESS.t1) / (1000000));  
jTextField3.setText(String.valueOf(t) + "ms");  
b1 = new byte[b2.length + 620];  
for (int i = 0; i < b1.length; i++) {  
if (i < 620) b1[i] = b[i];  
else b1[i] = b2[i - 620];  
}  

inputFile = new File(jFileChooser2.getSelectedFile() + "/encryptedimage.jpg");  
FileOutputStream fos = new FileOutputStream(inputFile);  
fos.write(b1);  
fos.flush();  
fos.close();  
for (int i = 0; i < b2.length; i++)  
b2[i] = b1[i + 620];  
if (jRadioButton2.isSelected() == true) b2 = AESS.decrypt(b2, k, 4);  
else b2 = AESS.decrypt(b2, k, 10);  
t = Math.round((AESS.t2 - AESS.t1) / (1000000));  
jTextField2.setText(String.valueOf(t) + "ms");  
for (int i = 0; i < b.length; i++) {  
if (i < 620) b[i] = b1[i];  
else b[i] = b2[i - 620];  
}  

inputFile = new File(jFileChooser2.getSelectedFile() + "/decryptedimage.jpg");  
fos = new FileOutputStream(inputFile);  
fos.write(b);  
fos.flush();  
fos.close();  
} else {  
if (jRadioButton2.isSelected() == true) b1 = AESS.encrypt(b, k, 4);  
else b1 = AESS.encrypt(b, k, 10);  
t = Math.round((AESS.t2 - AESS.t1) / (1000000));  
jTextField3.setText(String.valueOf(t) + "ms");  
inputFile = new File(jFileChooser2.getSelectedFile() + "/encryptedimage.jpg");  
FileOutputStream fos = new FileOutputStream(inputFile);  
fos.write(b1);  
fos.flush();  
fos.close();  
if (jRadioButton2.isSelected() == true) b1 = AESS.decrypt(b1, k, 4);  
else b1 = AESS.decrypt(b1, k, 10);  
t = Math.round((AESS.t2 - AESS.t1) / (1000000));  
jTextField2.setText(String.valueOf(t) + "ms");  
inputFile = new File(jFileChooser2.getSelectedFile() + "/decryptedimage.jpg");  
fos = new FileOutputStream(inputFile);  
fos.write(b1);  
fos.flush();  
fos.close();  
}  
}  
  
catch (IOException e) {  
System.out.println(e.getMessage());  
}  
}  

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
int returnVal = jFileChooser1.showOpenDialog(this);  
if (returnVal == JFileChooser.APPROVE_OPTION) {  
File file = jFileChooser1.getSelectedFile();  
if (!file.canRead()) {  
file.setReadable(true);  
}  
jTextField1.setText(file.getAbsolutePath());  
} 
else {  
System.out.println("You must choose a file.");  
}  
}

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { //GEN

jFileChooser2.setCurrentDirectory(new java.io.File("."));  
jFileChooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
int returnVal = jFileChooser2.showOpenDialog(this);  
if (returnVal == JFileChooser.APPROVE_OPTION) {  
File file = jFileChooser2.getSelectedFile();  
if (!file.canRead()) {  
file.setReadable(true);  
}  
jTextField4.setText(file.getAbsolutePath());  
} else {  
System.out.println("You must choose a save directory.");  
}  
} 

public static void main(String args[]) {   
java.awt.EventQueue.invokeLater(new Runnable() {  
public void run() {  
new AES_Demo().setVisible(true);  
}  
});  
}  


private javax.swing.JButton jButton1;  
private javax.swing.JButton jButton2;  
private javax.swing.JButton jButton3;  
private javax.swing.JFileChooser jFileChooser1;  
private javax.swing.JFileChooser jFileChooser2;  
private javax.swing.JLabel jLabel1;  
private javax.swing.JLabel jLabel2;  
private javax.swing.JLabel jLabel3;  
private javax.swing.JPanel jPanel1;  
private javax.swing.JPanel jPanel2;  
private javax.swing.JRadioButton jRadioButton1;  
private javax.swing.JRadioButton jRadioButton2;  
private javax.swing.JTextField jTextField1;  
private javax.swing.JTextField jTextField2;  
private javax.swing.JTextField jTextField3;  
private javax.swing.JTextField jTextField4;  
// End of variables declaration//GEN-END:variables  
}  
