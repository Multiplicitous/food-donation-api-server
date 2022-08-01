package com.miller.adrian.fooddonationapiserver.domain.donation.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Slf4j
@RequiredArgsConstructor
@ToString
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String fullName;
    @NonNull
    private String email;
    @NonNull
    private Integer quantity;
    @NonNull
    private DonatorType donatorType;
    @NonNull
    private DonationType donationType;

    @Temporal(TemporalType.DATE)
    private Date dropOffDate;

    @PrePersist
    public void onCreate() {
        fullName = firstName + " " + lastName;
        dropOffDate = new Date();
    }

    public String receipt() {
        return (fullName + " donated " + quantity + " of " + " on " + donationType);
    }
}
