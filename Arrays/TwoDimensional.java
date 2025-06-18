import java.util.*;
class TwoDimensional{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int rows= sc.nextInt();
int columns= sc.nextInt();
int[][] TwoD= new int[rows][columns];
for(int i=0; i<rows; i++){
  for(int j=0; j<columns; j++){
TwoD[i][j]= sc.nextInt();
}
}
int[] OneD= new int[rows*columns];
int index=0;
for(int i=0; i<rows; i++){
  for(int j=0; j<columns; j++){
OneD[index++]= TwoD[i][j];
}
}
System.out.print("The elements of the 1-dimensional array are: ");
for(int i=0; i<=OneD.length-1;i++){
System.out.print(OneD[i]+ " ");
}
}
}