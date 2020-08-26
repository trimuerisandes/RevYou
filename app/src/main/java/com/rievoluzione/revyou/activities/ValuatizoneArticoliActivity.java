package com.rievoluzione.revyou.activities;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rievoluzione.revyou.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ValuatizoneArticoliActivity extends AppCompatActivity {


    @BindView(R.id.txt_valutazione)
    TextView m_valutazione;
    @BindView(R.id.txt_valutazione_2)
    TextView m_valutazione_2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_valutazione_articoli);
        ButterKnife.bind(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            m_valutazione.setText(Html.fromHtml("Il Metodo RevYou <br> \n" +
                    "Perchè abbiamo scelto questo metodo?\n" +
                    "Ogni professionista sanitario deve responsabilmente pesare le evidenze e le prove di efficacia disponibili in letteratura prima di applicarle nella pratica clinica quotidiana. L’assunzione di una decisione dovrebbe passare sempre attraverso una valutazione bilanciata tra i punti di forza e le criticità dell’articolo scientifico considerato. Questa valutazione (critical appraisal) è un’attività complessa che richiede specifiche competenze ed una quantità di tempo difficilmente compatibile con la pratica professionale. <br><br>\n" +
                    "\n" +
                    "Il processo sequenziale richiesto, con l’obiettivo di valutare metodologia, rilevanza ed applicabilità della ricerca pubblicata, passa idealmente da tre grandi interrogativi: \n"
                    , Html.FROM_HTML_MODE_COMPACT));
            m_valutazione_2.setText(Html.fromHtml(
                            "Per fornire in maniera facile ed immediata queste informazioni, abbiamo scelto di affidarci agli strumenti del Critical Appraisal Skill Program (CASP), che da più di 25 anni di esperienza forma gli operatori sanitari. Il programma CASP offre una serie di strumenti di valutazione facili da usare per aiutare il professionista a leggere la ricerca e poter riconoscere, seppur con dei limiti, la validità e la rilevanza delle prove di efficacia, prima di utilizzarle nella propria pratica clinica. Questi strumenti sono scaricabili gratuitamente e possono essere utilizzati da chiunque sotto la Licenza Creative Commons. <br><br>\n" +
                            "\n" +
                            "Per adattare al meglio tali strumenti (checklist per revisioni sistematiche, trial randomizzati controllati, studi qualitativi, studi caso-controllo, studi diagnostici, studi di coorte, studi su regole di predizione clinica) alle necessità di ottimizzazione della produzione dei nostri contenuti, si sono rese necessarie alcune modifiche, senza alterare la natura e lo scopo finale della valutazione metodologica.<br><br>\n" +
                            "\n" +
                            "Siamo consapevoli che attualmente l’attribuzione di un punteggio numerico non esprime del tutto la qualità metodologica degli studi considerati e che i processi di valutazione sistematica sono in continua e rapida evoluzione. Tuttavia, gli strumenti CASP si sono rivelati per il progetto RevYou un compromesso ideale tra la necessità di non trascurare gli aspetti metodologici e, allo stesso tempo, garantire un approccio concreto, pragmatico ed immediato nella lettura di un articolo scientifico.<br><br>\n" +
                            "\n" +
                            "Infine, per la valutazione di Linee Guida (non considerate nelle CASP checklist), è stato adottato lo strumento AGREE II (Appraisal of Guidelines for Research & Evaluation), nuova versione dello strumento AGREE nato nel 2001, pubblicato dal Next Step Consortium e divenuto negli anni riferimento internazionale per valutare questo particolare disegno di studio. La traduzione ufficiale di questo strumento è stata realizzata dalla Fondazione GIMBE (Traduzioni ufficiali GIMBE).<br><br>\n" +
                            "\n" +
                            "Il risultato ottenuto dalla compilazione puntuale da parte del nostro team di fisioterapisti si traduce quindi in un punteggio di credibilità, tradotto graficamente attraverso una scala a gradiente di colore. Proprio per fornire spunti tangibili da trasferire nella professione, la valutazione della credibilità è stata affiancata da un secondo punteggio di praticità.<br><br>\n" +
                            "\n" +
                            "Tale assegnazione deriva dal giudizio personale di chi elabora gli approfondimenti, espresso in una scala da 0 a 5 creata ad hoc.<br>\n" +
                            "Il nostro metodo di recensione è visibile per ciascun approfondimento quotidiano.\n"
                    , Html.FROM_HTML_MODE_COMPACT));
        } else {
            m_valutazione.setText(Html.fromHtml("Il Metodo RevYou <br> \n" +
                    "Perchè abbiamo scelto questo metodo?\n" +
                    "Ogni professionista sanitario deve responsabilmente pesare le evidenze e le prove di efficacia disponibili in letteratura prima di applicarle nella pratica clinica quotidiana. L’assunzione di una decisione dovrebbe passare sempre attraverso una valutazione bilanciata tra i punti di forza e le criticità dell’articolo scientifico considerato. Questa valutazione (critical appraisal) è un’attività complessa che richiede specifiche competenze ed una quantità di tempo difficilmente compatibile con la pratica professionale. <br><br>\n" +
                    "\n" +
                    "Il processo sequenziale richiesto, con l’obiettivo di valutare metodologia, rilevanza ed applicabilità della ricerca pubblicata, passa idealmente da tre grandi interrogativi:\n"));
            m_valutazione_2.setText(Html.fromHtml(
                    "Per fornire in maniera facile ed immediata queste informazioni, abbiamo scelto di affidarci agli strumenti del Critical Appraisal Skill Program (CASP), che da più di 25 anni di esperienza forma gli operatori sanitari. Il programma CASP offre una serie di strumenti di valutazione facili da usare per aiutare il professionista a leggere la ricerca e poter riconoscere, seppur con dei limiti, la validità e la rilevanza delle prove di efficacia, prima di utilizzarle nella propria pratica clinica. Questi strumenti sono scaricabili gratuitamente e possono essere utilizzati da chiunque sotto la Licenza Creative Commons. <br><br>\n" +
                            "\n" +
                            "Per adattare al meglio tali strumenti (checklist per revisioni sistematiche, trial randomizzati controllati, studi qualitativi, studi caso-controllo, studi diagnostici, studi di coorte, studi su regole di predizione clinica) alle necessità di ottimizzazione della produzione dei nostri contenuti, si sono rese necessarie alcune modifiche, senza alterare la natura e lo scopo finale della valutazione metodologica.<br><br>\n" +
                            "\n" +
                            "Siamo consapevoli che attualmente l’attribuzione di un punteggio numerico non esprime del tutto la qualità metodologica degli studi considerati e che i processi di valutazione sistematica sono in continua e rapida evoluzione. Tuttavia, gli strumenti CASP si sono rivelati per il progetto RevYou un compromesso ideale tra la necessità di non trascurare gli aspetti metodologici e, allo stesso tempo, garantire un approccio concreto, pragmatico ed immediato nella lettura di un articolo scientifico.<br><br>\n" +
                            "\n" +
                            "Infine, per la valutazione di Linee Guida (non considerate nelle CASP checklist), è stato adottato lo strumento AGREE II (Appraisal of Guidelines for Research & Evaluation), nuova versione dello strumento AGREE nato nel 2001, pubblicato dal Next Step Consortium e divenuto negli anni riferimento internazionale per valutare questo particolare disegno di studio. La traduzione ufficiale di questo strumento è stata realizzata dalla Fondazione GIMBE (Traduzioni ufficiali GIMBE).<br><br>\n" +
                            "\n" +
                            "Il risultato ottenuto dalla compilazione puntuale da parte del nostro team di fisioterapisti si traduce quindi in un punteggio di credibilità, tradotto graficamente attraverso una scala a gradiente di colore. Proprio per fornire spunti tangibili da trasferire nella professione, la valutazione della credibilità è stata affiancata da un secondo punteggio di praticità.<br><br>\n" +
                            "\n" +
                            "Tale assegnazione deriva dal giudizio personale di chi elabora gli approfondimenti, espresso in una scala da 0 a 5 creata ad hoc.<br>\n" +
                            "Il nostro metodo di recensione è visibile per ciascun approfondimento quotidiano.\n"));
        }
    }

    @OnClick(R.id.btn_back) void back(){
        onBackPressed();
    }
}
