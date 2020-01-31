package life.majiang.community.dto;

import lombok.Data;

/**
 * @ 类    名： GithubUser
 * @ 描    述： GithubUser类
 * @ 创建时间： 2020/1/27
 * @ 作    者： KANGNX
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
