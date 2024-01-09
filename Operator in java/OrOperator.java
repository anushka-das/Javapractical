public class OrOperator {
    public static void main(String args[]){
    int a=10;
    int b=5;
    int c=20;
    //logical
    System.out.println(a>b||a<c);
    System.out.println(a>b|a<c);
    //Bitwise
    System.out.println(a>b||a++<c);
    System.out.println(a);
    System.out.println(a>b|a++<c);
    System.out.println(a);
    }
}
