import java.util.*;
class NumCheck{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int[] arr= new int[5];
for(int i=0; i<= arr.length-1; i++){
arr[i]= sc.nextInt();
}
for(int i=0; i<= arr.length-1; i++){
if(arr[i]>0){
System.out.println("Positive");
 if(arr[i]%2==0){
   System.out.println("Positive and even");
}
 else{
   System.out.println("Positive and odd");
}
}
else if(arr[i]==0){
   System.out.println("Zero");
}
else {
   System.out.println("Negative");
}
}
int first= arr[0];
int last= arr[4];
if(first>last){
System.out.println("first is bigger than last");
}
else if(first==last){
System.out.println("both are equal");
}
else{
System.out.println("last is bigger than first");
}
}
}