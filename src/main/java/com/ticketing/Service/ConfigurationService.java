package com.ticketing.Service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ticketing.Model.Configuration;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ConfigurationService {
    private final String filePath = "configuration.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void saveConfiguration(Configuration config) throws IOException{
        objectMapper.writeValue(new File(filePath), config);
    }

    public Configuration getConfiguration() throws IOException{
        File file = new File(filePath);
        if(!file.exists()){
            return new Configuration();
        }
        return objectMapper.readValue(file, Configuration.class);
    }
}