package com.prueba001.apirest.MenuPackages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuPackageRepository extends JpaRepository<MenuPackage, Long> {

}
