package com.ihrm.common.exception;

import com.ihrm.common.entity.ResultCode;
import lombok.*;

/**
 * 自定义异常
 * @author qinshiji
 * @date 2020/1/9 18:02
 */
@Getter
@Setter
@AllArgsConstructor
public class CommonException extends RuntimeException {
    /**
     * 自定义异常返回结果
     */
    private ResultCode resultCode;
}
