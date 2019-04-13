package com.galen.alert.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author shuaiys
 * @version 1.0
 * @package com.galen.alert
 * @description TODO
 * @date 2019-04-12 14:35
 */
@MapperScan("com.galen.alert.dao")
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages={"com.galen.alert"})
public class AlertApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlertApplication.class,args);
    }

}
