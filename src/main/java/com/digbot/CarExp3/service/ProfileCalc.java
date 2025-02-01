package com.digbot.CarExp3.service;
import com.digbot.CarExp3.http.response.ProfileResponseDTO;

public interface ProfileCalc {
    public ProfileResponseDTO createProfileResponse(String age,String size, String distance);
}
