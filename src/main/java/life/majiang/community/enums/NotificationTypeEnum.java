package life.majiang.community.enums;

/**
 * @ 类    名： NotificationTypeEnum
 * @ 描    述： NotificationTypeEnum类
 * @ 创建时间： 2020/2/2
 * @ 作    者： KANGNX
 */
public enum NotificationTypeEnum {
    REPLY_QUESTION(1, "回复了问题"),
    REPLY_COMMENT(2, "回复了评论");

    private int type;
    private String name;

    NotificationTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public static String nameOfType(int type) {
        for (NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values()) {
            if (notificationTypeEnum.getType() == type) {
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
