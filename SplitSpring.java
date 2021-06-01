class Splitstring{
public static void main(String[] args){
String msg="Hello Hello WakeUp developers";
char []arr=msg.toCharArray();
for (int i=0;i<arr.length;i++){
if (arr[i]==' '){
System.out.println(i);
}
}
}
}