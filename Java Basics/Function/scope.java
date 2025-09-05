public class scope {
    public static void main(String args[]) {
        // block scope
        {
            int s = 10;
            System.out.println(s);
        }
        // System.out.println(s);
        func();
    }
    //Block scope or function scope or local scope
    public static void func(){
        int a =5;
        {
            System.out.println(a);
        }
    }
}
