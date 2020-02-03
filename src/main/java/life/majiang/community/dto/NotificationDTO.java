package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @ 类    名： NotificationDTO
 * @ 描    述： NotificationDTO类
 * @ 创建时间： 2020/2/2
 * @ 作    者： KANGNX
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
