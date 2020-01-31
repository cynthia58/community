package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @ 类    名： QuestionDTO
 * @ 描    述： QuestionDTO类
 * @ 创建时间： 2020/1/29
 * @ 作    者： KANGNX
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
