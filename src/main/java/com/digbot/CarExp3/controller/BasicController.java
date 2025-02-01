package com.digbot.CarExp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.digbot.CarExp3.http.response.ProfileResponseDTO;
import com.digbot.CarExp3.http.response.MenuResponseDTO;
import com.digbot.CarExp3.http.request.ProfileRequestDTO;
import com.digbot.CarExp3.data.Profile;
import com.digbot.CarExp3.data.DistanceProfile;
import com.digbot.CarExp3.helper.IntPropertiesExtractor;
import com.digbot.CarExp3.helper.DynamicPropertyCopier;
import com.digbot.CarExp3.service.ProfileCalc;

@RestController
@RequestMapping()//"/api/v1"
public class BasicController {

    private final ProfileCalc profileCalc;

    public BasicController(@Autowired ProfileCalc photoService) {
        this.profileCalc = photoService;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public ProfileResponseDTO getProfile(@RequestBody ProfileRequestDTO requestDTO) {
        String age = requestDTO.getAge().toUpperCase();
        String size = requestDTO.getSize().toUpperCase();
        String distance = requestDTO.getDistance().toUpperCase();

        return this.profileCalc.createProfileResponse(age, size, distance);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/menu" , produces = "application/json")
    public MenuResponseDTO getMenu() {
        return new MenuResponseDTO();
    }
}