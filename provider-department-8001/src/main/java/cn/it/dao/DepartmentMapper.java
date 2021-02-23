package cn.it.dao;

import cn.it.entity.Department;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DepartmentMapper {
    List<Department> listAllDepartment();
    Integer addDepartment(Department dept);
    Integer deleteDepartmentById(Integer id);
    Integer updateDepartment(Department dept);

    //分页
    int countDeptByConditions(Map<String,Object> params);
    List<Department> listDeptByConditions(Map<String,Object> params);
}
