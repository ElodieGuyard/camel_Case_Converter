# Camel Case Converter 🐪  

Source du kata : https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

La consigne est la suivante : 
```
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
Examples

"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
```

Ce projet est un exercice qui consiste à explorer différentes façons de convertir une chaîne de caractères en camelCase en Java.

## 💡 Objectif
L'idée est de transformer une chaîne du type `"hello_world"` en `"helloWorld"`.  
Je voudrais tester **deux approches** :
1. **Boucle + Regex** → Simplicité et clarté : codé !
2. **Pattern + Matcher** → Expérimentation avancée avec regex : à expérimenter

## 🛠️ Comment ça marche ?
Chaque solution sera dans un fichier séparé :
- **src/CamelCaseConverter.java** → Solution avec boucle et regex  
- **src/CamelCaseConverterRegex.java** → Solution avec Pattern + Matcher  

### **4️⃣ Bonus : Ajouter des tests JUnit ?**  
Bientôt : écriture de tests unitaires avec **JUnit**.  
💡 Par exemple, un fichier `CamelCaseConverterTest.java` dans `tests/`.  

Exemple :  
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CamelCaseConverterTest {
    @Test
    void testToCamelCase() {
        assertEquals("helloWorld", CamelCaseConverter.toCamelCase("hello_world"));
        assertEquals("javaIsCool", CamelCaseConverter.toCamelCase("java_is_cool"));
    }
}
```
