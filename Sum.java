import java.util.*;
class Sum{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double[] arr= new double[10];
double total= 0.0;
int index=0;
System.out.println("Enter a negative number or zero to break");
while(true){
double n=sc.nextDouble();
if(n<=0){
break;
}
if(index==10){
break;
}
arr[index]= n;
index++;
}
for(int i=0; i<index; i++){
total=total+arr[i];
}
System.out.println("The total of all elements until now is: " + total);
}
}