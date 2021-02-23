package cn.it.feign.feignconfig;


import cn.it.entity.Department;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "provider-department-8001")
public interface FeignConfig {

    @RequestMapping("/listAllDepartment")
    List<Department> listAllDepartment();

    @RequestMapping("/addDpet")
    Integer addDepartment(Department dept);

    @RequestMapping("/deleteDpetById")
    Integer deleteDepartmentById(Integer id);

    @RequestMapping("/updateDpet")
    Integer updateDepartment(Department dept);

    //分页
    @RequestMapping("/listDeptByPage")
    PageInfo<Department> listDeptByPage(Map<String,Object> params);
}
