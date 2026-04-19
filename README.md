# 🎮 Draw It or Lose It – Software Design Document

This repository contains the completed software design document for **CS-230 Project Three**, developed for *The Gaming Room*.

## 📘 Operating Platforms Class – Software Design Reflection

### 🧩 Client Overview
The client for this project was **The Gaming Room**, a company that wanted to expand its existing game, *Draw It or Lose It*, from a single-platform Android application into a **web-based game application** that could run across multiple operating systems and devices.

The software needed to:
- Support multiple games, teams, and players
- Enforce unique naming for games and teams
- Use a centralized service for managing game data
- Scale within a distributed environment
- Provide cross-platform accessibility through web technologies

---

### ✅ What I Did Well
One of my strengths in this project was clearly connecting the client’s business requirements to technical design decisions. I effectively explained:
- The use of the **Singleton pattern** to ensure a single instance of the game service
- The benefits of a **layered architecture** for scalability and maintainability
- Platform comparisons (Linux, Windows, Mac, Mobile) in terms of cost, performance, and flexibility

This helped make the design document practical and aligned with real-world software development considerations.

---

### 🛠️ What the Design Process Helped Me Learn
Working through the design document was valuable because it required planning before coding. It pushed me to:
- Think about system structure and relationships between components
- Consider deployment environments and scalability early
- Understand how design decisions impact long-term development

This approach made implementation more structured and reduced the likelihood of major redesigns later.

---

### 🔄 What I Would Improve
If I could revise one part of my work, I would improve the **Recommendations section** by making the tone more objective from the start.

While my analysis was strong, some wording leaned slightly toward opinion rather than neutral evaluation. I would refine this by:
- Using more evidence-based language
- Presenting comparisons more evenly
- Supporting recommendations with clearly stated technical reasoning

---

### 🎯 Interpreting User Needs
I interpreted the user’s needs by focusing on both functional requirements and long-term goals. These included:
- Supporting multiple players and teams
- Ensuring unique game and team names
- Enabling cross-platform compatibility
- Designing for scalability and future expansion

These needs were implemented using object-oriented design, a centralized service layer, and a distributed web architecture.

Understanding user needs is critical because software must solve real problems. A technically sound system that does not meet user expectations will not be effective.

---

### 🧠 My Approach to Software Design
My approach to designing this software included:
1. Analyzing requirements
2. Building a domain model (classes and relationships)
3. Evaluating platform and environment options
4. Applying design patterns and architectural strategies
5. Considering scalability, security, and maintainability

For future projects, I plan to continue using this structured approach while incorporating:
- Design patterns where appropriate
- Layered architecture for separation of concerns
- Early consideration of distributed systems and security

This process helps create software that is not only functional, but also scalable and maintainable over time.
