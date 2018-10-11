# bankapp-BFH
BFH Programmiermethoden (2)

Bank 1: Klassen und Objekte
In dieser Übung geht es darum, eine Klasse (Account) zu implementieren und ein Objekt dieser Klasse zu erzeugen und zu manipulieren.
Klassen.

![alt text](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v1/klassen.svg "UML")

[API-Dokumentation](http://www.sws.bfh.ch/~fischli/courses/medinf/pm/bankapp/v1/doc/index.html)

**Aufgaben 1**

Implementieren Sie im Package bankapp.account die Klasse Account, die ein Bankkonto repräsentiert.
Implementieren Sie im Package bankapp die Klasse Main, deren main-Methode ein Bankkonto erzeugt, einen Geldbetrag einzahlt, einen Geldbetrag abhebt und den resultierenden Kontostand ausgibt.
Testen Sie die Klasse Account mit dem JUnit-Test AccountTest.

**Aufgaben 2**
Implementieren Sie im Package bankapp.bank die Klasse Bank, welche Bankkonten in einer Liste verwaltet und Methoden für Banktransaktionen zur Verfügung stellt.
Passen Sie die Klasse Main so an, dass die main-Methode ein Bank-Objekt erzeugt und damit ein Bankkonto eröffnet, einen Geldbetrag einzahlt, einen Geldbetrag abhebt, den resultierenden Kontostand ausgibt und das Konto wieder schliesst.
Testen Sie die Klasse Bank mit dem JUnit-Test BankTest.

**Aufgaben 3**
Implementieren Sie im Package bankapp.atm die Klasse ATM, welche eine Benutzerf�hrung zum Ausf�hren von Banktransaktionen zur Verf�gung stellt (Bankomat).
Passen Sie die Klasse Main so an, dass die main-Methode ein Bank-Objekt erzeugt, damit ein ATM-Objekt erzeugt und dann den Bankomaten laufenl�sst.

**Aufgaben 4**
Definieren Sie im Package bankapp.bank die Enumeration AccountType, welche die m�glichen Kontotypen deklariert.
Passen Sie die Klassen Bank und ATM so an, dass anstelle der Bank-Konstanten die Enumeration AccountType verwendet wird.
