package org.mybatis.generator.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

public class BeswarmMyBatisGeneratorTest {

    public static void main(String[] args) throws Exception{
/*        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
                File configFile = new File("G:\\workspace\\generator\\core\\mybatis-generator-core\\src\\main\\resources\\generatorConfigMyBatis3.xml");
                Configuration config = cp.parseConfiguration(configFile);
//        cp.parseConfiguration(cp.getClass().getClassLoader().getResourceAsStream("generatorConfigMyBatis3.xml"));
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);*/

     /*   List<String> warnings = new ArrayList<String>();
       ConfigurationParser cp = new ConfigurationParser(warnings);
    *//*     Configuration config = cp.parseConfiguration(this.getClass().getClassLoader().getResourceAsStream("generatorConfigMyBatis3.xml"));*//*

        File configFile = new File("G:\\workspace\\generator\\core\\mybatis-generator-core\\src\\main\\resources\\generatorConfigMyBatis3.xml");
        DefaultShellCallback shellCallback = new DefaultShellCallback(true);
        Configuration config = cp.parseConfiguration(configFile);

        try {
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
            myBatisGenerator.generate(null);
        } catch (InvalidConfigurationException e) {
            throw e;
        }*/

        BeswarmMyBatisGeneratorTest test=new BeswarmMyBatisGeneratorTest();
        test.generate();

    }

    public void generate() throws Exception{
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(this.getClass().getClassLoader().getResourceAsStream("generatorConfigMyBatis3.xml"));
            config.validate();

            DefaultShellCallback shellCallback = new DefaultShellCallback(true);

            try {
                MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
                myBatisGenerator.generate(null);
            } catch (InvalidConfigurationException e) {
                throw e;
            }
    }
}
