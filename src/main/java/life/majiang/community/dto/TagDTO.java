package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @ 类    名： TagDTO
 * @ 描    述： TagDTO类
 * @ 创建时间： 2020/2/2
 * @ 作    者： KANGNX
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
