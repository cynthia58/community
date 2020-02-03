package life.majiang.community.controller;

import life.majiang.community.dto.CommentDTO;
import life.majiang.community.dto.NotificationDTO;
import life.majiang.community.dto.ResultDTO;
import life.majiang.community.enums.CommentTypeEnum;
import life.majiang.community.enums.NotificationTypeEnum;
import life.majiang.community.model.User;
import life.majiang.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ 类    名： NotificationController
 * @ 描    述： NotificationController类
 * @ 创建时间： 2020/2/2
 * @ 作    者： KANGNX
 */
@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String profile(HttpServletRequest request, @PathVariable(name = "id") Long id) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }
        NotificationDTO notificationDTO = notificationService.read(id, user);
        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
                || NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType()) {
            return "redirect:/question/"+notificationDTO.getOuterid();
        }else{
            return "redirect:/";
        }
    }
}
