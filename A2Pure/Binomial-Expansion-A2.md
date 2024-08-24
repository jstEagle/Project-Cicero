### $$(1 + x)^n = 1 + nx + \frac{n(n-1)}{2!}*x^2 + \frac{n(n-1)(n-2)}{3!}*x^3 + ... + \frac{n(n-1)...(n-r + 1)}{r!}*x^r$$
**Only works when the format is $(1 + x)^n$ and with the restriction $|x| < 1$.**
___
### Example
Expand $(1 + x)^4$ using the binomial theorem
$$(1 + x)^4 = 1 + 4x + \frac{4(3)}{2!}*x^2 + \frac{4(3)(2)}{3!}*x^3 + \frac{4(3)(2)(1)}{4!}*x^4 + \frac{4(3)(2)(1)(0)}{5!}*x^5 $$
$$= 1 + 4x + 6x^2 + 4x^3 + x^4 + 0$$
$$= 1 + 4x + 6x^2 + 4x^3 + x^4$$
$$|x| < 1$$


Expand $(1 + x)^{-3}$ using the binomial theorem
$$(1 + x)^{-3} = 1 - 3x + \frac{-3(-4)}{2!}*x^2 + \frac{-3(-4)(-5)}{3!}*x^3 + \frac{-3(-4)(-5)(-6)}{4!}*x^4 + \dots$$
$$=1 - 3x $$
_____
### Example
Expand $(2-3x)^{-2}$ in ascending power of $x$, up to and including the term in $x^2$, simplifying the coefficients.
$$(2-3x)^{-2} = (2(1-\frac32x))^{-2}$$
$$= \frac14(1 - \frac32x)^{-2}$$
$$= \frac14(1 + (-2)(-\frac32x) + \frac{-2(-3)}{2!}(-\frac32x)^2 + \dots)$$
$$=\frac14(1 + 3x + \frac{27}{4}x^2 + \dots)$$
$$= \frac14 + \frac34x + \frac{27}{16}x^2 + \dots$$
$$\downarrow $$
$$|-\frac32x| < 1$$
$$|x| < \frac23$$
_____
You might need to use partial fractions before being able to expand.
![[Partial Fractions#$$ frac{px + q}{(ax + b)(cx + d)(ex + f)} equiv frac{A}{(ax + b)} + frac{B}{(cx + d)} + frac{C}{(ex + f)}$$|Partial Fractions Standard Formula]]
