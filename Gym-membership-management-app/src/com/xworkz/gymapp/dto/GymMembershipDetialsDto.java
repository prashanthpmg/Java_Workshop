package com.xworkz.gymapp.dto;
import lombok.Getter;
import lombok.Setter;
import com.xworkz.gymapp.constant.MembershipType;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter

public class GymMembershipDetialsDto {

    //properties or Instance variables
    private int memberId;
    private String memberName;
    private String memberEmailId;
    private long contactNumber;
    private LocalDate issuedDate;
    private LocalTime issuedTime;
    private LocalDate expDate;
    private MembershipType membershipType;

    //provide the getter and setter Methods




}
