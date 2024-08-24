Newtons law of cooling results in the differential equation: $\frac{dT}{dt} = k(T- T_0)$ 
We use differential equations to find information in real life situations.

- A differential equation is an equation involving derivatives
- Recall that $\frac{dy}{dx} = ...$ represents the rate of change of y with respect to x
- With extra information we can solve DE's by integrating and finding $y=... or f(x)=...$
- The position of an object is its distance from the origin O in the direction you have chosen to define as being positive.
- The rate of change of position of the object with respect to time is its velocity, and this can take positive or negative values according to whether the object is moving away from the origin of towards it.
_____
### $$ k \propto v = kv$$
### $$k \propto \frac1v = \frac{k}v$$
________
### Example
The area $A$ of a square is increasing at a rate proportional to the length of its side s. The constant of the proportionality is $k$. Find an expression for $\frac{ds}{dt}$
$$\frac{dA}{dt} * \frac{ds}{dA} = \frac{ds}{dt}$$
$$\frac{dA}{dt} = ks$$
$$\downarrow$$
$$A = s^2$$
$$\frac{dA}{ds} = 2s$$
$$\downarrow$$
$$\frac{ds}{dt} = ks * \frac1{2s}$$
$$= \frac{k}2$$
_____
### Solving differential equations
This just mean finding the original equation. i.e. integrating

### Example 1
Solve the differential equation $\frac{dy}{dx} = 3x^2 - 2$
$$\int 3x^2 - 2 *dx$$
$$=\frac{3x^3}{3} - 2x + c$$
$$= x^3 - 2x + c$$


### Example 2
Find for $y>0$, the general solution of the differential equation $\frac{dy}{dx} = xy$
$$\frac{1}{y}*\frac{dy}{dx} = x$$
$$\int\frac{1}y * \frac{dy}{\cancel{dx}} * \cancel{dx} = \int x * dx$$
$$\int \frac1y * dy = \int x*dx$$
$$ln|y| + c = \frac{x^2}2 + c$$
$$y = e^{\frac{x^2}{2} + c}$$
$$y = e^{\frac{x^2}{2}} * e^c$$
$$e^c = A$$
$$y = Ae^{\frac{x^2}{2}}$$
_______
