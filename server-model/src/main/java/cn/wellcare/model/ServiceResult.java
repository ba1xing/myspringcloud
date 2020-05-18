package cn.wellcare.model;


import lombok.Data;

@Data
public class ServiceResult<T> {

    private String state;

    private T Data;

    private String errorInfo;

    private String desc;

    public ServiceResult() {
        this.state = "200";
        this.errorInfo = "";
        this.desc = "";
    }
}
