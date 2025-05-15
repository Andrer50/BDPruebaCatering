package com.prueba001.apirest.MenuPackages;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

@RestController

@RequiredArgsConstructor
public class MenuPackageController {

    @Autowired
    private final MenuPackageService menuPackageService;

    @PostMapping("/menuPackage")
    @ResponseBody
    public MenuPackage createMenuPackage(@RequestBody MenuPackage menuPackage) {
        return menuPackageService.createMenuPackage(menuPackage);
    }

    @GetMapping("/menuPackage")
    @ResponseBody
    public List<MenuPackage> getMenusPackages() {
        return menuPackageService.listMenuPackage();
    }

    @DeleteMapping("/menuPackage/{id}")
    public void deleteMenuPackage(@PathVariable Long id) {
        menuPackageService.deleteMenuPackage(id);
    }

    @PutMapping("/menuPackage")
    public void uptadeMenuPackage(@RequestBody MenuPackage menuPackage) {
        menuPackageService.updateMenuPackage(menuPackage);
    }
}
