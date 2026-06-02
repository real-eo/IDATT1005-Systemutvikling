Ja — under får du **alle tre delene**, men **ikke** en punkt-for-punkt omskriving av hele `Slides.md`.

---

# Del 1: Stor sammenhengsoversikt tema-for-tema i tabellform

## 1. Helhetstabell: hva temaet betyr, hva det brukes til, og hva det henger sammen med

| Tema | Hva det er | Hva det brukes til | Henger særlig sammen med | Typisk eksempel |
|---|---|---|---|---|
| MMI | Faget om samspillet mellom mennesker og digitale systemer | Å lage løsninger som faktisk fungerer for mennesker | Interaksjonsdesign, evaluering, brukertesting, universell utforming, WCAG | En app kan være teknisk korrekt, men fortsatt vanskelig å bruke |
| Interaksjonsdesign | Utforming av hvordan brukeren handler i og opplever systemet | Å gjøre løsninger intuitive, effektive og meningsfulle | Prototyping, Norman, evaluering, brukertesting | Lage en god bestillingsflyt i en nettbutikk |
| Prototyping | Tidlige representasjoner av løsning | Å utforske ideer og redusere risiko før full implementasjon | Interaksjonsdesign, evaluering, brukertesting, smidig utvikling | Figma-prototype av innloggingsskjerm |
| Evaluering | Vurdering av kvalitet, nytte og brukeropplevelse | Å finne ut om løsningen fungerer som ønsket | Prototyping, brukertesting, heuristikker, validering | Testing av om brukerne finner “betal”-knappen |
| Brukertesting | Observasjon av brukere som utfører oppgaver | Å avdekke problemer i brukbarhet og forståelse | Evaluering, prototyper, MMI | En bruker prøver å bestille time uten hjelp |
| Universell utforming | Utforming for at flest mulig skal kunne bruke løsningen | Å inkludere brukere med ulike forutsetninger | WCAG, lovkrav, MMI, interaksjonsdesign | Et skjema som fungerer med tastatur og skjermleser |
| WCAG | Retningslinjer for webtilgjengelighet | Å konkretisere krav til tilgjengelighet | Universell utforming, lovkrav, testing | Kontrastkrav, alt-tekst, tastaturnavigasjon |
| Lovkrav til UU | Juridiske krav til tilgjengelighet i IKT | Å sikre at løsninger følger lov og forskrift | WCAG, universell utforming, profesjonsetikk | Offentlig nettside må være universelt utformet |
| UML | Modellspråk for å visualisere og beskrive systemer | Å skape felles forståelse av systemet | Krav, brukerhistorier, arkitektur, design | Diagrammer før koding |
| Use case | Modell av aktørers mål og samspill med systemet | Å beskrive funksjonelle krav og scenarioer | Brukerhistorier, BDD, sekvensdiagram | “Bestill time” |
| Domenemodell | Modell av sentrale begreper og relasjoner i domenet | Å skape felles domene-forståelse | DDD, klassediagram, brukerhistorier | Kunde, ordre, betaling |
| Sekvensdiagram | Viser meldinger mellom deltakere over tid | Å forstå flyt og samarbeid mellom komponenter | Use case, klassediagram, arkitektur | KundeUI kaller CheckoutService |
| Aktivitetsdiagram | Viser prosessflyt og beslutninger | Å beskrive arbeidsflyt og logikk | Use case, sekvensdiagram, brukertesting | Flyt for innlevering av skjema |
| Klassediagram | Statisk struktur med klasser og relasjoner | Å designe programstruktur | Domenemodell, sekvensdiagram, OO-design | Order, Customer, Product |
| Pakkediagram | Høynivågruppering av systemelementer | Å vise modularisering og struktur | Arkitektur, lagdeling, kompleksitetshåndtering | UI-, domene- og datalag |
| Tilstandsmaskindiagram | Viser tilstander og overganger | Å beskrive livsløp for objekter | Use case, sekvensdiagram, domenelogikk | Ordre: opprettet → betalt → sendt |
| Brukerhistorier | Små beskrivelser av brukerbehov | Å planlegge og prioritere arbeid | Use case, Scrum, BDD, akseptansetesting | “Som kunde vil jeg…” |
| Programvarearkitektur | Overordnet struktur i systemet | Å håndtere kompleksitet og styre kvaliteter | UML, testing, deployment, DevOps | Monolitt eller mikrotjenester |
| Kompleksitetshåndtering | Deling av system i mindre ansvar | Å gjøre systemer forståelige og vedlikeholdbare | Arkitektur, lagdeling, modulisering, testing | Skille UI, logikk og data |
| Standalone-applikasjon | Alt i én applikasjon | Egnet for små og enkle systemer | Monolitt, enkel testing | Liten desktop-app |
| Klient-tjener | System delt i klient og server | Å sentralisere logikk/data og støtte flere klienter | REST, trelagsarkitektur, webapplikasjoner | Nettleser + backend |
| Trelagsarkitektur | Presentasjon, logikk, data | Å skille ansvar og gjøre systemet mer vedlikeholdbart | Testing, MVC, klient-tjener | Frontend, service-lag, database-lag |
| Master-slave | En styrende enhet og flere arbeidende enheter | Å koordinere arbeid eller replikering | Distribuerte systemer, databaser | Primærdatabase med replikaer |
| Pipe-filter | Behandling i sekvensielle steg | Å strukturere databehandling | Dataflyt, ETL, streaming | Parser → validering → lagring |
| Broker | Mellomledd for kommunikasjon mellom komponenter | Å redusere direkte kobling | Distribuerte systemer, service discovery | Meldingsmegler |
| Peer-to-peer | Noder med likere roller | Å muliggjøre distribuert samarbeid | Nettverk, distribuert arkitektur | Fildeling |
| Event-bus | Hendelsesbasert kommunikasjon | Å koble komponenter løst | Mikrotjenester, asynkronitet, observer-mønster | “OrderCreated”-event |
| MVC | Deling i model, view og controller | Å strukturere interaktive apper | UI-design, trelagsarkitektur | Web- eller GUI-applikasjon |
| Mikrotjenester | Mange små, selvstendige tjenester | Å skalere, organisere og deploye uavhengig | DevOps, CI/CD, event-bus, REST | Egen tjeneste for betaling |
| Monolitt | Ett samlet system | Enkelt å starte med og drifte tidlig | Standalone, enklere deploy, testing | Alt i én backend |
| Plugin-arkitektur | Kjerne + utvidelser | Å gjøre systemer fleksible og utvidbare | Modulisering, lav kobling | VS Code extensions |
| Deployment-arkitektur | Hvordan programvare kjøres og distribueres | Å sikre drift, skalering og stabilitet | DevOps, containere, mikrotjenester | Docker + Kubernetes |
| Vannfall | Sekvensiell utviklingsmodell | Å planlegge tydelige faser | Tradisjonell testing, tung dokumentasjon | Krav → design → kode → test |
| UP | Iterativ prosess med mye modellering | Å håndtere endringer bedre enn vannfall | UML, iterasjoner | Tidlige iterasjoner med modeller |
| Smidige metoder | Iterativ, adaptiv utvikling | Å håndtere endringer og få rask feedback | Scrum, Kanban, XP, TDD, DevOps | Korte inkrementer |
| Scrum | Sprintbasert arbeidsrammeverk | Å strukturere smidig arbeid | Brukerhistorier, backlog, review, retro | To ukers sprint |
| Kanban | Flytbasert arbeidsmåte | Å optimalisere kontinuerlig flyt | WIP-begrensning, DevOps | Tavle med oppgaver i flyt |
| XP | Smidig metode med tekniske praksiser | Å sikre høy kodekvalitet og rask feedback | TDD, parprogrammering, refaktorering | Test først, kode deretter |
| TDD | Test først, så kode | Å styre design og sikre testbarhet | XP, enhetstesting, mocking, DI | Skriv test for kalkulator før kode |
| BDD | Atferdsdrevet utvikling | Å koble krav, språk og akseptansetesting | Brukerhistorier, Gherkin, akseptansetesting | Given-When-Then-scenarioer |
| Lean | Fokus på verdi og fjerning av sløsing | Å effektivisere utvikling | Kanban, smidig, levering | Unngå unødvendig dokumentasjon |
| DDD | Domenedrevet utvikling | Å bygge system rundt domeneforståelse | Domenemodell, arkitektur, språk | Kode som speiler forretningsbegreper |
| DevOps | Kultur for samarbeid mellom utvikling og drift | Å muliggjøre rask og trygg levering | CI/CD, deployment, monitorering | Automatisert bygg, test og deploy |
| REST | Arkitekturstil for API-er | Å eksponere ressurser over HTTP | Klient-tjener, testing, websystemer | GET /orders |
| Testing | Verifikasjon og validering av system | Å finne feil og bygge tillit | TDD, CI, kvalitet, akseptanse | Teste både kode og brukbarhet |
| Enhetstesting | Test av små isolerte deler | Å finne feil tidlig og billig | TDD, mocking, DI | Test av `calculateTotal()` |
| Integrasjonstesting | Test av samspill mellom komponenter | Å finne grensesnittfeil | API-er, databaser, arkitektur | Service + repository |
| Systemtesting | Test av hele systemet | Å se om alt fungerer sammen | Akseptanse, staging, QA | Komplett kjøpsflyt |
| Akseptansetesting | Test mot bruker-/kundekrav | Å avgjøre om løsningen er godkjent | BDD, brukerhistorier, validering | Kunden godkjenner bookingflyt |
| Regresjonstesting | Test for å oppdage at noe gammelt har blitt ødelagt | Å sikre trygg videreutvikling | CI, automatiserte tester, små endringer | Gamle tester kjøres etter ny kode |
| Smoke/sanity | Overfladiske kontroller av kritisk eller ny funksjonalitet | Å raskt sjekke om systemet er testbart | Release, systemtesting | “Starter appen og kan jeg logge inn?” |
| Mocking | Erstatte ekte avhengigheter med testdobler | Å isolere tester og gjøre dem deterministiske | Enhetstesting, TDD, DI | Fake betalingstjeneste i test |
| Testdata | Kontrollerte data brukt i test | Å sikre forutsigbare og repeterbare tester | Automatisering, regresjon, testfaser | Fast datasett i databasen |
| Risk poker | Felles vurdering av risiko og konsekvens | Å prioritere test og innsats | Risikoanalyse, teststrategi, Scrum | Teamet vurderer betalingsfeil som høy risiko |
| GDPR | Regelverk for behandling av personopplysninger | Å beskytte personvern og kontroll over data | Etikk, arkitektur, sikkerhet, krav | Innsyn, sletting, dataminimering |
| Profesjonsetikk | Moralsk ansvar i profesjonell praksis | Å ta ansvar for konsekvenser av teknologi | GDPR, UU, kvalitet, sikkerhet | Ikke lage diskriminerende systemer |
| Prosjektplanlegging | Plan for mål, risiko og gjennomføring | Å styre prosjektet mot ønsket resultat | Vision, risiko, smidig arbeid | Prosjektmål, milepæler, interessenter |
| Visjonsdokument | Beskrivelse av formål og retning | Å gi felles forståelse | Krav, brukerhistorier, interessenter | Hva produktet skal oppnå |
| Risikoanalyse | Analyse av hva som kan gå galt | Å prioritere tiltak og redusere usikkerhet | Testing, arkitektur, prosjektstyring | Risiko for personvernbrudd |

---

## 2. Kryssreferansetabell: “Dette temaet bør nesten alltid kobles til …”

| Hvis temaet er … | Koble det til … | Hvorfor |
|---|---|---|
| Interaksjonsdesign | Prototyping, evaluering, brukertesting | Design må prøves ut og vurderes |
| Brukertesting | Evaluering, prototyper, MMI | Brukertesting er en del av evaluering |
| Universell utforming | WCAG, lovkrav, MMI | UU er målet, WCAG er konkretiseringen |
| WCAG | Universell utforming, testing | WCAG må faktisk testes i praksis |
| Use case | Brukerhistorier, sekvensdiagram, akseptanse | Use case beskriver mål og scenario |
| Domenemodell | DDD, klassediagram, språk i teamet | Domeneforståelse styrer design og kode |
| Sekvensdiagram | Use case, klassediagram, arkitektur | Viser hvordan statiske deler samarbeider |
| Klassediagram | Domenemodell, sekvensdiagram, testing | Struktur påvirker implementasjon og testbarhet |
| Arkitektur | Kompleksitet, testing, deployment | Arkitektur velges for å håndtere kvaliteter og risiko |
| Trelagsarkitektur | Testing, MVC, lav kobling | Lagdeling gjør test og vedlikehold lettere |
| Mikrotjenester | DevOps, CI/CD, observability, event-bus | Distribusjon krever mer moden drift |
| Monolitt | Enkel deployment, tidlig fase, enklere debugging | Ofte bra når kompleksitet må holdes nede |
| Scrum | Brukerhistorier, backlog, review, retro | Scrum er en styringsramme rundt arbeidet |
| Kanban | Flyt, WIP, kontinuerlig levering | Handler om flyt framfor sprint |
| XP | TDD, parprogrammering, refaktorering | XP konkretiserer tekniske smidige praksiser |
| TDD | Enhetstesting, mocking, DI | TDD krever testbar kode |
| BDD | Brukerhistorier, akseptansetesting, Gherkin | BDD gjør krav om til testbare scenarier |
| DevOps | CI/CD, automatiserte tester, deployment | DevOps kobler utvikling og drift |
| Enhetstesting | TDD, mocking, DI | Isolasjon og determinisme er viktig |
| Integrasjonstesting | API, databaser, arkitektur | Samspill mellom komponenter testes |
| Akseptansetesting | BDD, brukerhistorier, kunde | Handler om å møte behovene |
| Regresjonstesting | CI, små endringer, automatisering | Kjøres ofte hele tiden i moderne utvikling |
| GDPR | Etikk, sikkerhet, arkitektur | Personvern må bygges inn i systemet |
| Profesjonsetikk | GDPR, UU, kvalitet, samfunnsansvar | Etikk påvirker tekniske valg |
| Risikoanalyse | Testing, prosjektplanlegging, arkitektur | Risiko avgjør hva som prioriteres |

---

# Del 2: Muntlig eksamensforklaring for hvert hovedtema i naturlig språk

Nå formulerer jeg dette slik du kan **si det muntlig**.

---

## MMI og interaksjonsdesign

Hvis jeg skulle forklart MMI muntlig, ville jeg sagt at dette handler om forholdet mellom mennesket og systemet, altså hvordan vi designer digitale løsninger som faktisk fungerer godt for brukeren. Interaksjonsdesign er den delen av dette som handler om å utforme selve samhandlingen: hvilke valg brukeren får, hvordan navigasjon fungerer, hvordan systemet gir tilbakemelding, og hvordan opplevelsen blir intuitiv og effektiv. Dette henger tett sammen med prototyping og evaluering, fordi vi ikke bare kan anta at et design fungerer; vi må teste det tidlig og forbedre det iterativt. Don Normans prinsipper er sentrale her fordi de gir oss et språk for å vurdere brukskvalitet, for eksempel synlighet, feedback, konsistens og affordances. I praksis betyr dette at hvis jeg designer et skjema eller en bestillingsflyt, må jeg tenke på hva brukeren prøver å oppnå, hvordan systemet kommuniserer med brukeren, og hvor lett det er å gjøre riktige handlinger uten å bli forvirret.

---

## Prototyping, evaluering og brukertesting

Prototyping brukes for å gjøre idéer konkrete tidlig i prosessen, før vi bruker mye tid på full utvikling. En prototype kan være alt fra en enkel papirskisse til en høyoppløselig, klikkbar modell. Poenget er å redusere risiko og få innsikt. Dette henger tett sammen med evaluering, fordi prototyper gir oss noe vi faktisk kan evaluere. Evaluering er et bredt begrep som handler om å vurdere kvalitet og nytte, mens brukertesting er en mer spesifikk metode der vi observerer brukere som løser oppgaver. Jeg ville forklart sammenhengen slik: interaksjonsdesign lager forslag, prototyping gjør dem testbare, evaluering undersøker hvor gode de er, og brukertesting gir direkte innsikt i hvordan reelle brukere oppfatter løsningen. I praksis kan man for eksempel lage en prototype av en timebestillingsløsning og la brukere prøve å finne ledige timer. Hvis de sliter med å forstå neste steg, er det et tegn på at designet må forbedres.

---

## Universell utforming, lovkrav og WCAG

Universell utforming handler om at løsninger skal kunne brukes av flest mulig, uavhengig av funksjonsevne og forutsetninger. Dette er både et designmål, et kvalitetsmål og i mange sammenhenger et lovkrav. Jeg ville forklart at universell utforming er det overordnede prinsippet, mens WCAG er den konkrete standarden eller retningslinjesamlingen som hjelper oss å oppfylle dette i praksis på web. Lovkravene gjør at dette ikke bare er “nice to have”, men noe virksomheter faktisk er pålagt å følge, særlig når IKT-løsninger er rettet mot allmennheten. Dette henger også tett sammen med MMI, fordi god tilgjengelighet i praksis ofte også gir bedre brukervennlighet generelt. Et godt eksempel er tydelig kontrast, god struktur og tastaturnavigasjon: det hjelper brukere med funksjonsnedsettelser, men også vanlige brukere på mobil, i sterkt lys eller under stress.

---

## UML og modellering

UML bruker vi for å visualisere og kommunisere systemer på en strukturert måte. Poenget er ikke å lage diagrammer for diagrammenes skyld, men å skape felles forståelse og redusere misforståelser. Jeg ville forklart at forskjellige UML-diagrammer viser forskjellige sider av samme system. Use case-diagrammet viser hva aktører vil oppnå. Domenemodellen viser sentrale begreper i problemområdet. Sekvensdiagram viser meldinger mellom objekter over tid. Aktivitetsdiagram viser prosessflyt. Klassediagram viser den statiske strukturen. Tilstandsmaskindiagram viser hvordan objekter endrer tilstand. Poenget er at de utfyller hverandre. Hvis vi for eksempel lager en nettbutikk, kan use case vise at kunden vil betale, sekvensdiagrammet vise hvordan komponentene samarbeider i checkout, og klassediagrammet vise hvilke klasser som trengs. UML henger derfor tett sammen med både kravarbeid, design og arkitektur.

---

## Brukerhistorier, use case og BDD

Brukerhistorier, use case og BDD er tre ulike måter å beskrive behov og forventet oppførsel på, men de henger tett sammen. Brukerhistorier er korte og verdiorienterte, og brukes ofte i smidige prosesser for planlegging og prioritering. Use case er mer scenariobaserte og viser hvordan en aktør samhandler med systemet for å oppnå et mål. BDD bygger videre på dette ved å formulere akseptkriterier som kjørbare eller halvformelle scenarier i naturlig språk, ofte i Given-When-Then-format. Jeg ville forklart dette som en kjede: først identifiserer vi brukerbehov gjennom brukerhistorier, så konkretiserer vi interaksjonen gjennom use case, og deretter gjør vi forventningene testbare gjennom BDD-scenarier. Dette knytter sammen krav, kommunikasjon og testing.

---

## Programvarearkitektur

Programvarearkitektur handler om den overordnede strukturen i systemet: hvilke deler det består av, hvordan de samarbeider, og hvilke prinsipper som styrer design og utvikling videre. Jeg ville lagt vekt på at arkitektur først og fremst handler om å håndtere kompleksitet. Når systemer blir store, må vi dele dem opp på en måte som gir lav kobling, høy kohesjon og tydelig ansvar. Dette henger tett sammen med testing, vedlikehold, skalering og teamarbeid. Hvis vi for eksempel velger trelagsarkitektur, blir det lettere å teste forretningslogikken separat fra brukergrensesnitt og database. Hvis vi velger mikrotjenester, kan vi skalere og deploye deler uavhengig, men vi får også mer kompleksitet i drift og feilsøking. Derfor er arkitektur alltid et kompromiss mellom ulike kvalitetskrav.

---

## Arkitekturmønstre

De ulike arkitekturmønstrene i pensum kan forklares som ulike måter å organisere systemer på avhengig av behov. Klient-tjener brukes når klienter ber om tjenester fra en sentral server. Trelagsarkitektur skiller presentasjon, logikk og data. MVC strukturerer interaktive applikasjoner i model, view og controller. Monolitt samler alt i ett system, mens mikrotjenester deler det i mange små tjenester. Event-bus og broker brukes når vi vil ha løsere kobling mellom komponenter. Pipe-filter passer når data skal behandles i flere steg. Jeg ville forklart at disse mønstrene ikke nødvendigvis utelukker hverandre; i et moderne system kan man ha klient-tjener på toppnivå, mikrotjenester i backend, REST mellom tjenester og event-bus for asynkron kommunikasjon. Det sentrale er å kunne begrunne hvorfor et mønster passer i en gitt situasjon.

---

## Smidige metoder, Scrum og Kanban

Smidige metoder oppstod fordi tradisjonelle, tunge prosesser fungerte dårlig når krav og omgivelser endret seg. Kjernen i smidig er iterasjon, samarbeid, tilbakemelding og tilpasning. Scrum og Kanban er to ulike måter å organisere dette på. Scrum bruker tidsbokser, altså sprinter, og har faste seremonier som planning, daily standup, review og retrospektiv. Kanban fokuserer mer på flyt, visuell styring og begrensning av arbeid i prosess. Jeg ville forklart at begge prøver å få framgang og læring, men på ulike måter. Scrum passer ofte når man vil ha rytme og forpliktelse rundt sprintmål, mens Kanban passer når man vil optimalisere kontinuerlig flyt og redusere flaskehalser. Disse metodene henger tett sammen med brukerhistorier, backlog, testing og DevOps.

---

## XP, TDD og BDD

XP er en smidig metode med sterkt fokus på tekniske praksiser som høy kvalitet, tett feedback, enkel kode og refaktorering. TDD er en praksis innen denne tradisjonen der man skriver test først, ser at den feiler, skriver minimal kode for å få den grønn, og så refaktorerer. BDD bygger videre på tanken om at spesifikasjon og test kan uttrykkes i et språk som også forretning og kunde forstår. Jeg ville forklart samspillet slik: XP gir verdier og praksiser, TDD hjelper oss å bygge kode med god struktur og høy testbarhet, og BDD knytter funksjonelle krav og akseptanse tettere til utvikling og test. For eksempel kan TDD brukes på en prisberegningsfunksjon, mens BDD brukes på brukerens kjøpsopplevelse.

---

## DDD og domeneforståelse

Domain-Driven Design handler om at systemet skal bygges rundt en dyp forståelse av domenet. Jeg ville forklart at dette henger nært sammen med domenemodellering og språk. Hvis teamet og kunden bruker de samme begrepene, og disse begrepene også speiles i koden, blir det mindre misforståelser og bedre samsvar mellom forretningsbehov og teknisk løsning. DDD er spesielt nyttig i komplekse domener der det er viktig å modellere virkeligheten på en presis måte. Dette påvirker både arkitektur, navngiving og hvordan teamet samarbeider.

---

## DevOps, CI og CD

DevOps er en kultur og praksis som kobler utvikling og drift tettere sammen for å muliggjøre rask, stabil og sikker levering. Jeg ville sagt at Agile ofte fokuserer mest på hvordan vi utvikler, mens DevOps utvider dette til også å omfatte bygg, test, deployment, drift og overvåking. CI betyr at kode integreres hyppig og testes automatisk. CD betyr at programvare kan leveres eller deployes automatisk videre i pipelinen. Dette henger tett sammen med automatisert testing, små endringer, regresjonstesting og deployment-arkitektur som containere og Kubernetes. I praksis betyr det at en liten kodeendring kan pushes, bygges, testes og rulles ut på en kontrollert måte med rask feedback.

---

## Testing som helhet

Testing handler både om verifisering og validering. Verifisering betyr at vi sjekker om systemet er bygget riktig, mens validering handler om om vi bygger riktig system. Jeg ville sagt at testing finnes på flere nivåer: enhetstesting, integrasjonstesting, systemtesting og akseptansetesting. Disse nivåene dekker ulike risikoer. Enhetstesting sjekker små isolerte deler, integrasjonstesting ser på samspill, systemtesting vurderer hele systemet, og akseptansetesting vurderer om løsningen oppfyller bruker- eller kundekrav. Dette henger tett sammen med arkitektur, fordi god lagdeling og løs kobling gjør det lettere å teste. Det henger også sammen med smidig utvikling og DevOps, fordi automatiserte tester og CI gjør det mulig å få rask og kontinuerlig feedback.

---

## Mocking, testdata og testfaser

Mocking brukes når vi vil erstatte ekte avhengigheter med kontrollerte testobjekter, slik at vi kan teste én del isolert og deterministisk. Dette er tett koblet til dependency injection og TDD. Testdata brukes for å gi forutsigbare og repeterbare testforhold, slik at testene faktisk sier noe pålitelig. Testfaser som oppsett, gjennomføring, verifisering og opprydding beskriver strukturen i en test. Jeg ville forklart at disse tre temaene sammen handler om testbarhet og kvalitet i selve testarbeidet. Hvis vi ikke har stabile testdata og kontrollerte avhengigheter, får vi skjøre tester som er vanskelige å stole på.

---

## GDPR og profesjonsetikk

GDPR handler om regler for behandling av personopplysninger, men i systemutvikling må dette forstås som noe som påvirker design og arkitektur, ikke bare juridikk. Dataminimering, sikkerhet, innsyn og sletting må bygges inn i systemet. Profesjonsetikk går enda bredere og handler om utviklerens ansvar for konsekvensene av teknologien. Jeg ville forklart at dette henger tett sammen med kvalitet: et system som krenker personvern, diskriminerer brukere eller er farlig i bruk, er ikke et godt system selv om det fungerer teknisk. Derfor må etikk og juss ses som en del av god systemutvikling, ikke noe som kommer i tillegg etterpå.

---

## Prosjektplanlegging og risiko

Prosjektplanlegging handler om å skape retning og struktur, mens risikoanalyse handler om å identifisere hva som kan gå galt og prioritere tiltak. Jeg ville forklart at nesten hele pensum egentlig kan ses som ulike former for risikoreduksjon. Prototyper reduserer risiko for feil løsning. UML reduserer risiko for misforståelser. Arkitektur reduserer risiko for teknisk kaos. Testing reduserer risiko for feil i produksjon. DevOps reduserer risiko ved leveranse. Risikoanalyse og risk poker hjelper teamet å prioritere innsats der konsekvensene er størst.

---

# Del 3: “Hvis du får spørsmål om X, koble det til Y og Z”-oversikt for rask pugging

Dette er laget for muntlig og skriftlig eksamen, så du raskt kan utvide svarene dine.

---

## MMI / interaksjonsdesign
**Hvis du får spørsmål om interaksjonsdesign, koble det til:**
- **prototyping**, fordi design må konkretiseres
- **evaluering/brukertesting**, fordi design må prøves ut
- **Normans prinsipper**, fordi de gir språk for god brukskvalitet
- **universell utforming/WCAG**, fordi godt design også må være tilgjengelig

**Eksempelsetning:**  
“Interaksjonsdesign handler ikke bare om layout, men om hvordan brukeren opplever samspillet, og derfor henger det tett sammen med prototyping, evaluering og universell utforming.”

---

## Prototyping
**Koble til:**
- interaksjonsdesign
- evaluering
- brukertesting
- smidig/iterativ utvikling

**Eksempelsetning:**  
“Prototyper brukes for å teste designhypoteser tidlig, og er derfor tett koblet til både brukertesting og smidige iterasjoner.”

---

## Evaluering
**Koble til:**
- testing vs evaluering
- brukertesting
- heuristisk evaluering
- validering

**Eksempelsetning:**  
“Evaluering er bredere enn testing fordi det handler om å vurdere om løsningen er nyttig og brukbar, ikke bare om den er feilfri.”

---

## Brukertesting
**Koble til:**
- prototyper
- evaluering
- MMI
- usability

**Eksempelsetning:**  
“Brukertesting er en evalueringsmetode der vi observerer om brukeren faktisk klarer oppgaver i løsningen.”

---

## Universell utforming
**Koble til:**
- WCAG
- lovkrav
- MMI
- profesjonsetikk

**Eksempelsetning:**  
“Universell utforming er både et kvalitetsmål, et inkluderingsmål og i mange tilfeller et lovkrav.”

---

## WCAG
**Koble til:**
- universell utforming
- testing
- lov/forskrift
- konkrete designvalg

**Eksempelsetning:**  
“WCAG gjør universell utforming konkret gjennom testbare kriterier som kontrast, tastaturnavigasjon og alternativ tekst.”

---

## Use case
**Koble til:**
- brukerhistorier
- sekvensdiagram
- akseptansetesting
- funksjonelle krav

**Eksempelsetning:**  
“Use case beskriver hvordan en aktør oppnår et mål i systemet, og kan brukes som grunnlag for både sekvensdiagram og testscenarioer.”

---

## Domenemodell
**Koble til:**
- DDD
- klassediagram
- felles språk
- kravforståelse

**Eksempelsetning:**  
“Domenemodellen hjelper teamet å forstå hvilke begreper som er sentrale i problemdomenet, og den legger grunnlaget for videre design.”

---

## Sekvensdiagram
**Koble til:**
- use case
- klassediagram
- arkitektur
- ansvar mellom komponenter

**Eksempelsetning:**  
“Sekvensdiagram viser hvordan delene samarbeider over tid for å realisere et use case.”

---

## Klassediagram
**Koble til:**
- domenemodell
- objektorientering
- testbarhet
- sekvensdiagram

**Eksempelsetning:**  
“Klassediagrammet viser den statiske strukturen, mens sekvensdiagrammet viser hvordan denne strukturen brukes i praksis.”

---

## Tilstandsmaskindiagram
**Koble til:**
- domenelogikk
- sekvensdiagram
- use case
- objekters livsløp

**Eksempelsetning:**  
“Tilstandsmaskindiagram er særlig nyttig når et objekt har tydelige livsfaser, som en ordre eller en timeavtale.”

---

## Programvarearkitektur
**Koble til:**
- kompleksitetshåndtering
- testing
- deployment
- kvalitetskrav

**Eksempelsetning:**  
“Arkitektur handler om å organisere systemet slik at det møter kvalitetskrav som vedlikeholdbarhet, testbarhet og skalerbarhet.”

---

## Trelagsarkitektur
**Koble til:**
- klient-tjener
- MVC
- testing
- lav kobling

**Eksempelsetning:**  
“Ved å skille presentasjon, forretningslogikk og data blir systemet lettere å forstå, teste og vedlikeholde.”

---

## Monolitt
**Koble til:**
- enkel oppstart
- enklere debugging
- svakere skalering
- alternativ til mikrotjenester

**Eksempelsetning:**  
“Monolitt er ofte et godt startpunkt fordi løsningen er enklere å utvikle og drifte før kompleksiteten blir for stor.”

---

## Mikrotjenester
**Koble til:**
- DevOps
- CI/CD
- distribuerte systemer
- event-bus eller REST

**Eksempelsetning:**  
“Mikrotjenester gir uavhengig deploy og skalering, men øker kompleksiteten i drift, testing og observability.”

---

## MVC
**Koble til:**
- UI-struktur
- trelagsarkitektur
- interaktive apper
- separasjon av ansvar

**Eksempelsetning:**  
“MVC er et mønster for å strukturere interaktive applikasjoner slik at presentasjon og logikk ikke blandes unødvendig.”

---

## Scrum
**Koble til:**
- backlog
- brukerhistorier
- sprint review
- retrospektiv

**Eksempelsetning:**  
“Scrum organiserer smidig arbeid i sprinter, og bruker seremonier for å planlegge, følge opp, evaluere og forbedre.”

---

## Kanban
**Koble til:**
- flyt
- WIP-begrensning
- DevOps
- flaskehalser

**Eksempelsetning:**  
“Kanban fokuserer på kontinuerlig flyt og gjør flaskehalser synlige gjennom tavlen og begrensning av arbeid i prosess.”

---

## XP
**Koble til:**
- TDD
- parprogrammering
- refaktorering
- feedback

**Eksempelsetning:**  
“XP er en smidig tilnærming som konkretiserer hvordan teamet jobber teknisk for å sikre kvalitet og rask feedback.”

---

## TDD
**Koble til:**
- enhetstesting
- mocking
- dependency injection
- refaktorering

**Eksempelsetning:**  
“TDD fremmer testbar kode og korte feedback-looper ved at testen skrives før implementasjonen.”

---

## BDD
**Koble til:**
- brukerhistorier
- akseptansetesting
- Gherkin
- kunde/forretning

**Eksempelsetning:**  
“BDD gjør krav mer testbare og forståelige ved å uttrykke systemets atferd i et språk både tekniske og ikke-tekniske kan lese.”

---

## DevOps
**Koble til:**
- CI/CD
- automatiserte tester
- containere
- monitorering

**Eksempelsetning:**  
“DevOps kobler utvikling og drift for å gjøre leveranser raskere, tryggere og mer automatiserte.”

---

## Testing generelt
**Koble til:**
- verifisering vs validering
- testnivåer
- automasjon
- risiko

**Eksempelsetning:**  
“Testing handler både om å sjekke at systemet er bygget riktig, og om å vurdere om vi har bygget riktig system.”

---

## Enhetstesting
**Koble til:**
- TDD
- mocking
- DI
- byggeprosess

**Eksempelsetning:**  
“Enhetstesting fokuserer på små isolerte deler og er ofte første forsvarslinje mot feil.”

---

## Integrasjonstesting
**Koble til:**
- API
- databaser
- tjenestesamspill
- arkitektur

**Eksempelsetning:**  
“Integrasjonstesting avdekker feil som ikke vises når delene testes isolert.”

---

## Akseptansetesting
**Koble til:**
- BDD
- kunde
- brukerhistorier
- validering

**Eksempelsetning:**  
“Akseptansetesting vurderer om løsningen faktisk oppfyller behovene og kravene som er avtalt.”

---

## Regresjonstesting
**Koble til:**
- CI
- automatiserte tester
- små endringer
- trygg videreutvikling

**Eksempelsetning:**  
“Regresjonstesting sikrer at eksisterende funksjonalitet ikke blir ødelagt når vi gjør endringer.”

---

## Mocking
**Koble til:**
- enhetstesting
- dependency injection
- determinisme
- testbar arkitektur

**Eksempelsetning:**  
“Mocking gjør det mulig å teste én del isolert ved å kontrollere responsen fra avhengigheter.”

---

## GDPR
**Koble til:**
- sikkerhet
- arkitektur
- profesjonsetikk
- krav

**Eksempelsetning:**  
“GDPR påvirker ikke bare jussen rundt systemet, men også hvordan vi designer datalagring, tilgang og sletting.”

---

## Profesjonsetikk
**Koble til:**
- GDPR
- universell utforming
- sikkerhet
- kvalitet

**Eksempelsetning:**  
“Profesjonsetikk handler om at utviklere må ta ansvar for konsekvensene av teknologien de lager, ikke bare den tekniske funksjonen.”

---

## Risikoanalyse
**Koble til:**
- testprioritering
- prosjektplanlegging
- arkitekturvalg
- risk poker

**Eksempelsetning:**  
“Risikoanalyse hjelper teamet å prioritere innsats der sannsynlighet og konsekvens er størst.”

---

# Hvordan bruke dette smartest

Jeg anbefaler at du pugger i denne rekkefølgen:

1. **Lær hovedkjeden:**  
   brukerbehov → krav → modellering → arkitektur → implementasjon → testing → drift/evaluering

2. **Lær koblingsord:**  
   “Dette henger sammen med …”, “Dette brukes som grunnlag for …”, “Dette påvirker …”

3. **Lær 1 eksempel per hovedtema**, for eksempel:
   - nettbutikk
   - timebestilling
   - innlogging
   - ordrebehandling

4. **Svar aldri isolert på eksamen** hvis du kan unngå det.  
   Koble alltid minst 2–3 temaer sammen.

---

> **@GPT-5.4:**
> 
> Hvis du vil, kan jeg som neste steg lage enten:
> 
> 1. **en kompakt 2-siders puggeversjon** av alt over,  
> 2. **en stor quiz med muntlige eksamensspørsmål og modell-svar**, eller  
> 3. **en “falske venner og vanlige feil” oversikt** over begreper som lett blandes, som evaluering vs testing, use case vs brukerhistorie, monolitt vs mikrotjenester, Scrum vs Kanban, og verifisering vs validering.