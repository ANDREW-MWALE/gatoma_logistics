package com.example.Objective1api.drivers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponsePojo {
private Integer statusCode;
private Object message;
}
