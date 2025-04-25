package com.xworkz.gymapp.runner;
import com.xworkz.gymapp.constant.MembershipType;
import com.xworkz.gymapp.dto.GymMembershipDetialsDto;
import com.xworkz.gymapp.repository.GymMembershipRepository;
import com.xworkz.gymapp.repository.GymMembershipRepositoryImpl;
import com.xworkz.gymapp.service.GymMembershipService;
import com.xworkz.gymapp.service.GymMembershipServiceImplementation;

import java.time.LocalDate;
import java.time.LocalTime;

public class GymMemberShipRunner {

    public static void main(String[] args) {
        GymMembershipDetialsDto dto = new GymMembershipDetialsDto();
        dto.setMemberId(1);
        dto.setMemberName("Pmg");
        dto.setContactNumber(987654321);
        dto.setMemberEmailId("prash@gmail.com");
        dto.setMembershipType(MembershipType.DAILY);
        dto.setIssuedDate(LocalDate.now());
        dto.setIssuedTime(LocalTime.now());
        dto.setExpDate(LocalDate.ofYearDay(2025,23));
        dto.setMembershipType(MembershipType.DAILY);
        dto.setExpDate(LocalDate.ofYearDay(2026,12));
        System.out.println(dto.getMemberId());
        System.out.println(dto.getMemberName());
        System.out.println(dto.getContactNumber());
        System.out.println(dto.getMemberEmailId());
        System.out.println(dto.getIssuedDate());
        System.out.println(dto.getIssuedTime());
        System.out.println(dto.getExpDate());
        System.out.println(dto.getMembershipType());

        //create instance for the repository
        GymMembershipRepository gymMembershipRepository =new GymMembershipRepositoryImpl();

        //create object //upcasting
        GymMembershipService service = new GymMembershipServiceImplementation(gymMembershipRepository);
        System.out.println("invoking");
        service.validateDto(dto);
        System.out.println("invoking");
        service.validateDto(dto);
        System.out.println("invoking");
        service.validateDto(dto);

    }
}


