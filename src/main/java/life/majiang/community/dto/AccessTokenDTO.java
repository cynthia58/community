package life.majiang.community.dto;

import lombok.Data;

/**
 * @ 类    名： AccesstokenDTO
 * @ 描    述： AccesstokenDTO类
 * @ 创建时间： 2020/1/27
 * @ 作    者： KANGNX
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
