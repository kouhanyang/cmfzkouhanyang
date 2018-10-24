package com.baizhi.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
public class Menu {
    private Integer id;
    private String title;
    private String parentId;
    private String iconcls;
    private String url;
    private List<Menu> list;

    public Menu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Menu> getList() {
        return list;
    }

    public void setList(List<Menu> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", parentId='" + parentId + '\'' +
                ", iconcls='" + iconcls + '\'' +
                ", url='" + url + '\'' +
                ", list=" + list +
                '}';
    }
}
