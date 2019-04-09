package com.example.ukol3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Films> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        films = new ArrayList<>();
        films.add(new Films("Hellboy","Oblíbený temný hrdina Hellboy se vrací na plátna kin s plnou parádou. Pod hlavičkou ÚPVO (Úřadu paranormálního výzkumu a obrany) se vydává do Londýna, kde se probrala ze záhrobí obávaná čarodějnice Nimue. ","Akční / Fantasy / Dobrodružný / Sci-Fi",R.drawable.hellboy, "10%"));
        films.add(new Films("Blade Runner 2049", "Třicet let po událostech prvního filmu odhaluje nový Blade Runner a důstojník losangeleské policie K (Ryan Gosling) dlouho ukryté tajemství, které je natolik zásadní, že by mohlo zcela rozvrátit poslední zbytky lidské společnosti. ","Sci-Fi / Mysteriózní",R.drawable.bladerunner,"74%"));
        films.add(new Films("Šílený Max: Zběsilá cesta","Šílený Max, pronásledovaný svou pohnutou minulostí, je přesvědčen, že jediný způsob jak přežít, je vydat se na osamělou pouť. Narazí však na skupinu prchající pustinou ve vyzbrojeném obrněném vozidle, v jejímž čele stojí elitní Imperator Furiosa. ","Sci-Fi / Akční / Dobrodružný / Thriller",R.drawable.madmax,"80%"));
        films.add(new Films("Děti planety Duna","Po zvrhnutí rodu Harkonnenov vládu nad planétou Arrakis preberá rod Atreidov. Príbeh odzrkadľuje politiku, mocenské túžby a intrigy v svete, kde je najvzácnejšou látkou korenie Melanž, ktoré sa nachádza v celom vesmíre jedine na planéte Arrakis - na Dune. ", "Fantasy / Sci-Fi",R.drawable.duna,"74%"));
        films.add(new Films("Farscape", "Projekt Farscape právě vstupuje do své poslední fáze, hlavní zodpovědnost teď leží na pilotu raketoplánu Johnu Crichtonovi. Během letu se však stane něco naprosto nečekaného, před raketoplánem se otevře červí díra a Crichton i s lodí se ocitá v neznámé části vesmíru. Neznámé, ale obydlené.", "Sci-Fi / Fantasy / Dobrodružný / Drama / Akční / Komedie",R.drawable.farscape,"77%"));
        films.add(new Films("The Espanse", "Děj se odehrává za 200 let v budoucnosti, kdy lidstvo plně kolonizovalo sluneční soustavu, ale ještě nedosáhlo ke hvězdám, na pozadí vyostřujícího se konfliktu mezi Zemí, Marsem a koloniemi v Pásu asteroidů. Detektiv Miller, narozený v Pásu, dostane úkol najít nezvěstnou mladou ženu, Juliettu Andromedu Mao.","Mysteriózní / Sci-Fi",R.drawable.expanse,"81%"));
        films.add(new Films("Firefly", "Serenity je loď třídy Firefly a její kapitán se jmenuje Malcolm Reynolds, ale nikdo mu neřekne jinak než Mal, což je vlastně latinsky „špatně“, ale co na tom.", "Sci-Fi / Dobrodružný / Drama", R.drawable.firefly, "88%"));
        films.add(new Films("Avangers","Marvel Studios uvádí super hrdinský tým všech dob Avengers, ve kterém se přestaví ikoničtí super hrdinové – Iron Man, Neuvěřitelný Hulk, Thor, Captain America, Hawkeye a Black Widow.","Akční / Dobrodružný / Sci-Fi / Fantasy",R.drawable.avengers,"83%"));
        films.add(new Films("Rozpolcený", "V Kevinovi se skrývá 23 různých osob. Každou chvílí se má objevit čtyřiadvacátá... Tu pochybnou čest se s ním seznámit dostanou tři studentky, které původně vezl domů na prázdniny otec jedné z nich. Stačila chvilka a místo něj seděl za volantem podivný chlapík, který je místo vysvětlení uspal chemikálií.","Horor / Thriller / Psychologický", R.drawable.split,"77%"));
        films.add(new Films("Glass","M. Night Shyamalan uvádí zcela nový thriller inspirovaný komiksem, nazvaný Skleněný. Spojuje tak dva samostatné úspěšné filmy Vyvolený (2000) a Rozpolcený (2016).","Thriller / Drama / Sci-Fi",R.drawable.glass,"69%"));

        OurAdapter adapter=new OurAdapter(this,films);
        ListView listView=findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
