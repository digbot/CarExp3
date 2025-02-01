package com.digbot.CarExp3.service;

import com.digbot.CarExp3.data.DistanceProfile;
import com.digbot.CarExp3.data.Profile;
import com.digbot.CarExp3.helper.DynamicPropertyCopier;
import com.digbot.CarExp3.helper.IntPropertiesExtractor;
import com.digbot.CarExp3.http.response.ProfileResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class ProfileCalcImp implements ProfileCalc {

    public ProfileResponseDTO createProfileResponse(String age, String size, String distance) {
        Profile profile = new DistanceProfile(age, size, distance);

        ProfileResponseDTO responseDTO = new ProfileResponseDTO();
        DynamicPropertyCopier.copyIntProperties(profile, responseDTO);
        //profile.setSum(IntPropertiesExtractor.sumIntProperties(profile));
        responseDTO.setTotal(IntPropertiesExtractor.sumIntProperties(profile));

        return responseDTO;
    }
}
