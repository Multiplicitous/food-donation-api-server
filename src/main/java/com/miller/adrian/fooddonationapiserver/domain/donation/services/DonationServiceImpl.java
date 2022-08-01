package com.miller.adrian.fooddonationapiserver.domain.donation.services;

import com.miller.adrian.fooddonationapiserver.domain.donation.models.Donation;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.DonationType;
import com.miller.adrian.fooddonationapiserver.domain.donation.models.DonatorType;
import com.miller.adrian.fooddonationapiserver.domain.donation.repos.DonationRepository;

import java.util.Date;
import java.util.List;

public class DonationServiceImpl implements DonationService{
    DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Donation create(Donation donation) {
        return donationRepository.save(donation);
    }

    @Override
    public Donation getById(Long id) {
        return donationRepository.findById(long);
    }

    @Override
    public List<Donation> getAll() {
        return donationRepository.findAll();
    }

    @Override
    public List<Donation> getByEmail(String email) {
        return donationRepository.findByEmail(email);
    }

    @Override
    public List<Donation> getByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Donation> getByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<Donation> getByFullName(String fullName) {
        return null;
    }

    @Override
    public List<Donation> getByDropOffDate(Date date) {
        return null;
    }

    @Override
    public List<Donation> getByDonatorType(DonatorType donatorType) {
        return null;
    }

    @Override
    public List<Donation> getByDonationType(DonationType donationType) {
        return null;
    }
}
