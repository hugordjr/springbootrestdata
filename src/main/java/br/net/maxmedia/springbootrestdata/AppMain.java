package br.net.maxmedia.springbootrestdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "br.net.maxmedia.springbootrestdata.model" })
@EnableJpaRepositories(basePackages = { "br.net.maxmedia.springbootrestdata.repository" })
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

}
