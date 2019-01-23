package com.shgx.rocketmq.constants;

import java.io.Serializable;

/**
 * @Description
 * @auther guangxush
 * @create 2019/1/23
 */
public interface ErrorCode extends Serializable {
    /**
     * 错误码
     * @return
     */
    String getCode();
    /**
     * 错误信息
     * @return
     */
    String getMsg();
}
