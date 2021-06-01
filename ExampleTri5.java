import java.util.Scanner;
public class ExampleTri5{
public static void main (String[]args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the number");
int row = s.nextInt();
int num=1;
for(int i=1;i<=row;i++){
for(int j=1;j<=row;j++){
if(i+j<row+1&&i>=j){
System.out.print(num +"");
num=num+2;
}
System.out.print(" ");
}
System.out.println();
}
}
}
  