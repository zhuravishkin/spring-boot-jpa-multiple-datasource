package com.zhuravishkin.springbootjpamultipledatasource.model.oracle;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "neo_matrix", schema = "neo")
@IdClass(OnePK.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OneEntity implements Serializable {
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
