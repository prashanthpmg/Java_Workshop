package com.xworkz.passportapp.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class PassportAppDetailsDto {

    //properties or Instance variables
        private int passportId;
        private String Name;
        private String EmailId;
        private long contactNumber;
        private String Nationality;
        private boolean MaritalStatus;
        private long AadhaarNumber;
        private LocalDate expDate;
        //provide the getter and setter Methods
    }


