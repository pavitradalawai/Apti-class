import java.util.Scanner;
class Triangle1{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
Sysytem.out.println("Enter the number of row");
byte row = S.nextByte();
for(int i=1;i<=row;i++){ 
for(int j=1;j<=row;j++){
if(i>=j&&i+j>row)
System.out.print(i + "" + j + " ");
else
System.out.print("   ");
}
System.out.println();
}
}
}

