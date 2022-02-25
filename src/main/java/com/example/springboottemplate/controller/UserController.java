package com.example.springboottemplate.controller;


import com.example.springboottemplate.dto.common.Result;
import com.example.springboottemplate.dto.common.ResultCode;
import com.example.springboottemplate.entity.User;
import com.example.springboottemplate.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Tag(name = "/user", description = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


//    @ApiOperation("查询用户详情")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户ID", required = true)
//    })
//    @GetMapping("/getUser/{id}")
//    public Result<User> getUserName(@PathVariable("id") Integer id) {
//        User user = userService.getUserName(id);
//        return Result.<User>builder().code(ResultCode.SUCCESS.code()).res(user).build();
//    }

    @Operation(description = "创建用户")
    @PostMapping("/createUser")
    public Result<Void> createUser(@RequestBody User user) {
        userService.createUser(user);
        return Result.<Void>builder().code(ResultCode.SUCCESS.code()).build();
    }

    @Operation(description = "查找全部")
    @GetMapping("/findAll")
    public Result<PageInfo<User>> findAll(@RequestParam(defaultValue = "1") Integer pageNum,
                                          @RequestParam(defaultValue = "10") Integer pageSize) {
        PageInfo<User> users = userService.findAll(pageNum, pageSize);
        return Result.<PageInfo<User>>builder().code(ResultCode.SUCCESS.code()).res(users).build();
    }

}
