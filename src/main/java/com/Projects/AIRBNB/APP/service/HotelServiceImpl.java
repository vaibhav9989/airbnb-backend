package com.Projects.AIRBNB.APP.service;

import com.Projects.AIRBNB.APP.dto.HotelDto;
import com.Projects.AIRBNB.APP.entity.Hotel;
import com.Projects.AIRBNB.APP.repositories.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService{

    private final ModelMapper modelMapper;
    private final HotelRepository hotelRepository;

    @Override
    public Hotel createNewHotel(HotelDto hotelDto) {
        return null;
    }

    @Override
    public Hotel getHotelByID(Long id) {
        return null;
    }
}
