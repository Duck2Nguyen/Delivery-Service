package com.example.shippingapp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRespDTO implements Serializable {
    private Long id;

    private String type;

    private String status;

    private Double shipFee;

    private Double paymentTotal;

    private String note;

    private List<OrderProductRespDTO> products;

    private ShopInfoRespDTO shop;

    private Long carrierId;

    private String fromAddress;
    private String destinationAddress;
    private Double destinationLongitude;
    private Double destinationLat;


    private CustomerRespDTO customer;

    private Date createdAt;

    private Date modifiedAt;

    private Date completedAt;

    private Date timeReceiveExpected;

    private Boolean isPaid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getShipFee() {
        return shipFee;
    }

    public void setShipFee(Double shipFee) {
        this.shipFee = shipFee;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public ShopInfoRespDTO getShop() {
        return shop;
    }

    public Double getDestinationLongitude() {
        return destinationLongitude;
    }

    public Double getDestinationLat() {
        return destinationLat;
    }

    public CustomerRespDTO getCustomer() {
        return customer;
    }
}
