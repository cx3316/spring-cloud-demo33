package cn.it.service.impl;

import cn.it.dao.DepartmentMapper;
import cn.it.entity.Department;
import cn.it.service.DepartmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper dm;

    @RequestMapping("/listAllDepartment")
    @Override
    public List<Department> listAllDepartment() {
        return dm.listAllDepartment();
    }

    @RequestMapping("/addDepartment")
    @Override
    public Integer addDepartment(Department dept) {
        return dm.addDepartment(dept);
    }

    @RequestMapping("/deleteDepartmentById")
    @Override
    public Integer deleteDepartmentById(Integer id) {
        return dm.deleteDepartmentById(id);
    }

    @RequestMapping("/updateDepartment")
    @Override
    public Integer updateDepartment(Department dept) {
        return dm.updateDepartment(dept);
    }

    @RequestMapping("/listDeptByPage")
    @Override
    public PageInfo<Department> listDeptByPage(Map<String, Object> params) {
        Integer currPage  = (Integer) params.get("currPage");
        Integer pageSize  = (Integer) params.get("pageSize");

        PageHelper.startPage(currPage,pageSize);

        List<Department> depts = dm.listDeptByConditions(params);
        PageInfo<Department> pageInfo = new PageInfo<>(depts);

        return pageInfo;
    }
}
