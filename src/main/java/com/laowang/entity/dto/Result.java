package com.laowang.entity.dto;

import lombok.Data;

@Data
public class Result <T> {
    // 本次请求的状态码， 200表示成功
    private int code;
    // 请求结果详情
    private String msg;
    // 返回结果集
    private T data;
}
