package com.kodefab.server.filedownloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class SpringBootFileDownloaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileDownloaderApplication.class, args);
	}

}
