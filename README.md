# Camel Case Converter 🐪  

Source du kata : https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

La consigne d'origine est la suivante : 
```
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
Examples

"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
```



## 📌 Objectif
L'idée est de transformer une chaîne du type `"hello_world"` en `"helloWorld"`.  
Je voudrais tester **deux approches** :
1. **Boucle + Regex** → Simplicité et clarté : codé !
2. **Pattern + Matcher** → Expérimentation avancée avec regex : à expérimenter

Ce projet en Java permet de convertir une chaîne de caractères en **camelCase** comme par exemple `"hello_world"` en `"helloWorld"`. 
Je voudrais explorer **deux approches différentes** :  
1. **Boucle + Regex** → Simplicité et lisibilité  : codé !
2. **Pattern + Matcher** → Utilisation avancée des regex en Java : coming soon

## 🚀 Fonctionnalités  
✔ Supprime les séparateurs (`_`) et met en majuscule la lettre suivante  
✔ Fonctionne sur n'importe quelle combinaison de mots séparés par `_` 

## 📂 Structure du projet

camel-case-converter/
│── src/ 
│ ├── main/
│ │ ├── java/com/example/CamelCaseConverter.java
│ ├── test/
│ │ ├── java/com/example/CamelCaseConverterTest.java
│── pom.xml # Dépendances Maven
│── README.md # Explication du projet
│── .gitignore # Fichiers à ignorer

Chaque solution sera dans un fichier séparé :
- **src/main/java/com/example/CamelCaseConverter.java** → Solution avec boucle et regex  
- **src/main/java/com/example/CamelCaseConverterRegex.java** → Solution avec Pattern + Matcher  

## 🛠️ Installation et Exécution  

### **1️⃣ Cloner le repo**
```sh
git clone https://github.com/ElodieGuyard/camel_Case_Converter.git
cd camel_Case_Converter
```
###**2️⃣ Compiler et exécuter (si Maven est installé)**
```sh
mvn compile
mvn exec:java -Dexec.mainClass="com.example.CamelCaseConverter"
```
### **3️⃣ Exécuter les tests**
```sh
mvn test
```

##🔥 Améliorations possibles

🔹 Gérer d'autres séparateurs (-, .)
🔹 Ajouter des tests unitaires en JUnit

## 👩‍💻 Auteur

Projet réalisé par Elodie Guyard ✨

Si vous avez des suggestions ou des retours, n'hésitez pas à ouvrir une issue ou à contribuer ! 🚀
