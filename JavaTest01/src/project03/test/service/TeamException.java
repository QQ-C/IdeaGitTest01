package project03.test.service;

/**
 * 自定义异常类
 */
public class TeamException  extends Exception{
    static final long serialVersionUID = -3387514229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
