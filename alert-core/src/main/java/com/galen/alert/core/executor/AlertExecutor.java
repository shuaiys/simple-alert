package com.galen.alert.core.executor;

/**
 * @author shuaiys
 * @version 1.0
 * @package com.galen.alert.core.executor
 * @description TODO
 * @date 2019-04-12 17:39
 */
public interface AlertExecutor<T> {

    void execute(T param);
}