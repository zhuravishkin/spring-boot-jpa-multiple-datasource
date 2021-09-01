package com.zhuravishkin.springbootjpamultipledatasource.model.postgres;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "mcgregor")
@IdClass(PostgresPK.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PostgresEntity implements Serializable {
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

    @Column(name = "date_time")
    private LocalDateTime dateTime;
}
