package life.majiang.community.exception;

/**
 * @ 类    名： CustomizeErrorCode
 * @ 描    述： CustomizeErrorCode类
 * @ 创建时间： 2020/1/31
 * @ 作    者： KANGNX
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("你找的问题不在了，要不换个试试？");

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
