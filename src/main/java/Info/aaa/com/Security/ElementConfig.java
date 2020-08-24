package Info.aaa.com.Security;

import Info.aaa.com.Entity.Element;
import Info.aaa.com.Service.ElementService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class ElementConfig implements UserDetailsService {
    @Resource
    ElementService service;
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Element element = service.FindByName(username);
        System.out.printf(username);
        System.out.printf("当前登录者："+element);
        if(element == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return (UserDetails) element;
    }
}
