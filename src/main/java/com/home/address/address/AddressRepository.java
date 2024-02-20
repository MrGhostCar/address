package com.home.address.address;


import com.home.address.address.dto.AddressResponseDTO;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class AddressRepository {
    AddressResponseDTO addressTestResponseDTO = new AddressResponseDTO(UUID.randomUUID(), "testAddress");

    public AddressResponseDTO getTestAddressForUser(UUID userId) {
        return addressTestResponseDTO;
    }
}
