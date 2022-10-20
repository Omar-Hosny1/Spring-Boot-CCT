package com.omar.spring.boot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotEmpty;
import java.util.HashMap;
import java.util.Map;

public class Photo {
    private  byte[] data;

    public void setData(byte[] data) {
        this.data = data;
    }
    @JsonIgnore
    public byte[] getData() {
        return data;
    }

    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public Photo() {
    }

    private String id;
//    @NotEmpty
    private String fileName;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return  this.id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    private  String contentType;

    public String getContentType() {
        return contentType;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
