package com.example.javaexamwebstoresportswear.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationPropertiesConfig
{
    @Value("${spring.datasource.url}")
    private String databaseUrl;
    @Value("${spring.datasource.username}")
    private String databaseUsername;
    @Value("${spring.datasource.password}")
    private String databasePassword;
    public String getDatabaseUrl()
    {
        return databaseUrl;
    }
    public String getDatabaseUsername()
    {
        return databaseUsername;
    }
    public String getDatabasePassword()
    {
        return databasePassword;
    }
}
