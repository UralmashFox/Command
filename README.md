# Hands on **Command**

Each student in our university has got **4 gold opportunities**:

1) to go to academival leave

2) to return from academical leave

3) to pass exam

4) to fail the exam

Suppose we have a **switch** that regulates the leaving/returning, failing/pasing. The **Command** just an executor of this command - it changes states from "0" to "1" and in opposite.

Create two classes that are responsible for (1) Academical leave and (2) Exam passing.

Each of these classes has exactly 2 methods: one for describing state "0" and another one for state "1".

- when the student **goes to** the academical leave, the console should display the meassage "Student left to the Academical leave";

-  when the student **returns from** the academical leave, the console should display the meassage "Student returned from the Academical leave";

- when the student **passes** the exam, the console should display the message "Student succesfully passed the exam"

- when the student **fails** the exam, the console should display the message "Student failed and goes to retake"

Implement **Switch** such that Command can be executed for state "0" (**flipUp**) or "1" (**flipDown**)

Realise 4 classes for each of 4 states (passed, failed, acadevical leave, return from leave). Each class has **constructor** and a sigle **execute** method to change the state

Test your implementation
