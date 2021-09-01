package com.zhuravishkin.springbootjpamultipledatasource.model.oracle;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OraclePK implements Serializable {
    private String phoneNumber;
    private Integer age;
}
