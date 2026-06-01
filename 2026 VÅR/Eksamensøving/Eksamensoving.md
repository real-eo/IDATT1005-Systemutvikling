---
kanban-plugin:
---
## 1.  MMI
Tema som omhandler hvordan applikasjoner er strukturert slik at det blir intuitivt for et menneske å bruke applikasjonen. 
##### 1.1 Interaksjonsdesign
- **Definisjon:** utforme hvordan brukere samhandler med digitale produkter. Skape intuitive, effektive og meningsfulle opplevelser for brukerne. 
- **Fokus:** å forstå brukerens behov, mål og kontekst og designe UI og interaksjonsmønstrer som passer
- **Mål:** skape brukeropplevelser som er intuitive, effektive, tilfredstillende og engasjerende. 
- **Modell når man jobber med IxD:**![[Screenshot 2025-05-08 at 21.01.30.png]]Er en Iterativ prosess lik moderne utviklingsmetoder
###### 1.1.1 Fem dimensjoner i IxD: 
De ulike dimensjonene som man bruker til å kommunisere med en bruker
1. **Ord** - forståelig og tilgjengelig
2. **Visuell representasjon** - grafiske elementene 
3. **Fysiske objekter og rom** 
4. **Tid** - brukt på de første 3 dimensjonene
5. **Oppførsel** - følelsene og reaksjonene brukeren får når de samhandler med produktet
###### 1.1.2 Don Normans prinsipper om interaksjons design
1. **Synlighet på funksjoner** - vise at de er til stede og hvordan de skal brukes. Brukeren burde gjenkjenne lett hvilke funksjoner som er tilgjengelig. Motsatt; funksjoner som ikke er nødvendig til gitt tid burde ikke være synlig
2. **Feedback**: signaliserer til brukeren hva som foregår gjennom. Gjøres gjennom lyder, visualiseringer, fysisk osv.
3. **Begrensninger:** begrenser brukeren ulike former for interaksjon som er mulig å gjøre i et gitt øyeblikk. Gjør det lettere å lede brukeren gjennom prosessen og gjøre applikasjonen mer brukervennlig
4. **Avbilding:** Konsept til hvordan en funksjon irl oversettes til interaksjonsmuligheter i applikasjonen. Burde en stryken på lys justert med knapp, hjul, slider elns.
5. **Konsistens**: lage ting slikt at brukeren gjør lignende ting på lignende måter flere steder i applikasjonen.
6. **Tilbydelser**: hvilke handlinger en bruker *opplever* at hun kan gjøre med et system. Henger med hvordan systemet er laget og brukerens erfaring med andre systemer.
Prinsippene ment for å diskutere og beskrive brukskvaliteten til UI, og ikke som en sjekkliste for interaksjonsdesign. 
##### 1.2 Prototyping
- Hva og hvorfor
- **Dimensjoner ved prototyping**: Utseende, innhold, funksjonalitet, interaktivitet, romlig struktur.
- **Typer og kompromisser**
	- Horisontal prototyper: lite dypde og brukes til høynivåpresentasjoner![[Screenshot 2025-05-08 at 21.02.12.png]]
	- Vertikal prototype: mye dypde
	- ![[Screenshot 2025-05-08 at 21.02.29.png]]
- **Utvikling av prototype** 
	- Evolusjonære prototyper
	- Bruk og kast
	- Lavoppløslige prototyper: lite interaksjon
	- Høyoppløslige prototyper: mye interaksjon
##### 1.3 Evaluering: 
Er å finne verdien av noe. Bredt begrep som inkluderer: tester, formelle modeller, gjennomgang, prototyper
**Testing vs Evaluering:**
- **Testing:** Avdekke feil (verifisering – *are we building the product right?*)
- **Evaluering:** Vurdere nytteverdi/brukeropplevelse (validering – *are we building the right product?*). Inkluderer også testing.
Alt som kan gi brukeren en idé om den endelige løsningen kan evalueres.
- **Evalueringsformer:** 
	- Formativ: man gjør en evaluering for å påvirke utviklingen og sikre at designende man jobber med oppfyller kravene, utføres underveis. 
	- Summativ: evaluering av sluttproduktet 
- **Evaluering som involverer brukere** 
	1. Brukertester - lar en bruker bruke produktet i kontrollerte omgivelser og observer hva som blir brukt, feil, interaksjoner osv.
	2. A/B tester - lager to eller flere varianter av et design, presenterer brukere for en tilfeldig variant og ser hvilken variant som presterer best
	3. Feltstudier - naturlige omgivelser
	4. Opportunistiske evaluering - en bruker gi tilbakemelding på en spesifikk ide eller problemstilling
- **Evaluering som ikke involverer brukere** 
	1. Heuristiske gjennomganger - evaluer produkt gjennom regler og retningslinjer for brukerkvalitet
	2. Pluralistiske gjennomganger - brukere, utviklere og brukerkvalitetseksperter jobber sammen gjennom viktige scenarioer
	3. Prediktive modeller - maskinlæringsmodeller som prøver å forutsi brukeropplevelse
- Evalueringsmetoder og teknikker 
	- Metoder: Observasjon, spørre brukere, direkte testing, spørre eksperter, modellere
	- Metoder for data: kodevalidering, testing i forskjellige nettleser og på forskjellige plattformer, testing av fleksibiliteten til et design, testing av grad av universell utfordring og brukerkvalitet, testing av feilmeldinger
##### 1.4 Brukertesting: 
- Definisjon: Simulerer en reell situasjon der testing inkluderer konkrete oppgaver. Observerer brukeren og brukes til å evaluere brukervennligheten. 
- **Mål**: få innsikt man trenger for å gjøre produktet enklere å bruke
- Brukertest burde ha spesifikke og begrenset hensikt. Problem -> formål med brukertest
##### 1.5 Universell utforming
- **Definisjon:** Går ut på at løsninger skal være utformet slik at de kan benyttes av flest mulig uten å diskriminere. 
- Produktet kan brukes av alle typer brukere uavhengig av fysisk begrensninger og kunnskapsnivå. 
- Handler ikke om å lage tilleggsløsninger for de med spesielle behov, men lage ting som i utgangspunktet kan brukes av alle
- Bidrar til likeverdig deltakelse i samfunnet og øker brukervennligheten for alle og samtidig reduserer behov for individuelle tilpasninger.
**Prinsipper for universell utforming (Central for Universal Design):**
1. **Enkelt og intuitiv i bruk:** 
2. **Forståelig informasjon**
3. **Toleranse for feil:** Utforming skal minimalisere farer og skader som kan gi konsekvenser
4. **Lik mulighet for alle:** Skal passe for *alle* uansett individuelle ferdigheter 
5. **Lav fysisk anstrengelse**
6. **Størrelse og plass for tilgang og bruk:** Hensiktsmessig størrelse og plass skal muliggjøre tilgang, rekkevidde, betjening og bruk, uavhengig av brukeren kroppsstørrelse, kroppsstilling og mobilitet.
Diskriminerings- og tilgjengelighetsloven stiller krav om universell utforming til offentlige og private virksomheter
##### 1.6 Lovkrav til universell utforming
- **Lov om likestilling og forbud mot diskriminering (§17–19):** trådte i kraft 1. januar 2018.
  - §17: Offentlige og private virksomheter rettet mot allmennheten har plikt til universell utforming av alminnelige funksjoner
  - §18: IKT-løsninger som underbygger virksomhetens alminnelige funksjoner skal være universelt utformet
  - §41: Eksisterende IKT-løsninger skal være universelt utformet fra 1. januar 2021
- **Forskrift om universell utforming av IKT:** trådte i kraft 1. juli 2013
- **EUs Webdirektiv (WAD):** oppdatert regelverk, nye krav gjaldt fra 1. februar 2023
- **Gode argumenter for UU:**
  1. Mer inkluderende (nesten 1 million opplever utfordringer på nettet)
  2. Enklere å bruke (god informasjonsstruktur, enkel navigasjon)
  3. Mer mobiltilpasset (store knapper, god kontrast fungerer på mobilskjerm)
  4. Mer synlig for Google (god kodestandard = bedre SEO)
  5. Mer lønnsomt (økt omsetning, færre henvendelser til support)
###### **1.5.1 WCAG 2.0**
- **Definisjon:** Retningslinjer som ser utviklet for å hjelpe utviklere til å lage nettsteder som er tilgjengelig for alle, inkl personer med funksjonsnedsettelser.
- **Mål:** sikre at folk, uavhengig av faktorer som kjønn, alder, og funksjonshemninger får tilgang til den samme informasjonen. 
- Noen krav:
	- Alt av innhold skal være tilgjengelig via tastaturnavigering
	- Bilder skal ha alt-funksjon
	- Video skal ha teksting eller alternativ lydspor
	- Formater skal være lett å forstå
	- Innhold skal være lett å forstå
- Øverste nivå i WCAG retningslinjer er det fire prinsipper: 
	- Mulig å oppfatte
	- Mulig å betjene
	- Forståelig
	- Robusthet
- 12 retningslinjer på nivået under som deles på 61 kriterier som nettsider må oppfylle. ex: kontrastbruken i tekst som må vise kontrastforhold med bakgrunnen slik at fargeblinde og svaksynte kan lese
--- 
## 2. UML
Hvorfor UML?
- Visualiserer konsept på en mer oversiktlig måte. Kan brukes der og da og for dokumentasjon etter. 
- Uttrykker mye informasjon med en modell
##### 2.1 Use case
- **Definisjon:** Illustrerer overfladisk hvordan brukeren bruker et system. Gjøres ved å illustrere ulike scenarioer en bruker kan møte og hvordan brukeren kan navigere seg gjennom systemet. 
- Avklarer enkelte funksjonelle krav
**Hvordan lager man en use case:** 
- Har en aktør som representerer en bruker. Aktøren har assosiasjoner med flere use-caser koblet med en linje. Bruker "extend" og "include" for å koble sammen deler av. Kan også bruke systemgrense for å skille ulike use-caser i use-casen.
##### 2.2 Domenemodell
- **Definisjon:** Beskrive data og funksjonalitet innad et domene abstrakt. Definerer en rekke konsepter og relasjonene mellom dem. 
- Mål: *alle* skal få felles forståelse over domenet 
- Domenemodellen skal ikke være detaljert som de andre modellene. Konseptene og relasjonene skal vises på en oversiktlig og enkelt måte. Ofte brukes et felles språk med navngiving osv.
##### 2.3 Sekvensdiagram
Viser hvordan klassene/komponenter i applikasjonen samarbeider over tid
- Deltakerne (klasser, aktører, objekt, komponenter) er boksene
- Funksjoner er horisontale linjer som peker mot høyre
- Stiplet vertikal linje: deltakers levetid/tidslinje
- Solid rektangel på vertikale linjen: når en deltaker utfører en operasjon
- Ramme representerer løkker
##### 2.4 Aktivitetsdiagram
Viser hvilke rekkefølge aktiviteter utføres i, dens betingelser og tilhørende handlinger. Dermed ser vi hvilke handlinger som utføres asynkronisk og hva som er avhengig av hverandre.  
- Aksjoner representeres med bokser. Start og slutt vises med svart sirkel. Overganger mellom aksjoner vises med piler
- Noder: Initial node (start), Final node (slutt), Decision node (betingelse), Fork node (parallell start), Join node (parallell slutt), Merge node
##### 2.5 Klassediagram
Modellerer den statiske strukturen til et system. Viser klassene (typer objekter), attributtene, metodene og relasjonene mellom dem. Kan brukes til å generere kode (forward engineering) eller utledes fra eksisterende kode (reverse engineering).
- **Klasse:** navn, attributter og metoder
- **Relasjoner:**
  - **Avhengighet (dependency):** klasse brukes av en annen, svak kobling
  - **Assosiasjon:** strukturell kobling mellom to klasser, kan ha multiplisitet
  - **Aggregering (aggregation):** "del av"-relasjon, delene har eget levetid
  - **Komposisjon (composition):** sterk aggregering – delene ødelegges når helheten ødelegges
  - **Arv (inheritance/generalization):** subklasse arver fra superklasse
  - **Realisering (realization):** klasse implementerer et grensesnitt (interface)
- Brukes tidlig: se use-diagram → sekvensdiagram → klassediagram før koding
##### 2.6 Pakkediagram
Grupperer relaterte UML-elementer (diagrammer, klasser, andre pakker) i en hierarkisk struktur. Brukes til å vise høynivåarkitekturen til et system.
- Vanlig i programmering for å organisere kildekode
- Kan vise lagdelt arkitektur (klient–server–data) eller funksjonell gruppering
##### 2.7 Tilstandsmaskindiagram (State Machine)
Viser de ulike tilstandene til et objekt eller system, og overgangene som fører til tilstandsendringer.
- Hvert objekt i systemet kan endre tilstand i sin levetid (f.eks. bruker: ikke-innlogget → innlogget → utlogget)
- **Hovedelementer:** starttilstand, sluttilstand, tilstander (states), overganger (transitions) med triggere/hendelser
- Utfyller sekvens- og aktivitetsdiagrammer ved å vise systemet fra et tilstandsperspektiv
##### 2.8 Brukerhistorier (User Stories)
Minste enhet av arbeid, vanligvis skrevet av produkteier.
- Format: «As <<rolle>> I want <<funksjonalitet>> Such that <<begrunnelse>>»
- Eksempel: «As <<Lotto-administrator>> I want <<Opprette ny lotterirunde>> Such that <<spillere kan delta>>»
- Modellering av brukerhistorier gjøres i UML via use case-diagrammer
---
## 3 Programvarearkitektur
Handler om å se den helhetlig strukturen til programmet, alt fra kildekoden til produktet.
**IEEE-definisjon:** «Arkitektur er den fundamentale organiseringen av et programvaresystem, uttrykt gjennom dets komponenter, deres relasjoner til hverandre og til miljøet, samt prinsippene som styrer design og evolusjon.»
##### 3.0 Hvorfor arkitektur?
- Forstå systemet tidlig – tidlige designbeslutninger og tidlig tilbakemelding gir:
  - Reduserte kostnader, unngår duplisering av ressurser
  - Økt kvalitet og hjelp til risikostyring
- Kommunikasjon mellom interessenter – gir felles og gjensidig forståelse
- Retningslinjer for utviklere gjennom hele prosjektet
##### 3.1 Kompleksitetshåndtering
Håndtere kompleksitet ved å dele dem mindre domener/biter (Splitt og hersk teknikk).
Enklere delegere ansvarsområder i utviklingsteamet, samt isolere hvert del, som gjør koden mer testbar og robust
##### 3.2 Modeller:
###### 3.2.1 Standalone application
![[Screenshot 2025-05-08 at 21.03.31.png]]
Programvare som inneholder all logikk og fungerer på egenhånd
Funker bra for mindre prosjekter slik at kompleksitet blir unngått.
###### 3.2.2 Klient - tjener arkitektur![[Screenshot 2025-05-08 at 21.04.08.png]]
Deler opp koden i to deler: (1) Kjører på klienten (presentasjon) (2) kjører på serveren (logikk)
Serveren utfører oppgaver for de ulike klientene  og klientene spør om de tjenestene de trenger.
Gjør at utviklere kan fokusere på deler av programmet. Fører til lav kobling som gjør det mer skalerbart. 
###### 3.2.3 Tre-lags-arkitektur
![[Screenshot 2025-05-08 at 21.04.47.png]]
Dele opp applikasjoner i 3 lag. Hvert lag utfører spesifikke oppgaver for et lag høyere. Hvert lag kan kun be om tjenester fra laget under eller over seg. Gir lav kobling
1. **Presentasjonslag**: Presentere data til brukeren vha UI-elementer. Håndterer interaksjoner og kaller på tjenester under.
2. **Forettningslogikklag:** Databehandling i applikasjonen, loigkk og forettningsarbeid for brukeren
3. **Data access lag:** Gir tilgang til eksterne tjenester og APIer ved bruk av metoder for logikklaget slik at applikasjonen får utført arbeid. CRUD
###### 3.2.4 Master-slave pattern
![[Screenshot 2025-05-08 at 21.05.02.png]]
Bygd opp at to partier: master og slaver. 
- Masteren: komponenten som delegerer arbeid til de forskjellige identiske slave komponentene. 
- Slavene returnerer resultat til master. 
Fordeler
- Får et overordnet blikk over prosessen i master og kan gå over til implementeringen i slavene. Slavene kan enkelt enhetstestes mens mesteren kan integrasjonstestes opp mot slavene.
Brukes i databasereplikering:
- Master db fungerer som kilden og videresender sin tilstand til slavene, som synkroniserer seg til mesterens data. Kan da sende spørringer til hvilken som helst av databasene som gir systemet høyere kapasitet enn en enkel db.
###### 3.2.5 Pipe-filter pattern
![[Screenshot 2025-05-08 at 21.05.25.png]]
Piper etterfulgt av rekke filter-nodes som prosesserer dataene til en *sink* som samler opp dataene. Brukt til å strukturere systemer som produserer datastrømmer.
###### 3.2.6 Broker pattern![[Screenshot 2025-05-08 at 21.05.38.png]]
Hver komponent kommuniserer gjennom en broker, som fasiliteter kommunikasjon og koordinasjon. Serveren gir sine kapasiteter til brokeren og klienten spør etter service fra brokeren, og brokeren sender klienten til et passende service. 
Brukt til å strukturere systemer der komponentene ikke har kjennskap til hverandre. 
###### 3.2.7 Peer to Peer pattern
![[Screenshot 2025-05-08 at 21.05.50.png]]
Komponentene kalt peers. Peers funker nesten lik klient-tjener, men kan ta en dynamisk rolle både tjener og klient. Peersene kan sende forespørsler til hverandre og samarbeider ofte.
###### 3.2.8 Event-bus pattern
![[Screenshot 2025-05-08 at 21.06.02.png]]
Fire hovedkomponenter: event listener, event source, channel og event bus. Kilden (source) sender en melding til en spesifikk channel på event bussen. Listener abonnerer til channelen og sier ifra til andre komponenter når en melding blir sendt på channelen de abonnerer på.
###### 3.2.9 MVC![[Screenshot 2025-05-08 at 21.06.20.png]]
Deler en interaktive applikasjon i tre deler:
- Model: hoved funksjonaliteten, alt av data som vises i applikasjonen samt data som er viktig for prosessering
- View: Viser fram modellene og andre data til brukeren gjennom GUI
- Controller: Styrer informasjonsflyten ved å ta input og andre interaksjon fra brukeren, henter/sender data til andre tjenester og manipulerer modellene slik at GUI blir oppdatert.
Fordeler
- Deler opp komponenter som fører til høy kohesjon og gjenbrukbarhet  
###### 3.2.10 Microservice
Basert på *single responsibility principle*: samle det som endres av samme grunn, og skill det som endres av ulike grunner. Deler opp programvare i selvstendige tjenester med én ansvarsoppgave, sin egen data og eget kjøremiljø.
**Fordeler**
- Skalerbart
- Modulær
- Fleksibel bruk av teknologi 
- Tilgjengelig (feil i én tjeneste stopper ikke hele systemet)
- Muliggjør kontinuerlig levering (CI/CD), optimalisert for DevOps
**Ulemper**
- Kompleks debugging og logging på tvers av tjenester
- Krever automatisering
- Vanskelig å teste (distribuerte systemer)
- Datainkonsistens – data spredt over mange databaser
- Økt ressursforbruk
###### 3.2.11 Monolittarkitektur
Tradisjonell, sammenslått modell der alle deler av programvaren er pakket inn i ett system. Selvinneholdt og tett koblet.
**Fordeler**
- Bedre gjennomstrømning enn modulære tilnærminger
- Enklere å teste og debugge i begynnelsen
**Ulemper**
- Vanskelig å vedlikeholde – endring i én del krever oppdatering av hele applikasjonen
- Lite skalerbar/utvidbar sammenlignet med modulære arkitekturer
- Tett koblet – én feil kan stoppe hele systemet
###### 3.2.12 Plugin-basert arkitektur
Består av to hoveddeler: et **kjerne-system** og **plugin-moduler** (utvidelser/extensions).
- Kjernen administrerer levetiden til tilkoblede plugins
- Plugins kan legges til eller fjernes fra kjernen når som helst
**Eksempler:** Chrome Web Store, IDE-er (IntelliJ, VS Code, Eclipse)
**Fordeler**
- Lav kobling og høy isolasjon mellom funksjoner
- Fleksibelt og utvidbart
**Ulemper**
- Endringer i kjernen kan ødelegge alle plugins (bakoverkompatibilitet viktig)
- Mange plugins kan senke ytelsen
- Kompleks testing av hele systemet
##### 3.3 Deployment-arkitekturer
**Tradisjonell deployment:** Applikasjoner kjøres direkte på fysiske servere. Ressursallokering er et problem – én app kan ta opp for mye.

**Virtualisering (VMs):** Kjøre flere virtuelle maskiner på én fysisk server. Hvert VM har eget OS. Problem: ressurser reserveres selv om de ikke brukes.

**Container-deployment:** Containere deler OS med hverandre men er isolert. Lettere og mer effektive enn VMs. Nøkkelteknologier: **Docker** (container-teknologi) og **Kubernetes** (container-orkestrering).
- Containere er enkle å distribuere og gir konsistent kjøremiljø ("fungerer likt overalt")
- Løst koblet, distribuert, elastisk – som microservices

---
## 4 Systemutviklingsmetodikk
##### 4.1 Før smidig metoder
- Vannfallsmodellen: Flere store faser gjennomført en og en, med krav først også design.
	- Mye dokument overlevert fase til fase og nye folk hver fase
	- Vanskelig å skalere og mange prosjekter feilet.
- UP (Unified Process): innførte iterasjoner for å takle vannfallsmodellen sine problemer rundt endringer underveis. 
	- UML-modellering svært sentralt
##### 4.2 Smidige metoder
Oppsto som reaksjon mot den tunge vannfallsmodellene. Ble kjent når *The Agile Manifesto* ble utgitt. 
**Grunnleggende prinsipper:* for smidig metode*
1. **Problem based**: Større problemer brytes ned i mindre og prioriteres. 
2. **Collaborative**: Flere personer er en del av prosessen fra begynnelsen.
3. **Iterativ:** Prosessen er iterativ
4. **Adaptiv**: fremgang er adaptiv og ikke lineær.
**Manifesto kort oppsummert:**
- **Individer og interaksjoner fremfor prosesser og verktøy**: menneskene involvert og deres samarbeid er den viktigste faktoren for prosjektet. Prioriterer kommunikasjon og samarbeid fremfor strenge prosesser og bruk av spesifikke verktøy.
- **Fungerende programvare fremfor omfattende dokumentasjon:** Målet er å skape verdi gjennom programvaren som utvikles.
- **Kundesamarbeid fremfor kontraktsforhandlinger:** Vektlegger samarbeid med kunden for å forstå deres behov og tilpasse endringer over tid enn å fokusere på detaljerte kontrakter og opprinnelige krav.
- **Reagere på endring fremfor å følge en plan:** Smidig metoder er tilpasningsdyktig og fleksible. Å respondere effektivt på endrede krav og forutsetninger er viktigere enn å følge en forhåndsbestemt plan.
**Ulike smidige metoder:** 
###### 4.2.1 Extreme Programming
Har nesten ingen dokumentasjon og modellering. Har 29 faste regler:
- Alltid parprogrammering
- Skriv enhetstester før koding
- Integrer kun én liten endring av gangen
- Enkel, tydelig kode og hyppig refaktorering
- Ha kort feedback-loop, hyppige tester og tilbakemeldinger fra kunde skal bidra til kontinuerlige endringer.
- Ha korte iterasjoner med leveranser mellom dem 
Fem sentrale verdier innen XP:
- Communications, simplicity, feedback, courage og respect:
	- Det trengs god kommunikasjon, koden skal simpel, tilbakemelding fra testene, teamet og kunden, man må ikke vær redd for refaktorisere dårlig kode, ha respekt for sitt og andres arbeid.
###### 4.2.2 TDD (Test-Driven develompent)
- **Hva?** Skriver tester for en bestemt funksjonalitet først, kjører testen for å se at den mislykkes og deretter skrive kode for at den skal bestå. 
- Videreføring av XP og har samme "regler" når det gjelder refaktorering av dårlig kode. 
- Fokus på enhetstesting og akseptansetesting. 
- Tester og krav er sammensmeltet: 
	- Enhetstester setter krav til hva koden kan gjøre samtidig som den tester. 
	- Bruker *user-stories* til å definere kundekrav og testcaser for akseptansetester
**Fordeler:** 
- Kodekvalitet
- Testdekning
- Rask tilbakemelding
- Økt tillit
- Testene fungerer også som en form for dokumentasjon.
**Ulemper**
- Lærekurve: krever endring i tenkemåte
- Tidsbruk å skrive tester
- Vedlikehold av testene 
###### 4.2.3 BDD (Behavior-Driven develompent)
	- **Hva?** automatiserte akseptansetester og involverer flere interessenter. Gruppa møtes for å komme med konkrete akseptkriterier i en brukerhistorie. Akseptkriterier skrevet vha domenespesifikt språk som UML og lagt inn i testscenario fil som konverteres til kjørbare tester, vanligvis automatisk.
- Teste applikasjonen oppførsel fra sluttbrukerens perspektiv
- Sørger for at use cases fungerer på et høyere nivå
###### 4.2.4 Scrum
Tidsboksbasert *smidig metode* som ikke forteller oss hvordan vi skal utvikle koden eller modellere krav, men hvordan vi skal jobbe og få fremgang. 
- Utfører sprinter (tidsavgrensede iterasjoner) med demo mot slutten eller levert produkt
- Fokus på kryssfunksjonalitet der utviklerteamet ikke har spesifikke roller
**Seremonier/møter**
- **Sprint planning meeting:** Product owner og utviklingsteam møter og avklarer hva som skal inngå i kommende sprint. Henter ut ProductBackLogItems fra ProductBacklog, justerer disse og legger i SprintBacklog. PO bestemmer hvilke PBI. Populerer også scrum-board med oppgaver  
- **Standup møte:** 
- **Sprint review:** Utviklerteam, PO og interessenter møter etter ferdig sprint og resultat presenteres. Tilbakemelding gis og evaluering av produkt skjer.
- **Retrospektiv:** Utviklerteam innad reflekterer hva som gikk bra under spint og arbeidsprosess.
##### 4.3 Lean
Lik smidig metode, men med mer vekt på å ikke lagre ting uten verdi. Prinsipper:
- **Eliminate waste**: alt som produseres må ha verdi. Altså, unngå funksjoner kunden ikke vil ha selv om du liker det, dokumentasjon som er bare flesk, mye byråkrati osv 
- **Build quality in**: God kvalitet på koden og systemet
- **Create knowledge:** Korte feedback looper mellom kunde og utvikler slik at flere ting kan testes og endringer kan gjøres hyppig. 
- **Defer commitment:** Vent med handlinger som er irreversible til man har lært nok om konsekvensene av de handlingene
- **Deliver fast:** Tenk enkelt og unngå overengineering. Dette skaper unødvendig kompleksitet og administrering. Hovedfunksjonaliteten skal prioriteres og må ut i produksjon så raskt som mulig. 
- **Respect people:** La utviklere ha ansvar over selve utviklingsprosessen og ledere fokuserer på sitt. 
- **Optimize the whole:** Forstå helheten i et system, forstå hoveddomene og avhengigheter mellom komponenter
**Lean-metoder:**
###### 4.3.1 Kanban
- Flytbasert: Fokus på å unngå flaskehalser under utvikling 
- Fokus på kontinuerlig flyt med fleksible prosesser og visuell styring uten faste iterasjoner.
- Produkt levert kontinuerlig 
- Ingen standard møter 
- Bruker et **kanban-board**: lik scrum-board bare at det er begrenset oppgaver på hver kolonne. Formål: Dersom man har lite oppgaver i kolonnen man jobber i kan man bidra i andres kolonner som har flere oppgaver. Disse kolonnene fungerer som en flaskehals som bremser det prosessen.
###### 4.3.2 Domain-Driven Design
- Høyt fokus på domenet
- Koden skal gjenspeile virkeligheten, altså domenet
- Godt egnet for skalering og endringer
- Fokuserer på det viktigste i domenet
##### 4.4 DevOps
En kultur og praksis som kombinerer **utvikling (Dev)** og **drift (Ops)** for å muliggjøre kontinuerlig integrasjon og leveranse.
- **Agile vs DevOps:** Agile er en metode (fokus på utvikling), DevOps er en kultur (fokus på leveranse til produksjon). Kombinert: «Agile DevOps»-kultur.
- **CI (Continuous Integration):** Kode integreres hyppig i en felles gren. Endringer bygges og testes automatisk.
- **CD (Continuous Delivery/Deployment):** Kodeendringer deployes automatisk til produksjon.
- DevOps-verktøy:
  - Utvikling: GitLab/GitHub, Jira/Confluence
  - CI (bygg/test): Maven, Gradle, Jenkins, JUnit, Selenium
  - CD (deploy): Kubernetes, Helm, Docker
  - Drift/monitorering: Kibana, Grafana
##### 4.5 REST
**REpresentational State Transfer** – arkitekturstil (ikke protokoll) for design av API-er.
- Basert på klient-tjener-paradigmet der klient og server utveksler representasjoner av ressurser
- Data og funksjonalitet behandles som **ressurser** tilgjengelig via **URI-er**
- Ressurser manipuleres med veldefinerte HTTP-operasjoner: GET, POST, PUT, DELETE
- Eksempel: `GET /candidates` (hent alle), `POST /candidates` (legg til ny), `DELETE /candidates/{id}` (slett)
---
## 5 Testing
##### 5.1 Hvorfor teste?
For å validere at systemet:
- Responderer riktig ved interaksjon/input
- Ikke har bugs
- Har god ytelse under edge cases
- Møter krav til brukervennlighet
- Møter kravene satt av product owner
- Kan installeres i riktig miljø
- Kan håndtere endringer
Tester vanligvis i faser i prosjektet, mens med smidig metode tester man kontinuerlig og automatisk gjennom DDD. 
##### 5.2 Tradisjonell vs Smidig testing
- **Tradisjonell testing**
    - Utvikling og testing skjer separat: ett team utvikler, et annet (QA-teamet) kvalitets­sikrer
    - Produktet sendes tilbake til utvikling dersom krav ikke er oppfylt
    - Ulempe: mye tid brukt på kommunikasjon fremfor utvikling
- **Smidig testing**
    - Utviklere skriver og tester egen kode kontinuerlig
    - Funksjonalitet blir integrert og forbedret i små inkrementer
    - Kan bruke et QA-team for å validere viktige scenarioer
    - Bruker automatiserte tester
- **Automatiserte tester**
    - Enhetstester og integrasjonstester kjøres automatisk i CI-pipelines
    - Testkjøring trigges ved opprettelse av pull requests
    - Resultatrapport legges ved PR for rask feedback
- **Egne test-/staging-miljøer**
    - Testmiljøet speiler produksjons­miljøet for mer realistisk testing
    - QA-teamet kan teste hele applikasjonen før release
    - Infrastructure-as-code (IaC) gjør oppsett og versjonshåndtering av miljøer enkelt
- **Fordeler med CI og små endringer**
    - Mindre diff mellom gammel og ny versjon
    - Enkel isolering og sporing av endringer
    - Redusert sannsynlighet for feil og enklere rollback ved problemer
- **Prioritering av testing**
    - Finn riktig nivå på test­dekning basert på risiko
    - Prioriter tester der de gir størst verdi og reduserer mest usikkerhet
##### 5.3 Risk-poker
Brukes ved å beregne *risiko* og *konsekvens* av feil og av evt risikofaktorer. Alle på teamet "scorer" sannsynligheten og påvirkningen samtidig med et kortstokk, så bruker vi snittet. Siden hele teamet er med er treffsikkerheten større.
##### 5.4 Test-data
Når vi kjører tester er vi avhengig av et forutsigbart miljø for at programvaren ikke blir påvirket av eksterne faktorer, da dette kan gjøre det vanskelig å isolere feil. Testdataene må derfor være det samme under testprosessen og prosessen må også være deterministisk. Utviklere kan da vurdere resulatene testene mer grundig og effektivt. 
##### 5.5 Mocking
Noen ganger kan vi ikke jobbe med reell data. Ofte er klasser avhengig av hverandre som gjør det vanskelig å isolere delene fra hverandre og teste klassene hver for seg. Lurt å bruke utviklingsmønstre som Dependency Injection for å sette moduler inn i hverandre under kjøring. Da kan man bytte ut komponenter eller klasseinstanser med "mock" objekter som implementerer de samme metodene som instansene, men er deterministisk.

Da er det mulig å teste ut funksjonaliteten til én klasse om gangen basert på de hardkodede dataene returnert av mock-objektene
##### 5.6 Testfaser

| Faser         | Beskrivelse                                                                                                                        |
| ------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| Oppsett       | Setter opp testdataene og sørger for at de holder seg like hver gang testen kjøres. Oppretter altså en fasttilstand "test fixture" |
| Gjennomføring | Utfører operasjonene spesifisert i testen                                                                                          |
| Verifisering  | Bekrefter at det som skulle skje har skjedd og verifiserer resultatene av testen vha f.eks. assert                                 |
| Opprydding    | Dersom man benytter seg av eksterne ressurser er det viktig å rydde opp slik at vi får et identisk miljø på nytt til neste test    |
##### 5.7  Testnivåer![[Screenshot 2025-05-08 at 21.07.30.png]]
##### 5.8 Test-typer![[Screenshot 2025-05-08 at 21.07.47.png]]
###### 5.8.1 Enhetstesting
- Utviklertest av individuelle klasser på funksjonsnivå. 
- Automatisert og repeterbar
- Kjøres alltid som en del av byggeprosessen
- Mål: identifisere feil tidlig slik at de kan bli rettes før integrasjons med andre deler av programvaren
###### 5.8.2 Integrasjonstesting
- Tester samspillet og integrasjon mellom ulike komponenter som allerede er testet individuelt. 
- Mål: oppdage feil i grensesnittet og samhandlingen.
- Kan og bør automatiseres.
###### 5.8.3 Systemtesting
- Tester et fullt integrert system for å sjekke om systemet møter kravene. 
- Kan bruke verktøy som Selenium, men siden vi er avhengig av alle ressurser (db, eksterne tjenester, API osv) kan dette bli vanskelig å gjennomføre da det er vanskelig å oppnå repeterbare tester.
###### 5.8.4 Akseptansetesting
- Type systemtesting som utføres av kunden for å verifisere om systemet møter kravene i kontrakten. 
- Akseptansetesting i TDD handler om automatisk testing av user-stories og kan være utviklet i samsvær med kunden. 
- Er manuell og automatisk
###### 5.8.5 Regresjonstesting
- Sikrer at systemet ikke brekker ved endringer der testen kjøres før og etter en endring. Med kontinuerlig endring skjer dette implisitt siden testene kjøres ved innsjekk av kode.
- Enhetstester fungerer derfor som regresjonstesting. Kan også lage regresjonstester på integrasjon- og akseptansenivå. 
- Regresjonstesting kan automatiseres siden man utfører nøyaktig samme test før og etter en endring.  
###### 5.8.6 Smoke-testing/Sanity-testing
Ad hoc type test der man prøver ut de viktigste delene av et system. Kan være greit å gjøre før systemet sendes videre til andre tester. 
- Smoke-testing: funker på kritisk funksjonalitet i systemet
- Sanity-testing: fokus på ny funksjonalitet
###### 5.8.7 Utforskende testing
Tester brukeren sin kunnskap og erfaring med testing, sammen med kunnskap om systemet til å utføre kreativ testing. Kan ikke automatiseres. 
###### 5.8.8 Destruktiv testing
Type ad hoc, kreativ og utforskende testing hvor man prøver å få systemet til å faile. Kan ikke automatiseres. Må bruke menneskelig kreativitet og erfaring.
###### 5.8.9 Usability testing 
Tester brukervennligheten: GUI og om kunden er fornøyd 
###### 5.8.10 Ytelsestesting
**Hva**
- Hvor mye last tåler systemet
- Hvor mye plutselig last tåler systemet
- Ytelse over tid med tung arbeid
- Lekkasjer?
**Hvordan vi måler ytelse:**
- Antall samtidige brukere
- Transaksjoner per tid
- Throughput
- Responstider
**Flaskehalser**
Ønsker å finne flaskehalser i systemet da vet vi hvor systemet er treigest/svakest og hvor vi må gjøre forbedringer. Kan finne flaskehalser ved å teste responstid på ulike steder og nivåer. Når flaskehalsen er funnet må vi finne årsaken. Ofte er årsaken knyttet til CPU, minne, tråder, db tilkobling osv.
**Typer ytelsestester**
1. **Last-Test:** Hvordan systemet oppfører seg ved forventet last. Hvor mye tåler systemet før ytelsen degraderes vesentlig. Hva er det som gjør at systemet degraderes
2. **Stress test:** Finne systemets øverste limit. Når bryter systemet sammen og hva er årsaken?
3. **Spike-test:** Hvordan systemet oppfører seg ved plutselig høy last. 
4. **Utholdenhetstest:** Hva skjer når systemet utsettes for jevn last over tid. 
###### 5.8.10 Black-box vs white box testing
Blackbox
	- From external and 
- No knowledge of internal code
- Test based on requirements, specifications and expected behavior
Whitebox
- Test internal of the software
- Full knowledge of internal code
##### 5.9 Automatisk eller manuell testing
**Automatisk**
- Raske og nøyaktige. 
- Enhetstester og regresjonstest
- Finner ikke noe eksplisitt
**Manuelle tester** 
- Kreative og finne fort vanlige feil
- Smoke, sanity, utforskende, destruktiv testing
Begge
- Usability, integrasjon, akseptanse, ytelsestesting og systemtesting
##### 5.10 Testing prinsiples
1. Testing shows the presence of defects
2. Exhaustive testing is impossible
3. Early testing
4. Defects clustering
5. Pesticide paradox
6. Testing is context dependent
7. Absence of error fallacy
---
## 6 Profesjonsetikk

##### 6.1 GDPR: General Data Protection Regulation
###### 6.1.1 Formål
EUs personvernordning innført i norsk lov via personopplysningsloven. Regulerer all behandling av personopplysninger - fra innsamling og lagring til sletting og utlevering - for å beskytte individets rett til privatliv og kontroll over egen data.
###### 6.1.2 Grunnleggende prinsipper
1. **Lovlighet, rimelig og gjennomsiktighet** - .
2. **Formålsbegrensning** - opplysninger samles inn kun for angitte mål. 
3. **Dataminimering** - kun det som er nødvendig for formålet skal innhentes. 
4. **Riktighet** - feil data skal rettes. 
5. **Lagringsbegrensning** - data skal ikke lagres lengre enn nødvendig. 
6. **Integritet og konfidensialitet** - tiltak skal hindre uautorisert tilgang, tap eller endring. 
7. **Ansvarliggjøring** - behandlingsansvarlige må kunne sikre at prinsippene følges. 
###### 6.1.2 De registreters rettigheter
- **Rett til informasjon:** vite hva som samles og hvorfor
- **Rett til insyn:** tilgang til sine egne opplysninger
- **Rett til retting:** korrigering av uriktige data
- **Rett til sletting:** kreve fjerning av unødvendige data
- **Rett til begrensning:** stoppe videre bruk av data i visse situasjoner
- **Rett til å protestere:** nekte automatisk eller markedsføringsbasert behandling
- **Rett til dataportabilitet:** motta egne data i maskinlesbart format og overføre dem
**Unntak:**
Noen rettigheter kan begrenses, f.eks. når behandlingen er nødvendig for juridisk forpliktelse, ivareta offentlig sikkerhet eller forskning. Behandlingsansvarlige som må bevise at unntaket gjelder.
##### 6.2 Profesjonsetikk
###### 6.2.1 Hva er profesjonsetikk?
Omfatter de moralske normene og forventningene som knytter seg til et bestemt yrke. 
###### 6.2.2 Ingeniøretikk
Etiske problemstillinger oppstår når teknologiske løsninger kan ha utilsiktede eller skadelige konsekvenser. Ingeniørens ansvar omfatter blant annet:
- **Sosialt ansvar:** Teknologi kan forandre arbeidsmarkedet, påvirke demokratier eller krenke kulturelle normer.
- **Sikkerhet og pålitelighet:** Eks – selvkjørende biler kan aldri bli feilfrie; hvor legges terskelen for trygghet?
- **Brukeres velferd:** Automatisering som erstatter menneskelig arbeidskraft – hvilken rolle spiller utvikleren i å dempe sosiale omkostninger?
- **AI og militær bruk:** Droner med dødelig kraft reiser spørsmål om hvem som har siste etiske ansvar
###### 6.2.3 Kodeverk og retningslinjer:
- **NITO:** Dataingeniøren skal vise respekt for kolleger uavhengig av bakgrunn, vedkjenne seg faglig ansvar, følge anerkjente kvalitetsnormer, og bidra til åpenhet om teknologiske konsekvenser.
- **IEEE/ACM Code of Ethics:** Internasjonale etiske retningslinjer for utvikling av IT løsninger.
	1. SAMFUNN - Programvareingeniører skal handle konsekvent i offentlig interesse.
	2. KUNDE OG ARBEIDSGIVER - Programvareingeniører skal handle på en måte som er til beste for kunde og arbeidsgiver og i samsvar med offentlige interesser. 
	3. PRODUKT - Programvareingeniører skal sikre at deres produkter best mulig oppfyller profesjonelle standarder. 
	4. VURDERING - Programvareingeniører skal utvise faglig skjønn og opprettholde integritet og uavhengighet. 
	5. LEDELSE – Ledere skal fremme en etisk tilnærming til styring av programvareutvikling og vedlikehold. 
	6. PROFESJON - Programvareingeniører skal fremme integriteten og omdømmet til profesjon i samsvar med offentlig interesse. 
	7. KOLLEAGER - Programvareingeniører skal være rettferdige mot og støtte sine kollegaer.
	8. IDENTITET - Programvareingeniører skal delta i livslang læring innen praksis innen sin profesjon og skal fremme en etisk tilnærming til utøvelsen av yrket.
###### 6.2.4 Nøkkelprinsipper i profesjonsetikken:
1. **Ærlighet og integritet:** Vær åpen om begrensninger og mulige risikoer i egne løsninger.
2. **Respekt for personvern:** Bygg inn personvernbeskyttelse fra starten («privacy by design»).
3. **Kvalitetsbevissthet:** Følg anerkjente utviklings- og teststandarder for å unngå feil.
4. **Ansvar for konsekvenser:** Identifiser og håndter etiske dilemmaer proaktivt, ikke først når problemer oppstår.
5. **Kontinuerlig vurdering:** Etikkarbeid er iterativt - reflekter jevnlig over nye teknologiske muligheter og følg ny veiledning fra faglige organisasjoner.
**Hvorfor det henger sammen med kvalitet:**  
Programvare som tar hensyn til etiske krav er mer robust, unngår alvorlige sikkerhets- og personvernbrudd, gir høyere bruker­tilfredshet og beskytter utviklerens og organisasjonens omdømme. Manglende etisk forankring kan gi programvare av dårlig kvalitet, for eksempel systemer med innebygde skjevheter (bias), mangelfull sikkerhet eller løsninger som bryter brukernes tillit og fører til omdømmeskade.
##### 6.3 Susad

---
## 7 Prosjektplanlegging 
#### 7.1 Visiondokument
- Beskriver prosjektets formål, omfang og hensikt.
- I smidige metoder er visiondokumentet mer fleksibel og mindre deltaljert og kan oppdateres.
- Gir felles forståelse av prosjektet blant interessenter (prosjektteamet, ledelse, aksjonærer, kunde, osv)
- Gir en retning for arbeidet: formål, målgruppe, funksjonelle og ikke-funksjonelle  krav
- Identifisering av interessenter og brukerbehov
- Kommunikasjon med prosjektets interessenter 
#### 7.2 Risikoanalyse
Hensikt
- Identifisere potensielle risikoer som kan påvirke prosjektets fremgang
- Prioritering av risiko
- Tiltak
- Forbedring av beslutnignsprosess
Øke prosjektets robusthet og gi prosjektteamet og interessentene en bedre forståelse av potensielle trusler og utfordringer undereis i prosessen.
## 8 Øving (eksamensoppgave)
## Oppgave 1 (20 %) Systemutviklingsmetodikk
1. Gjør rede for de viktigste prinsippene i smidig utvikling.

2. Hva er forskjellen mellom scrum og kanban metodikk?

3. I Scrum opererer man med ulike møter (seremonier). Fortell kort om hva som foregår på hvert av disse møtene og hvem som deltar der.

4. Innen programvareutvikling benytter man ofte både Use Case og Domenemodellering. Fortell om hvordan disse utfyller (kompletterer) hverandre.

## Oppgave 2 (20 %) Programvarearkitektur og design
1. Figuren viser en programvarearkitektur. Fortell om hvilken arkitektur dette er og beskriv med eksempler knyttet til figuren hvilke fordeler og utfordringer man får ved å benytte en slik arkitektur.

2. Innen programvarearkitektur og objektorientert design står begrepene “høy styrke” (high cohesion) og “lave koblinger” (low coupling) sentralt. Forklar hva som ligger i disse begrepene og kommenter hvorfor de har så stor betydning for å få en god og vedlikeholdbar programvare.

3. Beskriv prinsippene i arkitekturmønsteret Lagdeling (Layer) og kommenter hvilke lag man typisk deler en applikasjon i.

4. Microservices er et mye brukt mønster i moderne programvarearkitektur. Trekk frem fire fordeler og fire ulemper med å benytte dette mønsteret.

## Oppgave 3 (20 %) Testing
1. Hva er forskjellen mellom enhetstesting og integrasjonstesting, og hvordan utfyller de hverandre i en teststrategi for programvareutvikling?

2. Hvordan kan bruk av testdrevet utvikling (test driven development - TDD) bidra til å forbedre kvaliteten på programvaren, og hva er noen av utfordringene og fordelene ved å gjennomføre TDD i en utviklingsprosess?

3. Forklar de to begrepene TDD (test driven development) og BDD (behavior driven development)? Hvordan fungerer de sammen?

4. Hvilke ulike typer testing finner vi innen systemutvikling? Hvilke typer tester passer best for automatisk eller manuell testing?

## Oppgave 4 (20% ) MMI
1. Hva handler interaksjonsdesign om?

2. En mobiltelefon har veldig annerledes betingelser fra en vanlig pc både i skjermstørrelse og inndatametoder. Lag en kortfattet oversikt over retningslinjer for mobilnettsteddesign.

3. Hvilke typiske trinn består interaksjonsprosessen av, og hva er nyttige interaksjonsdesignprinsipper?

4. Redegjør for prinsipper for universell utforming.

5. Hva er WCAG og hvordan kan WCAG hjelpe utviklere og designere å sikre  tilgjengelighet for brukere med funksjonsnedsettelser?

## Oppgave 5 - Prosjekt Planlegging + evt.
1. Redegjør for hensikten med et visjonsdokument og diskuter betydningen dette dokumentet har for prosjektets suksess i et smidig systemutviklingsprosjekt.

2. Hva er hensikten med risikoanalyse i visjonsdokumentet og hvordan kan denne påvirke prosjektet?

## Oppgave 6 - Etikk
1. Hvilke rettigheter har en person ifølge General Data Protection Regulation (GDPR), og finnes det noen unntak fra disse rettighetene?
