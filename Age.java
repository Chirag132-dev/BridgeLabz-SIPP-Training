import java.util.*;
class Age{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int[] array= new int[10];
for(int i=0; i<array.length; i++){
array[i]= sc.nextInt();
}
for(int i=0; i<array.length; i++){
if(array[i]>=18){
System.out.println("The student with age " + array[i] + " can vote.");
}
else {
System.out.println("The student with age " + array[i] + " can't vote.");
}
}
}
}