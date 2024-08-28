### $$ X \sim Geo (p)$$
_When will the event occur?_

- Discrete data
- Independent
- Random events
- Infinite
- Two events

What is the prob. that you throw a '5' on a single die on the 4th throw?

$$ p(X = 4) = \frac56*\frac56*\frac56*\frac16 = 0.965\ (3sf)$$
$\frac56$ - Failure
$\frac16$ - Success

### General formula
#### $$ p(X = r) = pq^{r-1}$$
#### $$ p(X = 7) = \frac16 * \frac56^6 = 0.0558\ (3sf)$$
![[Pasted image 20230819103944.png]]
____________
### Mean
$$E(X) = \frac{1}{p}$$
_____________
#### Mode
Due to the nature of the geometric distribution, the mode is always 1
________
#### Median
Either trial and error (lame).

or

#### $$-\frac{log(2)}{log(1-p)} \le M \le 1 - \frac{log(2)}{log(1-p)} $$$$M \epsilon Z$$
_________
#### Sum to Infinity

### $$ S_\infty = \frac{p}{1-q}$$
### $$ = \frac{p}{p}$$
### $$= 1$$
_______
### Example
Find the probability that fewer than 7 tosses of a coin are required to obtain a pair of heads.
$$ X \sim Geo(\frac14)$$

$$p(X<7)$$
$$p(X<7) = 1 - p(X\ge 7) = 1 - p(X > 6)$$
$$1 - (\frac34)^6$$
$$ = 0.822\ (3sf)$$
_______
