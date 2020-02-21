package exceptions;

public class ExceptionTest {

    public static void main(String[] args) throws CustomException {
        for (int i=0;i<5;i++){
            if(i==3) {
                throw new CustomException("custom exception thrown");
            }
        }
    }
}
