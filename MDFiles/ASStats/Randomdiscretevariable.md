In probability theory and statistics, **discrete random variables** are essential tools for modeling and analyzing random phenomena. A discrete random variable is a variable that takes on a countable number of distinct values, each with an associated probability.

### Notation

Discrete random variables are often denoted by capital letters, such as \(X\), \(Y\), or \(Z\). The possible values that a discrete random variable can take are represented as \(x\), \(y\), \(z\), etc.

### Probability Mass Function (PMF)

The probability mass function (PMF) of a discrete random variable \(X\), denoted as \(P(X = x)\), defines the probability that \(X\) takes on a particular value \(x\). The PMF satisfies two crucial properties:

1. **Non-negativity**: For all \(x\), \(P(X = x) \geq 0\).
2. **Summation to 1**: The sum of the probabilities over all possible values of \(X\) equals 1.

$\sum_{x} P(X = x) = 1$

### Expected Value (Mean)

The expected value (or mean) of a discrete random variable \(X\), denoted as \(E(X)\) or \(\mu\), represents the average value of \(X\) and is calculated as the weighted sum of all possible values of \(X\), weighted by their respective probabilities.

$E(X) = \sum_{x} x \cdot P(X = x)$

### Variance

The variance of a discrete random variable \(X\), denoted as \(\text{Var}(X)\), measures the spread or dispersion of \(X\)'s values. It quantifies how much \(X\) varies from its expected value. The formula for variance is:

$\text{Var}(X) = \sum_{x} (x^2 \cdot P(X = x)) - (E(X))^2$

Where:
- \(x\) represents each possible value of \(X\).
- \(P(X = x)\) is the probability of \(X\) taking the value \(x\).
- \(E(X)\) is the expected value of \(X\).

### Example: Rolling a Fair Six-Sided Die

Let's illustrate these concepts with an example of a discrete random variable: rolling a fair six-sided die (D6). The possible values of \(X\) (the outcome) are {1, 2, 3, 4, 5, 6}, each with equal probability:

$P(X = 1) = P(X = 2) = P(X = 3) = P(X = 4) = P(X = 5) = P(X = 6) = \frac{1}{6}$

The PMF is a table representing these probabilities:

|   x   | 1 | 2 | 3 | 4 | 5 | 6 |
|:-----:|---|---|---|---|---|---|
| P(X=x)|1/6|1/6|1/6|1/6|1/6|1/6|

To calculate the expected value:

$E(X) = \sum_{x} x \cdot P(X = x) = (1 \cdot \frac{1}{6}) + (2 \cdot \frac{1}{6}) + (3 \cdot \frac{1}{6}) + (4 \cdot \frac{1}{6}) + (5 \cdot \frac{1}{6}) + (6 \cdot \frac{1}{6}) = \frac{7}{2}$

Now, let's calculate the variance using the formula:

$$\begin{align*}
\text{Var}(X) &= \sum_{x} (x^2 \cdot P(X = x)) - (E(X))^2 \\
&= \left[(1^2 \cdot \frac{1}{6}) + (2^2 \cdot \frac{1}{6}) + (3^2 \cdot \frac{1}{6}) + (4^2 \cdot \frac{1}{6}) + (5^2 \cdot \frac{1}{6}) + (6^2 \cdot \frac{1}{6})\right] - \left(\frac{7}{2}\right)^2 \\
&= \frac{35}{12}
\end{align*}$$

So, the variance of rolling a fair six-sided die is $(\frac{35}{12})$.