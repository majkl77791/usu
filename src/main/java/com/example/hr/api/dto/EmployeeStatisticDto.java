package com.example.hr.api.dto;

import java.math.BigDecimal;

public class EmployeeStatisticDto {
    private String position;
    private long count;
    private BigDecimal avgAge;

    public EmployeeStatisticDto() {
    }

    public EmployeeStatisticDto(String position, long count, BigDecimal avgAge) {
        this.position = position;
        this.count = count;
        this.avgAge = avgAge;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public BigDecimal getAvgAge() {
        return avgAge;
    }

    public void setAvgAge(BigDecimal avgAge) {
        this.avgAge = avgAge;
    }

    @Override
    public String toString() {
        return "EmployeeStatisticDto{" +
                "position='" + position + '\'' +
                ", count=" + count +
                ", avgAge=" + avgAge +
                '}';
    }
}
