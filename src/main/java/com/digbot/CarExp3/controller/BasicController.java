package com.digbot.CarExp3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.digbot.CarExp3.http.response.ProfileResponseDTO;
import com.digbot.CarExp3.http.response.MenuResponseDTO;
import  com.digbot.CarExp3.http.request.ProfileRequestDTO;
import com.digbot.CarExp3.data.Profile;
import com.digbot.CarExp3.data.DistanceProfile;

import com.digbot.CarExp3.helper.IntPropertiesExtractor;
import com.digbot.CarExp3.helper.DynamicPropertyCopier;

import com.digbot.CarExp3.constant.Size;

@RestController
@RequestMapping()//"/api/v1"
public class BasicController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public ProfileResponseDTO getProfile(@RequestBody ProfileRequestDTO requestDTO) {
        String age = requestDTO.getAge().toUpperCase();
        String size = requestDTO.getSize().toUpperCase();
        String distance = requestDTO.getDistance().toUpperCase();

        Profile profile = new DistanceProfile(age, size, distance);

        ProfileResponseDTO responseDTO = new ProfileResponseDTO();
        DynamicPropertyCopier.copyIntProperties(profile, responseDTO);
        responseDTO.setTotal(IntPropertiesExtractor.sumIntProperties(profile));
        return responseDTO;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/menu" , produces = "application/json")
    public MenuResponseDTO getMenu() {
        return new MenuResponseDTO();
    }
}