package com.galen.alert.core.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PageVo implements Serializable{

    private static final long serialVersionUID = 262351852171364750L;

    public static final Integer DEFAULT_PAGE_SIZE = 10;
    public static final Integer DEFAULT_PAGE_NUM = 1;
    
    private Integer pageNum = DEFAULT_PAGE_NUM;
    
    private Integer pageSize = DEFAULT_PAGE_SIZE;
    
    private Integer startNum = 0;
    
    private Integer totalCount = 0;
    
    private Integer totalPage = 0;
    
    private Map<String, Object> searchParamMap;

    public PageVo() {
        super();
    }

    public PageVo(Integer pageNum, Integer pageSize, Integer startNum, Map<String, Object> searchParamMap) {
        super();
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.startNum = startNum;
        this.searchParamMap = searchParamMap;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        int totalPage = (int)Math.ceil((double)totalCount/(double)pageSize);
        this.totalPage = totalPage;
        return this.totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    
    public Map<String, Object> getSearchParamMap() {
        return searchParamMap;
    }

    public void setSearchParamMap(Map<String, Object> searchParamMap) {
        this.searchParamMap = searchParamMap;
    }

    public static PageVo proessMap(Map<String, Object> searchParamMap, Integer pageNum, Integer pageSize) {
        
        if (searchParamMap == null) 
            searchParamMap = new HashMap<>();
        if (pageNum == null || pageNum < 1) 
            pageNum = PageVo.DEFAULT_PAGE_NUM;
        if (pageSize == null || pageSize < 1) 
            pageSize = PageVo.DEFAULT_PAGE_SIZE;
        int startNum = (pageNum - 1) * pageSize;
        searchParamMap.put("limitOffset", startNum);
        searchParamMap.put("limitRows", pageSize);
        
        PageVo pageVO = new PageVo(pageNum, pageSize, startNum, searchParamMap);
        
        return pageVO;
    }
}
