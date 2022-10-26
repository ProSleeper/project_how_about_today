package com.phoenix.howabouttoday.room.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Builder
public class Service {

    @Id
    @GeneratedValue
    @Column
    private Long serviceNum;//서비스번호

    @Column
    private String serviceName;//서비스이름

    @Builder
    public Service(Long serviceNum, String serviceName) {
        this.serviceNum = serviceNum;
        this.serviceName = serviceName;
    }


}
