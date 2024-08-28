**The confidence interval for the mean can be defined as the range of values in which we would expect to find the population mean with a specified degree of certainty.**

**A 95% confidence interval means that if we know the population standard deviation $\sigma$, we could take a random sample of size n, find its mean $\bar{x}$ and know that 95% of the times we did this, the interval $\bar{x} \pm 1.96\frac{\sigma}{\sqrt{n}}$ would contain the population mean $\mu$.**


### $$\bar{x} - z\frac{\sigma}{\sqrt{n}} < \mu < \bar{x} + z\frac{\sigma}{\sqrt{n}}$$
where the z value gives the degree of confidence.
**Standard error:**
### $$SE = \frac{\sigma}{\sqrt{n}}$$
_______
### Degree of confidence
The degree of confidence is given as a percentage probability changed into a z-score, using the standard [[List MF-19|normal distribution tables]]. 
The value of z will depend on the degree of confidence required. If the population standard deviation ($\sigma$) is not known the sample standard deviation ([[Biased and Unbiased estimates of population parameters|S]]) can be used as an estimate. 
_____
### Example
A dairy factory produces blocks of cheese for export whose weights are known to be normally distributed with a standard deviation of 1.4kg. A random sample of 25 blocks of cheese has a mean weight of 22.3kg. Find 99% confidence intervals for the population.
$$\bar{x} = 22.3$$
$$\sigma = 1.4$$$$n = 25 $$$$SE = \frac{\sigma}{\sqrt{n}} = \frac{1.4}{\sqrt{25}} = \frac{1.4}{5}$$
$$z = \Phi(2.574) \rightarrow 0.995$$
$$\therefore z = 2.574 $$
$$22.3-(2.574)(\frac{1.4}{5}) < \mu < 22.3+(2.574)(\frac{1.4}{5})$$
$$21.6 < \mu < 23.0$$
If we took 100 samples, the true population mean would occur in 99% of estimates.