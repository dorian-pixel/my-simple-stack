package deqo.daze.mysimplestack;

public class EmptyStackException extends Exception {

    private static final long serialVersionUID = 1L;

    public EmptyStackException() {}

    public EmptyStackException(String messsage) {
        super(messsage);
    }

    public EmptyStackException(Throwable cause) {
        super(cause);
    }

    public EmptyStackException(String messsage, Throwable cause) {
        super(messsage, cause);
    }

}
