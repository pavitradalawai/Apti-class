class Square{
public static void main(String[]args){
int row=4;
for(int i=1;i<=row;i++){
for(int j=1;j<=row;j++){
if(i==1||j==1||i==4||j==4)
System.out.print(i+""+j+ "");
else
System.out.print("  ");
}
System.out.println();
}
}
}
