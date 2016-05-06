package org.sid.eboutique.metiers;

import org.sid.eboutique.entities.Produit;

public interface IAdminProduitsMetier extends InternauteMertier	{
	public Long ajouterProduit(Produit p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
}
