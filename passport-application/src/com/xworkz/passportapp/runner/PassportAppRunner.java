package com.xworkz.passportapp.runner;

import com.xworkz.passportapp.dto.PassportAppDetailsDto;

import java.time.LocalDate;

public class PassportAppRunner {
    public static void main(String[] args) {
        PassportAppDetailsDto dto = new PassportAppDetailsDto();
        dto.setName("bharath");
        dto.setPassportId(22);
        dto.setEmailId("bharath@gmail.com");
        dto.setContactNumber(987654321);
        dto.setNationality("Indian");
        dto.setAadhaarNumber(654368);
        dto.setExpDate(LocalDate.ofYearDay(2025,15));
        dto.setExpDate(LocalDate.ofYearDay(2027,12));
        System.out.println(dto.getPassportId());
        System.out.println(dto.getName());
        System.out.println(dto.getAadhaarNumber());
        System.out.println(dto.getEmailId());
        System.out.println(dto.getContactNumber());
        System.out.println(dto.getNationality());
        System.out.println(dto.getExpDate());


    }

}



