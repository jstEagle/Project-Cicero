In binomial cases where p is either very large or very small, and n is very large, the binomial distribution $X \sim B(n, p)$ can be approximated by the Poisson distribution.

**Why does it work?**
$X \sim B(n, p)$

1 meter of pipe has 4 defects $\lambda = 4$ 
If we cut it into 10 pieces then $n = 10 \rightarrow 0.4\ defects / 10cm$
$n = 100 \rightarrow 0.04 / 1cm$

$$\therefore\ suited\ to\ X \sim B(n, \frac4n)$$
$$X \sim B(100, \frac4{100})$$
i.e. pipe cut into 100 pieces, with a probability of $\frac4{100}$ that a defect is present in any one piece.

Since the event is so rare: $prob > 1\ defect$ is tiny $\therefore$ two outcomes: One defect / Not one defect.

$$X \sim B(n, \frac4n)$$
$$E(x) = n*p = n * \frac4n = 4$$
$$Var(x) = n * p * q= n * \frac4n * (1 - \frac4n)$$
$$= 4 * (1 - \frac4n)$$
$$= 4 - \frac{16}n = 4$$
$$n \rightarrow \infty$$
$$\frac{16}{n} \rightarrow 0$$
$$\therefore Var(x) = E(x)$$
So [[Poisson Distribution]] is suitable when n is very large. And $p \rightarrow 0$ or $q \rightarrow 0$.

______
### $$\lambda = np$$
### $$n > 50$$
### $$n*p < 5$$
_____

### Example
It is known that nationally one person in a thousand is allergic to a particular chemical used in making a wood preservative. A firm that makes this wood preservative employs 500 people in one of its factories.

What is the probability that more than two people at the factory are allergic to the chemical?

$$X \sim B(500, 0.001)$$
$$p(x > 2) = 1 - p(x \le 2)$$
$$= 1 - (p(x = 0) + p(x = 1) + p(x = 2))$$
$$= 1 - (0.999^{500} + 500 * 0.001 * 0.999^{499} + \begin{pmatrix} 500 \\ 2 \end{pmatrix} * 0.001^2 * 0.999^{498})$$
$$= 0.0143$$
$$n*p = 0.5\ and\ n > 50$$
$$X \sim Po(0.5)$$
$$p(x > 2) = 1 - p(x \le 2)$$
$$= 1 - e^{-0.5} * (1 + 0.5 + \frac{0.5^2}{2!}) = 0.0144$$
------
