package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @ 类    名： CommentDTO
 * @ 描    述： CommentDTO类
 * @ 创建时间： 2020/2/1
 * @ 作    者： KANGNX
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
