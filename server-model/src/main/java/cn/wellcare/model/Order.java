package cn.wellcare.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order implements Serializable {

    private String id;

    private Date createTime;

}
