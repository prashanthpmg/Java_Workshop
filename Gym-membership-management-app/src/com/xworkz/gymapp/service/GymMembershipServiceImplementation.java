package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetialsDto;
import com.xworkz.gymapp.repository.GymMembershipRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class GymMembershipServiceImplementation implements  GymMembershipService{

    //here we need to create instance of Repository association
    private GymMembershipRepository gymMembershipRepository;




@Override
   public boolean validateDto(GymMembershipDetialsDto dto){

       if(dto!=null){
           System.out.println("dto is not null we can save the data");
            boolean saveResult = gymMembershipRepository.saveDto(dto);
            return saveResult;

       }

        return true;
    }
    public void readDto(){
    //invoke the repository method
        this.gymMembershipRepository.readDto();
    }

}
