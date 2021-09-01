package com.zhuravishkin.springbootjpamultipledatasource.model.postgres;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PostgresPK implements Serializable {
    private String phoneNumber;
    private Integer age;
}
