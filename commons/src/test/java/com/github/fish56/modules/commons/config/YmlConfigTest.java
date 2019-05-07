package com.github.fish56.modules.commons.config;

import com.github.fish56.modules.CommonsApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class YmlConfigTest extends CommonsApplicationTest {
    @Autowired
    private YmlConfig ymlConfig;

    @Test
    public void filePath(){
        System.out.println(ymlConfig.filePath);
    }
}