package com.example.patronproxy;

import com.example.patronproxy.clases.IService;
import com.example.patronproxy.clases.ServiceImpl;
import com.example.patronproxy.clases.ServiceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronProxyApplication.class, args);

        ServiceImpl service = new ServiceImpl();
        ServiceProxy proxy = new ServiceProxy(service);

        proxy.doSomeThing();
    }

}
