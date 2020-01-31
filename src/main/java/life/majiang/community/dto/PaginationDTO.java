package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ 类    名： PaginationDTO
 * @ 描    述： PageDTO类
 * @ 创建时间： 2020/1/30
 * @ 作    者： KANGNX
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }
        showPrevious = (page == 1) ? false : true;
        showNext = (page == totalPage) ? false : true;
        showFirstPage = pages.contains(1) ? false : true;
        showEndPage = pages.contains(totalPage) ? false : true;
    }
}
