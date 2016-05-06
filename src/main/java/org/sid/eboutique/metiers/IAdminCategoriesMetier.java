package org.sid.eboutique.metiers;

import org.sid.eboutique.entities.Categorie;
import org.sid.eboutique.entities.Role;
import org.sid.eboutique.entities.User;

public interface IAdminCategoriesMetier extends IAdminProduitsMetier{
	public Long ajouterCategorie(Categorie c);
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser(User u);
	public void attribuerRole(Role r, Long userID);
}
