package t1;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Project name(项目名称)：MyBatis_if
 * Package(包名): t1
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/13
 * Time(创建时间)： 20:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public interface SiteMapper
{
    /**
     * Update int.
     *
     * @param site the site
     * @return the int
     */
    public int update(@Param("site") Site site);

    /**
     * Update by param int.
     *
     * @param id         the id
     * @param name       the name
     * @param url        the url
     * @param age        the age
     * @param country    the country
     * @param createTime the create time
     * @return the int
     */
    public int updateByParam(@Param("id") Integer id, @Param("name") String name, @Param("url") String url,
                             @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);

    /**
     * Select list.
     *
     * @param site the site
     * @return the list
     */
    public List<Site> select(@Param("site") Site site);

    /**
     * Select by param list.
     *
     * @param id         the id
     * @param name       the name
     * @param url        the url
     * @param age        the age
     * @param country    the country
     * @param createTime the create time
     * @return the list
     */
    public List<Site> selectByParam(@Param("id") Integer id, @Param("name") String name, @Param("url") String url,
                                    @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);

    /**
     * Select website list.
     *
     * @param site the site
     * @return the list
     */
    public List<Site> selectWebsite(Site site);

    /**
     * Select website by param list.
     *
     * @param id         the id
     * @param name       the name
     * @param url        the url
     * @param age        the age
     * @param country    the country
     * @param createTime the create time
     * @return the list
     */
    public List<Site> selectWebsiteByParam(@Param("id") Integer id, @Param("name") String name, @Param("url") String url,
                                           @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);
}
