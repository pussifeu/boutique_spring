package org.sid.eboutique;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.sid.eboutique.entities.Categorie;
import org.sid.eboutique.entities.Produit;
import org.sid.eboutique.metiers.IAdminCategoriesMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {
	ClassPathXmlApplicationContext context;
	@Before
	public void setUp() throws Exception{
		context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	}
	@Test
	public void test1() { 
		try {
			IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean("metier");
			List <Categorie> cts1 =  metier.listCategories();
			metier.ajouterCategorie(new Categorie("ordinateur", null, "description", "image1.jpeg"));
			metier.ajouterCategorie(new Categorie("impremenante", null, "description imp", "image1.jpeg"));
			List <Categorie> cts2 =  metier.listCategories();
			assertTrue(cts1.size()+2==cts2.size());
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}
	
	@Test
	public void test2() { 
		try {
			IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean("metier");
			List <Produit> prod1 =  metier.listProduits();
			metier.ajouterProduit(new Produit("HP", "HP565", 200, true, "image.jpeg", 20),1L);
			metier.ajouterProduit(new Produit("HPss", "HP565s", 200, true, "image.jpeg", 20),1L);
			List <Produit> prod2 =  metier.listProduits();
			assertTrue(prod1.size()+2==prod2.size());
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}

}
