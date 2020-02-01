package life.majiang.community.dto;

import lombok.Data;

/**
 * @ 类    名： CommentCreateDTO
 * @ 描    述： CommentDTO类
 * @ 创建时间： 2020/1/31
 * @ 作    者： KANGNX
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
