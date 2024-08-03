package com.digbot.CarExp3.http.response;

import com.digbot.CarExp3.constant.Age;
import com.digbot.CarExp3.constant.Distance;
import com.digbot.CarExp3.constant.Size;
import java.util.ArrayList;

public class MenuResponseDTO {

    public ArrayList<String> age = new ArrayList<String>();
    public ArrayList<String> size = new ArrayList<String>();
    public ArrayList<String> distance = new ArrayList<String>();

    public MenuResponseDTO() {

        age.add(Age.OLD);
        age.add(Age.FRESH);
        age.add(Age.NEW);

        size.add(Size.SMALL);
        size.add(Size.MIDDLE);
        size.add(Size.BIG);

        distance.add(Distance.LOW);
        distance.add(Distance.MIDDLE);
        distance.add(Distance.LONG);

    }
}
