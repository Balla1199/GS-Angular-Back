package com.test.services;

import com.test.dto.TopEntreeDTO;
import com.test.dto.TopVenduDTO;
import com.test.entities.Produit;
import com.test.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class
ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    public Optional<Produit> findById(int id) {
        return produitRepository.findById(id);
    }

    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    public void deleteById(int id) {
        produitRepository.deleteById(id);
    }

     /*public List<TopVenduDTO> getTopVendus() {
        return produitRepository.findTopVendus();
    }

    public List<TopEntreeDTO> getTopEntrees() {
        return produitRepository.findTopEntrees();
    }

   public long countProductsByEntrepotId(Long entrepotId) {
        return produitRepository.countProductsByEntrepotId(entrepotId);
    }

    public List<Produit> findProductsByEntrepotId(Long entrepotId) {
        return produitRepository.findProductsByEntrepotId(entrepotId);
    }*/
}
