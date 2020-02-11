public class GodClass {
    public static void main(String[] args) {

        String str = new String("Santosh");
        //Class strObj = str.getClass();
        System.out.println("Super class of String is: " + str.getClass().getSuperclass());

        Object object = new Object();
        Class obj = object.getClass();
        System.out.println("Super class of Object is: " + obj.getSuperclass());
    }
}
