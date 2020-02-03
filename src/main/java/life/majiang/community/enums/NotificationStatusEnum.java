package life.majiang.community.enums;

/**
 * @ 类    名： NotificationStatusEnum
 * @ 描    述： NotificationStatusEnum类
 * @ 创建时间： 2020/2/2
 * @ 作    者： KANGNX
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);

    private int status;

    NotificationStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
