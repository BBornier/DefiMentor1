package MesChats;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("- OYEZ OYEZ, LES PETITS CHATS SONT PARMI NOUS (par minous, vous l'avez xD ?) !!! -");
		System.out.println("----------------------------------------------------------------------------------");
		
		
		Chats minou1 = new Chats("","caract�riel mais sait �tre c�lin.", 5, 6);  
		Chats minou2 = new Chats("Nero", "la mignonitude incarn�e, ma femme peut aller se rhabiller !", 4, 4);
		Chats minou3 = new Chats("Nitro", "plus rapide que la fus�e SpaceX !!!", 2, 1);
		Chats minou4 = new Chats("Pixel", "curieux, il est attir� par mes cours de JAVA.", 3, 2);
		Chats minou5 = new Chats("Rodouxdoux", "le MainCoon le plus moelleux et le plus �pais.", 20, 10);
		Chats minou6 = new Chats();
		
		// nouveaux chats pour l'usineChat() ? :
		Chats minou7 = new Chats();
		Chats minou8 = new Chats();
		Chats minou9 = new Chats();
		Chats minou10 = new Chats();
		Chats minou11 = new Chats();
		
		// g�n�rer un nb al�atoire entre 0 et 110kg :
		int n = (int)(Math.random() * 111);
		System.out.println(n);
		
		// g�n�rer un nb al�atoire avec m�thode Random.nextInt tjs de 0 � 110kg :
		Random r = new Random();
		int n2 = r.nextInt(111);
		System.out.println(n2);
		
		// g�n�rer un nombre al�atoire en choisissant la plage (ici de 1 � 110kg) : 
		
		int minPoids = 1;
		int maxPoids = 110;
		Random poidsChats = new Random();
		int poidsRandom = poidsChats.nextInt(maxPoids + minPoids) + minPoids;
		System.out.println(poidsRandom);
		
		
		
		/*minou6.setSonAge(4);
		minou4.setSonAge(1);
		minou6.setSonNom("Ripley");
		System.out.println(minou4.toString());*/
		
		// comment faire la liste des chats � partir de l'instanciation ci-dessus :  cf For ou For Each. 
		// syntaxe pour faire de l'it�ration. 2 conditions pour nom et age. 
		
		List<Chats> listChats = new ArrayList<Chats>();
		listChats.add(minou1);
		listChats.add(minou2);
		listChats.add(minou3);
		listChats.add(minou4);
		listChats.add(minou5);
		listChats.add(minou6);
		for(Chats chat : listChats) { // d�claration de la boucle for...each. Pour pouvoir utiliser la List/Arraylist ! C'est comme l'instanciation d'un objet.
	         //System.out.println(listeDeChats);
			if (chat.getSonNom() == null || chat.getSonAge() > 5 ) { // Les conditions doivent �tre TOUTES true avec &&. 
				System.out.println("");
			} else if (chat.getSonNom() == "" && chat.getSonAge() < 5) {
				System.out.println("");
			} else {
				System.out.println(chat.getSonNom() +" est " + chat.getSaQualite()+ " Il p�se "+chat.getSonPoids() +"kg et est �g� de "+chat.getSonAge()+"ans.");
				
	      }		
	   }
		
		/*for(Chats chat : listChats) {
			chat.setSonAge(chat.getSonAge()+2);
			System.out.println(chat.toString()); // on vient r�cup�rer l'�ge et on rajoute 2.*/ 
		
		// Utilisation de la m�thode usineChats() :
		
		minou7.usineChats("Chat n�1", "Ripley", poidsRandom);
		minou8.usineChats("Chat n�2", "Nero", poidsRandom);
		minou9.usineChats("Chat n�3", "Nitro", poidsRandom);
		minou10.usineChats("Chat n�4", "Pixel", poidsRandom);
		minou11.usineChats("Chat n�5", "Rodouxdoux", poidsRandom);
		
		
		
	} 
}
	

		
		
	
