
package com.developer.SpringMySQL;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.*;

import com.developer.SpringMySQL.controllers.TarifService;
import com.developer.SpringMySQL.models.Tarif;
import com.developer.SpringMySQL.models.TarifRepository;


public class TarifServiceTest2 {
	private TarifService ts;
	@InjectMocks
	private TarifRepository tr;
	
	@Test
	public void findAllTarifTest(){
		tr = mock(TarifRepository.class);
		ts = new TarifService();
		List<Tarif> lsTarifs = new ArrayList<Tarif>(){
			/**
			 * add serialUID
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Tarif("1", "2", 50));
			add(new Tarif("2", "2:00-3:00", 20));
		}};
		when(tr.findAll()).thenReturn(lsTarifs);
		List<Tarif> obj = (List<Tarif>) tr.findAll();
//		obj = (List<Tarif>) ts.findAll();
		assertTrue(obj.size() == 2);
	}
	
	@Test 
	public void findByIdTarifTest(){
		tr = mock(TarifRepository.class);
		ts = new TarifService();
		
		List<Tarif> lsTarifs = new ArrayList<Tarif>(){
			/**
			 * add serialUID
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Tarif("1", "2", 50));
			add(new Tarif("2", "2:00-3:00", 20));
		}};
		
		when(tr.findOne(anyInt())).thenReturn(lsTarifs.get(1));
		Tarif tarif = tr.findOne(2);
		assertTrue(tarif.getNom().equals("2"));
		assertTrue(tarif.getPlageHoraire().equals("2:00-3:00"));
		assertTrue(tarif.getMontant()==20);
		
	}
	
	@Test
	public void saveTarifTest(){
		tr = mock(TarifRepository.class);
		ts = new TarifService();
		Tarif tarif = new Tarif("mockname", "2:00-3:00", 30.5f);
		when(tr.save(tarif)).thenReturn(tarif);
		Tarif tarifsave = tr.save(tarif);
		assertTrue(tarifsave.getNom().equals("mockname"));
	}
	
}
