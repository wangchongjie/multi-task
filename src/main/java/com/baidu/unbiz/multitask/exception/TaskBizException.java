package com.baidu.unbiz.multitask.exception;

/**
 * 数据获取超时异常
 * 
 * @author wangchongjie
 * @fileName TaskBizException.java
 * @dateTime 2015-7-3 下午4:04:06
 */
public class TaskBizException extends RuntimeException {

    private static final long serialVersionUID = -7375423850222016116L;

    public TaskBizException(String msg) {
        super(msg);
    }

    public TaskBizException(Throwable cause) {
        super(cause);
    }

    public TaskBizException(String message, Throwable cause) {
        super(message, cause);
    }
}
