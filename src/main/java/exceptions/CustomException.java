package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class CustomException extends Exception {

    CustomException(String message) {
        super(message);
    }

}
