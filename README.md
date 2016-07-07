# Playing with the Collatz Conjuncture

This project demonstrates some nice features and usage approaches for different programming languages (some that I personally like).

According to [wikipedia](https://en.wikipedia.org/wiki/Collatz_conjecture), the Collatz conjecture is a conjecture in mathematics named after Lothar Collatz, who first proposed it in 1937. The conjecture is also known as the 3n + 1 conjecture, the Ulam conjecture (after Stanisław Ulam), Kakutani's problem (after Shizuo Kakutani), the Thwaites conjecture (after Sir Bryan Thwaites), Hasse's algorithm (after Helmut Hasse), or the Syracuse problem; the sequence of numbers involved is referred to as the hailstone sequence or hailstone numbers (because the values are usually subject to multiple descents and ascents like hailstones in a cloud), or as wondrous numbers.

The conjecture can be summarized as follows. Take any positive integer n. If n is even, divide it by 2 to get n / 2. If n is odd, multiply it by 3 and add 1 to obtain 3n + 1. Repeat the process (which has been called "Half Or Triple Plus One", or HOTPO) indefinitely. The conjecture is that no matter what number you start with, you will always eventually reach 1.

## Code output

All different implementations here will produce an output as follows, in which each line consists of the number being used as input and the list of steps performed by the algorithm until it reaches the number 1.

Experiment(1, [1])

Experiment(2, [2,1])

Experiment(3, [3,10,5,16,8,4,2,1])

Experiment(4, [4,2,1])

Experiment(5, [5,16,8,4,2,1])

Experiment(6, [6,3,10,5,16,8,4,2,1])

Experiment(7, [7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1])

Experiment(8, [8,4,2,1])

Experiment(9, [9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1])

Experiment(10, [10,5,16,8,4,2,1])

...
