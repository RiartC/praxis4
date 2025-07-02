# praxis4_pizzeria

## Pizzeria Mashup


Idee und Zielsetzung

Unser Projekt ist eine interaktive Webanwendung für eine Pizzeria, die verschiedene externe Datenquellen kombiniert, um den Besuchern ein modernes, benutzerfreundliches und informatives Erlebnis zu bieten. Das Ziel ist es, nicht nur Informationen wie Speisekarte, Öffnungszeiten und Standort anzuzeigen, sondern auch aktuelle externe Inhalte wie Wetter, News, Lieferzeit-Prognosen und Tagesangebote dynamisch einzubinden.
Die Anwendung wird als Mashup konzipiert, wobei Inhalte aus APIs und HTML-Seiten kombiniert und mit unserer eigenen Backend-Datenbank verknüpft werden.


Technologien

Frontend: React mit TypeScript
Backend: Java Spring Boot (REST API)
Datenbank: MySQL, Zugriff über Spring Data (JPA)
Hosting & Versionskontrolle: GitHub mit Wiki, Projektboard (Kanban), ReadMe.md & Journal
APIs & Datenquellen:
OpenWeatherMap API (Wetteranzeige für Standort der Pizzeria)
Google Maps API (Standortanzeige & Routenplanung)
20min RSS Newsfeed (lokale News beim Besuch der Seite)
Subway/Essensangebote-Feeds als Beispiel für Tagesmenüs
Eigenes JSON-File mit Speisekarte, Preise & Angeboten

Funktionalitäten

Startseite: Übersicht über die Pizzeria, aktuelle Öffnungszeiten, Tagesangebot
Speisekarte: Dynamisch geladen aus eigener JSON/CSV-Quelle
Standortkarte: Anzeige über Google Maps inkl. Navigation zum Restaurant
Live-Wetter: Anzeige des aktuellen Wetters für den Standort der Pizzeria
News-Ticker: Regionale News eingebunden via RSS Feed (z. B. 20min.ch)
Bestellzeit-Prognose: Abhängig vom Wetter, Uhrzeit & Wochentag simulieren wir eine voraussichtliche Lieferzeit

Mashup-Elemente & Originalität

Die Mashup-Idee hebt sich durch die clevere Kombination von Wetterdaten, News und Standortinformationen in Verbindung mit Gastronomieinhalten hervor. Gäste erhalten nicht nur klassische Informationen zur Pizzeria, sondern auch nützliche Echtzeitdaten, die ihr Besuchserlebnis verbessern. Die Anwendung kann z. B. empfehlen: „Heute ist schlechtes Wetter – gönn dir Pizza daheim, Lieferzeit ca. 35 Min!“

Bewertungskriterien (Erfüllt)
Kriterium --- Umsetzung
Java Spring Boot Backend --- Eigene REST API für Speisekarte & Angebote
Min. 2 externe Datenquellen --- Wetter (OpenWeather), Maps, RSS
Mashup-Logik & Kombination --- Speisekarte + Wetter + Lieferzeit-Prognose
Originalität --- Fokus auf Gastronomie kombiniert mit Echtzeitdaten
Lokale Speicherung (DB) --- Speisekarte & Tagesangebote lokal gespeichert
Projektstruktur --- GitHub, Wiki, ReadMe, Journal, Projektboard

Zielgruppe & Nutzen
Die Zielgruppe sind Pizza-Liebhaber, Touristen oder hungrige Leute auf der Suche nach einer schnellen, gut informierten Entscheidung. Durch die Integration nützlicher Live-Daten in eine einfache Restaurantseite schaffen wir ein neues digitales Erlebnis im Gastronomiebereich.
