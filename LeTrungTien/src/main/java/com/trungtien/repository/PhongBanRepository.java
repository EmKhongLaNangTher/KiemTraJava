package com.trungtien.repository;

import com.trungtien.model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}