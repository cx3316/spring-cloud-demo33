package cn.it.feign.controller;

import cn.it.entity.Department;
import cn.it.entity.R;
import cn.it.feign.feignconfig.FeignConfig;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dept")
@Slf4j
public class DepartmentController {

    @Autowired
    private FeignConfig feignConfig;

    @GetMapping("/listAllDepts")
    public R listAllDepartment() {
        List<Department> depts = feignConfig.listAllDepartment();
        return R.ok().data("depts",depts);
    }

    @PostMapping("/addDept")
    public R addDepartment(@RequestBody Department dept) {
        Integer result = feignConfig.addDepartment(dept);

        return result > 0 ? R.ok():R.error();
    }

    @DeleteMapping("/deleteDept/{id}")
    public R deleteDepartmentById(@PathVariable("id") Integer id) {
        Integer result = feignConfig.deleteDepartmentById(id);

        return result > 0 ? R.ok():R.error();
    }

    @PostMapping("/updateDept")
    public R updateDepartment(@RequestBody Department dept) {
        Integer result = feignConfig.addDepartment(dept);

        return result > 0 ? R.ok():R.error();
    }

    @PostMapping("/listDeptByPage/{currPage}/{pageSize}")
    public R listDeptByPage(@PathVariable("currPage")Integer currPage,
                            @PathVariable("currPage")Integer pageSize,
                            @RequestBody Map<String,Object> params) {
        log.info(">>>>>>>>>>>>>> params: " + params.toString());

        PageInfo<Department> pageInfo = feignConfig.listDeptByPage(params);

        return R.ok().data("pageInfo",pageInfo);
    }
}
