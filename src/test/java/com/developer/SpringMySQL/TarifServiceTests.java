package com.developer.SpringMySQL;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.developer.SpringMySQL.controllers.TarifService;
import com.developer.SpringMySQL.models.Tarif;
import com.developer.SpringMySQL.models.TarifRepository;

import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class TarifServiceTests {
	@Tested TarifService tarifServ;
	@Injectable TarifRepository respo;
	
	@Test
	public void findAllTarifTest(){
		new NonStrictExpectations() {
			{
				respo.findAll();
				List<Tarif> lsTarifs = new ArrayList<Tarif>(){
					/**
					 * add serialUID
					 */
					private static final long serialVersionUID = 1L;

				{
					add(new Tarif("1", "2", 50));
					add(new Tarif("2", "2:00-3:00", 20));
				}};
				result = lsTarifs;
			}
		};
		@SuppressWarnings("unchecked")
		List<Tarif> obj = (List<Tarif>) tarifServ.findAll();
		assertTrue(obj.size()==2);
	}
	
	@Test 
	public void findByIdTarifTest(){
		new NonStrictExpectations() {
			{
				respo.findOne(anyInt);
				result = new Tarif("mockname", "2:00-3:00", 30.5f);
			}
		};
		Tarif tarif = tarifServ.findById(22);
		assertTrue(tarif.getNom().equals("mockname"));
		assertTrue(tarif.getPlageHoraire().equals("2:00-3:00"));
		assertTrue(tarif.getMontant()==30.5f);
	}
	
	@Test
	public void saveTarifTest(){
		Tarif tarif = new Tarif("mockname", "2:00-3:00", 30.5f);
		new NonStrictExpectations(tarif) {
			{
				
				respo.save(tarif);
				result = tarif;
			}
		};
		Tarif tarifSave = tarifServ.save(tarif);
		assertTrue(tarifSave.getNom().equals("mockname"));
		assertTrue(tarifSave.getPlageHoraire().equals("2:00-3:00"));
		assertTrue(tarifSave.getMontant()==30.5f);
	}
	
	
	@Test 
	public void deleteTarifTest(){
		new NonStrictExpectations() {
			{
				respo.delete(anyInt);
				result = null;
			}
		};
		tarifServ.delete(2);
		
		new Verifications() {
			{
				respo.delete(2);
				times = 1;
			}
		};
	}
}
