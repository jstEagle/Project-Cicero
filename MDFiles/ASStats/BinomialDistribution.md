### $$ X \sim B(n, p)$$

##### $$ E(x) = np$$
##### $$ Var(x) = npq$$
### $$ p(X = r) = \begin{pmatrix} n \\ r \end{pmatrix} p ^r q^{n-r}$$
### n - Number of trials
### p - Probability of event


#### How many

I.E. What is the probability of getting rolling <u>5 sixes</u> when a die is thrown 12 times.

### Key features
- Fixed number of trials - n
- Two outcomes only
- Random
- Independent
### $$ X \sim B(12, \frac16)$$
### $$ p(X = 5) = \begin{pmatrix} 12 \\ 5 \end{pmatrix} (\frac16) ^5\ (\frac56)^{7}$$
_____

### Example

A factory makes water pistols, 8% of which do not work properly.

1) A random sample of 19 water pistols is taken. Find the probability that at most 2 do not work properly.

2) In a random sample of n water pistols, the probability that at least one does not work properly is greater than 0.9. Find the smallest possible value of n.

3) A random sample of 1800 water pistols is taken. Use an approximation to find the probability that there are at least 152 that do not work properly.

4) Justify the use of your approximation in part (3)


1) $$ X \sim B(19, 0.08)$$
$$ p(X \le 2) = p(X = 0) + p(X = 1) + p(X = 2)$$
$$ p(X = 0) = \begin{pmatrix} 19 \\ 0 \end{pmatrix} (0.08)^0\ (0.92)^{19}$$
$$ p(X = 1) = \begin{pmatrix} 19 \\ 1 \end{pmatrix} (0.08)^1\ (0.92)^{18}$$
$$ p(X = 2) = \begin{pmatrix} 19 \\ 2 \end{pmatrix} (0.08)^2\ (0.92)^{17}$$
$$ = 0.205 + 0.33886 + 0.26519$$
$$ = 0.809\ (3sf)$$


2) 
$$ X \sim B(n,0.08)$$
$$ p(X \ge 1) = 1 - p(0)$$
$$ = 1 - p(0.92)^n > 0.90$$
$$ 0.1 > (0.92)^n$$
$$n > 27.6$$
$$ \therefore n = 28$$



3) 
[[Approximating a Binomial Distribution to a Normal Distribution]]

$$ X \sim N(\bar{x} , \sigma{^2}) $$
$$ E(x) = 1800 * 0.08 = 144$$
$$\sigma{^2} = npq = 144 * 0.92 = 132.48$$

$$ X \sim N(144, 132.48)$$
$$p(X \ge 152) \rightarrow p(X \ge 151.5)$$
$$z = \frac{151.5 - 144}{\sqrt{132.48}} $$
$$ = 0.652\ (Rounded)$$
$$ p = 0.2571$$
$$ = 0.257\ (3sf)$$



4) 
$$np > 5\ and\ nq > 5$$
$$1800 * 0.08 > 5$$
$$1800 * 0.92$$
_____
