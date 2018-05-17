package com.spay.bean;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class ExistBean implements ExitCodeGenerator {
    @Override
    public int getExitCode() {
        return 1;
    }
}
