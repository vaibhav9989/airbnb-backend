package com.Projects.AIRBNB.APP.service;

import com.Projects.AIRBNB.APP.dto.HotelDto;
import com.Projects.AIRBNB.APP.entity.Hotel;

public interface HotelService {
    Hotel createNewHotel(HotelDto hotelDto);
    Hotel getHotelByID(Long id);
}
