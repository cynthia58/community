package life.majiang.community.model;

import lombok.Data;

/**
 * @ 类    名： Question
 * @ 描    述： Question类
 * @ 创建时间： 2020/1/28
 * @ 作    者： KANGNX
 * @ 版权所有： 江苏宇峰信息科技有限公司
 */
@Data
public class Question {
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
}
