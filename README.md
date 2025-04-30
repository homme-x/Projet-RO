# 🌳 Projet Arbre Généalogique

## Description

Cette application permet de modéliser et de visualiser dynamiquement un **arbre généalogique** en utilisant les **algorithmes de graphes** (Dijkstra, Bellman-Ford, Prim, Kruskal) pour explorer les relations familiales.

L’utilisateur peut :
- Ajouter des membres de sa famille.
- Rechercher les liens de parenté entre deux personnes.
- Visualiser l’arbre sous forme interactive.
- Identifier des sous-familles ou branches à l’aide d’algorithmes d’arbres couvrants.

---

## 🧰 Technologies

| Frontend       | Backend         | Base de données |
|----------------|------------------|-----------------|
| React.js + D3.js | Spring Boot (Java) | SQLite         |

---

## 📁 Structure du projet

/frontend --> Interface utilisateur React.js /backend --> API Spring Boot + logique métier /database --> Fichier SQLite (famille.db)

yaml
Copier
Modifier

---

## ⚙️ Installation

### Prérequis

- Node.js ≥ 14.x
- Java 17+
- Maven ou Gradle
- SQLite3

### 1. Lancer le backend Spring Boot


cd backend
./mvnw spring-boot:run

### 2. Lancer le frontend React
cd frontend
npm install
npm start

##🧠 Fonctionnalités principales
🔍 Algorithmes intégrés :
Dijkstra : chemin de parenté le plus court entre deux personnes.

Bellman-Ford : gestion de relations indirectes ou complexes.

Prim : construction de l’arbre couvrant minimal.

Kruskal : détection de sous-familles/groupes.

👤 Interface utilisateur :
Recherche par nom

Visualisation interactive (D3.js)

Ajout manuel des membres

Requête de parenté entre deux individus

🗃️ Stockage des données
Base de données locale SQLite (projetRO.db)

Format des relations : parent-enfant avec poids (degré de parenté)

