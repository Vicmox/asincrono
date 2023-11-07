package com.ufps.asincrono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class EjercicioApplication {

    //Metodo que configura el asincrono
    @Bean("threadPoolTaskExecutor")
    public TaskExecutor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2); //Define el minino de hilos para que se usaran 
        executor.setMaxPoolSize(2); //Define el maximo de hilos que se usaran
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setThreadNamePrefix("Async-");
        return executor;
    }

    public static void main(String[] args) {
        SpringApplication.run(EjercicioApplication.class, args);
    }

}
