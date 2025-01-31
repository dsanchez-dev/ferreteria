package com.ferreteria.persistance.repository;

import com.ferreteria.persistance.entity.VentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface VentasRepository extends JpaRepository<VentasEntity, Integer> {

    @Query(value = "SELECT * FROM ventas_entity WHERE fecha = :fecha", nativeQuery = true)
    List<VentasEntity> findAllByFecha(@Param("fecha") LocalDateTime fecha);




}
//s<>