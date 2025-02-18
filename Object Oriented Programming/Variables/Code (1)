class Student{
    static String name="ULAB";// Static variable shared among all instances
    int ID;// Instance variable
    void display(){
        int a=10;// Local variable
        System.out.println("Varsity:"+name+"\nId:"+ID);
    }
}
public class Hello{
    public static void main(String[] args){
        Student s1= new Student();
        s1.ID=101;
        s1.display();

        Student.name="AIUB";// Change static variable name
        //Since name is static, changing Student.name will affect all Student objects.
        s1.display();

    }
}
