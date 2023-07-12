package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
    /*
    Step2 - 사용자 요청이 들어올 때마다 Thread를 새로 생성해서 사용자 요청을 처리 하도록 한다.
    Step3 - Thread Pool을 적용해 안정적인 서비스가 가능하도록 한다.
     */
}