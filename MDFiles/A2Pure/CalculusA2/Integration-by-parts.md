### $$\int u*v' = u*v - \int u'*v$$
### $$\int^b_au*v' = [u*v]^b_a - \int^b_au' * v$$
------
### Choose u - LAATE
### L - ln / log
### A - Arctan
### A - Algebra
### T - Trig
### E - Exponents - $e^x$
### Then choose v
-------
### Proof
$$\frac{d}{dx}[u*v] = \frac{du}{dx}*v + \frac{dv}{dx}*u$$
$$\int \frac{d}{dx}[u*v] = \int\frac{du}{dx}*v + \int\frac{dv}{dx}*u $$
$$\int u*\frac{du}{dx}*dx = u*v - \int\frac{du}{dx}*v $$
$$= \int u*v' = u*v - \int u'*v$$ _____
### Example - Indefinite
Find $\int 2xe^x*dx$
$$u = 2x$$
$$\int 2xe^x*dx = 2x*ex - \int2e^x*dx$$
$$=2xe^x - 2e^x$$


Find $\int \ln x * dx$
$$u = \ln x$$
$$v = x$$
$$\int \ln x *dx = lnx * x - \int \frac1x * x * dx$$
$$= \ln x * x - x + c$$
$$=x \ln x - x + c$$


Find $\int x \sqrt{1+x}*dx$
$$u = x$$
$$v'=\sqrt{1+x}$$
$$=x*\frac23(1+x)^{\frac32}-\int \frac23(1+x)^{\frac32}*dx $$
$$=\frac{10}{15}x(1+x)^{\frac32} - \frac{4}{15}(1+x)^\frac25 + c$$
$$=\frac1{15}(1+x)^{\frac32}(10x-4(1+x)) + c $$
$$=\frac1{15}(1+x)^{\frac32}(6x-4) + c$$
$$=\frac2{15}(1+x)^{\frac32}(3x-2) + c$$
______
### Example - Definite
Evaluate $\int^2_0 xe^x*dx$
$$u = x$$
$$v' = e^x$$
$$= [xe^x]^2_0 - \int^2_0 e^x * dx$$
$$= [xe^x]^2_0 - [e^x]^2_0$$
$$=([(2)e^{(2)}] - [(0)e^{(0)}]) - ([e^{(2)}] - [e^{(0)}])$$
$$=e^2 + 1$$
$$= 8.39\ (3sf)$$
_______
