class Matrix2{
public static void main(String[]args){
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;i++)
{
if(i==1||i==3||j==1||j==5)
System.out.print(i +"" + j + " ");
else
System.out.print("  ");
}
System.out.println();
}
}
} 