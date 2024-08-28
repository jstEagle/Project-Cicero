### H$_0$ - Null Hypothesis
Nothing is changed, what we believed to be true previously still applies.

### H$_1$ - Alternate Hypothesis
A new possibility that we are investigating.

### Significance level
It is the level at which an event is so unlikely to be coincidence that we reject the null hypothesis and concede that something has probably changed.

Usually, a significance level of 5% or 1% is used by scientists but it depends on the situation. Clearly a level of 1% will provide more certainty for your conclusion that 5%.

**If probability of event > Significance level $\rightarrow$ Accept Null Hypothesis**

**If probability of event < Significance level $\rightarrow$ Reject Null Hypothesis
_____

### Example
Records show that <mark class="hltr-orange">1% of the population</mark> has a positive reaction to a test for a particular allergy. In a village, <mark class="hltr-orange">120 people are tested and four people have a positive reaction</mark>. Test at the <mark class="hltr-orange">5% level of significance</mark> if there is any evidence of an increase in the population with a positive reaction for this particular allergy.

$$ X \sim B(120, 0.01)$$
$$H_0: \lambda = 1.2$$
$$H_1: \lambda > 1.2$$
$$X\sim Po(1.2)$$
$$5\% \ significance$$
$$\downarrow$$
$$p(x \ge 4) = 1 - p(x < 4)$$
$$= 1 - e^{-1.2}(1 + 1.2 + \frac{1.2^2}{2!} + \frac{1.2^3}{3!})$$
$$= 3.38\%$$
$$3.38\% < 5\%$$
$\therefore \ H_0$ is rejected, $H_1$ is accepted. This means that there has been an increase in the population of people that have a positive reaction.

_To accept null hypothesis $p(x \ge 4) > 5\%$_

_________

### Example
Studies suggest that 10% of the world's population is left-handed. Bailin suspects that being left-handed is less common amongst basketball players and plans to test this by asking a random of 50 basketball players if there are left-handed.

1) Find the rejection region at the 5% significance level and state the critical value.

- Define the random variable: $X \sim B(50, 0.1)$. $X =$ number of players who are left handed.
- State $H_0$ - 10% of the basketball players are left-handed
- State $H_1$ - less than 10% of the basketball players are left-handed
- Type of test - One tailed at 5% significance

$$X \sim B(50, 0.1)$$
$$p(X\le K) \le 5\%$$
$$p(X = 0) = 0.9^{50} = 0.0052$$
$$p(X = 1) = 0.0286$$
$$p(X = 2) = 0.0779$$
$$\downarrow$$
$$P(X \le 1) = \begin{pmatrix}50 \\ 0 \end{pmatrix}*0.1^0*0.9^{50} + \begin{pmatrix}50 \\ 1 \end{pmatrix} * 0.1*0.9^{49} $$
$$ = 3.38\%$$
$$p(X \le 2) = 11.17\%$$
$$\downarrow$$
$$3.38\% < 5\%$$
Rejection region is $X \le 1$ 
If one or fewer players are left-handed then there is sufficient evidence to suggest that less than 10% of basketball players are left-handed


2) If the critical value is 2, what would be the lest integer significance level for you to conclude that Bailin's suspicion is correct?

i.e. min level of significance level required if n = 2 to reject $H_0$ 
$$ = 12\%$$
