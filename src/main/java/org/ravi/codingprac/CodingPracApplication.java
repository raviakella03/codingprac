package org.ravi.codingprac;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.utils.SetSpringBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class CodingPracApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CodingPracApplication.class, args);

		if (System.getProperty("java.version").substring(0,3).equals("1.8") ) {

			SpringApplication springApplication = new SpringApplication(CodingPracApplication.class);
			springApplication.setBanner(new SetSpringBanner());
			springApplication.run(args);
			log.info("Inside Spring application for coding practice.");
			/*log.info(System.getProperty("java.version"));
			log.info(System.getProperty("java.specification.version"));
			log.info(System.getProperty("java.vm.specification.version"));
			log.info(System.getProperty("java.vm.version"));
			log.info(System.getProperty("os.name"));
			log.info(System.getProperty("os.arch"));
			log.info(System.getProperty("os.version"));
			log.info(System.getProperty("user.name"));
			log.info(System.getProperty("user.home"));
			log.info(System.getProperty("user.dir"));*/
		} else {
			log.error("Java version used(" + System.getProperty("java.version").substring(0,3) + ") is not 1.8");
		}
	}
}