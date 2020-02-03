package life.majiang.community.dto;

import lombok.Data;

/**
 * @ 类    名： QuestionQueryDTO
 * @ 描    述： QuestionQueryDTO类
 * @ 创建时间： 2020/2/3
 * @ 作    者： KANGNX
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
