package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetialsDto;
import com.xworkz.gymapp.service.GymMembershipService;

public interface GymMembershipRepository {


    boolean saveDto(GymMembershipDetialsDto dto);
    void readDto();
}