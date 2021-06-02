package MesChats;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("- OYEZ OYEZ, LES PETITS CHATS SONT PARMI NOUS (par minous, vous l'avez xD ?) !!! -");
		System.out.println("----------------------------------------------------------------------------------");
		
		
		Chats minou1 = new Chats("","caractériel mais sait être câlin.", 5, 6);  
		Chats minou2 = new Chats("Nero", "la mignonitude incarnée, ma femme peut aller se rhabiller !", 4, 4);
		Chats minou3 = new Chats("Nitro", "plus rapide que la fusée SpaceX !!!", 2, 1);
		Chats minou4 = new Chats("Pixel", "curieux, il est attiré par mes cours de JAVA.", 3, 2);
		Chats minou5 = new Chats("Rodouxdoux", "le MainCoon le plus moelleux et le plus épais.", 20, 10);
		Chats minou6 = new Chats();
		
		// nouveaux chats pour l'usineChat() ? :
		Chats minou7 = new Chats();
		Chats minou8 = new Chats();
		Chats minou9 = new Chats();
		Chats minou10 = new Chats();
		Chats minou11 = new Chats();
		
		// générer un nb aléatoire entre 0 et 110kg :
		int n = (int)(Math.random() * 111);
		System.out.println(n);
		
		// générer un nb aléatoire avec méthode Random.nextInt tjs de 0 à 110kg :
		Random r = new Random();
		int n2 = r.nextInt(111);
		System.out.println(n2);
		
		// générer un nombre aléatoire en choisissant la plage (ici de 1 à 110kg) : 
		
		int minPoids = 1;
		int maxPoids = 110;
		Random poidsChats = new Random();
		int poidsRandom = poidsChats.nextInt(maxPoids + minPoids) + minPoids;
		System.out.println(poidsRandom);
		
		
		
		/*minou6.setSonAge(4);
		minou4.setSonAge(1);
		minou6.setSonNom("Ripley");
		System.out.println(minou4.toString());*/
		
		// comment faire la liste des chats à partir de l'instanciation ci-dessus :  cf For ou For Each. 
		// syntaxe pour faire de l'itération. 2 conditions pour nom et age. 
		
		List<Chats> listChats = new ArrayList<Chats>();
		listChats.add(minou1);
		listChats.add(minou2);
		listChats.add(minou3);
		listChats.add(minou4);
		listChats.add(minou5);
		listChats.add(minou6);
		for(Chats chat : listChats) { // déclaration de la boucle for...each. Pour pouvoir utiliser la List/Arraylist ! C'est comme l'instanciation d'un objet.
	         //System.out.println(listeDeChats);
			if (chat.getSonNom() == null || chat.getSonAge() > 5 ) { // Les conditions doivent être TOUTES true avec &&. 
				System.out.println("");
			} else if (chat.getSonNom() == "" && chat.getSonAge() < 5) {
				System.out.println("");
			} else {
				System.out.println(chat.getSonNom() +" est " + chat.getSaQualite()+ " Il pèse "+chat.getSonPoids() +"kg et est âgé de "+chat.getSonAge()+"ans.");
				
	      }		
	   }
		
		/*for(Chats chat : listChats) {
			chat.setSonAge(chat.getSonAge()+2);
			System.out.println(chat.toString()); // on vient récupérer l'âge et on rajoute 2.*/ 
		
		// Utilisation de la méthode usineChats() :
		
		minou7.usineChats("Chat n°1", "Ripley", poidsRandom);
		minou8.usineChats("Chat n°2", "Nero", poidsRandom);
		minou9.usineChats("Chat n°3", "Nitro", poidsRandom);
		minou10.usineChats("Chat n°4", "Pixel", poidsRandom);
		minou11.usineChats("Chat n°5", "Rodouxdoux", poidsRandom);
		
		
		
	} 
}
	

		
		
	
