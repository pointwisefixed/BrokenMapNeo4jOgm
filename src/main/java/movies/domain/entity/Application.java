package movies.domain.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by grosal3 on 2/8/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"movies.domain"})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);

    }
}
