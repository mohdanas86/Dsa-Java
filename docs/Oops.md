# 🚀 JAVA OOPS

---

# 1️⃣ ENCAPSULATION (Data Hiding)

### 🔹 Meaning

Hide data using `private` + provide access using getters/setters.

### 🔹 Example

```java
class Employee {
    private double salary;

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
```

---

## 🔐 Encapsulation – One Look Table

| Feature         | Description              |
| --------------- | ------------------------ |
| Data Hiding     | ✅ Yes                    |
| Access Modifier | private                  |
| Access Method   | Getter/Setter            |
| Security        | High                     |
| Control         | Full validation possible |

---

### When to Use?

* 🔥 To protect data
* 🔥 To control modifications
* 🔥 For secure design

---

# 2️⃣ INHERITANCE (Code Reusability)

### 🔹 Meaning

Child class gets properties & methods of parent.

### 🔹 Keyword

`extends`

---

## 🧬 Inheritance – One Look Table

| Feature        | Description                      |
| -------------- | -------------------------------- |
| Relationship   | IS-A                             |
| Code Reuse     | ✅ Yes                            |
| Constructor    | Parent runs first                |
| Access Private | ❌ No                             |
| Overriding     | ✅ Yes                            |
| Types          | Single, Multilevel, Hierarchical |

---

### 🔹 Example

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

---

### When to Use?

* 🔥 IS-A relationship
* 🔥 Common base behavior
* 🔥 Runtime polymorphism

---

# 3️⃣ POLYMORPHISM (Many Forms)

### 🔹 Meaning

Same method → Different behavior.

---

## 🎭 Polymorphism – One Look Table

| Type                | Method Overloading | Method Overriding |
| ------------------- | ------------------ | ----------------- |
| Time                | Compile Time       | Runtime           |
| Inheritance Needed? | ❌ No               | ✅ Yes             |
| Parameters          | Different          | Same              |
| Decision            | Compiler           | JVM               |

---

### 🔹 Runtime Example

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

Animal a = new Dog();
a.sound();   // Dog barks
```

---

### When to Use?

* 🔥 Flexible design
* 🔥 Dynamic method dispatch
* 🔥 Common interface behavior

---

# 4️⃣ ABSTRACTION (Hide Implementation)

### 🔹 Meaning

Show WHAT, hide HOW.

---

## 🎯 Abstraction – One Look Table

| Feature              | Abstract Class    | Interface           |
| -------------------- | ----------------- | ------------------- |
| Methods              | Abstract + Normal | Mostly abstract     |
| Variables            | Normal allowed    | public static final |
| Constructor          | ✅ Yes             | ❌ No                |
| Multiple Inheritance | ❌ No              | ✅ Yes               |
| Keyword              | abstract          | interface           |

---

### 🔹 Example

```java
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area");
    }
}
```

---

### When to Use?

* 🔥 Force child to implement methods
* 🔥 Define blueprint
* 🔥 Achieve loose coupling

---

# 🧠 MASTER MEMORY TRICK (Very Important)

### 🔹 Encapsulation → Hide Data

### 🔹 Inheritance → IS-A Relationship

### 🔹 Polymorphism → Many Behaviors

### 🔹 Abstraction → Hide Implementation

---

# 🔥 DESIGN SUMMARY TABLE

| Concept       | Purpose      | Keyword            | Real Meaning |
| ------------- | ------------ | ------------------ | ------------ |
| Encapsulation | Protect Data | private            | Security     |
| Inheritance   | Reuse Code   | extends            | IS-A         |
| Polymorphism  | Flexibility  | override           | Many Forms   |
| Abstraction   | Blueprint    | abstract/interface | Hide HOW     |

---

# 🎯 INTERVIEW GOLDEN LINES

* Inheritance enables runtime polymorphism
* Abstract class can have constructor
* Interface supports multiple inheritance
* Private members are not inherited
* Overriding = runtime polymorphism
* Overloading = compile-time polymorphism
* OOPS improves modularity & maintainability

---

# 🚀 FINAL OOPS STRUCTURE FLOW

Encapsulation
⬇
Inheritance
⬇
Polymorphism
⬇
Abstraction

Together → Clean Architecture 🔥
