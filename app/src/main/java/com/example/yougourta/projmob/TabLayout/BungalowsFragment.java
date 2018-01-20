package com.example.yougourta.projmob.TabLayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yougourta.projmob.Classes.Commentaire;
import com.example.yougourta.projmob.Classes.Disponibilite;
import com.example.yougourta.projmob.Classes.Logement;
import com.example.yougourta.projmob.ListeLogements.LogementsAdapter;
import com.example.yougourta.projmob.MainActivity;
import com.example.yougourta.projmob.R;

import java.util.ArrayList;

/**
 * Created by Nadji AZRI on 24/03/2017.
 */

public class BungalowsFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bungalowfragment,container,false);
        bungalows(view);
        return view;
    }

    public void bungalows(View view)
    {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;

        /** Commentaires **/
        //ArrayList de commentaires
        ArrayList<Commentaire> commentaire1 = new ArrayList<Commentaire>();
        ArrayList<Commentaire> commentaire2 = new ArrayList<Commentaire>();
        ArrayList<Commentaire> commentaire3 = new ArrayList<Commentaire>();
        ArrayList<Commentaire> commentaire4 = new ArrayList<Commentaire>();
        ArrayList<Commentaire> commentaire5 = new ArrayList<Commentaire>();
        ArrayList<Commentaire> commentaire6 = new ArrayList<Commentaire>();

        //Remplissage des commentaires
        commentaire1.add(new Commentaire(MainActivity.user1, "Appartement nul, vraiment déguelasse..."));
        commentaire1.add(new Commentaire(MainActivity.user1, "Plutôt bien situé."));
        commentaire1.add(new Commentaire(MainActivity.user3, "Dommage que ça soit un F3"));
        commentaire1.add(new Commentaire(MainActivity.user2, "Super spacieux"));
        commentaire1.add(new Commentaire(MainActivity.user2, "Juste magnifique"));

        commentaire2.add(new Commentaire(MainActivity.user3, "Appartement nul, vraiment déguelasse..."));
        commentaire2.add(new Commentaire(MainActivity.user4, "Plutôt bien situé."));
        commentaire2.add(new Commentaire(MainActivity.user2, "Dommage que ça soit un F3"));
        commentaire2.add(new Commentaire(MainActivity.user3, "Super spacieux"));
        commentaire2.add(new Commentaire(MainActivity.user4, "Juste magnifique"));

        commentaire3.add(new Commentaire(MainActivity.user1, "Appartement nul, vraiment déguelasse..."));
        commentaire3.add(new Commentaire(MainActivity.user3, "Plutôt bien situé."));
        commentaire3.add(new Commentaire(MainActivity.user2, "Dommage que ça soit un F3"));
        commentaire3.add(new Commentaire(MainActivity.user4, "Super spacieux"));
        commentaire3.add(new Commentaire(MainActivity.user3, "Juste magnifique"));

        commentaire4.add(new Commentaire(MainActivity.user1, "Appartement nul, vraiment déguelasse..."));
        commentaire4.add(new Commentaire(MainActivity.user4, "Plutôt bien situé."));
        commentaire4.add(new Commentaire(MainActivity.user4, "Dommage que ça soit un F3"));
        commentaire4.add(new Commentaire(MainActivity.user2, "Super spacieux"));
        commentaire4.add(new Commentaire(MainActivity.user3, "Juste magnifique"));

        commentaire5.add(new Commentaire(MainActivity.user3, "Appartement nul, vraiment déguelasse..."));
        commentaire5.add(new Commentaire(MainActivity.user2, "Plutôt bien situé."));
        commentaire5.add(new Commentaire(MainActivity.user1, "Dommage que ça soit un F3"));
        commentaire5.add(new Commentaire(MainActivity.user1, "Super spacieux"));
        commentaire5.add(new Commentaire(MainActivity.user2, "Juste magnifique"));

        commentaire6.add(new Commentaire(MainActivity.user4, "Appartement nul, vraiment déguelasse..."));
        commentaire6.add(new Commentaire(MainActivity.user4, "Plutôt bien situé."));
        commentaire6.add(new Commentaire(MainActivity.user4, "Dommage que ça soit un F3"));
        commentaire6.add(new Commentaire(MainActivity.user3, "Super spacieux"));
        commentaire6.add(new Commentaire(MainActivity.user2, "Juste magnifique"));

        /** IMAGES **/

        //ArrayList d'Images pour chaque appartement
        ArrayList<Integer> images1 = new ArrayList<Integer>();
        images1.add(R.drawable.ic_a);

        ArrayList<Integer> images2 = new ArrayList<Integer>();
        images2.add(R.drawable.ic_b);

        ArrayList<Integer> images3 = new ArrayList<Integer>();
        images3.add(R.drawable.ic_c);

        ArrayList<Integer> images4 = new ArrayList<Integer>();
        images4.add(R.drawable.ic_d);

        ArrayList<Integer> images5 = new ArrayList<Integer>();
        images5.add(R.drawable.ic_e);

        ArrayList<Integer> images6 = new ArrayList<Integer>();
        images6.add(R.drawable.ic_f);


        /** DISPONIBILITE **/

        //Creéation d'un ensemble de jourDispo
        Disponibilite disponibilite1 = new Disponibilite("Mardi", "15h", "16h");
        Disponibilite disponibilite2 = new Disponibilite("Samedi", "9h", "12h");
        Disponibilite disponibilite3 = new Disponibilite("Jeudi", "18h", "19h");
        Disponibilite disponibilite4 = new Disponibilite("Vendredi", "16h", "18h");

        //ArrayList de Disponibilites
        ArrayList<Disponibilite> disponibilites = new ArrayList<Disponibilite>();
        disponibilites.add(disponibilite1);
        disponibilites.add(disponibilite3);
        disponibilites.add(disponibilite4);

        /** LOGEMENTS **/

        //Création d'un ensemble de logements
        Logement logement1 = new Logement("Appartement","80, 000", "F3", "98", "2", "Ighil Ouazoug, Tizi, Bejaia, 06000", "     Appartement pour location, bonne localisation, citée calme avec un voisinage superbe." +'\n'+'\n'+"Appartement pour location, bonne localisation, citée calme avec un voisinage superbe. Il vous apportera lux et confort et plei nde bla bla bla, oui j'écris ça juste pour remplire.", 36.735160, 5.0469151, disponibilites, images1, MainActivity.user1, "3.4", commentaire1, "Libre", "13");
        Logement logement2 = new Logement("Appartement","43, 000", "F4", "221", "3", "Sidi Ahmed, Bejaia, 06000", "Appartement pour location, bonne localisation", 36.761015, 5.056305, disponibilites, images2, MainActivity.user2, "3.4", commentaire2, "Loué", "43");
        Logement logement3 = new Logement("Appartement","21, 000", "F2", "438", "1", "Aamriw, Bejaia, 06000", "Appartement pour location, bonne localisation", 36.751141, 5.0557437, disponibilites, images3, MainActivity.user3, "3.4", commentaire3, "Libre", "103");
        Logement logement4 = new Logement("Appartement","33, 000", "F4", "354", "3", "Taghzouit, Bejaia, 06000", "Appartement pour location, bonne localisation", 36.753199, 5.034329, disponibilites, images4, MainActivity.user4, "3.4", commentaire4, "Loué", "213");
        Logement logement5 = new Logement("Appartement","54, 000", "F3", "230", "2", "4 Chemins, Bejaia, 06000", "Appartement pour location, bonne localisation", 36.739379, 5.062149, disponibilites, images5, MainActivity.user2, "3.4", commentaire5, "Loué", "113");
        Logement logement6 = new Logement("Appartement","28, 000", "F3", "196", "2", "Ihaddaden 300, Bejaia, 06000", "Appartement pour location, bonne localisation", 36.741457, 5.045203, disponibilites, images6, MainActivity.user1, "3.4", commentaire6, "Libre", "413");

        //ArrayList de logements
        ArrayList<Logement> logements = new ArrayList<Logement>();
        logements.add(logement1);
        logements.add(logement2);
        logements.add(logement3);
        logements.add(logement4);
        logements.add(logement5);
        logements.add(logement6);



        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewBungalow);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        adapter = new LogementsAdapter(logements);
        recyclerView.setAdapter(adapter);
    }
}
