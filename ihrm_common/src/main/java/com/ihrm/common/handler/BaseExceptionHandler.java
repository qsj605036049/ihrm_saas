package com.ihrm.common.handler;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.common.exception.CommonException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qinshiji
 * @date 2020/1/9 18:08
 */
@ControllerAdvice
public class BaseExceptionHandler {
    /**
     * 统一处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public Result error(CommonException e){
        return new Result(e.getResultCode());
    }

    /**
     * 统一处理系统异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return new Result(ResultCode.SERVER_ERROR);
    }

}
