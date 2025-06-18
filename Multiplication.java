import java.util.*;
class Multiplication{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
int[] arr= new int[10];
for(int i=0; i<= arr.length-1; i++){
arr[i]= num*i;
System.out.println(num + " * " + i + " = " + arr[i]);
}
}
}