package cn.it.service;

import cn.it.entity.Department;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    List<Department> listAllDepartment();
    Integer addDepartment(Department dept);
    Integer deleteDepartmentById(Integer id);
    Integer updateDepartment(Department dept);

    //分页
    PageInfo<Department> listDeptByPage(Map<String,Object> params);
}
