package Info.aaa.com.Service;

import Info.aaa.com.Dao.ElementDao;
import Info.aaa.com.Entity.Element;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ElementService {
    @Resource
    ElementDao dao;
    public Element FindByName(String m_name){
        return dao.FindByName(m_name);
    }
}
