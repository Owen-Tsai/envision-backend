package com.ruoyi.system.domain.vo;

import com.ruoyi.common.utils.StringUtils;

/**
 * 路由显示信息
 * 
 * @author ruoyi
 */
public class MetaVo
{
    /**
     * 设置该路由在侧边栏和面包屑中展示的名字
     */
    private String title;

    /**
     * 设置该路由的图标，对应路径src/assets/icons/svg
     */
    private String icon;

    /**
     * 设置为true，则不会被 <keep-alive>缓存
     */
    private boolean noCache;

    /**
     * 内链地址（http(s)://开头）
     */
    private String link;

    /**
     * 是否在侧边栏隐藏该路由对应的菜单项
     */
    private boolean hidden;

    /**
     * 是否使用非默认布局
     */
    private boolean isCustomLayout;

    /**
     * 当某路由是其父路由的唯一子路由时，是否依然在侧边栏中显示菜单层级而非直接展示该路由作为菜单项
     */
    private boolean alwaysShow;

    /**
     *
     */

    public MetaVo()
    {
    }

    public MetaVo(String title) {
        this.title = title;
    }


    public MetaVo(String title, String icon)
    {
        this.title = title;
        this.icon = icon;
    }

    public MetaVo(String title, String icon, boolean noCache)
    {
        this.title = title;
        this.icon = icon;
        this.noCache = noCache;
    }

    public MetaVo(String title, String icon, String link)
    {
        this.title = title;
        this.icon = icon;
        this.link = link;
    }

    public MetaVo(String title, String icon, boolean noCache, String link)
    {
        this.title = title;
        this.icon = icon;
        this.noCache = noCache;
        if (StringUtils.ishttp(link))
        {
            this.link = link;
        }
    }

    public boolean isNoCache()
    {
        return noCache;
    }

    public void setNoCache(boolean noCache)
    {
        this.noCache = noCache;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    // added by cai on 2024/1/15
    public boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(boolean val) {
        this.hidden = val;
    }

    public boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    public void setAlwaysShow(boolean val) {
        this.alwaysShow = val;
    }

    public boolean getIsCustomLayout() {
        return this.isCustomLayout;
    }

    public void setIsCustomLayout(boolean val) {
        this.isCustomLayout = val;
    }
}
