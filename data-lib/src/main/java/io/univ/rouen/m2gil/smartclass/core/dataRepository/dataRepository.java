package io.univ.rouen.m2gil.smartclass.core.dataRepository;

import io.univ.rouen.m2gil.smartclass.core.data.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dataRepository extends JpaRepository<Data, Long> {

}
