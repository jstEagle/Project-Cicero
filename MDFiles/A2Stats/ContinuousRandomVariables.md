This is just finding the probability of an event we know can be modelled by some function, by finding the area under the graph between two points.
____
### Median and Quartiles
The median value of a continuous random variable X with p.d.f. $f(X)$ is the value m for which
$$p(X < m) = p(X > m) = 0.5$$
consequently
$$\int^m_{-\infty}f(X)*dx = 0.5\ \  and\  \int^{\infty}_mf(X)*dx = 0.5$$
_the same works with quartiles just using 0.25_

### Mode
The mode of a continuous random variable X whose p.d.f. is $f(X)$ has the greatest value. Thus the mode is the value of X where the curve is at its highest. If the mode is at a local maximum of $f(X)$ then it may often be found by differentiating $f(X)$ and solving the equation $f'(X) = 0$

i.e.
```desmos-graph
left=-1; right=2;
bottom=-1; top=2;
---
y = 4x(1-x^2) | 0 \le x \le 1
(0.57735, 1.5396) | label: mode
```


### Mean and Variance
$$\int f(x)*dx = prob.\ of\ x = p(x)$$
$$E(X) = \sum x*p(X)\ for\ discrete\ data$$
$$E(X) = \int x * f(x)*dx $$
$$Var(X) = \sum x^2 * p(X) - \bar{x}^2 = \int x^2 * f(x) *dx - [\int x * f(x) * dx]^2 $$

### Uniform (rectangular) distribution
$$f(x) = \left\{ \begin{array}{c} \frac{1}{b-a}\ \ \ \ a \le x \le b \\ 0\ \ \ otherwise \end{array} \right.$$
$$Median = \frac{b+a}{2}$$
$$No\ mode$$
$$Var(X) = \frac{(b-a)^2}{12}$$
Proof:
$$\int^b_a x^2(\frac{1}{b-a})*dx - (\frac{b+a}{2})^2 $$
$$=[\frac{x^3}{3}(\frac{1}{b-a})]^b_a*(\frac{1}{b-a}) - (\frac{b+a}{2})^2 $$
$$= \frac{b^3}{3(b-a)}-(\frac{b-a}{2})^2$$
$$= \frac{b^3-a^3}{3(b-a)} - (\frac{b-a}{2})^2$$
$$\downarrow$$
$$b^3-a^3 = (b-a)(a^2 + ab + b^2)$$
$$= \cancel{a^2b} + \cancel{ab^2} + b^3 - a^3 - \cancel{a^2b} - \cancel{ab^2}$$
$$=\frac{(b-a)(a^2 + ab + b^2)}{3(b-a)} - (\frac{b+a}{2})^2 $$
$$=\frac{a^2 + ab + b^2}{3} - \frac{b^2 + 2ab + a^2}{4} $$
$$= \frac{4a^2 + \cancel{4ab} + \cancel{4b^2} - \cancel{3b^2} - \cancel{6ab} - 3a^2}{12}$$
$$= \frac{b^2 - 2ab + a^2}{12}$$
$$= \frac{(b-a)^2}{12}$$

```desmos-graph
left=-1; right=10;
bottom=-1; top=5;
---
y = 2
(0,2) | label: prob of one segment |
```


_______
### Example
The oil refinery are thinking of fitting an electronic security system inside the head office. They have been told by manufacturers that the lifetime, X years, of the system they have in mind has the p.d.f. of
$$f(x) = \left\{ \begin{array}{c} \frac{3x(20-x)}{4000}\ \ \ for\ 0 \le x \le 20 \\ 0\ \ \ otherwise \end{array} \right.$$
1. Show that the manufacturer's statement is consistent with $f(x)$ being a probability density function.
$$If\ f(x)\ is\ p.d.f.\ then\ \int^{20}_0\frac{3x(20-x)}{4000} = 1$$
$$\int^{20}_0 \frac{3x(20-x)}{4000}*dx = \int^{20}_0\frac{60x-3x^2}{4000}*dx = \frac{1}{4000}*\int^{20}_0 60x - 3x^2*dx$$
$$= [\frac{1}{4000}((\frac{60x^2}2) - \frac{3x^3}3)]^{20}_0$$
$$ = [\frac1{4000} (30x^2 - x^3)]^{20}_0$$
$$= [\frac{3x^2}{400} - \frac{x^3}{4000}]^{20}_0 = [\frac{3(20^2)}{400} - \frac{(20)^3}{4000}] - [\frac{3(0)^2}{400} - \frac{(0)^3}{4000}]$$
$$ = 1$$
$$\therefore\ is\ p.d.f.$$

2. Find the probability that it fails in the tenth year
$$\frac{1}{4000}\int^{10}_9 60x - 3x^2 *dx$$
$$= [\frac{3x^2}{400} - \frac{x^3}{4000}]^{10}_9 = [\frac{3(10)^2}{400} - \frac{(10)^3}{4000}] - [\frac{3(9)^2}{400} - \frac{(9)^3}{4000}] $$
$$ = (0.5) - (0.42525)$$
$$ = 0.0748$$

_________
### Example
A continuous random variable, X, has the following PDF:
$$f(x) = \left\{ \begin{array}{c} \frac1{27}x^2\ \ \ \ \ \ \ \ \ \ 0\le x\le3 \\ \frac13(5-x)\ \ \ 3<x\le5 \\ 0\ \ \ \ \ \ \ \ \ \ \ \ \ \ otherwise \end{array} \right.$$
1. Find the median
Have to use second part, so working from the back of the graph to the front
$$\int^5_m\frac13(5-x)*dx = \frac13*\int^5_m 5- x *dx = 0.5$$
$$=[\frac53x-\frac{x^2}6]^5_m = [\frac53(5) - \frac{(5)^2}6] - [\frac53(m) - \frac{(m)^2}{6}] = 0.5$$
$$\frac{25}6 - \frac53m + \frac{m^2}6 = 0.5 $$
$$25 - 10m + m^2 = 3$$
$$Quadratic\ equation$$
$$\downarrow$$
$$m = \cancel{6.73}\ because\ > 5$$
$$\therefore m = 3.27$$
2. Find the lower quartile
$$\frac1{27}*\int^Q_0 x^2*dx = 0.25$$
$$=[\frac{x^3}{81}]^Q_0= 0.25$$
$$=\frac{Q^3}{81} = 0.25$$
$$Q = 2.73$$
______
### Example
The response time, in seconds, for a contestant in a general knowledge quiz is modelled by a continuous random variable X whose X p.d.f is
$$f(x) = \frac{x}{50}\ \ \ \ \ for\ 0 < x\le 10$$
The rules state that a contestant who makes no answer is disqualified from the whole competition. This has the consequence that everybody gives an answer, if only a guess, to every question. Find

1. The mean time in seconds for a contestant to respond to a particular question
$$E(X) = \int^{10}_0x * \frac{x}{50} * dx = \int^{10}_0 \frac{x^2}{50} * dx$$
$$= [\frac{x^3}{150}]^{10}_0 = [\frac{(10)^3}{150}] - [\frac{(0)^3}{150}]$$
$$= \frac{1000}{150} = \frac{20}3 $$

2. The standard deviation of the time taken.
$$\sigma = \sqrt{\sigma^2} = \sqrt{\int^{10}_0 x^2 * \frac{x}{50} * dx - (E(X))^2} $$
$$= [\frac{x^4}{200}^{10}_0] = [\frac{(10)^4}{200}] - [\frac{(0)^4}{200}]$$
$$= \sqrt{50 - (\frac{20}3)^2} = 2.36$$

3. The organiser estimates the proportion of contestants who are guessing by assuming that they are those whose time is at least one standard deviation greater than the mean. Using this assumption, estimate the probability that a randomly selected response is a guess.
$$p(X \ge \frac{20}3 + \frac{\sqrt{50}}3)$$
$$= \int^{10}_{\frac{20}3 + \frac{\sqrt{50}}3} \frac{x}{50} = [\frac{x^2}{100}]^{10}_{\frac{20}3 + \frac{\sqrt{50}}3}$$
$$= \frac{10^2}{100} - \frac{(\frac{20}3 + \frac{\sqrt{50}}3)}{100} = 1- 0.814 $$
$$=0.186 $$
__________
