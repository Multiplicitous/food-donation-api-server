package com.miller.adrian.fooddonationapiserver.domain.donation.repos;

import com.miller.adrian.fooddonationapiserver.domain.donation.models.Donation;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.DonationType;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.DonatorType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByEmail(String email);
    List<Donation> findByLastName(String lastName);
    List<Donation> findByFirstName(String firstName);
    List<Donation> findByFullName(String fullName);
    List<Donation> findByDropOfDate(Date dropOffDate);
    List<Donation> findByDonatorType(DonatorType donatorType);
    List<Donation> findByDonationType(DonationType donationType);

}
