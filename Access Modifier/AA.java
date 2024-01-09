public class AA {
    protected void msg(){
        System.out.println("Hello");
    }
}
class B extends AA{
    public static void main(String[] args) {
        B obj=new B();
        obj.msg();
    }
}
