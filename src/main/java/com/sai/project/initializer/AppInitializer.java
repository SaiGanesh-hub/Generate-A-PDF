package com.sai.project.initializer;

import com.sai.project.service.FileGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppInitializer implements CommandLineRunner {

    private final FileGenerator fileGenerator;

    @Override
    public void run(String... args) throws Exception {
        fileGenerator.generateFileUsingTemplate();
    }
}
