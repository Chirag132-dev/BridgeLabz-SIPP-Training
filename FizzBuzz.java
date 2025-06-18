import java.util.*;
class FizzBuzz{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
String[] array= new String[n];
if(n>0){
for(int i=0; i<n; i++){
if(i%3==0){
	array[i]="Fizz";
}
else if(i%5==0){
	array[i]="Buzz";
}
else if((i%3==0) && (i%5==0)){
	array[i]="FizzBuzz";
}
else{
	array[i]= String.valueOf(i);
}
}
for(int i=0; i<=array.length-1; i++){
System.out.println("Position " + i + " = " + array[i]);
}
}
}
}