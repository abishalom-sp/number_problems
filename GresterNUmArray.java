class GresterNUmArray{
public static void main(String [] args){

int arr[] = new int [] {1,45,7,58,1,7,89,45,45,91};

int greater = arr[0];

for (int i =1; i<arr.length; i++){
if(greater < arr[i])
greater= arr[i];

}
System.out.println(greater);
}
}