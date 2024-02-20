package com.home.address.address;

import com.home.address.address.dto.AddressResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressResponseDTO getAddressForUser(UUID userId) {
        return addressRepository.getTestAddressForUser(userId);
    }
}
