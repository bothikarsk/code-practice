package exceptions;

import java.sql.SQLException;

public class ExceptionTest2 {
    public static void main(String[] args) throws SQLException {
        B b = new B();
        b.print();
    }
}
