import java.util.*;
class Height{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double[] arr= new double[11];
double total= 0.0;
for(int i=0; i<= arr.length-1; i++){
arr[i]= sc.nextDouble();
}
for(int i=0; i<= arr.length-1; i++){
total= total+ arr[i];
}
double mean= total/11;
System.out.println("The mean age of the football team is: " + mean);
}
}