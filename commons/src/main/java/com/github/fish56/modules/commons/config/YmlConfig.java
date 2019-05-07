package com.github.fish56.modules.commons.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YmlConfig {
    @Value("${file.path:}")
    public String filePath;
}
