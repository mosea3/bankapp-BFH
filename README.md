# bankapp-BFH
BFH Programmiermethoden (2)

Bank 1: Klassen und Objekte
In dieser Ãœbung geht es darum, eine Klasse (Account) zu implementieren und ein Objekt dieser Klasse zu erzeugen und zu manipulieren.
Klassen.

![alt text](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v1/klassen.svg "UML")

[API-Dokumentation](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v1/doc/index.html)

**Aufgaben 1(Klassen und Objekte)**
* Implementieren Sie im Package bankapp.account die Klasse Account, die ein Bankkonto reprÃ¤sentiert.
* Implementieren Sie im Package bankapp die Klasse Main, deren main-Methode ein Bankkonto erzeugt, einen Geldbetrag einzahlt, einen Geldbetrag abhebt und den resultierenden Kontostand ausgibt.
* Testen Sie die Klasse Account mit dem JUnit-Test [AccountTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v1/AccountTest.java).

**Aufgaben 2 (Objekte)**
* Implementieren Sie im Package bankapp.bank die Klasse Bank, welche Bankkonten in einer Liste verwaltet und Methoden fÃ¼r Banktransaktionen zur Verfügung stellt.
* Passen Sie die Klasse Main so an, dass die main-Methode ein Bank-Objekt erzeugt und damit ein Bankkonto erÃ¶ffnet, einen Geldbetrag einzahlt, einen Geldbetrag abhebt, den resultierenden Kontostand ausgibt und das Konto wieder schliesst.
* Testen Sie die Klasse Bank mit dem JUnit-Test [BankTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v2/BankTest.java).

**Aufgaben 3 (Objektbeziehungen)**
![Negativbeispiel, wie ein ATM nicht sein sollte, aber es dennoch so gibt](https://raw.githubusercontent.com/mosea3/bankapp-BFH/master/doc/Negativbeispiel-Domodossola.jpg)
* Implementieren Sie im Package bankapp.atm die Klasse ATM, welche eine Benutzerführung zum Ausführen von Banktransaktionen zur Verfügung stellt (Bankomat).
* Passen Sie die Klasse Main so an, dass die main-Methode ein Bank-Objekt erzeugt, damit ein ATM-Objekt erzeugt und dann den Bankomaten laufenlässt.

**Aufgaben 4 (Vererbung)**
* Definieren Sie die Klasse Account als abstrakt und leiten Sie die Klassen PersonalAccount und SavingsAccount ab, welche Privat- bzw. Sparkonten repräsentieren.
* Überschreiben Sie in der Klasse SavingsAccount die Methode withdraw so, dass der Kontostand nicht negativ und eine konstante Rückzugslimite nicht überschritten werden kann.
* Testen Sie die Klassen mit den JUnit-Tests [PersonalAccountTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v4/PersonalAccountTest.java) und [SavingsAccountTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v4/SavingsAccountTest.java).
* Definieren Sie in der Klasse Bank Konstanten für die beiden Kontotypen und ergänzen Sie die openAccount-Methode um einen Parameter, welcher den Typ des zu eröffnenden Kontos bestimmt.
* Passen Sie die Klasse ATM so an, dass beim Eröffnen eines Kontos der Kontotyp ausgewählt werden kann.

**Aufgaben 5 (Enumerations)**
* Definieren Sie im Package bankapp.bank die Enumeration AccountType, welche die möglichen Kontotypen deklariert.
Passen Sie die Klassen Bank und ATM so an, dass anstelle der Bank-Konstanten die Enumeration AccountType verwendet wird.

**Aufgaben 6 (Interfaces)**
* Definieren Sie das Interface Bank, welches die Transaktionsmethoden einer Bank deklariert.
* Benennen Sie die Klasse Bank in BankImpl um und implementieren Sie das Interface Bank.
* Implementieren Sie im Package bankapp.atm die Klasse AccountComparator, welche das Interface java.util.Comparator implementiert, sodass zwei Konten aufgrund ihres Kontostands verglichen werden.
* Passen Sie die Klasse ATM so an, dass beim Verlassen des Bankomaten alle Konten nach aufsteigendem Kontostand ausgegeben werden.

**Aufgaben 7 (Exception Handling)**
* Implementieren Sie im Package bankapp.bank die Exception-Klasse BankException, welche Applikationsfehler der Bank repräsentiert.
* Passen Sie die Methoden der Account-Klassen und der Klasse Bank so an, dass im Fehlerfall eine BankException mit zugehöriger Fehlermeldung geworfen wird, und entfernen Sie alle überflüssigen Returnwerte.
* Testen Sie die Klassen mit den JUnit-Tests [PersonalAccountTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v7/PersonalAccountTest.java), [SavingsAccountTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v7/SavingsAccountTest.java) und [BankTest](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v7/BankTest.java).
* Passen Sie die Klasse ATM so an, dass auftretende Exceptions abgefangen und die zugehörige Fehlermeldung ausgegeben wird.

**Aufgaben 8 (Collections und Generics)**
* Ersetzen Sie in der Klasse BankImpl die Liste der Kontos durch eine Map, welche eine Kontonummer auf das zugehörige Konto abbildet, und passen Sie die Methoden der Klasse entsprechend an.
* Implementieren Sie im Package bank.account die Klasse Transaction, welche die Angaben einer Banktransaktion (Einzahlung, Abhebung) enthält.
* Ergänzen Sie die Klasse Account um eine Liste und fügen Sie für jede ausgeführte Transaktionen ein entsprechendes Objekt hinzu.
* Ergänzen Sie die Klassen Account und Bank um je eine Methode getTransactions, welche die Liste der Transaktionen eines Kontos zurückgibt.
* Ersetzen Sie in der Klasse ATM die Abfrage des Kontostands durch eine Abfrage des Kontoauszugs.
* Versehen Sie die Klasse AccountComparator mit einem Typparameter, sodass keine Typumwandlungen mehr notwendig sind.

**Aufgaben 9 (Ein- Ausgabe)**
* Implementieren Sie in den Klassen Account und Transaction das Interface Serializable.
* Ergänzen Sie die Klasse BankImpl um die Methoden loadData und saveData, mit denen die letzte Kontonummer und die Bankkonten mittels Objektserialisierung aus einer Datei gelesen bzw. in eine Datei geschrieben werden.
* Laden Sie im Konstruktor der Klasse BankImpl die Bankdaten und speichern Sie diese nach jeder Änderung wieder ab.

**Aufgaben 10 (Threading)**
* Implementieren Sie in den Account-Klassen eine Methode getInterestRate, mit welcher der Zinsfuss des entsprechenden Kontotyps abgefragt werden kann.
* Ergänzen Sie die Klasse Account um die Methode payInterests, welche ein Konto mit dem entsprechenden Zinsfuss verzinst.
* Leiten Sie die Klasse BankImpl von der Standardklasse Thread ab und implementieren Sie die Methode run, welche alle Bankkonten periodisch verzinst.
* Starten Sie im Konstruktor der Klasse BankImpl den zugehörigen Thread.
