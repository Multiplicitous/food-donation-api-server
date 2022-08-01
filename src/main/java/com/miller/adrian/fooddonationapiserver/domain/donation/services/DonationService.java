package com.miller.adrian.fooddonationapiserver.domain.donation.services;


import com.miller.adrian.fooddonationapiserver.domain.core.ResourceCreationException;
import com.miller.adrian.fooddonationapiserver.domain.core.ResourceNotFoundException;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.Donation;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.DonationType;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.DonatorType;

import java.util.Date;
import java.util.List;

public interface DonationService {
    Donation create(Donation donation) throws ResourceCreationException;
    Donation getById(Long id) throws ResourceNotFoundException;
    List<Donation> getAll();
    List<Donation> getByEmail(String email);
    List<Donation> getByLastName(String lastName);
    List<Donation> getByFirstName(String firstName);
    List<Donation> getByFullName(String fullName);
    List<Donation> getByDropOffDate(Date date);
    List<Donation> getByDonatorType(DonatorType donatorType);
    List<Donation> getByDonationType(DonationType donationType);
}
