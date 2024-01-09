 //Private constructor
 class Private{
    private Private(){
        void msg(){
            System.out.println("Hello Java");
        }
    }
  
    public class Simple{
    public static void main(String[] args) {
        Private obj=new Private(); //Compile Time Error
    }
}
