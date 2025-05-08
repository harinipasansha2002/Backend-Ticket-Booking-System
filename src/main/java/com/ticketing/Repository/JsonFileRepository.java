package com.ticketing.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonFileRepository <T>{
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String filePath;

    public JsonFileRepository(String filePath){
        this.filePath = filePath;
    }

    public List<T> read(Class<T> clazz) throws IOException{
        File file = new File(filePath);
        if (!file.exists()){
            return List.of();
        }
        return objectMapper.readValue(file, new TypeReference<>() {});
    }

    public void write(List<T> data) throws IOException{
        objectMapper.writeValue(new File(filePath), data);
    }
}