package life.majiang.community.enums;

/**
 * @ 类    名： CommentTypeEnum
 * @ 描    述： CommentTypeEnum类
 * @ 创建时间： 2020/1/31
 * @ 作    者： KANGNX
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);

    private Integer type;

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type) {
                return true;
            }
        }
        return false;
    }

    public Integer getType() {
        return type;
    }
}
