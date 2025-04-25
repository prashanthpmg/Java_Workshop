package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetialsDto;

public interface GymMembershipService {

    public abstract boolean validateDto(GymMembershipDetialsDto dto);
  // read method
    void readDto();
}
