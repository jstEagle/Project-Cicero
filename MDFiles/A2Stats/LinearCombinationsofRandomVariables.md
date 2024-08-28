### E(X) = + or -
### Var(X) = ALWAYS +

____
##### Distributions:
[[#Example|Random Discrete Variable (Binomial)]]
[[#Normal Distribution]]
[[#Poisson Distribution]]
____
### Example
[[Random discrete variable]]
Consider the following spinner. When it is spun it is equally likely to land on any one of the sections, | 3 | 3 | 3 | 3 | 3 | 2 | 2 | 1 |.
1. If X is the random variable landing on one of the sections, complete the PD table and hence calculate the expected value.

| X      | 1         | 2         | 3         |
| ------ | --------- | --------- | --------- |
| p(X=x) | $\frac18$ | $\frac28$ | $\frac58$ |
$$E(X) = 2.5$$
$$Var(X) = 0.5$$
### Adding a constant
Lets add 3, let Y be the new random variable, Y = x + 3. The new spinner will look like this,
| 6 | 6 | 6 | 6 | 6 | 5 | 5 | 4 |.

2. The table is shown bellow

| Y = x + 3 | 4         | 5         | 6         |
| --------- | --------- | --------- | --------- |
| p(Y=y)    | $\frac18$ | $\frac28$ | $\frac28$ |
$$E(Y) = 5.5$$
$$Var(Y) = 0.5 $$
##### Relationship between $E(x)$ and $E(y)$
$$E(Y) = E(X + 3) = E(X) + 3$$
$$Var(Y) = Var(X + 3) = Var(X)$$

### Multiplying by a constant
Lets multiply by 4, let m be the new random variable, m = 4x.
The new spinner looks like this. | 12 | 12 | 12 | 12 | 12 | 8 | 8 | 4 |.

3. The table is shown bellow

| M = 4x | 4         | 8         | 12        |
| ------ | --------- | --------- | --------- |
| p(M=m) | $\frac18$ | $\frac28$ | $\frac58$ |
$$E(M) = 10$$
$$Var(M) = 8$$


### Graph to show the relationship between $E(X)$, $E(Y)$ and $E(M)$.

$E(X)$ = blue dot                   $E(Y)$ = green cross                  $E(M)$ = red open
```desmos-graph
left=-1; right=14;
top=7; bottom=-7;
---
(1, -1)|point|blue
(2, -1)|point|blue
(2, -2)|point|blue
(3, -1)|point|blue
(3, -2)|point|blue
(3, -3)|point|blue
(3, -4)|point|blue
(3, -5)|point|blue

(4, -1)|cross|green
(5, -1)|cross|green
(5, -2)|cross|green
(6, -1)|cross|green
(6, -2)|cross|green
(6, -3)|cross|green
(6, -4)|cross|green
(6, -5)|cross|green

(4, 1)|open|red
(8, 1)|open|red
(8, 2)|open|red
(12, 1)|open|red
(12, 2)|open|red
(12, 3)|open|red
(12, 4)|open|red
(12, 5)|open|red
```

### Rules
$$E(X + b) = E(X) + b$$
$$E(aX) = aE(X)$$
$$E(aX + b) = aE(X) + b$$
$$ $$
$$Var(X + b) = Var(X)$$
$$Var(aX) = a^2Var(X)$$
$$Var(aX + b) = a^2Var(X)$$
$$ $$
$$E(X) * E(X) \ne E(X^2)$$
$$ $$
$$E(aX + bY) = aE(X) + bE(Y)$$
$$Var(aX \pm bY) = a^2Var(X) + b^2Var(Y)$$
______
### Normal Distribution
[[Normal Distribution]]
Physical quantities that are the sum of normally distributed independent variables are themselves normally distributed.
![[Pasted image 20240517092210.png]]
$$E(X_1 \pm X_2 \pm \dots \pm X_n) = E(X_1) \pm E(X_2) \pm\dots\pm E(X_n)\ provided\ X_1 \pm X_2 \pm \dots \pm X_n\ are\ independent $$
$$Var(X_1 \pm X_2 \pm \dots \pm X_n) = Var(X_1) + Var(X_2) + \dots + Var(X_n)$$
____
**If $X_1$, $X_2$, $\dots$, $X_n$ is a set of normally distributed variables. 
Then the distribution of($X_1 \pm X_2 \pm \dots \pm X_n$) is also normal.**
_____
### Example
The mass, X of a suitcase at an airport is modelled as being normally distributed, with mean 15kg and standard deviation 3kg. Find the probability that a random sample of ten suitcases weighs more than 154kg.

The mass X of one suitcase is given by $X \sim N(15, 3^2)$
Then the mass of each of the ten suitcases has the distribution of X: call them $X_1, X_2, \dots + X_{10}$.

Let the random variable T be the total weight of ten suitcases $T = X_1 + X_2 + \dots + X_{10}$
$$E(T) = E(X_1) + E(X_2) + \dots + E(X_{10})$$
$$Var(T) = Var(X_1) + Var(X_2) + \dots + Var(X_{10})$$
so $T \sim N(150, 90)$

$$p(T > 154) = \frac{154 - 150}{\sqrt{90}} = 0.337\ (3sf)$$
______
### Difficult example
A machine produces sheets of paper the thickness of which are normally distributed with mean 0.1mm and standard deviation 0.006mm.

1. State the distribution of the total thickness of eight randomly selected sheets of paper.
$$X \sim N(0.8, 0.0170^2)$$
2. Single sheets of paper are folded three times. State the distribution of the total thickness.
**This is a trick questions. Because the paper is folded, it doubles in width each time. Meaning its $2^3$ which is 8 width**

$$E(T) = E(8X) = 0.8$$
$$Var(T) = Var(8X) = 64(0.006)^2 = 0.00230$$
The variation is the variation of one piece of paper multiplied by eight because once a single piece of paper is chosen the variation is not evenly random.

$$\therefore T \sim N(0.8, 0.00230)$$
______


### Poisson Distribution
[[Poisson Distribution]]

$$A \sim Po(3)$$
$$B \sim Po(4)$$
$$C = A + B$$
$$\therefore C\sim Po(7)$$
$$Var(C) = 7$$
$$ $$
$$X = A + 2B$$
<center>Not Poisson distribution because amount changes!</center>

$$E(X) = 3 + 2(4) = 11$$
$$Var(X) = 3 + 4(4) = 19$$

Otherwise it is very straight forward, **just remember that if any distribution is multiplied then the resultant E(X) and Var(X) are not of a Poisson distribution and you CANNOT treat it like a Poisson!**
_____
