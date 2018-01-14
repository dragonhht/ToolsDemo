package dragon.hht.swaggerdemo.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dragon.hht.swaggerdemo.model.Student;
import dragon.hht.swaggerdemo.model.User;

/**
 * 控制层.
 *
 * @author: huang
 * Date: 18-1-14
 */
@Api("用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("根据用户ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int",
                    required = true, value = "用户ID", defaultValue = "1")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数不正确"),
            @ApiResponse(code = 4004, message = "路径错误")
    })
    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id) {
        if (id == 2) {
            return new User(2, "张三", 18);
        }
        return new User(1, "王二", 17);
    }

    @ApiOperation("根据学生ID获取学生信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int",
                    required = true, value = "学生ID", defaultValue = "1")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数不正确"),
            @ApiResponse(code = 4004, message = "路径错误")
    })
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("id") int id) {
        new User();
        if (id == 2) {
            return new Student(2, "学生2", 18);
        }
        return new Student(1, "学生1", 17);
    }
}
