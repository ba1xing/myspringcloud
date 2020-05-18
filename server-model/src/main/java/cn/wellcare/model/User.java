package cn.wellcare.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private String id;

    private String name;

    private String passWord;

    private String mail;

    private String mobile;

    private String state;

    private Date createTime;

    private Date updateTime;

    private String remark;
}
