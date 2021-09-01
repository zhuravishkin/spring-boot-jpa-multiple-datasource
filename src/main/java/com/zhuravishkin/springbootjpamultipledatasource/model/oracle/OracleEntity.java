package com.zhuravishkin.springbootjpamultipledatasource.model.oracle;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "john_wick")
@IdClass(OraclePK.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OracleEntity implements Serializable {
    @Id
    @Column(name = "phone_number")
    private String phoneNumber;

    @Id
    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

    @Column(name = "action")
    private String action;
}
