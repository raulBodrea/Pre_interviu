package Service;

import java.io.Serializable;

public class ServiceException extends RuntimeException {
    public ServiceException(String serviceException){
        super(serviceException);
    }
}
