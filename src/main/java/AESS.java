package main;  
 
import javax.crypto.KeyGenerator;  
import javax.crypto.SecretKey;  
import java.io.*;

public class AESS {  
private static int Nb, Nk, Nr;  
private static byte[][] w;  
static double t1,t2;  
private static int[] sbox = { 0x63, 0x7C, 0x77, 0x7B, 0xF2, 0x6B, 0x6F,  
0xC5, 0x30, 0x01, 0x67, 0x2B, 0xFE, 0xD7, 0xAB, 0x76, 0xCA, 0x82,  
0xC9, 0x7D, 0xFA, 0x59, 0x47, 0xF0, 0xAD, 0xD4, 0xA2, 0xAF, 0x9C,  
0xA4, 0x72, 0xC0, 0xB7, 0xFD, 0x93, 0x26, 0x36, 0x3F, 0xF7, 0xCC,  
0x34, 0xA5, 0xE5, 0xF1, 0x71, 0xD8, 0x31, 0x15, 0x04, 0xC7, 0x23,  
0xC3, 0x18, 0x96, 0x05, 0x9A, 0x07, 0x12, 0x80, 0xE2, 0xEB, 0x27,  
0xB2, 0x75, 0x09, 0x83, 0x2C, 0x1A, 0x1B, 0x6E, 0x5A, 0xA0, 0x52,  
0x3B, 0xD6, 0xB3, 0x29, 0xE3, 0x2F, 0x84, 0x53, 0xD1, 0x00, 0xED,  
0x20, 0xFC, 0xB1, 0x5B, 0x6A, 0xCB, 0xBE, 0x39, 0x4A, 0x4C, 0x58,  
0xCF, 0xD0, 0xEF, 0xAA, 0xFB, 0x43, 0x4D, 0x33, 0x85, 0x45, 0xF9,  
0x02, 0x7F, 0x50, 0x3C, 0x9F, 0xA8, 0x51, 0xA3, 0x40, 0x8F, 0x92,  
0x9D, 0x38, 0xF5, 0xBC, 0xB6, 0xDA, 0x21, 0x10, 0xFF, 0xF3, 0xD2,  
0xCD, 0x0C, 0x13, 0xEC, 0x5F, 0x97, 0x44, 0x17, 0xC4, 0xA7, 0x7E,  
0x3D, 0x64, 0x5D, 0x19, 0x73, 0x60, 0x81, 0x4F, 0xDC, 0x22, 0x2A,  
0x90, 0x88, 0x46, 0xEE, 0xB8, 0x14, 0xDE, 0x5E, 0x0B, 0xDB, 0xE0,  
0x32, 0x3A, 0x0A, 0x49, 0x06, 0x24, 0x5C, 0xC2, 0xD3, 0xAC, 0x62,  
0x91, 0x95, 0xE4, 0x79, 0xE7, 0xC8, 0x37, 0x6D, 0x8D, 0xD5, 0x4E,  
0xA9, 0x6C, 0x56, 0xF4, 0xEA, 0x65, 0x7A, 0xAE, 0x08, 0xBA, 0x78,  
0x25, 0x2E, 0x1C, 0xA6, 0xB4, 0xC6, 0xE8, 0xDD, 0x74, 0x1F, 0x4B,  
0xBD, 0x8B, 0x8A, 0x70, 0x3E, 0xB5, 0x66, 0x48, 0x03, 0xF6, 0x0E,  
0x61, 0x35, 0x57, 0xB9, 0x86, 0xC1, 0x1D, 0x9E, 0xE1, 0xF8, 0x98,  
0x11, 0x69, 0xD9, 0x8E, 0x94, 0x9B, 0x1E, 0x87, 0xE9, 0xCE, 0x55,  
0x28, 0xDF, 0x8C, 0xA1, 0x89, 0x0D, 0xBF, 0xE6, 0x42, 0x68, 0x41,  
0x99, 0x2D, 0x0F, 0xB0, 0x54, 0xBB, 0x16 };  

private static int[] inv_sbox = { 0x52, 0x09, 0x6A, 0xD5, 0x30, 0x36, 0xA5,  
0x38, 0xBF, 0x40, 0xA3, 0x9E, 0x81, 0xF3, 0xD7, 0xFB, 0x7C, 0xE3,  
0x39, 0x82, 0x9B, 0x2F, 0xFF, 0x87, 0x34, 0x8E, 0x43, 0x44, 0xC4,  
0xDE, 0xE9, 0xCB, 0x54, 0x7B, 0x94, 0x32, 0xA6, 0xC2, 0x23, 0x3D,  
0xEE, 0x4C, 0x95, 0x0B, 0x42, 0xFA, 0xC3, 0x4E, 0x08, 0x2E, 0xA1,  
0x66, 0x28, 0xD9, 0x24, 0xB2, 0x76, 0x5B, 0xA2, 0x49, 0x6D, 0x8B,  
0xD1, 0x25, 0x72, 0xF8, 0xF6, 0x64, 0x86, 0x68, 0x98, 0x16, 0xD4,  
0xA4, 0x5C, 0xCC, 0x5D, 0x65, 0xB6, 0x92, 0x6C, 0x70, 0x48, 0x50,  
0xFD, 0xED, 0xB9, 0xDA, 0x5E, 0x15, 0x46, 0x57, 0xA7, 0x8D, 0x9D,  
0x84, 0x90, 0xD8, 0xAB, 0x00, 0x8C, 0xBC, 0xD3, 0x0A, 0xF7, 0xE4,  
0x58, 0x05, 0xB8, 0xB3, 0x45, 0x06, 0xD0, 0x2C, 0x1E, 0x8F, 0xCA,  
0x3F, 0x0F, 0x02, 0xC1, 0xAF, 0xBD, 0x03, 0x01, 0x13, 0x8A, 0x6B,  
0x3A, 0x91, 0x11, 0x41, 0x4F, 0x67, 0xDC, 0xEA, 0x97, 0xF2, 0xCF,  
0xCE, 0xF0, 0xB4, 0xE6, 0x73, 0x96, 0xAC, 0x74, 0x22, 0xE7, 0xAD,  
0x35, 0x85, 0xE2, 0xF9, 0x37, 0xE8, 0x1C, 0x75, 0xDF, 0x6E, 0x47,  
0xF1, 0x1A, 0x71, 0x1D, 0x29, 0xC5, 0x89, 0x6F, 0xB7, 0x62, 0x0E,  
0xAA, 0x18, 0xBE, 0x1B, 0xFC, 0x56, 0x3E, 0x4B, 0xC6, 0xD2, 0x79,  
0x20, 0x9A, 0xDB, 0xC0, 0xFE, 0x78, 0xCD, 0x5A, 0xF4, 0x1F, 0xDD,  
0xA8, 0x33, 0x88, 0x07, 0xC7, 0x31, 0xB1, 0x12, 0x10, 0x59, 0x27,  
0x80, 0xEC, 0x5F, 0x60, 0x51, 0x7F, 0xA9, 0x19, 0xB5, 0x4A, 0x0D,  
0x2D, 0xE5, 0x7A, 0x9F, 0x93, 0xC9, 0x9C, 0xEF, 0xA0, 0xE0, 0x3B,  
0x4D, 0xAE, 0x2A, 0xF5, 0xB0, 0xC8, 0xEB, 0xBB, 0x3C, 0x83, 0x53,  
0x99, 0x61, 0x17, 0x2B, 0x04, 0x7E, 0xBA, 0x77, 0xD6, 0x26, 0xE1,  
0x69, 0x14, 0x63, 0x55, 0x21, 0x0C, 0x7D };  

private static int Rcon[] = { 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 
0xab, 0x4d, 0x9a,  
0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39,  
0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a,  
0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8,  
0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef,  
0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc,  
0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b,  
0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3,  
0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94,  
0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04, 0x08, 0x10, 0x20,  
0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63, 0xc6, 0x97, 0x35,  
0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd, 0x61, 0xc2, 0x9f,  
0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb, 0x8d, 0x01, 0x02, 0x04,  
0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc, 0x63,  
0xc6, 0x97, 0x35, 0x6a, 0xd4, 0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91, 0x39, 0x72, 0xe4, 0xd3, 0xbd,  
0x61, 0xc2, 0x9f, 0x25, 0x4a, 0x94, 0x33, 0x66, 0xcc, 0x83, 0x1d, 0x3a, 0x74, 0xe8, 0xcb };  

public static byte[] keygeneration() throws Exception {  
KeyGenerator generator = KeyGenerator.getInstance("AES");  
generator.init(128);  
SecretKey key = generator.generateKey();  
return key.getEncoded();  
}  

private static byte[] xor_func(byte[] a, byte[] b) {  
byte[] out = new byte[a.length];  
for (int i = 0; i < a.length; i++) {  
out[i] = (byte) (a[i] ^ b[i]);  
}  
return out;  
}  

private static byte[][] generateSubkeys(byte[] key) {  
byte[][] tmp = new byte[Nb * (Nr + 1)][4];  
int i = 0;  
while (i < Nk) {  
tmp[i][0] = key[i * 4];  
tmp[i][1] = key[i * 4 + 1];  
tmp[i][2] = key[i * 4 + 2];  
tmp[i][3] = key[i * 4 + 3];  
i++;  
}  
i = Nk;  
while (i < Nb * (Nr + 1)) {  
byte[] temp = new byte[4];  
for(int k = 0;k<4;k++)  
temp[k] = tmp[i-1][k];  
if (i % Nk == 0) {  
temp = SubWord(rotateWord(temp));  
temp[0] = (byte) (temp[0] ^ (Rcon[i / Nk] & 0xff));  
} else if (Nk > 6 && i % Nk == 4) {  
temp = SubWord(temp);  
}  
tmp[i] = xor_func(tmp[i - Nk], temp);  
i++;  
}  
return tmp;  
}  

private static byte[] SubWord(byte[] in) {  
byte[] tmp = new byte[in.length];  
for (int i = 0; i < tmp.length; i++)  
tmp[i] = (byte) (sbox[in[i] & 0x000000ff] & 0xff);  
return tmp;  
}  

private static byte[] rotateWord(byte[] input) {  
byte[] tmp = new byte[input.length];  
tmp[0] = input[1];  
tmp[1] = input[2];  
tmp[2] = input[3];  
tmp[3] = input[0];  
return tmp;  
}  

private static byte[][] AddRoundKey(byte[][] state, byte[][] w, int round) {  
byte[][] tmp = new byte[state.length][state[0].length];  
for (int c = 0; c < Nb; c++) {  
for (int l = 0; l < 4; l++)  
tmp[l][c] = (byte) (state[l][c] ^ w[round * Nb + c][l]);  
}  
return tmp;  
}  

private static byte[][] SubBytes(byte[][] state) {  
byte[][] tmp = new byte[state.length][state[0].length];  
for (int row = 0; row < 4; row++)  
for (int col = 0; col < Nb; col++)  
tmp[row][col] = (byte) (sbox[(state[row][col] & 0x000000ff)] & 0xff);  
return tmp;  
}  

private static byte[][] InvSubBytes(byte[][] state) {  
for (int row = 0; row < 4; row++)  
for (int col = 0; col < Nb; col++)  
state[row][col] = (byte)(inv_sbox[(state[row][col] & 0x000000ff)]&0xff);  
return state;  
}  

private static byte[][] ShiftRows(byte[][] state) {  
byte[] t = new byte[4];  
for (int r = 1; r < 4; r++) {  
for (int c = 0; c < Nb; c++)  
t[c] = state[r][(c + r) % Nb];  
for (int c = 0; c < Nb; c++)  
state[r][c] = t[c];  
}  
return state;  
}  

private static byte[][] InvShiftRows(byte[][] state) {  
byte[] t = new byte[4];  
for (int r = 1; r < 4; r++) {  
for (int c = 0; c < Nb; c++)  
t[(c + r)%Nb] = state[r][c];  
for (int c = 0; c < Nb; c++)  
state[r][c] = t[c];  
}  
return state;  
}  

private static byte[][] InvMixColumns(byte[][] s){  
int[] sp = new int[4];  
byte b02 = (byte)0x0e, b03 = (byte)0x0b, b04 = (byte)0x0d, b05 = (byte)0x09;  
for (int c = 0; c < 4; c++) {  
sp[0] = FFMul(b02, s[0][c]) ^ FFMul(b03, s[1][c]) ^ FFMul(b04,s[2][c]) ^ FFMul(b05,s[3][c]);  
sp[1] = FFMul(b05, s[0][c]) ^ FFMul(b02, s[1][c]) ^ FFMul(b03,s[2][c]) ^ FFMul(b04,s[3][c]);  
sp[2] = FFMul(b04, s[0][c]) ^ FFMul(b05, s[1][c]) ^ FFMul(b02,s[2][c]) ^ FFMul(b03,s[3][c]);  
sp[3] = FFMul(b03, s[0][c]) ^ FFMul(b04, s[1][c]) ^ FFMul(b05,s[2][c]) ^ FFMul(b02,s[3][c]);  
for (int i = 0; i < 4; i++) s[i][c] = (byte)(sp[i]);  
}  
return s;  
}  

private static byte[][] MixColumns(byte[][] s){  
int[] sp = new int[4];  
byte b02 = (byte)0x02, b03 = (byte)0x03;  
for (int c = 0; c < 4; c++) {  
sp[0] = FFMul(b02, s[0][c]) ^ FFMul(b03, s[1][c]) ^ s[2][c] ^ s[3][c];  
sp[1] = s[0][c] ^ FFMul(b02, s[1][c]) ^ FFMul(b03, s[2][c]) ^ s[3][c];  
sp[2] = s[0][c] ^ s[1][c] ^ FFMul(b02, s[2][c]) ^ FFMul(b03, s[3][c]);  
sp[3] = FFMul(b03, s[0][c]) ^ s[1][c] ^ s[2][c] ^ FFMul(b02, s[3][c]);  
for (int i = 0; i < 4; i++) s[i][c] = (byte)(sp[i]);  
}  
return s;  
}  

public static byte FFMul(byte a, byte b) {  
byte aa = a, bb = b, r = 0, t;  
while (aa != 0) {  
if ((aa & 1) != 0)  
r = (byte) (r ^ bb);  
t = (byte) (bb & 0x80);  
bb = (byte) (bb << 1);  
if (t != 0)  
bb = (byte) (bb ^ 0x1b);  
aa = (byte) ((aa & 0xff) >> 1);  
}  
return r;  
}  

public static byte[] encryptBloc(byte[] in) {  
byte[] tmp = new byte[in.length];  
byte[][] state = new byte[4][Nb];  
for (int i = 0; i < in.length; i++)  
state[i / 4][i % 4] = in[i%4*4+i/4];  
state = AddRoundKey(state, w, 0);  
for (int round = 1; round < Nr; round++) {  
state = SubBytes(state);  
state = ShiftRows(state);  
state = MixColumns(state);  
state = AddRoundKey(state, w, round);  
}  
state = SubBytes(state);  
state = ShiftRows(state);  
state = AddRoundKey(state, w, Nr);  
for (int i = 0; i < tmp.length; i++)  
tmp[i%4*4+i/4] = state[i / 4][i%4];  
return tmp;  
}  

public static byte[] decryptBloc(byte[] in) {  
byte[] tmp = new byte[in.length];  
byte[][] state = new byte[4][Nb];  
for (int i = 0; i < in.length; i++)  
state[i / 4][i % 4] = in[i%4*4+i/4];  
state = AddRoundKey(state, w, Nr);  
for (int round = Nr-1; round >=1; round--) {  
state = InvSubBytes(state);  
state = InvShiftRows(state);  
state = AddRoundKey(state, w, round);  
state = InvMixColumns(state);  
}  
state = InvSubBytes(state);  
state = InvShiftRows(state);  
state = AddRoundKey(state, w, 0);  
for (int i = 0; i < tmp.length; i++)  
tmp[i%4*4+i/4] = state[i / 4][i%4];  
return tmp;  
}  

public static byte[] encrypt(byte[] in,byte[] key){  
Nb = 4;  
Nk = key.length/4;  
Nr = Nk + 6;  
int lenght=0;  
byte[] padding = new byte[1];  
int i;  
lenght = 16 - in.length % 16;  
padding = new byte[lenght];  
padding[0] = (byte) 0x80;  
for (i = 1; i < lenght; i++)  
padding[i] = 0;  
byte[] tmp = new byte[in.length + lenght];  
byte[] bloc = new byte[16];  
w = generateSubkeys(key);  
int count = 0;  
for (i = 0; i < in.length + lenght; i++) {  
if (i > 0 && i % 16 == 0) {  
bloc = encryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
}  
if (i < in.length)  
bloc[i % 16] = in[i];  
else{  
bloc[i % 16] = padding[count % 16];  
count++;  
}  
}  
if(bloc.length == 16){  
bloc = encryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
}  
return tmp;  
}  

public static byte[] decrypt(byte[] in,byte[] key){  
int i;  
byte[] tmp = new byte[in.length];  
byte[] bloc = new byte[16];  
Nb = 4;  
Nk = key.length/4;  
Nr = Nk + 6;  
w = generateSubkeys(key);  
for (i = 0; i < in.length; i++) {  
if (i > 0 && i % 16 == 0) {  
bloc = decryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
}  
if (i < in.length)  
bloc[i % 16] = in[i];  
}  
bloc = decryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
tmp = deletePadding(tmp);  
return tmp;  
}  

private static byte[] deletePadding(byte[] input) {  
int count = 0;  
int i = input.length - 1;  
while (input[i] == 0) {  
count++;  
i--;  
}  
byte[] tmp = new byte[input.length - count - 1];  
System.arraycopy(input, 0, tmp, 0, tmp.length);  
return tmp;  
}  

public static byte[] encrypt(byte[] in,byte[] key,int n){  
t1=System.nanoTime();  
Nb = 4;  
Nk = key.length/4;  
Nr=n;  
int lenght=0;  
byte[] padding = new byte[1];  
int i;  
lenght = 16 - in.length % 16;  
padding = new byte[lenght];  
padding[0] = (byte) 0x80;  
for (i = 1; i < lenght; i++)  
padding[i] = 0;  
byte[] tmp = new byte[in.length + lenght];  
byte[] bloc = new byte[16];  
w = generateSubkeys(key);  
int count = 0;  
for (i = 0; i < in.length + lenght; i++) {  
if (i > 0 && i % 16 == 0) {  
bloc = encryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
}  
if (i < in.length)  
bloc[i % 16] = in[i];  
else{  
bloc[i % 16] = padding[count % 16];  
count++;  
}  
}  
if(bloc.length == 16){  
bloc = encryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
}  
t2=System.nanoTime();  
return tmp;  
}  

public static byte[] decrypt(byte[] in,byte[] key,int n){  
t1=System.nanoTime();  
int i;  
byte[] tmp = new byte[in.length];  
byte[] bloc = new byte[16];  
Nb = 4;  
Nk = key.length/4;  
Nr = n;  
w = generateSubkeys(key);  
for (i = 0; i < in.length; i++) {  
if (i > 0 && i % 16 == 0) {  
bloc = decryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
}  
if (i < in.length)  
bloc[i % 16] = in[i];  
}  
bloc = decryptBloc(bloc);  
System.arraycopy(bloc, 0, tmp, i - 16, bloc.length);  
tmp = deletePadding(tmp);  
t2=System.nanoTime();  
return tmp;  
}  
}  