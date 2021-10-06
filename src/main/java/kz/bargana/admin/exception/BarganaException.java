package kz.bargana.admin.exception;

public class BarganaException extends RuntimeException{
    protected ExceptionCode code;

    public BarganaException(String message, ExceptionCode code) {
        super(message);
        this.code = code;
    }

    public BarganaException(Throwable cause, ExceptionCode code) {
        super(cause);
        this.code = code;
    }

    public ExceptionCode getCode() {
        return code;
    }
}
