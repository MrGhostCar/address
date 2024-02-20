package com.home.address.address;

import com.home.address.address.dto.AddressResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/address")
    public AddressResponseDTO getAddressForUser(@RequestParam UUID userId) {
        return addressService.getAddressForUser(userId);
    }

}
