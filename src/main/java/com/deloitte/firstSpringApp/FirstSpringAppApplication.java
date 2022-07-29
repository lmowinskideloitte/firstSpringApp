package com.deloitte.firstSpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FirstSpringAppApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(FirstSpringAppApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APP");
        SpringApplication.run(FirstSpringAppApplication.class, args);
        LOG.info("APP FINISHED");
    }

    @Override
    public void run(String... args) {
        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
        printInput();
    }

    private void printInput() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("type your word: ");
        LOG.info(scanner.next());
    }
}
