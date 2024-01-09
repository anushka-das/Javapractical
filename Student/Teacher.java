public class Teacher{
 int id;
 String name;
 void insertvalues(int i,String n)
 {
    id= i;
    name= n;
 }
 void displayInformation(){
    System.out.println(id + " " +name);
 }

        public static void main(String args[])
        {
            Teacher t1=new Teacher();
            Teacher t2=new Teacher();
            t1.insertvalues(3, "anu");
            t2.insertvalues(4, "pranisha");;
            t1.displayInformation();
            t2.displayInformation();
 }
}
