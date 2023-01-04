package com.java.study.task3_deamon_thread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setDaemon(true);
        System.out.println(thread.getName());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getId());
        System.out.println(thread.getContextClassLoader());
        System.out.println(thread.getStackTrace());
        System.out.println(thread.getUncaughtExceptionHandler());
    }
}
