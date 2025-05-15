package com.prueba001.apirest.MenuPackages;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuPackageService {
    @Autowired
    private final MenuPackageRepository menuPackageRepo;
    //Crear Menu
    public MenuPackage createMenuPackage(MenuPackage menuPackage) {
        return menuPackageRepo.save(menuPackage);
    }
    //Obtener Todos los Menus
    public List<MenuPackage> listMenuPackage() {
        return menuPackageRepo.findAll();
    }
    //Eliminar Menu
    public void deleteMenuPackage(Long id) {
        menuPackageRepo.deleteById(id);
    }
    //Actualizar Menu
    public void updateMenuPackage(MenuPackage menuPackage) {
        menuPackageRepo.save(menuPackage);
    }


}
