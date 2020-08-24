package Info.aaa.com.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Element")
public class Element {
    @Id
    @Column
    private Integer m_id;
    @Column
    private  String pwd;
    @Column
    private String photo;
    @Column
    private Integer state;
    @Column
    private String demo;
    @Column
    private Integer m_eid;

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public Integer getM_eid() {
        return m_eid;
    }

    public void setM_eid(Integer m_eid) {
        this.m_eid = m_eid;
    }

    @Override
    public String toString() {
        return "Element{" +
                "m_id=" + m_id +
                ", pwd='" + pwd + '\'' +
                ", photo='" + photo + '\'' +
                ", state=" + state +
                ", demo='" + demo + '\'' +
                ", m_eid=" + m_eid +
                '}';
    }
}
