package com.developer.SpringMySQL.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.SpringMySQL.models.Tarif;
import com.developer.SpringMySQL.models.TarifRepository;

@Service
public class TarifService {
    @Autowired
    private TarifRepository tarifRepository;

    public Object findAll(){
        return tarifRepository.findAll();
    }

    public Tarif findById(Integer id){
        return tarifRepository.findOne(id);
    }

    public Tarif save(Tarif tarif){
        return tarifRepository.save(tarif);
    }

    public void delete(int id){
    	tarifRepository.delete(id);
    	return;
    }


}