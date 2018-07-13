package Dao;
import Entity.Model.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdminDao {
    /**登陆
     *
     * @param  admin
     * @return
     */
    public  Admin login(Admin admin);

    /** 根据条件查询管理员
     *
     * @param  map
     * @return
     */
    public List<Admin> findAdmins(Map<String, Object> map);

    /** 根据条件查询管理员人数
     *
     *
     */
    public Integer getCount(Map<String, Object> map);

    /**添加管理员
     *
     */
    public  Integer addAdmin(Admin admin);

    /** 修改管理员
     *
     */
    public  Integer updateAdmin(Admin admin);

    /** 删除管理员
     *
     */
        public  Integer deleteAdmin(Integer id);
}
