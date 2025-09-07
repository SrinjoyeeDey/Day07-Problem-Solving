# 🚀 DSA Problem Solutions in Java  

![Java](https://img.shields.io/badge/Language-Java-blue?logo=java&logoColor=white)  ![Data Structures](https://img.shields.io/badge/Topic-Data%20Structures-orange)  ![LeetCode](https://img.shields.io/badge/Practice-LeetCode-yellow?logo=leetcode)  ![Status](https://img.shields.io/badge/Status-Solved-brightgreen)  

This repository contains *clean Java implementations* of important DSA problems, with explanations, edge cases, and approaches. Perfect for *interview prep* 💯.  

---

## 📘 Problems Covered  

1. 🔄 *LRU Cache*  
2. 🌳 *Bottom View of Binary Tree*  
3. 🔤 *Sort String by Frequency*  

---

## 🔄 1. LRU Cache  

### 📌 Problem  
Design a data structure that follows the *Least Recently Used (LRU)* cache mechanism.  
- get(key) → returns value if present, else -1.  
- put(key, value) → insert/update value. If capacity full, remove *least recently used* entry.  

### ✨ Approach  
- Use *HashMap + Doubly Linked List*  
- HashMap → stores (key → Node) for *O(1)* lookup.  
- DLL → maintains usage order (Head = Most Recent, Tail = Least Recent).  
- On get/put, move node to *head*.  
- If capacity exceeded → remove *tail.prev*.  

### 🧪 Edge Cases  
- Accessing a non-existing key → return -1.  
- Updating existing key → update value & move to head.  
- Cache capacity = 0 → always return -1.  

---

## 🌳 2. Bottom View of Binary Tree  

### 📌 Problem  
Print the *bottom view* of a binary tree.  
- Bottom view = nodes visible when tree viewed from the bottom.  

### ✨ Approach (HashMap + Level Order Traversal)  
- Perform *BFS (level order)* with *horizontal distance (HD)* tracking.  
- Use a *map<HD, Node>* to store last seen node at each HD.  
- At the end → sort keys (HD) and print corresponding nodes.  

### 🧪 Edge Cases  
- Empty tree → return empty list.  
- Tree with only left or right children → straight line output.  
- Multiple nodes at same HD → bottom-most node overrides.  

---

## 🔤 3. Sort String by Frequency  

### 📌 Problem  
Given a string s, sort characters by frequency (most frequent first).  

### ✨ Approach (Heap / Bucket Sort)  
- Count frequency of each character using HashMap.  
- Use *PriorityQueue (max heap)* sorted by frequency.  
- Build result string by repeatedly appending highest frequency chars.  

### 🧪 Edge Cases  
- Empty string → return empty string.  
- All characters same → return same string.  
- Equal frequency chars → order doesn’t matter.  

---

## 🛠 Run the Code  

```bash
# Compile
javac LRUCache.java
javac BottomViewBinaryTree.java
javac SortStringByFrequency.java

# Run
java LRUCache
java BottomViewBinaryTree
java SortStringByFrequency


---

🤝 Contributing

Feel free to ⭐ this repo and contribute more DSA problems with clean code + explanations.


---

📌 Author

👩‍💻 Srinjoyee Dey
🚀 Engineering Student | Aspiring FAANG Engineer | DSA + Web Dev Learner

---
