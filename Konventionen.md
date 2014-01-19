Konventionen für VRZ-Software
=============================


Java-Packages
-------------

Die Struktur der Packages in Java orientieren sich an der Softwarearchitektur
mit dem Präfix `de.bsvrz`.

    de.bsvrz.segment.sweinheit.swkomponente*.swmodul

Die SW-Komponente ist optional und kann, wenn vorhanden, beliebig oft vorkommen.


Verzeichnis
-----------

Das Distributionspaket besteht aus einer ZIP-Datei mit folgendem Inhalt. Im
Beispiel wird die SW-Einheit `de.bsvrz.sys.funclib.foo` verwendet.

    de.bsvrz.sys.funclib.foo
        de.bsvrz.sys.funclib.foo.jar
        de.bsvrz.sys.funclib.foo-doc-api.zip
        de.bsvrz.sys.funclib.foo-doc-design.zip
        de.bsvrz.sys.funclib.foo-src.zip
        de.bsvrz.sys.funclib.foo-Build-Report.txt
        de.bsvrz.sys.funclib.foo-LGPL-lizenz.txt

Die Tests folgenden der selben Konvention mit dem zusätzlichen Namensbestandteil
*test*.

    de.bsvrz.sys.funclib.foo
        de.bsvrz.sys.funclib.foo-test.jar
        de.bsvrz.sys.funclib.foo-test-doc-api.zip
        de.bsvrz.sys.funclib.foo-test-doc-design.zip
        de.bsvrz.sys.funclib.foo-test-src.zip
        de.bsvrz.sys.funclib.foo-test-Build-Report.txt
        de.bsvrz.sys.funclib.foo-test-LGPL-lizenz.txt

Bibliotheken werden in seperaten Unterverzeichnissen abgelegt.


Konfiguration
-------------

Die Konfiguration wird in je ein Paket pro Konfigurationsverantwortlichen
geliefert. Das folgende Beispiel zeigt den Konfigurationsverantwortlichen *foo*.

    kv.foo
        config
        	kb.aoe.foo
        	kb.default.aoe.foo
            kb.kv.foo.config
            kb.tmBar.config
            kb.objekteFoobar.config
            verwaltungsdaten.xml
        xml
            kb.kv.foo.xml
            kb.tmBar.xml
            kb.objekteFoobar.xml
        ReleaseNotes
            Datenmodelle-kv-foo.pdf
            ReleaseNotes-kv.foo.doc


Projektstruktur
---------------

Die folgende Projektstruktur ist vorgeschlagen, aber noch nicht bestätigt.

    Projektname
        archiv
        bin
            ant
            bash
            dos
            logs
        debug
        dokumentation
        konfiguration
            config
            log
            xml
        lib
            de.bsvrz.*
        log
        parameter


Distributionspaket
------------------

Alle Dateinamen dürfen nur aus ASCII-Zeichen bestehen nach dem regulären
Ausdruck `[A-Za-z0-9_-.]` bestehen. Der Unterstrich _ wird nur Trennung von
Namensbestandteilen verwendet.

Der Name des Distributionspakets wird nach folgenden Schema gebildet.

    Typ_Bezeichnung_Status_Version_StandDatum[_StandZeit][_Zusatz].Endung

Die wichtigsten Typen sind:

  * SWE    -> SW-Einheit
  * KV     -> Konfiguration eines Konfigurationsverantwortlichen
  * PlugIn -> Plug-in für das Rahmenwerk

Die Bezeichnung ist der Name der zu liefernden Software, Konfiguration usw.

Die wichtigsten Werte für den Status sind.

  * FREI -> Produkt durch durch Hersteller freigegeben
  * BETA -> Beta

Die Version wird mit dem Buchstaben V als Präfix nach dem Schema *Semantic
Versioning* (http://semver.org) gebildet.

Das Standdatum wird mit dem Buchstaben D als Präfix nach dem Schema
`DYYYY-MM-DD` angegeben. Die Standzeit entsprechen mit dem Buchstaben T als
Präfix nach dem Schema `Thhmmss`.

Der Zusatz ist ein beliebiger Text.

Die Endung ist die übliche Dateiendung, z.B. `zip`.
