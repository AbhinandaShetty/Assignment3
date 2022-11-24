package com.example.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobile.entity.Mobile;
@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
