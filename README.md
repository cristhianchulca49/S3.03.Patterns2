# 🎓 Design Patterns Examples in Java

Este repositorio contiene ejemplos prácticos de implementación de **patrones de diseño** en Java, aplicando buenas prácticas de **SOLID**, **Fluent Builder**, **Step Builder** y **Decorator**.

Patrones incluidos:

1. **Builder Pattern** – Menú de restaurante  
2. **Observer Pattern** – Notificaciones del mercado bursátil  
3. **Decorator Pattern** – Personalización de Bubble Tea  

---

## 🍽️ 1. Restaurant Menu Builder Pattern

### 🎯 Objetivo
Diseñar un sistema para construir distintos tipos de menús de restaurante aplicando:

- **Builder Design Pattern** con estilo **Fluent Builder**
- Principios **SOLID**
- **Progressive Interface** o **Step Builder** para garantizar un orden correcto de construcción.

---

### 🍽️ Descripción
Un menú puede estar compuesto por:

- **Entrante** (Appetizer)  
- **Plato Principal**  
- **Postre o Café**  
- **Bebida**  

#### Características de los platos

- Opciones dietéticas: **vegano** y/o **sin gluten**  
- Platos principales pueden incluir **suplementos**  

#### Variaciones de Menú

- **Half Menu:** Plato principal + bebida  
- **Kids Menu:** Plato principal + postre + bebida  
- Bebidas opcionales  
- Postre o café obligatorio elegir uno, pero no ambos  

---

### 📝 Reglas / Consideraciones

- No se puede añadir postres antes del plato principal.  
- No se puede llamar más de una vez al método de postre.  
- Elegir postre o café, nunca ambos.  
- La construcción debe seguir un orden lógico mediante interfaces progresivas.  

---

### 🧪 Ejemplo conceptual de uso

- **Executive Menu:** Entrante + Plato principal + Postre + Bebida  
- **Kids Menu:** Plato principal + Postre + Bebida  
- **Half Menu:** Plato principal + Bebida (Postre opcional)  

---

## 📈 2. Stock Market Notifications (Observer Pattern)

### 🎯 Objetivo
Crear un sistema donde un **StockAgent** notifique automáticamente a varias agencias de brokers cada vez que cambia el mercado.

---

### 📈 Descripción
**StockAgent (Observable):**

- Administra suscriptores (add/remove observers)  
- Simula fluctuaciones de mercado (Up/Down)  
- Llama `notifyObservers()` automáticamente cuando cambia el estado  

**StockBrokerAgency (Observer):**

- Se suscribe al StockAgent  
- Recibe notificaciones mostrando dirección del mercado y valor de acciones  

---

### 📝 Reglas / Consideraciones

- Cada vez que el valor del mercado sube o baja, todos los brokers suscritos reciben una notificación.  
- Se puede agregar o remover brokers en cualquier momento.  
- La notificación incluye: nombre del broker, dirección del mercado (UP/DOWN) y valor actualizado.  

---

### 🧪 Ejemplo conceptual de uso

- Un **StockAgent** tiene dos brokers: Alpha Brokers y Zenith Investments  
- Cuando el mercado sube a 150.75, ambos brokers reciben:  
  - "Alpha Brokers received notification: Stock market went UP to 150.75"  
  - "Zenith Investments received notification: Stock market went UP to 150.75"  
- Si baja a 148.30, reciben:  
  - "Alpha Brokers received notification: Stock market went DOWN to 148.30"  
  - "Zenith Investments received notification: Stock market went DOWN to 148.30"  

---

## 🧋 3. Bubble Tea Customization (Decorator Pattern)

### 🎯 Objetivo
Simular la **personalización de Bubble Tea** usando **Decorator Pattern**, permitiendo agregar toppings de manera dinámica.

---

### 🧋 Descripción

- **Bases:** Latte, Matcha, Tea  
- **Decoradores:** Ice, Sugar, Tapioca, Flavors  
- **Builder Wrapper:** simplifica la creación de objetos decorados  

---

### 📝 Reglas / Consideraciones

- Se puede combinar cualquier topping de forma dinámica sobre la base elegida.  
- Los precios se suman según los toppings seleccionados.  
- No hay límite de toppings, pero cada uno se agrega de manera opcional.  

---

### 🧪 Ejemplo conceptual de uso

- **Latte con Ice y Tapioca:** Latte + Ice + Tapioca  
- **Matcha con Flavors Banana y Apple:** Matcha + Flavor Banana + Flavor Apple  
- **Tea simple:** Tea sin toppings adicionales  

---

### 🧪 Tools & Technologies Used

- **Java 17/21** – Core programming language.
- **JUnit 5** – Testing framework for unit and parameterized tests.
- **Maven/Gradle** – Dependency management and project build.
- **Git & GitHub** – Version control and project sharing.
- **IntelliJ IDEA** – Primary IDE for development.

---

## 🛠️ Installation

Clone this repository:
```git
git clone https://github.com/cristhianchulca49/S3.03.Patterns2.git
```
---

## 🤝 Contributions are welcome! 
Please follow these steps to contribute:
  
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request


    
