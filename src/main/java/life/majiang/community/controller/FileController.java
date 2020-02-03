package life.majiang.community.controller;

import life.majiang.community.dto.FileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ 类    名： FileController
 * @ 描    述： FileController类
 * @ 创建时间： 2020/2/3
 * @ 作    者： KANGNX
 */
@Controller
public class FileController {

    @RequestMapping("/file/upload")
    @ResponseBody
    public FileDTO upload() {
        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/images/wechat.jpg");
        return fileDTO;
    }

}
