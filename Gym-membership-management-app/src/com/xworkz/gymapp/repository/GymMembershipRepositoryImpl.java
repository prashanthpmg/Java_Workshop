package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetialsDto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GymMembershipRepositoryImpl implements GymMembershipRepository{

    //declare the array
    private GymMembershipDetialsDto[] listDtos =new GymMembershipDetialsDto[2];
    private int index = 0;




    @Override
    public boolean saveDto(GymMembershipDetialsDto dto) {
        System.out.println("Invoking the GymMembershipRepositoryImpl()");
        System.out.println("dto is:"+dto);
        if (this.index < listDtos.length){
            listDtos[this.index] =dto;
            this.index++;

            System.out.println("saved Successfully");
            return true;
        }
        else {
            System.out.println("check array length or array is full");
        }
        return false;
    }
     // write the logic to display
    @Override
    public void readDto(){
        System.out.println(Arrays.toString(listDtos));
    }




}
