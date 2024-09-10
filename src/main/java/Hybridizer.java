package main;  
import java.util.*;

public class Hybridizer {  
public String form_comb() {  
Random rand = new Random();  
String res = "";

int[] li = new int[3];  
int top = -1;  
int n = rand.nextInt(4 - 1) + 1;  
System.out.println(n);  

for (int i = 0; i < n; i++) {  
int temp = rand.nextInt(4 - 1) + 1;  
if (top == -1) {  
top = top + 1;  
li[top] = temp;  
res = res + temp;  
} 
else {  
int flag = 0;  
for (int k = 0; k <= top; k++) {  
if (li[k] == temp) {  
flag = 1;  
break;  
}  
}  

if (flag == 0) {  
top = top + 1;  
li[top] = temp;  
res = res + temp;  
} else {  
i = i - 1;  
continue;  
}  
}  
}  
return res;  
}  
}