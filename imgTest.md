### The modulus-argument form of complex numbers
The position of the point $z$ in an Argand diagram can be described by means of the length of the line connecting this point to the origin, and the angle which this line makes with the positive real axis.
[[other math topic]]
__________
$$\arg(zw) = \arg(z) + \arg(w)$$
$$\arg(\frac{z}{w}) = \arg(z) - \arg(w)$$
$$|zw| = |z|*|w|$$
$$|\frac{z}{w}| = \frac{|z|}{|w|}$$
$$\text{If } x+iy = r(\cos\theta + i\sin\theta)$$
$$\text{then } \sqrt{x+iy} = \sqrt{r}(\cos(\frac{\theta}2) + i\sin(\frac{\theta}2))$$
$$\text{second root } = \sqrt{r}(\cos(\frac{\theta}2 +\pi) + i\sin(\frac{\theta}2+\pi))$$
_____
![[Pasted image 20240807091253.png]]
_____
### $arg(x+iy)$ means the angle $\phi$ created for this point
$$\phi = phi$$
$$z=x+iy$$
$$=r\cos\phi+ir\sin\phi$$
$$=r(\cos\phi + i\sin\phi)$$
$$-\pi < \phi \le \pi$$
The angle measured in radians. It is usual to choose that value of $\alpha$ for which $-\pi <\alpha\le\pi$. This is called the principal argument of $z$, denoted $arg(z)$. _The argument of zero is undefined_
$$arg(-4) = \pi$$
$$arg(-4)\text{ means find the angle for }(-4+0i)$$

----
If you know the length of the line & its angle then you can easily find its co-ordinates $(x+iy)$ and vice versa.

### Polar form - $z = r(\cos\theta + i\sin\theta)$
Angles must be the same & you must be adding!
**These are NOT polar form $z = r(\cos\theta - i\sin\theta)$ or $z = -2(\cos\theta+i\sin\theta)$**
$$\cos \phi = \frac{x}r$$
$$x = r\cos\phi$$
$$\sin\phi = \frac{y}r$$
$$y = r\sin\phi$$

### Z to Polar form
$$1+i$$
$$|z| = \sqrt{2} \quad \arg(z) = \frac{\pi}4$$
$$\downarrow$$
$$\sqrt{2}(\cos(\frac{\pi}4) + i\sin(\frac{\pi}4)) $$
### Polar form to Z
given $|z|$ and $\arg(z)$ either fill the polar form equation in on calculator or use $\sin$ and $\cos$
$$2(\cos(\frac{\pi}2) + i\sin(\frac{\pi}2))$$
$$|z| = 2$$
$$\arg(z) = \frac{\pi}{2}$$
$$\downarrow$$
$$2\cos(\frac{\pi}2) = x $$
$$2\sin(\frac{\pi}2) = y $$
$$\downarrow$$
$$= 2i$$
_____
### Sets of points using the polar form
![[Pasted image 20240807093430.png]]
_____
### Example
$$z = -4$$
$$z = 0i - 4$$
$$arg(-4) = \pi$$
$$mod(-4) = |0i-4| = 4$$
$$polar\ form = 4(\cos\pi + \sin\pi)$$
______
### Example
Convert the following to polar form
1. $z = -2(\cos\alpha+i\sin\alpha)$
2. $z = -2(\cos\alpha - i\sin\alpha)$
3. $z = 2(\cos\alpha-i\sin\alpha)$


1.  
   $$z = 2(-\cos\alpha - i \sin\alpha)$$
   $$third\ quadrant$$
   $$\downarrow$$
   $$= 2(\cos(\alpha-\pi) + \sin(\alpha-\pi))$$

2. 
$$z = 2(-\cos\alpha + i\sin\alpha) $$
$$=2(\cos(\pi-\alpha) + i\sin(\pi-\alpha))$$

3. 
   $$z=2(\cos(-\alpha) + i\sin(-\alpha))$$
______
### Proof $\arg(zw) = arg(z) + arg(w)$
$$z_1 = r_1 (\cos\theta + i\sin\theta) \quad z_2 = r_2(\cos\alpha+i\sin\alpha)$$
$$z_1 * z_2 = r_1(\cos\theta + i\sin\theta) * r_2(\cos\alpha + i\sin\alpha)$$
$$= r_1r_2(\cos\theta\cos\alpha + i\sin\theta\cos\alpha + i\sin\alpha\cos\theta + i^2\sin\theta\sin\alpha)$$
$$=r_1r_2(\cos\theta\cos\alpha + i^2\sin\theta\sin\alpha + i(\sin\theta\cos\alpha + \sin\alpha\cos\theta))$$
$$=r_1r_2((\cos\theta\cos\alpha -\sin\theta\sin\alpha) + i(\sin\theta\cos\alpha + \sin\alpha\cos\theta))$$
$$\underbrace{z_1 * z_2}_{\text{new number}} = \overbrace{r_1*r_2}^{\text{new modulus}}(\cos(\underbrace{\theta + \alpha}_\text{new arg}) + i\sin(\theta + \alpha))$$
______
### Proof $\arg(\frac{u}{v}) = \arg(u) - \arg(v)$




_______
### Proof $\sqrt{z}$
$$\text{If the root }z = r(\cos\theta + i\sin\theta)$$
$$z^2 = r(\cos^2\theta+2i\cos\theta\sin\theta - \sin^2\theta)$$
$$=r^2(\cos^2\theta - \sin^2\theta + 2i\cos\theta\sin\theta)$$
$$\text{Sub in double angle identities }\cos2\theta = \cos^2-\sin^2\theta \text{ and } \sin2\theta = 2\sin\theta\cos\theta$$
$$z^2 = r^2(\cos2\theta + i\sin2\theta)$$
$$z^2 = r^2(\cos2\theta + i\sin2\theta) \text{ or } r^2(\cos(2\theta + 2\pi) + i\sin(2\theta + 2\pi))$$
$$\text{but }z = r(\cos\theta + i\sin\theta)$$
$$\text{So to get to }z = \sqrt{r^2}(\cos\frac{2\theta}{2} + \sin\frac{2\theta}{2})$$
$$\text{and } z = \sqrt{r^2}(\cos(\frac{2\theta}{2}+\pi) + \sin(\frac{2\theta}{2}+\pi))$$
_________
