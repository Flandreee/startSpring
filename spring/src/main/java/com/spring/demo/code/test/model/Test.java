package com.spring.demo.code.test.model;






import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "test")
public class Test implements Serializable {

    @Id
    private String id;

    private String msg;

    private String info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
