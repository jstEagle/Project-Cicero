**An estimate is an unbiased estimate of a given population parameters/statistic (e.g. mean, variance, maximum value, etc.) when the mean of the sampling distribution of that parameter/statistic is equal to the population parameter being investigated**

Formula to calculate sample variance given E(V)
### $$S^2 = E(V)*\frac{n}{n-1} = \frac{1}{n-1}(\sum x^2 f - n\bar{x}^2)$$
### 3 Different situations
- You are provided either $\mu$ or $\mu_\bar{x}$ and population variance $\sigma^2$, and are asked something about a sample.
- The hand lengths of 5 students are: $\dots, \dots, \dots$ . Find the mean and variance of these students' hand lengths. (As such this is a population of ? students)
- Use the data for the ? students to estimate the mean and variance of the length of students' hands at the university. _This is a new situation. We are given neither the mean or the variance of the population but are asked for estimates of them from a sample of the population_

________
### Biased $\rightarrow$ Unbiased
A jar contains a large number of small discs. 40% are numbered 1, 40% are numbered 2 and 20% are numbered 3.

1) Calculate the theoretical population mean and variance for the random variable "number on disk"
$$\mu = 1.8$$
$$Var(x) = 0.56$$
2) A random sample of 3 discs are taken from the jar. By considering all the possible values for a sample size of 3, determine whether the variance of the sample is an unbiased estimator of the variance of the population
$$\frac{1^2 + 1^2 + 2^2}{3} - (\frac{1 + 1 + 2}{3})^2$$
$$ = \frac29$$
<center>The probability of selecting this sample</center>

$$0.4 * 0.4 * 0.4 = 0.064$$
This results in the following probability distribution table of the sample variances

| V (sample variance) | 0     | $\frac29$ | $\frac69$ | $\frac89$ |
| :------------------ | :---- | :-------- | :-------- | :-------- |
| $P(V=v)$            | 0.136 | 0.528     | 0.192     | 0.144     |

Now calculate the expectation of the sample variances i.e. the mean of the sample variances E(V). If the sample variance is a good estimator, the mean of the sample variances should be more or less equal to the variance of the population.
$$E(V) = 0*0.136 + \frac29*0.528 + \frac69*0.192 + \frac89*0.144 = 0.3733$$
$$E(V) \ne \sigma^2$$
<center>E(V) is a poor estimator, it is biased</center>
<center>In order to get a good estimator of the population variance, try this:</center>

### $$S^2 = Sample\ varaince$$
### $$S^2 = E(V)*\frac{n}{n-1}$$
$$0.3733 * \frac{3}{3-1} = 0.56 = \sigma^2$$
**In order for E(V) to be an unbiased estimator it must be adjusted this way**
_______
### Example
Consider a spinner, with sides 1, 1, 2 and 4.

| X        | 1   | 2    | 4    |
| :------- | :-- | :--- | :--- |
| $P(X=x)$ | 0.5 | 0.25 | 0.25 |
**Population parameters:**
$\mu = 2$
$\sigma^2 = 1.5$

We saw that if we spun it once or several times that the mean is always 2. Thus mean is an unbiased estimate, now consider the variance for a sample size of 1, 2 or 3 spins.

### n = 1

| Outcome | $\sum x^2$ | $\bar{x}$ | $\sigma^2=\frac{\sum x^2}{n} - (\bar{x})^2$ | Probability |
| :------ | :--------- | :-------- | :------------------------------------------ | :---------- |
| 1       | 1          | 1         | 0                                           | 0.5         |
| 2       | 4          | 2         | 0                                           | 0.25        |
| 4       | 16         | 4         | 0                                           | 0.25        |

| Variance | 0   | 0    | 0    |
| :------- | :-- | :--- | :--- |
| $P(V=v)$ | 0.5 | 0.25 | 0.25 |
##### $$\therefore E(V)\ne \sigma^2$$
### n = 2

| Outcome | $\sum x^2$ | $\bar{x}$ | $\sigma^2=\frac{\sum x^2}{n} - (\bar{x})^2$ | Probability    |
| :------ | :--------- | :-------- | :------------------------------------------ | :------------- |
| 1 1     | 2          | 1         | 0                                           | $\frac4{16}$   |
| 2 2     | 8          | 2         | 0                                           | $\frac1{16}$   |
| 4 4     | 32         | 4         | 0                                           | $\frac{1}{16}$ |
| 1 2     | 5          | 1.5       | 0.25                                        | $\frac{4}{16}$ |
| 1 4     | 17         | 2.5       | 2.25                                        | $\frac{4}{16}$ |
| 2 4     | 20         | 3         | 1                                           | $\frac{2}{16}$ |

| V        | 0         | 0.25      | 1         | 2.25      |
| :------- | :-------- | :-------- | :-------- | :-------- |
| $P(V=v)$ | $\frac38$ | $\frac14$ | $\frac18$ | $\frac14$ |
$$E(V) = \sum V * P(V=v) = \frac34$$
<center>E(V) is a biased estimator</center>

$$S^2 = E(V)*\frac{n}{n-1}$$
$$=\frac34 * \frac21$$
$$=1.5$$

### n = 3

| Outcome | $\sum x^2$ | $\bar{x}$    | $\sigma^2=\frac{\sum x^2}{n} - (\bar{x})^2$ | Probability  |
| :------ | :--------- | :----------- | :------------------------------------------ | :----------- |
| 1 1 1   | 3          | 1            | 0                                           | $\frac18$    |
| 1 1 2   | 6          | $\frac34$    | $\frac29$                                   | $\frac3{16}$ |
| 1 2 2   | 9          | $\frac53$    | $\frac29$                                   | $\frac3{32}$ |
| 2 2 2   | 12         | 2            | 0                                           | $\frac1{64}$ |
| 1 1 4   | 18         | 2            | 2                                           | $\frac3{16}$ |
| 1 2 4   | 21         | $\frac73$    | $\frac{14}9$                                | $\frac6{32}$ |
| 2 2 4   | 24         | $\frac83$    | $\frac89$                                   | $\frac3{64}$ |
| 1 4 4   | 33         | 3            | 2                                           | $\frac3{32}$ |
| 2 4 4   | 36         | $\frac{10}3$ | $\frac89$                                   | $\frac3{64}$ |
| 4 4 4   | 48         | 4            | 0                                           | $\frac1{64}$ |

| V        | 0            | $\frac29$    | $\frac89$    | $\frac{14}9$ | 2            |
| :------- | :----------- | :----------- | :----------- | :----------- | :----------- |
| $P(V=v)$ | $\frac5{32}$ | $\frac9{32}$ | $\frac3{32}$ | $\frac6{32}$ | $\frac9{32}$ |
$$E(V) = \sum V * P(V=v) = 1$$
<center>E(V) is a biased estimator</center>

$$S^2 = E(V) * \frac{n}{n-1}$$
$$= 1 * \frac32$$
$$= 1.5$$
_____

### Summary
$$S^2 = \frac{n}{n-1} * E(V) $$
$$because$$
$$E(V) = \frac{n-1}{n}*\sigma^2$$
$$S^2 \approx \sigma^2$$
$$S^2 = \frac{n}{n-1} * E(V)$$
$$E(V) = expected\ variance = \frac{\sum x^2}{n} - \bar{x}^2$$
$$S^2 = \frac{n}{n-1}(\frac{\sum x^2}{n} - \bar{x}^2)$$
$$\downarrow$$
$$S^2 = \frac{1}{n-1}(\frac{\cancel{n}\sum x^2}{\cancel{n}} - n\bar{x}^2) = \frac{1}{n-1}(\sum x^2 f - n\bar{x}^2)$$
$$= \frac{1}{n-1}(\sum x^2 - \frac{(\sum x)^2}{n}) \rightarrow Given\ in\ formula\ sheet$$

