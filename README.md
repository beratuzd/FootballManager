# ⚽ Java Football Manager (Console Mini-Game)

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Version" />
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" alt="Build Status" />
  <img src="https://img.shields.io/badge/Architecture-OOP-blueviolet?style=for-the-badge" alt="Architecture" />
  <img src="https://img.shields.io/badge/Platform-Console-black?style=for-the-badge&logo=gnubash&logoColor=white" alt="Platform" />
</p>

> [!NOTE]
> An interactive, turn-based text simulation game written in Java that models realistic football mechanics using clean Object-Oriented Programming (OOP) paradigms.

---

## 🌟 Key Features

- 🛡️ **Squad Creation & Strict Data Validation:**
  - Build two squads: **Home** and **Away**.
  - Exactly 3 field players (Striker `St`, Midfielder `Cm`, Defender `Cb`) and 1 Goalkeeper per team.
  - Strict input boundary loops for **Age (16–42)**, **Jersey Numbers (1–99)**, and **Ratings (1–99)**.
  - Position locking ensures no duplicate positions are assigned within the same squad.

- 🔄 **Two-Tier Interactive Decision Loops:**
  - Decision-level error handling prevents wasted turns if a user enters an invalid tactical command or player index.

- ⏱️ **Dynamic Match Timeline:**
  - 90-minute game loop evaluated at **15-minute intervals** (Minutes 15, 30, 45, 60, 75, 90).
  - Procedural pitch distance generation (0–100 meters).
  - Built-in **Half-time (Minute 45)** and **Full-time (Minute 90)** milestones.

- 🧤 **Interactive Goalkeeper Duel System:**
  - Shot success is dynamically calculated using shooting distance, player `shootingRating`, and opposing goalkeeper `reflexRating`.
  - Goalkeeper `handlingRating` determines whether a saved shot is securely caught or deflected out for a corner kick.

---

## 🏗️ OOP Architecture

```
                  ┌───────────────────────────┐
                  │          Athlete          │
                  │ (Base Class: Stats & Core)│
                  └─────────────┬─────────────┘
                                │
               ┌────────────────┴────────────────┐
               ▼                                 ▼
      ┌──────────────────┐             ┌──────────────────┐
      │  FootballPlayer  │             │    GoalKeeper    │
      │ - position       │             │ - reflexRating   │
      │ - passingRating  │             │ - handlingRating │
      │ - shootingRating │             └──────────────────┘
      └──────────────────┘
```

> [!IMPORTANT]
> **Core OOP Principles Applied:**
> * **Inheritance:** `FootballPlayer` and `GoalKeeper` inherit identity attributes from `Athlete`.
> * **Polymorphism:** Subclasses override `play()` for role-specific pitch behavior.
> * **Encapsulation:** Private attributes guarded by explicit getter/setter methods.
> * **Cross-Entity Interaction:** Attackers interact dynamically with the opposing squad's goalkeeper instance.

---

## 📊 Probability & Mechanics Matrix

### 1. Shooting vs. Goalkeeper Duels

```diff
+ Goal Scored: Shot accuracy test succeeds against goalkeeper reflex rating.
- Save / Corner: Shot missed; goalkeeper handling rating determines catch or corner.
```

| Distance Range | Required Rating | Accuracy (Shooter < GK Reflex) | Accuracy (Shooter == GK Reflex) | Accuracy (Shooter > GK Reflex) | Handling Threshold (Corner vs Catch) |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **0 – 30 m** | $\ge 30$ | **26%** | **47%** | **65%** | $\ge 78$ / $\ge 87$ / $\ge 95$ |
| **31 – 50 m** | $\ge 50$ | **30%** | **50%** | **70%** | $\ge 70$ / $\ge 82$ / $\ge 90$ |
| **51 – 70 m** | $\ge 70$ | **30%** | **38%** | **45%** | $\ge 60$ / $\ge 70$ / $\ge 80$ |
| **71 – 100 m** | $\ge 90$ | **37%** | **40%** | **47%** | $\ge 55$ / $\ge 60$ / $\ge 65$ |

### 2. Passing Mechanics

| Distance Range | Required Pass Rating | Pass Success Rate |
| :--- | :---: | :---: |
| **0 – 30 m** | $\ge 0$ | **70%** |
| **31 – 50 m** | $\ge 50$ | **70%** |
| **51 – 70 m** | $\ge 70$ | **70%** |
| **71 – 100 m** | $\ge 90$ | **90%** |

---

## 📁 Project Structure

```text
FootballManager/
├── src/
│   ├── Athlete.java         # Base entity class with common attributes and getters/setters
│   ├── FootballPlayer.java  # Field player implementation (passing & shooting math)
│   ├── GoalKeeper.java      # Goalkeeper entity with reflex and handling ratings
│   ├── Team.java            # Team entity managing player roster via ArrayList
│   └── Main.java            # Game loop, input validation, match engine, and UI
└── README.md
```

---

## 🚀 Installation & Execution

> [!TIP]
> You can run this project directly from any terminal without an IDE using the steps below:

```diff
# Step 1: Clone the repository to your local machine
+ git clone https://github.com/YOUR_USERNAME/FootballManager.git
+ cd FootballManager

# Step 2: Compile all Java sources into a 'bin' directory
+ javac -d bin src/*.java

# Step 3: Run the compiled application
+ java -cp bin Main
```

*(Alternatively, open the project in **IntelliJ IDEA**, **VS Code**, or **Eclipse** and run `Main.java`.)*

---

## 🎮 How to Play

1. 🏷️ **Team Registration:** Enter team names for both Home and Away sides.
2. 👥 **Squad Setup:** For each team, register 3 outfield players (`St`, `Cm`, `Cb`) and 1 Goalkeeper.
3. ⚽ **Kick-Off:** Type `yes` to commence the match.
4. 🎯 **Match Minutes (15, 30, 45, 60, 75, 90):**
   - Review possession and generated pitch distance.
   - Choose your tactic: type `shoot` or `pass`.
   - Select the player (`1`, `2`, or `3`).
5. 🏆 **Final Whistle:** View the final scoreline at minute 90.
