package String;

public class LengthExample {
    public static void main(String[] args) {
        String str ="Javatpoint";
        if(str.length()>0){
            System.out.println("String is not empty and length is:"+str.length());
        }
        str="";
        if(str.length()==0){
            System.out.println();
        }
    }
}
