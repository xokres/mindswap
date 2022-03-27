# Programming Languages Live-coding

### Goal

Understand how Inheritance works in Java.

### Flow

- Present the following problem to the students:
    - We want to create a shop that sells 3 kinds of bears:

    1. **Simple Bear** - Can talk; every time it talks, it says "I love you". When its batteries are exhausted, it loses
       its ability to talk.
    2. **Cranky Bear** - Can talk; every time it talks, it says "I love you". When its batteries reach a lower than 50%
       energy level, it loses its ability to talk. However, it can still sing a sad song one time, if it hasn't before.
    3. **Drunk Bear** - Can talk; every time it talks, it says "I love you", but it has a 0.2% probability of falling
       asleep. When this happens, this bear loses its ability to talk, snoring instead.

    - The shop creates one bear at the time, and never stores them. The created bears follow a pattern :

    1. If the number of bears created is even, it creates a Simple Bear.
    2. If the number of bears created is a multiple of 5, it creates a Cranky Bear.
    3. If it's neither, it creates a Drunk Bear.

    - The shop should also be able to compare itself to another shop. The store with more bears created, wins.
- Ask students to implement it.

### Alternatives
N/A