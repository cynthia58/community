package life.majiang.community.exception;

/**
 * @ 类    名： CustomizeException
 * @ 描    述： CustomizeException类
 * @ 创建时间： 2020/1/31
 * @ 作    者： KANGNX
 */
public class CustomizeException extends RuntimeException {
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
