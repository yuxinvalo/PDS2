package com.developer.SpringMySQL.controllers;

import com.developer.SpringMySQL.models.Tarif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class TarifController {

    @Autowired
    TarifService tarifService;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("indexTarif");
        mv.addObject("lists",tarifService.findAll());
        return mv;
    }
   @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("id") String id, @RequestParam("nom") String nom, @RequestParam("plageHoraire") String plageHoraire, @RequestParam("montant") float montant){
        ModelAndView mv = new ModelAndView("redirect:/");
        Tarif tarif;
        if(!id.isEmpty()){
            tarif =(Tarif)tarifService.findById(Integer.parseInt(id));
        } else {
            tarif = new Tarif();
        }
      
        tarif.setNom(nom);
        tarif.setPlageHoraire(plageHoraire);
        tarif.setMontant(montant);
        tarifService.save(tarif);
        return mv;
    }
    

    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists",tarifService.findById(id));
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        tarifService.delete(id);
        return mv;
    }

    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",tarifService.findById(id));
        return mv;
    }

}
