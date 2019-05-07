package com.github.fish56.modules.commons.config;

import com.github.fish56.modules.ModulesApplication;
import com.github.fish56.modules.ModulesApplicationTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class YmlConfigTest extends ModulesApplicationTest {
    @Autowired
    private YmlConfig ymlConfig;

    @Test
    public void autowired(){
        System.out.println(ymlConfig);
        Assert.assertNotNull(ymlConfig);
        // false
    }

    @Test
    public void filePath(){
        System.out.println(ymlConfig.filePath);
    }
}
