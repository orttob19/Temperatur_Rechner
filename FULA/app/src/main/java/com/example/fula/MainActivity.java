package com.example.fula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView tvFrage;
    private TextView tvAntwort;
    private Button btAntwort;
    private Button btNext;
    private String answerText;
    //private int questionNumber;
    Random r = new Random();

    private String questionWrite(int number){
        String returnVal = "";
        switch (number) {
            case 1:
                returnVal = "Welche Funkgespräche sind grundsätzlich verboten?";
                answerText = "Alle Funkgespräche, deren Inhalt nicht feuerwehrdienstlichen Zwecken dient.";
                break;
            case 2:
                returnVal = "Wie soll eine Funknachricht abgefasst sein?";
                answerText = "Eine Funknachricht soll unter Fortfall alles Nebensächlichen so kurz als möglich abgefasst sein.";
                break;
            case 3:
                returnVal = "Darf die Sprechtaste gedrückt werden, ohne dass ein Gespräch geführt wird?";
                answerText = "Nein.";
                break;
            case 4:
                returnVal = "Was ist ein Reihenruf?";
                answerText = "Derselbe Nachrichteninhalt wird gleichzeitig an mehrere eingesetzte Funkstellen durchgegeben, jedoch nicht an alle!";
                break;
            case 5:
                returnVal = "Was ist ein Sammelruf?";
                answerText = "Derselbe Nachrichteninhalt wird gleichzeitig an alle eingesetzten Funkstellen durchgegeben";
                break;
            case 6:
                returnVal = "Wie wird ein Irrtum bei der Durchgabe einer Nachricht richtiggestellt?";
                answerText = "Mit den Worten „Ich berichtige“.";
                break;
            case 7:
                returnVal = "Wie wird die Wiederholung einer Nachricht gefordert?";
                answerText = "Mit der Aufforderung „Wiederholen - kommen“.";
                break;
            case 8:
                returnVal = "Warum muss eine Einsatzsofortmeldung abgesetzt werden?";
                answerText = "Um die Florianstation vom Einsatz in Kenntnis zu setzen.";
                break;
            case 9:
                returnVal = "Warum ist bei der Durchgabe von Funkgesprächen in Sprechpausen die Sprechtaste freizugeben?";
                answerText = "Um anderen Funkstellen bei Gefahr im Verzug die Möglichkeit einer Funkdurchsage zu geben";
                break;
            case 10:
                returnVal = "Buchstabiere nach der in der Funkordnung vorgesehenen Buchstabiertafel das Wort ......!";
                answerText = "(ca. 10 Buchstaben)";
                break;
            case 11:
                returnVal = "Was versteht man unter Sternverkehr?";
                answerText = "Sämtliche Funkgespräche müssen über eine Leitstelle abgewickelt werden";
                break;
            case 12:
                returnVal = "Welche Funkverkehrsarten im Digitalfunk zwischen zwei Funkstellen gibt es?\n";
                answerText = "a) TMO - Netzmodus\n" +
                        "b) DMO - Direktmodus";
                break;
            case 13:
                returnVal = "Wie ist die Beurteilung der Hörbarkeit bei Digitalfunkgeräten?";
                answerText = "Sehr gut, brauchbar oder unbrauchbar.";
                break;
            case 14:
                returnVal = "Wie lautet die Regel des Funkers vor dem Gespräch?";
                answerText = "Denken, drücken, schlucken - Pieps Ton abwarten, sprechen.";
                break;
            case 15:
                returnVal = "Wenn ein Funkgespräch nicht abgesetzt werden kann, wem ist dies zu melden?";
                answerText = "Dem Einsatzleiter bzw. dem Verfasser des Funkgespräches.";
                break;
            case 16:
                returnVal = "Wie ist das Kennzeichen z.B. SO 44 ULW entsprechend der Funkordnung durchzugeben?\n";
                answerText = "„Ich buchstabiere: Siegfried, Otto, vier, nochmals vier, Ulrich, Ludwig, Wilhelm.";
                break;
            case 17:
                returnVal = "Was versteht man unter Wechselsprechverkehr?";
                answerText = "Dass man nicht gleichzeitig senden und empfangen kann. z.B. Feuerwehrfunk";
                break;
            case 18:
                returnVal = "Was versteht man unter Gegensprechverkehr?";
                answerText = "Dass man gleichzeitig senden und empfangen kann. z.B. Telefon";
                break;
            case 19:
                returnVal = "Welche Funktionen hat die Antenne eines Feuerwehrfunkgerätes zu erfüllen?";
                answerText = "Das Empfangen bzw. Ausstrahlen von hochfrequenten elektromagnetischen Wellen.";
                break;
            case 20:
                returnVal = "Welche Antennenart ist für Fahrzeugfunkgeräte geeignet";
                answerText = "Ein vertikaler Rundstrahler (z.B. Stabantenne).\n";
                break;
            case 21:
                returnVal = "Welche Statusmeldungen sind im Digitalfunk des LFV Steiermark möglich?\n";
                answerText = "3 - Zum Einsatz unterwegs\n" +
                        "5 - Sprechwunsch\n" +
                        "6 - Am Einsatzort eingetroffen\n" +
                        "9 - Fahrzeug wieder einsatzbereit";
                break;
            case 22:
                returnVal = "Was ist bei nicht vorhandener Netzverbindung eines Digital-Funkgerätes zu unternehmen? („KEIN NETZ“) ";
                answerText = "a) Standortwechsel um sich wieder in den Netzversorgungsbereich der nächsten Basisstation zu begeben.\n" +
                        "b) Umschalten auf Direktmodus (DMO) nach Anordnung der EL.";
                break;
            case 23:
                returnVal = "Wie ist das Digitalfunksystem technisch aufgebaut?";
                answerText = "Als zellularer Netzaufbau (die Funkzellen überlagern sich in den Randbereichen)";
                break;
            case 24:
                returnVal = "Wie erfolgt die Stromversorgung bei Handfunksprechgeräten?\n";
                answerText = "Durch Akkus";
                break;
            case 25:
                returnVal = "Was versteht man unter Frequenz?";
                answerText = "Die Anzahl der Schwingungen pro Sekunde. Sie wird in Hertz gemessen.";
                break;
            case 26:
                returnVal = "Was sind Funkwellen?";
                answerText = "Funkwellen sind hochfrequente elektromagnetische Wellen, die sich mit Lichtgeschwindigkeit ausbreiten.";
                break;
            case 27:
                returnVal = "Wie lautet der Rufname einer fallweise besetzten Fixstation?";
                answerText = "Feuerwehr + Ortsname";
                break;
            case 28:
                returnVal = "Aus welchen Hauptgruppen besteht ein Funkgerät?";
                answerText = "Sender, Empfänger, Antenne, Stromversorgung";
                break;
            case 29:
                returnVal = "Was ist nach dem Einschalten des Funkgerätes zu überprüfen?";
                answerText = "Ob die richtige Bereichshauptsprechgruppe eingestellt ist!";
                break;
            case 30:
                returnVal = "Welche Gefahr besteht, wenn in unmittelbarer Nähe mehrere Funkgeräte eingeschaltet sind?";
                answerText = "Gefahr der Rückkopplung";
                break;
            case 31:
                returnVal = "Was bedeutet BOS?";
                answerText = "Behörden und Organisationen mit Sicherheitsaufgaben";
                break;
            case 32:
                returnVal = "Welche Standorte sind beim Funken zu vermeiden?";
                answerText = "Stahlbauten, Hochspannungsleitungen, Tunnel, Hochwald";
                break;
            case 33:
                returnVal = "Auf welcher Sprechgruppe ist mit der Florianstation IMMER Verbindung zu halten?";
                answerText = "Die jeweilige Hauptsprechgruppe des Bereiches.";
                break;
            case 34:
                returnVal = "Was ist für die Erhaltung einer hohen Kapazitätsbereitschaft des Akkus erforderlich?";
                answerText = "Regelmäßige Lade- und Entladezyklen.";
                break;
            case 35:
                returnVal = "Nenne mindestens fünf Sprechgruppen, mit welchen jedes Funkgerät in der Steiermark ausgestattet ist! ";
                answerText = "Haupt-, Führungs-, Einsatz-, Arbeits-, Atemschutz- und Veranstaltungsgruppen, BOS, Hubschrauber, Nachbarbereiche,… (weitere möglich)";
                break;
            case 36:
                returnVal = "Was ist zu tun, wenn bei der Sirenenprobe die Sirene nicht funktioniert?";
                answerText = "Kontrolle der Stromversorgung der Sirene im Feuerwehrhaus und anschließend Meldung über Funk oder Telefon an die Florianstation.\n";
                break;
            case 37:
                returnVal = "Was hat der Funker nach einer Alarmierung zu tun?";
                answerText = "a) Sprechwunsch – Status 5 drücken\n" +
                        "b) Er holt sich Informationen über den Einsatz von der Florianstation.";
                break;
            case 38:
                returnVal = "Aufgrund wessen Anordnung muss im Einsatz auf der Sprechgruppe „Einsatz __“ gearbeitet werden?";
                answerText = "Auf Anordnung des Einsatzleiters nach Rücksprache mit der Florianstation.";
                break;
            case 39:
                returnVal = "Welche Funksysteme funktionieren in Tunnelanlagen?";
                answerText = "a) 70cm-Band-Semiduplex\n" +
                        "b) Digitalfunk";
                break;
            case 40:
                returnVal = "Wo ist die Durchführung der Funkgrundausbildung vorgesehen?";
                answerText = "Vorbereitend in der Feuerwehr und im Funkgrundlehrgang des BFV.";
                break;
            case 41:
                returnVal = "Wer ist der Bewilligungsinhaber für alle Frequenzen im BOS-Digitalfunksystem?\n";
                answerText = "Bundesministerium für Inneres (BMI)";
                break;
            case 42:
                returnVal = "Wie lautet die Einheitskurzrufnummer des FW-Notrufes?";
                answerText = "122";
                break;
            case 44:
                returnVal = "Wie erfolgt die Alarmierung einer Feuerwehr durch die Florianstation?";
                answerText = "Durch den Sirenenalarm oder über einen „Stillen Alarm“ mittels Rufempfänger. Auch beides gleichzeitig möglich.";
                break;
            case 43:
                returnVal = "Wen hat die Florianstation nach Entgegennahme der Alarmierung zu verständigen?";
                answerText = "Die örtlich zuständige Feuerwehr";
                break;
            case 45:
                returnVal = "Wofür hat der Funker im Einsatz zu sorgen?";
                answerText = "Das Funkgerät muss immer besetzt sein.";
                break;
            case 46:
                returnVal = "Welche Taste ist vor jeder Verbindungsaufnahme mit der Florianstation zu drücken?";
                answerText = "Taste 5 - Sprechwunsch";
                break;
            case 47:
                returnVal = "Wer setzt die Einsatzsofortmeldung ab?";
                answerText = "Die erstankommende Feuerwehr.";
                break;
            case 48:
                returnVal = "Mit welcher Stelle ist am Einsatzort Kontakt/Verbindung aufzunehmen?";
                answerText = "Mit der Einsatzleitung.";
                break;
            case 49:
                returnVal = "Was hat der Funker nach Einsatzende zu tun?";
                answerText = "Umschalten auf Hauptsprechgruppe und Taste 9 drücken bei KFZ-Funkgerät";
                break;
            case 50:
                returnVal = "Wie lautet das Feuerwehr-Alarmsignal?";
                answerText = "15 Sekunden Sirenenton, 7 Sekunden Pause, 15 Sekunden Sirenenton, 7 Sekunden Pause, 15 Sekunden Sirenenton\n";
                break;
            case 51:
                returnVal = "Was sagt das Feuerwehr-Alarmsignal aus und was haben die Feuerwehrleute dabei zu tun?";
                answerText = "Einsatz für die Feuerwehr, Feuerwehrhaus besetzen, Funkgerät in Betrieb nehmen und bei Florian Alarmmeldung abfragen.";
                break;
            case 52:
                returnVal = "Wie lauten die Warn- und Alarmsignale für den Zivilschutzfall?";
                answerText = "Warnung: 3 Minuten gleichbleibender Dauerton\n" +
                        "Alarm: 1Minute auf und abschwellender Heulton\n" +
                        "Entwarnung: 1 Minute gleichbleibender Dauerton";
                break;
            case 53:
                returnVal = "An wen muss der Verlust, Diebstahl oder das Ausscheiden der Digitalfunkgeräte unverzüglich gemeldet werden?";
                answerText = "An die Landesleitzentrale „Florian Steiermark“";
                break;
            case 54:
                returnVal = "Was versteht man allgemein unter einer Landkarte?";
                answerText = "Das verkleinerte Abbild eines Teiles der Erdoberfläche.";
                break;
            case 55:
                returnVal = "Was besagt die Angabe des Maßstabes 1:50.000?";
                answerText = "1 cm auf der Karte entspricht 500m, in der Wirklichkeit.";
                break;
            case 56:
                returnVal = "Welche Gradeinteilung wird beim Kompass üblicherweise verwendet?";
                answerText = "Die Unterteilung eines Kreises in 360 Grade.";
                break;
            case 57:
                returnVal = "Was bedeutet das Einnorden einer Karte?";
                answerText = "Die Karte mittels des Kompasses in jene Lage zu bringen, die der Wirklichkeit entspricht.";
                break;
            case 58:
                returnVal = "Was gibt die Zahl bei Ortsnamen an?";
                answerText = "Höhe des Ortes über dem Meeresspiegel.";
                break;
            case 59:
                returnVal = "Welche Himmelsrichtung befindet sich am oberen Kartenrand?";
                answerText = "Norden";
                break;
            case 60:
                returnVal = "Wie heißt die Karte, in der das Löschgebiet der Feuerwehr verzeichnet ist?";
                answerText = "Löschbereichskarte";
                break;
            default:
                answerText = "ERROR";
                break;

        }
        return returnVal;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvFrage = (TextView) findViewById(R.id.tvFrage);
        tvAntwort = (TextView) findViewById(R.id.tvLösung);
        btAntwort = (Button) findViewById(R.id.btAntwort);
        btNext = (Button) findViewById(R.id.btNext);

        tvAntwort.setText("");

        btAntwort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAntwort.setText(answerText);
            }
        });

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int questionNumber = 0;
                String question = "";
                tvAntwort.setText("");
                questionNumber = r.nextInt(60);
                questionNumber++;
                question = questionWrite(questionNumber);
                tvFrage.setText("Frage " + questionNumber + " : " + question);
            }
        });
    }
}