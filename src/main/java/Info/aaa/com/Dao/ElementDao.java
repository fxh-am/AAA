package Info.aaa.com.Dao;

import Info.aaa.com.Entity.Element;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ElementDao {
    @Select("select * from Element where m_name = #{m_name}")
    public Element FindByName(String m_name);
}
