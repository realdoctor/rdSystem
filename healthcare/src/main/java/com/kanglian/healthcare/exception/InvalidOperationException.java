package com.kanglian.healthcare.exception;

import com.easyway.business.framework.common.enums.BaseResultCodeEnum;
import com.easyway.business.framework.common.exception.BaseException;

/**
 * 不正确的操作异常
 * 
 * @author liuxl
 */
public class InvalidOperationException extends BaseException {

    /**
     * 
     */
    private static final long serialVersionUID = 5413189051917512242L;

    public InvalidOperationException() {
        super(BaseResultCodeEnum.ILLEGAL_OPERATION);
    }

    public InvalidOperationException(Throwable cause) {
        super(BaseResultCodeEnum.ILLEGAL_OPERATION, cause);
    }

    public InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidOperationException(String operation) {
        super(BaseResultCodeEnum.ILLEGAL_OPERATION, "Invalid operation: " + operation);
    }
}
