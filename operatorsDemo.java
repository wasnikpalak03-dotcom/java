public class operatorsDemo {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("Addition:" + sum);
    }

    int multiply (int a, int b){
        return a * b;
    }

    public static void main(string[] args){
       //Operators
       int x = 15 , y = 8;
       System.out.println("x + y =" + (x + y)); 
       System.out.println("x - y =" + (x - y)); 
       System.out.println("x * y =" + (x * y));
       System.out.println("x / y =" + (x / y)); 
       System.out.println("x % y =" + (x % y));

       byte a = 20,  b= 30;
       int result = a + b;
       System.out.println("Arithmetic Promotion Result:" + result);

       OperatorsDemo obj = new OperatorsDemo();
       obj.add(17,5);
       int product = obj.multiply(17,5);
       System.out.println("multiplication" + product);
    }
    
}
