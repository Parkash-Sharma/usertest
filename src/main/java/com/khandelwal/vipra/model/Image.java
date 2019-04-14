package com.khandelwal.vipra.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profileImage")
public class Image {
private String userId;
private String fileName;
private String fileDownloadUri;
private String fileType;
private long size;
}
