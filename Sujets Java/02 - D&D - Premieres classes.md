---
title: 🐉 2-D&D-Premières classes🐉
---
# :dragon: **Projet "Donjons & Dragons"** :dragon:

![](./ressources/image2.png)
*source : generation-NT*

## :sunny: Objectifs

Le but de l'ensemble des activités qui suivent est de créer un jeu,
inspiré des jeux de plateaux de l'univers « Donjons et Dragons », en
utilisant le langage Java. L'ensemble des règles du jeu peut être trouvé
dans le document **"Projet D&D - Règles du jeu**".

Nous allons commencer par créer et afficher des personnages.

## :dart: Compétences

-   Programmer avec des variables

-   Programmer une condition

-   Programmer une boucle

-   Programmer avec des tableaux

-   Programmer une fonction et l\'appeler

-   Définir et utiliser une méthode

-   Définir des classes

-   Instancier des objets

-   Générer la javadoc

# **ITÉRATION 2**

# Création des personnages et du plateau de jeu

## :green_book: Modalités

-   Travail en autonomie et production individuelle.

-   Durée : **2 jours** (max)

## 2.1 - Structure du jeu et création de personnages

Nous allons manipuler deux types de personnages : **guerrier** et
**magicien** (pour le moment une seule classe "Personnage", avec un
attribut de type string qui vaudra "guerrier" ou "magicien") et leur
équipement offensif par défaut (arme ou sort). Le **guerrier** possède
un EquipementOffensif (une arme) et peut être équipé d'un
EquipementDefensif (un bouclier) pour se défendre. Le **magicien**
possède un EquipementOffensif (un sort) et peut avoir un
EquipementDefensif ( un) philtre pour se défendre. Chaque type de
personnage est caractérisé par les attributs suivants :

-   *Guerrier* : Nom, Niveau de vie (10), Force d'attaque (10),
    EquipementOffensif, EquipementDefensif

<!-- -->

-   *Magicien* : Nom, Niveau de vie (6), Force d'attaque (15),
    EquipementOffensif, EquipementDefensif

Le programme commence par vous proposer **un premier menu** :

-   **Nouveau personnage ou quitter le jeu** :

    -   Création du personnage : le programme va demander quel type de
        personnage vous voulez créer, puis vous demande les informations
        adéquates pour créer ce personnage, avec la saisie via lecture
        des entrées clavier (classe
        [Scanner](https://www.w3schools.com/java/java_user_input.asp)
        des informations du personnage (Guerrier ou Magicien, et nom).

    -   Pour le personnage en cours de création, un choix permettra de :

        -   afficher toutes les infos du personnage

        -   modifier ses infos

    -   Quitter le jeu : vous pouvez à tout moment quitter le jeu

### CONSEILS DE DÉVELOPPEMENT

-   Préférez le développement en anglais. Si c'est trop complexe, le
    français est toléré

-   Veillez à bien nommer vos classes, fonctions et variables ainsi que
    répartir logiquement vos classes dans des packages correctement
    nommés.

-   Commencez à architecturer votre code correctement en utilisant des
    classes :

    -   Une classe « Personnage » qui aura 3 constructeurs (sans
        paramètres / avec nom / avec nom et type)

    -   Une classe « EquipementOffensif » caractérisée par un type
        (String "Arme" ou "Sort"), un niveau d'attaque et un nom.

    -   Une classe « EquipementDefensif » caractérisée par un type
        (String "Bouclier" ou "Philtre"), un niveau de défense et un
        nom.

    -   Une classe « Menu » qui vous permettra de structurer
        correctement le déroulement du jeu et les messages pour
        l'utilisateur en utilisant des fonctions.

    -   Une classe « Game » qui contiendra la logique interne du jeu (
        joueurs, avancement )

-   **Attention!!** Toutes vos classes devront être
    structurées correctement (Getters/Setters, constructeurs, méthode
    toString(), \...).

### :mag_right: Ressources

-   *Reprenez celles données précédemment.*

## 2.2 - Plateau de Jeu et déplacement du joueur

-   Ajouter une option dans le Menu pour démarrer la partie

-   Au démarrage de la partie, le joueur se trouve sur la case 1 du
    plateau.

-   A chaque tour de jeu le dé virtuel est jeté et le personnage se
    déplace de case en case tant qu'il n'est pas arrivé au bout du
    plateau.

-   Pas de notions d'ennemis, de combats et de caisses surprises dans
    cette première version. Le programme doit afficher (dans la console)
    l'avancement du joueur sur le plateau (case n / 64).

-   Une fois arrivé au bout du plateau, choisir de quitter le jeu ou de
    recommencer une partie.

### CONSEILS DE DÉVELOPPEMENT

1.  Votre méthode main doit rester **très courte** : environ 15 lignes !
    Organisez votre code en conséquence.

2.  L'IDE faisant bien son travail, il vous proposera régulièrement des
    corrections pour vos erreurs, c'est super **mais** n'acceptez
    **JAMAIS** (pour le moment ;-) ). La correction consiste à mettre
    souvent le mot clé "**static**" pour résoudre vos problèmes. Vous
    allez courir à votre perte. A ce stade , nous ne devons pas voir
    dans votre code le mot static (à part pour le main).

3.  Tous vos attributs seront "**private**" par défaut et ne seront
    approchés que par le biais de getters et setters.

### :mag_right: Ressources

-   *Ressources précédentes*


### :gift: Livrables
- Codes commentés des classes « Main », « Personnage », EquipementOffensif », « EquipementDefensif » et « Menu ». A déposer sur GitHub.
- Un glossaire enrichi des différentes syntaxes utilisées est à déposer sur votre GitHub.