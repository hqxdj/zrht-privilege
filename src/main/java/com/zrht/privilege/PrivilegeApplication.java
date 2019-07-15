package com.zrht.privilege;

import com.cloud.common.annotation.SpringCloudWebApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

@SpringCloudWebApplication
@MapperScan("com.zrht.privilege.dao")
public class PrivilegeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivilegeApplication.class, args);
	}

}
