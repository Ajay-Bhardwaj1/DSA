 class MethodOverloading {
   public public static void main(String[] args) {
        System.out.println("Here we understand the concep of the Method Overloading");
        /* Defonition :- If a class has multiple methods having same name but different in parameters, it
         is known as Method Overloading. */
         Method op= new Method();
         System.out.println(op.Hello(11,11));
         System.out.println(op.Hello(11,11));



    }
    
}
class Method{
    void Hello(int a, long b){
     System.out.println("something else");

    }
    void Hello(long a, int b){
       System.out.println("Something anything");
        
    }

}
