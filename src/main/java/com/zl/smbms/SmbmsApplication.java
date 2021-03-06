package com.zl.smbms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.zl.smbms.mapper")
public class SmbmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmbmsApplication.class, args);
	}
}
