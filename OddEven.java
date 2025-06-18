import java.util.*;
class OddEven{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int size= (n/2) + 1;
int[] odd= new int[size];
int[] even= new int[size];
int oddIndex=0;
int evenIndex=0;
if(n>0){
for(int i=1; i<=n; i++){
if(i%2==0){
even[evenIndex++]=i;
}
else{
odd[oddIndex++]=i;
}
}
 System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
}
else{
return;
}
}
}