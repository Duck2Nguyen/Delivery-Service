package com.example.shippingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CarrierRespDTO {
    private Long id;

    private Long accountId;

    private String name;

    private Double longitudeNewest;

    private Double latitudeNewest;

    private String phoneNumber;

    private boolean active;

    private boolean available;

    private String pathAvatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitudeNewest() {
        return longitudeNewest;
    }

    public void setLongitudeNewest(Double longitudeNewest) {
        this.longitudeNewest = longitudeNewest;
    }

    public Double getLatitudeNewest() {
        return latitudeNewest;
    }

    public void setLatitudeNewest(Double latitudeNewest) {
        this.latitudeNewest = latitudeNewest;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
