package com.home.address.address.dto;

import java.util.UUID;

public class AddressResponseDTO {
    private UUID id;
    private String address;

    public AddressResponseDTO(UUID id, String address) {
        this.id = id;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
