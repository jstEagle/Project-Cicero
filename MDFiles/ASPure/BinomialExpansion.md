### $$(a+b)^n =... + \begin{pmatrix} n \\ r \end{pmatrix}a^{n-r}\ b^r +...$$
### $$(a+b)^n = \sum^n_{k=0}\begin{pmatrix} n \\ k \end{pmatrix} a^{n-k} \ b^k$$
_______
### Example
Find the term independent of x in the expansion of $(\frac{2}{x} - 3x)^6$ 

$$\begin{pmatrix} 6 \\ r \end{pmatrix} (\frac{2}{x})^{6-r} (-3x)^r$$
$$(\frac{1}{x})^{6-r}(-3x)^r$$
$$\frac{x^r}{x^{6-r}} = x^0$$
$$x^{r-6+r} = x^0$$
$$2r-6 = 0$$
$$2r = 6$$
$$r = 3$$
$$\downarrow$$
$$\begin{pmatrix} 6 \\ 3 \end{pmatrix} (\frac{2}{x})^{3} (-3x)^3$$
$$ = -4320$$


Find the value of a for which there is no term independent of x in the expansion

$$(1+ax^2)(\frac{2}{x} - 3x)^6$$
$$(1+ax^2)(-4320 + ......)$$
$$\frac{x^r}{x^{6-r}} = x^{-2}$$
$$2r - 6 = -2$$
$$2r = 4$$
$$r = 2$$
$$\downarrow$$
$$\begin{pmatrix} 6 \\ 2 \end{pmatrix} (\frac{2}{x})^{4} (-3x)^2$$
$$(1+ax^2)(-4320 + \begin{pmatrix} 6 \\ 2 \end{pmatrix} (\frac{2}{x})^{4} (-3x)^2)$$
$$(1 + ax^2)(...+\frac{2160}{x^2} - 4320 + ...)$$
$$-4320 + 2160a = 0$$
$$2160a = 4320$$
$$a = 2$$
________
