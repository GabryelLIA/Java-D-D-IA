---
title: Projet D&D - Règles du jeu
---
# **ANNEXE**

# Le jeu Donjons et Dragons

## Introduction

Le but de ce projet est de créer un jeu, inspiré des jeux de plateaux de l’univers « Donjons et Dragons », en utilisant le langage Java. Ce projet se découpe en plusieurs itérations, au cours desquelles de nouvelles fonctionnalités vont vous être demandées.

  

Pour chaque itération, veillez à bien lire les fonctionnalités et livrables demandés. Il est fortement conseillé de passer par une phase de réflexion sur “papier” avant de vous lancer dans le développement à proprement parler. N’hésitez pas à solliciter vos camarades ainsi que les formateurs.

  

**LISEZ ATTENTIVEMENT LE SUJET ! :)**

  

## **Règles du jeu** **final**

Le but du jeu est de faire traverser le plateau par le personnage. Sur le chemin, il rencontrera des ennemis, des armes et des bonus. Il doit sortir vivant de l’aventure !
![](./ressources/image10.png)
Le jeu se déroulant via la console, l’ensemble des images est donné à titre indicatif. Les images sont des “suggestions de présentations”

## **Le plateau de jeu**

Le plateau de jeu est constitué de 64 cases. Chaque case pouvant :

- être vide
    
- contenir un ennemi
    
- contenir une caisse surprise
    
![](./ressources/image11.png)  
### **Les personnages**

Au début de chaque partie, l’utilisateur choisit son personnage (guerrier ou magicien). Chaque type de personnage est caractérisé par les attributs suivants :

![](./ressources/image12.png)  

## **Les caisses surprises**
![](./ressources/image13.png)
### **Les équipements offensifs**

Les armes/sorts sont caractérisés par un niveau d’attaque, qui lorsqu’ils sont utilisés, vont venir augmenter d’autant le niveau d’attaque du personnage.

On proposera dans une première version du jeu, les équipements offensifs décrits ci-dessous :

  

-Les armes (spécifiques au guerrier) :

- Massue : augmente l’attaque de 3 points

- Epée : augmente l’attaque de 5 points

-Les sorts (spécifiques au magicien) :

- Eclair: augmente l’attaque de 2 points.

- Boule de feu : augmente l’attaque de 7 points.

-Les potions (utilisable par tous les personnages) :

- Potion de vie standard : rends 2 points de vie.
    
- Grande potion de vie : rends 5 points de vie.
    

## **Les ennemis**
Les personnages peuvent être confrontés à des ennemis au cours du jeu.
![](./ressources/image14.png)
### **Déroulement du jeu**

Ce jeu se déroule en mode tour par tour. À chaque tour, le joueur va lancer un dé virtuel à 6 faces afin de connaître le nombre de cases duquel il avance :

- Si la nouvelle case atteinte est vide : on passe au tour suivant.
    
- Si la nouvelle case contient une caisse surprise :
    
    - Équipement : l’équipement est ajouté au personnage si et seulement:
        
        - Le personnage est compatible avec cet équipement
            
        - L’équipement actuel est moins avantageux que le nouveau.
            
    - Potions : Le personnage récupère le nombre de points de vie défini par le type de potion.
        
- Si la nouvelle case atteinte contient un ennemi, le combat s’engage.
    

### **Règle des combats**

Le personnage frappe l’ennemi avec la force définie par son équipement (arme ou sorts) et le niveau de vie de l’ennemi diminue en conséquence.

- Si le niveau de vie de l’ennemi atteint 0, il meurt.
    
- Sinon l’ennemi réplique et le niveau de vie du personnage diminue en fonction de la force de frappe de l’ennemi. Ce dernier s’enfuit lorsqu’il vous a frappé
    

  

**Note :** Le niveau de vie d’un même ennemi (sur une même case) doit être persistant d’un tour à l’autre. Si le joueur parvient à vaincre totalement un ennemi (niveau de vie à 0), cet ennemi doit disparaître du plateau.

### **Règle de fin de partie**

La partie est gagnée si le joueur arrive au bout du plateau.

En revanche, si le joueur perd tous ses points de vie, la partie est perdue.