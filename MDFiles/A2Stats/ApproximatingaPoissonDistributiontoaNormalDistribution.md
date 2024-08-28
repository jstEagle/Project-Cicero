- **The Poisson distribution can be approximated by the Normal Distribution when $\lambda$ is large. i.e. when $\lambda > 15$**

- We use a Normal Distribution to approximate the Poisson for a similar reason as the above. i.e. to avoid long and tedious Poisson Calculations.

- Because the Poisson distribution is a discrete distribution and it is being approximated by a continuous Normal distribution, we must ensure that we use a **continuity correction!**

$$P(x > 98) \rightarrow P(x > 98.5)$$
$$P(x \ge 155) \rightarrow P(x \ge 154.5)$$
$$P(x = 12) \rightarrow P(11.5 \le x \le 12.5)$$
$$P(x < 97) \rightarrow P(x < 96.5)$$
$$P(x \le 18) \rightarrow P(x \le 18.5)$$
$$P(52 \le x < 60) \rightarrow P(51.5 \le x < 59.5)$$
### $$\mu\ and\ \sigma \rightarrow \lambda\ and\ \sqrt{\lambda}$$

________
### Example
Assume Manuela posts on average 24 pictures per week.
Find the probability that she posts:
1) 30 pictures
2) Between 24 & 26 pictures

1) Poisson:
   $$X \sim Po(24)$$
   $$P(x = 30) = \frac{e^{-24} * 24^{30}}{30!} = 0.0362 (3sf)$$
   Normal:
   Because $\lambda > 15$ it is an appropriate approximation.
   $$P(x = 30) \rightarrow P(29.5 \le x \le 30.5)$$
   $$X \sim N(24, 24)$$
   ![[Normal Distribution#Calculating Z-value]]
   $$\frac{30.5 - 24}{\sqrt{24}} \ge Z \ge \frac{29.5 - 24}{\sqrt{24}}$$
   $$\Phi(1.327) - \Phi(1.123) = 0.0385$$
2) Poisson:
   $$P(24 \le x \le 26)$$
   $$e^{-24}(\frac{24^{24}}{24!} + \frac{24^{25}}{25!} + \frac{24^{26}}{26!})$$
   $$= 0.231$$
   Normal:
   $$P(23.5 \le x \le 26.5)$$
   $$\frac{26.5-24}{\sqrt{24}} \ge Z \ge \frac{23.5-24}{\sqrt{24}}$$
   $$\Phi(0.510) - \Phi(-0.102) = 0.236$$
_____
