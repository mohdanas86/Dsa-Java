# 🚀 JAVA COLLECTIONS – COMPLETE QUICK REVISION NOTE

---

# SET (No Duplicates)

### 🔹 Common Operations

`add()` | `remove()` | `contains()` | `size()`

---

## SET – One Look Table

| Feature   | HashSet    | LinkedHashSet      | TreeSet        |
| --------- | ---------- | ------------------ | -------------- |
| Duplicate | ❌          | ❌                  | ❌              |
| Order     | ❌          | ✅ Insertion        | ✅ Sorted       |
| Null      | ✅ One      | ✅ One              | ❌              |
| Add       | O(1)       | O(1)               | O(log n)       |
| Remove    | O(1)       | O(1)               | O(log n)       |
| Contains  | O(1)       | O(1)               | O(log n)       |
| SC        | O(n)       | O(n)               | O(n)           |
| Internal  | Hash Table | Hash + Linked List | Red-Black Tree |

---

### When to Use?

* 🔥 Fast uniqueness check → **HashSet**
* 🔥 Unique + maintain order → **LinkedHashSet**
* 🔥 Unique + sorted → **TreeSet**

---

# 2️ LIST (Allows Duplicates)

### 🔹 Common Operations

`add()` | `add(index)` | `get()` | `remove()` | `contains()`

---

## LIST – One Look Table

| Feature      | ArrayList     | LinkedList         |
| ------------ | ------------- | ------------------ |
| Duplicate    | ✅             | ✅                  |
| Order        | ✅             | ✅                  |
| Null         | ✅             | ✅                  |
| Add (end)    | O(1)*         | O(1)               |
| Add (middle) | O(n)          | O(n)               |
| Get          | O(1) 🚀       | O(n) 🐢            |
| Remove       | O(n)          | O(n)               |
| SC           | O(n)          | O(n) (More memory) |
| Internal     | Dynamic Array | Doubly Linked List |

*O(1) amortized

---

### When to Use?

* 🔥 Fast random access → **ArrayList**
* 🔥 Frequent insert/delete → **LinkedList**

---

# 3️ MAP (Key–Value Pair)

### 🔹 Common Operations

`put()` | `get()` | `remove()` | `containsKey()`

---

## MAP – One Look Table

| Feature          | HashMap    | LinkedHashMap      | TreeMap         |
| ---------------- | ---------- | ------------------ | --------------- |
| Duplicate Keys   | ❌          | ❌                  | ❌               |
| Duplicate Values | ✅          | ✅                  | ✅               |
| Order            | ❌          | ✅ Insertion        | ✅ Sorted by Key |
| Null Key         | ✅ One      | ✅ One              | ❌               |
| Put              | O(1)       | O(1)               | O(log n)        |
| Get              | O(1)       | O(1)               | O(log n)        |
| Remove           | O(1)       | O(1)               | O(log n)        |
| SC               | O(n)       | O(n)               | O(n)            |
| Internal         | Hash Table | Hash + Linked List | Red-Black Tree  |

---

### When to Use?

* 🔥 Fast key lookup → **HashMap**
* 🔥 Maintain insertion order → **LinkedHashMap**
* 🔥 Sorted keys → **TreeMap**

---

# MASTER MEMORY TRICK (Very Important)

### 🔹 Set → No duplicates

### 🔹 List → Allows duplicates

### 🔹 Map → Key–Value

---

### 🔹 Hash → Fast ⚡ but No Order

### 🔹 Linked → Maintains Insertion Order

### 🔹 Tree → Sorted + log(n)

---

# PERFORMANCE SUMMARY

| Type | Fastest         | Sorted? | Ordered?      |
| ---- | --------------- | ------- | ------------- |
| Set  | HashSet         | TreeSet | LinkedHashSet |
| List | ArrayList (get) | ❌       | Yes           |
| Map  | HashMap         | TreeMap | LinkedHashMap |

---

# 🎯 Interview Golden Lines

* Hash based → O(1)
* Tree based → O(log n)
* All SC → O(n)
* ArrayList → Best for read
* LinkedList → Best for modify
* HashMap → Most used in real projects