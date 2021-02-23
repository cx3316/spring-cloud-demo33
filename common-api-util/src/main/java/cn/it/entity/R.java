package cn.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class R {
    private String code;
    private boolean status;
    private String message;
    private Map<String,Object> data = new HashMap<>();

    public static R ok(){
        R r = new R();
        r.setCode("200");
        r.setStatus(true);
        return r;
    }

    public static R error(){
        R r = new R();
        r.setCode("444");
        r.setStatus(false);
        return r;
    }

    public R code(String code){
        this.code = code;
        return this;
    }

    public R status(boolean status){
        this.status = status;
        return this;
    }

    public R message(String message){
        this.message = message;
        return this;
    }

    public R data(Map<String,Object> map){
        this.data = map;
        return this;
    }

    public R data(String k, Object v){
        this.data.put(k,v);
        return this;
    }
}
