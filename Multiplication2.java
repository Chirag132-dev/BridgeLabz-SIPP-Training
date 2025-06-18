import java.util.*;
class Multiplication2{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int[] arr= new int[11];
int nums= sc.nextInt();
if((nums>=6)&&(nums<=9)){
for(int i=1; i<=arr.length-1; i++){
arr[i]= i*nums;
System.out.println(nums + " * " + i + " = "+ arr[i]);
}
}
else{
System.out.println("Kindly enter a number between 6 and 9");
}
}
}