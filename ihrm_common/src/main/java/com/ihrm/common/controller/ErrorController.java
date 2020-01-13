package com.ihrm.common.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinshiji
 * @date 2020/1/13 10:32
 */
@RestController
@RequestMapping("/error")
public class ErrorController {
    /**
     * 公共错误跳转
     * @return
     */
    @RequestMapping("/autherror")
    public Result authError(int code){
        return code==1?new Result(ResultCode.UNAUTHENTICATED):new Result(ResultCode.UNAUTHORISE);
    }
}
