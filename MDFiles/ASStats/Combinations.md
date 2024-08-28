Combinations are a fundamental concept in combinatorics, a branch of mathematics that deals with counting and arranging objects without regard to their order. Combinations are often denoted as "n choose k" and are used to calculate the number of ways to select k objects from a set of n distinct objects without replacement.

## Notation

The notation for combinations is typically expressed as:

$$
C(n, k) = \binom{n}{k}
$$

Here, $n$ represents the total number of objects to choose from, and $k$ represents the number of objects to be chosen. The expression $\binom{n}{k}$ reads as "n choose k" or "n over k."

## Formula for Combinations

The formula to calculate combinations is as follows:

$$
\binom{n}{k} = \frac{n!}{k!(n - k)!}
$$

Where:
- $n!$ (n factorial) represents the product of all positive integers from 1 to n.
- $k!$ (k factorial) represents the product of all positive integers from 1 to k.
- $(n - k)!$ represents the product of all positive integers from 1 to (n - k).

## Example

Let's say you have a set of 5 different colors, and you want to choose 2 of them for a painting. You can calculate the number of different combinations using the combination formula:

$$
\binom{5}{2} = \frac{5!}{2!(5 - 2)!} = \frac{5 \cdot 4}{2 \cdot 1} = 10
$$

So, there are 10 different combinations of 2 colors you can choose from the set of 5.

## Properties of Combinations

### 1. Symmetry Property

Combinations exhibit symmetry, meaning that $\binom{n}{k} = \binom{n}{n - k}$. This property reflects the fact that choosing k objects from n is equivalent to choosing (n - k) objects not to include.

### 2. Zero Combinations

If k is greater than n (i.e., if you want to choose more objects than are available), $\binom{n}{k}$ is equal to 0.

### 3. Combinations with Repetition

In some cases, you may want to calculate combinations with repetition, where the same object can be chosen multiple times. The formula for combinations with repetition is:

$$
\binom{n + k - 1}{k}
$$

## Applications

Combinations have various applications in mathematics and real-world problems, including:

- Combinatorial problems in probability theory.
- Calculating the number of ways to form committees or teams.
- Solving problems related to permutations, where order does matter.
- Counting possibilities in various games and puzzles.

_______
### Example 1: Combinations of Playing Cards

Suppose you have a standard deck of 52 playing cards, and you want to find the number of ways to choose 5 cards from the deck for a poker hand. We can use the combination formula:

$$
\binom{52}{5} = \frac{52!}{5!(52 - 5)!}
$$

Calculating this:

$$
\binom{52}{5} = \frac{52!}{5! \cdot 47!}
$$

Now, calculate the factorials:

$$
\begin{align*}
52! &= 52 \cdot 51 \cdot 50 \cdot 49 \cdot 48 \cdot \ldots \cdot 3 \cdot 2 \cdot 1 \\
5! &= 5 \cdot 4 \cdot 3 \cdot 2 \cdot 1 \\
47! &= 47 \cdot 46 \cdot 45 \cdot \ldots \cdot 3 \cdot 2 \cdot 1
\end{align*}
$$

Now, plug these values into the combination formula:

$$
\begin{align*}
\binom{52}{5} &= \frac{52 \cdot 51 \cdot 50 \cdot 49 \cdot 48 \cdot \ldots \cdot 3 \cdot 2 \cdot 1}{(5 \cdot 4 \cdot 3 \cdot 2 \cdot 1) \cdot (47 \cdot 46 \cdot 45 \cdot \ldots \cdot 3 \cdot 2 \cdot 1)} \\
&= \frac{52 \cdot 51 \cdot 50 \cdot 49 \cdot 48}{5 \cdot 4 \cdot 3 \cdot 2 \cdot 1} \\
&= 2,598,960
\end{align*}
$$

So, there are 2,598,960 different combinations of choosing 5 cards from a standard deck of 52 cards for a poker hand.

### Example 2: Choosing Donuts

Imagine you have 8 different types of donuts at a bakery, and you want to select 3 donuts to create a custom box of donuts. How many different combinations of donuts can you choose?

Using the combination formula:

$$
\binom{8}{3} = \frac{8!}{3!(8 - 3)!}
$$

Calculate the factorials:

$$
\begin{align*}
8! &= 8 \cdot 7 \cdot 6 \cdot 5 \cdot 4 \cdot 3 \cdot 2 \cdot 1 \\
3! &= 3 \cdot 2 \cdot 1 \\
(8 - 3)! &= 5! = 5 \cdot 4 \cdot 3 \cdot 2 \cdot 1
\end{align*}
$$

Now, plug these values into the combination formula:

$$
\begin{align*}
\binom{8}{3} &= \frac{8!}{3! \cdot 5!} \\
&= \frac{8 \cdot 7 \cdot 6}{3 \cdot 2 \cdot 1} \\
&= 56
\end{align*}
$$

So, there are 56 different combinations of choosing 3 donuts from 8 different types at the bakery to create a custom box of donuts.