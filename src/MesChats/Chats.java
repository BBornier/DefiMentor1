package MesChats;

public class Chats {
		
		String sonNom;
		String saQualite;
		int sonPoids;
		int sonAge;
		

	public Chats(String pNom, String pQualite, int pPoids, int pAge) {
		
		
		sonNom = pNom;
		saQualite = pQualite;
		sonPoids = pPoids;
		sonAge = pAge;
		
}
		
	public Chats() {
		
	}
	
	public String getSonNom() { // change la valeur des paramètres de l'objet.
		return sonNom;
	}


	public String getSaQualite() {
		return saQualite;
	}


	public int getSonPoids() {
		return sonPoids;
	}


	public int getSonAge() {
		return sonAge;
	}
		
	// Ai-je vraiment besoin de la partie this. ?

	public void setSonNom(String pNom) { // recupère la valeur des paramètres de l'objet. 
		this.sonNom = pNom;
	}


	public void setSaQualite(String pQualite) {
		this.saQualite = pQualite;
	}


	public void setSonPoids(int pPoids) {
		this.sonPoids = pPoids;
	}


	public void setSonAge(int pAge) {
		this.sonAge = pAge;
	}

	/*@Override
	public String toString() {
		return "Chats [sonNom=" + sonNom + ", saQualite=" + saQualite + ", sonPoids=" + sonPoids + ", sonAge=" + sonAge
				+ "]";*/

	public static void usineChats(String numéroChat, String nom, int poids) {

	}
}
	