public class FinalizeExample {

    public void finalize(){
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        FinalizeExample finalizeExample1= new FinalizeExample();
        FinalizeExample finalizeExample2= new FinalizeExample();
        finalizeExample1=null;
        finalizeExample2=null;
        System.gc();
    }
}
