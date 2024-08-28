### $$X \sim Po(\lambda)$$
### $$P(X=x) = \frac{e^{-\lambda}*\lambda^x}{x!}$$
### $$\lambda = E(x) = Var(x)$$
**The Poisson distribution is where discrete and infinite events occur in continuous but finite intervals of time or space.**

_It is sometimes known as the distribution of rare events_

eg
The number of earthquakes per year (the number of earthquakes is discrete, and the one year time period is continuous but finite time interval)

The number of misprints on a page (the number of misprints is discrete, and the one page is the continuous but finite period of space)

The number of defects in a 5km telecommunication cable

- In theory there is not upper limit to the number of events
- The parameter for the Poisson distribution is $X \sim Po(\lambda)$ That is because the mean and variance of a Poisson distribution are equal, hence a Poisson distribution has only one parameter.
- Compare this with the binomial distribution which has two parameters, n and p

The following conditions must apply for a Poisson distribution:
1) Each event is independent of the next
2) Events cannot occur simultaneously
3) for small intervals the probability of the event occurring is proportional to the size of the interval

### Grains of rice on chessboard

| Number of grains                             | 0     | 1     | 2      | 3     | 4     | 5     | 6      | >6    |
| -------------------------------------------- | ----- | ----- | ------ | ----- | ----- | ----- | ------ | ----- |
| Number of squares                            | 11    | 8     | 12     | 5     | 3     | 3     | 4      | 18    |
| Relative freq. (/64)                         | 0.172 | 0.125 | 0.1875 | 0.078 | 0.046 | 0.046 | 0.0625 | 0.281 |
| $P(X=x) = \frac{e^{-\lambda}*\lambda^x}{x!}$ |       |       |        |       |       |       |        |       |
$$E(x) = 3.8$$
$$Var(x) = 9.35$$
**This is not a Poisson distribution**

