package villageGaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal{

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	Produit getProduit();

	void occuperEtal(Gaulois vendeur, Produit produit, int quantite);

	boolean contientProduit(String produit);

	int acheterProduit(int quantiteAcheter);

	void libererEtal();

	/**
	 * 
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'�tal est occup� [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantit� de produit � vendre au d�but du march� [4] :
	 *         quantit� de produit vendu
	 */
	String[] etatEtal();

}