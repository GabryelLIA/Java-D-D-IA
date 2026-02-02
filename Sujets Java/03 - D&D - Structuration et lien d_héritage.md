---
title: 🐉 3-Structuration et lien d'héritage🐉
---
# :dragon: **ITÉRATION 3** :dragon:

# Organisation du code

# Héritage et classes abstraites

![](./ressources/image3.png)
*source : gmutlu*

## :green_book: Modalités

-   Travail en autonomie

-   Production individuelle

-   Durée : **1 jour**

## :sunny: Objectifs

-   Implémenter l'héritage

-   Manipuler des classes abstraites

-   Gérer les exceptions

## :dart: Compétences

-   Mettre en œuvre l'héritage objet

-   Manipuler classes abstraites

-   Gérer les exceptions (erreurs)

# 1 - Etude de tutoriel

-   Dans un premier temps vous allez vous familiariser avec les concepts
    d'héritage.

## :mag_right: Ressources

-   *Openclassrooms :*

    -   [https://openclassrooms.com/en/courses/6173501-debutez-la-programmation-avec-java/6458196-specialisez-vos-classes-avec-l-heritage-et-le-polymorphisme](https://openclassrooms.com/en/courses/6173501-debutez-la-programmation-avec-java/6458196-specialisez-vos-classes-avec-l-heritage-et-le-polymorphisme)

-   *Ressource vidéo*

    -   [https://www.youtube.com/watch?v=On0X8RLMqko&list=PLABHMI-ayZf6DNjsiiSii8p4Axs2pDZbg&index=9](https://www.youtube.com/watch?v=On0X8RLMqko&list=PLABHMI-ayZf6DNjsiiSii8p4Axs2pDZbg&index=9)

## :dart: Compétences

-   N/A

# **2 - Implémentation du code**

Nous allons maintenant introduire les **Guerriers** et **Magiciens** qui
auront leur propre classe et des comportements spécifiques. Nous
utiliserons les notions d'héritage et de classe abstraite pour organiser
votre code, clarifier l'ensemble et profiter de la force des concepts
objet.

De même nous allons créer les classes **Arme** et **Sort** qui
hériteront de **EquipementOffensif,** ainsi que les classes **Bouclier**
et **Philtre** qui hériteront de **EquipementDefensif.**

## 2.1 Héritage et structuration du projet

-   Créez les classes *Guerrier* et *Magicien*. Ces objets de type
    *Guerrier* et *Magicien* vont hériter de la **classe (abstraite)**
    *Personnage*. Cet héritage va permettre de personnaliser un certain
    nombre d'attributs et de comportements en fonction du type de la
    classe *Personnage*.

-   Crééez les classes *Arme, Sort, Bouclier et Philtre.* Les classes
    *EquipementOffensif* et *EquipementDefensif* deviennent abstraites.

-   Redéfinissez les méthodes *toString()* de vos classes (Par exemple :
    \"Personnage : Thor, Niveau de vie : 5, Force : 5\")

-   Organisez votre code en petits packages.

## 2.2 Gestion des exceptions

Vous créerez une exception que vous appellerez
"**PersonnageHorsPlateauException**" qui sera lancée si la position du
personnage dépasse de la case finale.

-   Tutoriels OpenClassrooms :
    [https://zestedesavoir.com/tutoriels/646/apprenez-a-programmer-en-java/557_java-oriente-objet/2699_les-exceptions/](https://zestedesavoir.com/tutoriels/646/apprenez-a-programmer-en-java/557_java-oriente-objet/2699_les-exceptions/)

-   Gérer l'exception précédente.

## :gift: Livrables
- Codes des itérations à déposer sur GitHub.
- Un glossaire enrichi des différentes syntaxes utilisées est à déposer sur votre GitHub.

## :mag_right: Ressources

-   [Tutoriel Openclassrooms Héritage](https://openclassrooms.com/en/courses/6173501-apprenez-a-programmer-en-java/6458196-specialisez-vos-classes-avec-l-heritage-et-le-polymorphisme)

-   [Tutoriel Openclassrooms Exceptions](https://zestedesavoir.com/tutoriels/646/apprenez-a-programmer-en-java/557_java-oriente-objet/2699_les-exceptions/) 

-   [Ressource vidéo (UPMC)](https://www.youtube.com/watch?v=On0X8RLMqko&list=PLABHMI-ayZf6DNjsiiSii8p4Axs2pDZbg&index=8)

-   [Tutoriel d'Oracle pour Java](http://docs.oracle.com/javase/tutorial/java/index.html)

-   [Ressources classes abstraites et intefaces](https://www.lri.fr/~jacquot/ipo/08_Abstraction.pdf)

-   [Ressource vidéo : EPFL classe et méthodes abstraites](https://www.youtube.com/watch?v=sZ3UecFEi8c)
