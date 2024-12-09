package Exo_Voyage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        TrajetSimple trajet1 = new TrajetSimple("Affaire", "Paris", "Lyon",4);
        TrajetSimple trajet2 = new TrajetSimple("Loisir", "Lyon", "Marseille",5);


        TrajetCompose voyageCompose = new TrajetCompose("Mission en France");
        voyageCompose.ajouteVoyage(trajet1);
        voyageCompose.ajouteVoyage(trajet2);

        TrajetSimple trajet3 = new TrajetSimple("Affaire", "Marseille", "Nice",2.6);
        voyageCompose.ajouteVoyage(trajet3);


        System.out.println("Lieux dans trajet1 : " + trajet1.ListeLieu());

        System.out.println("Lieux dans voyageCompose : " + voyageCompose.ListeLieu());
        double duree=voyageCompose.dureeCumulee();
        System.out.println("La duree Trajet compose  est  " +duree);
        System.out.println(trajet1.toString());

	}

}
