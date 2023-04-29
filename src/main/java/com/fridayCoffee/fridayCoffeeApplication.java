package com.fridayCoffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class fridayCoffeeApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(fridayCoffeeApplication.class, args);

//        System.out.println("//////////////////////////////////////////////");
//        System.out.println("my pid is " + ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
//        System.out.println("//////////////////////////////////////////////");
//
//        // 자식 프로세스를 실행할 명령어와 인자를 지정
//        ProcessBuilder pb = new ProcessBuilder("command", "arg1", "arg2");
//
//        // 작업 디렉토리를 설정할 수 있다
//        pb.directory(new File("/path/to/directory"));
//
//        // 환경 변수를 설정할 수 있다
//        Map<String, String> env = pb.environment();
//        env.put("KEY1", "VALUE1");
//        env.put("KEY2", "VALUE2");
//
//        // 자식 프로세스를 실행
//        Process process = pb.start();
//
//        // 자식 프로세스의 입력, 출력, 에러 스트림을 다룰 수 있다
//        InputStream inputStream = process.getInputStream();
//        OutputStream outputStream = process.getOutputStream();
//        InputStream errorStream = process.getErrorStream();
//
//        // 자식 프로세스의 상태 코드를 얻을 수 있다
//        int exitCode = process.waitFor();
//
//        System.out.println("자식 프로세스 종료 코드 : " + exitCode);
    }

}
