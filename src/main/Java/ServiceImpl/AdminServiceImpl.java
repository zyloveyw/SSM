package ServiceImpl;
import Dao.AdminDao;
import Entity.Model.Admin;
import Service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.ObjectInput;
import java.util.List;
import java.util.Map;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    //自动注入Dao对象
    @Resource
    private AdminDao adminDao;

    //实现接口中的方法
    @Override
    public Admin login(Admin admin){
        return adminDao.login(admin);
    }

    @Override
    public List<Admin> findAdmins(Map<String, Object>map){
        return adminDao.findAdmins(map);
    }

    @Override
    public  Integer getCount(Map<String, Object>map){
        return adminDao.getCount(map);
    }

    @Override
    public  Integer addAdmin(Admin admin){
        return adminDao.addAdmin(admin);
    }

    @Override
    public  Integer updateAdmin(Admin admin){
        return adminDao.updateAdmin(admin);
    }

    @Override
    public  Integer deleteAdmin(Integer id){
        return  adminDao.deleteAdmin(id);
    }
}
