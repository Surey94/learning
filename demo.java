public class demo{

//method creation
public void addition(int a, int b){
int sum = a+b;
//return method
// return sum;
}

public static void main(String[] args){

int num1 = 25;
int num2 = 15;
//create an object of main class
demo obj = new demo();
int result = obj.addition(num1, num2);
System.out.println("sum is:"+ result);

}
}