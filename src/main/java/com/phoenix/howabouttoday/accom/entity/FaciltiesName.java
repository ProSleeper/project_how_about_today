package com.phoenix.howabouttoday.accom.entity;

/**
 * TV,TWOBED는 예시로 넣어놓음
 */

public enum FaciltiesName {
    TV("20인치 TV"),TWOBED("2개의 룸");

    private String krName;

    FaciltiesName(String krName) {
        this.krName = krName;
    }

    public String getKrName() {
        return krName;
    }
}
