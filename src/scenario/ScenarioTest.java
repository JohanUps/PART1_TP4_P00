package scenario;

import produit.Poisson;
import produit.Sanglier;
import villageGaulois.Etal;
import villageGaulois.IEtal;

public class ScenarioTest {

	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		IEtal<Sanglier> etalSanglier = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;

	}

}
