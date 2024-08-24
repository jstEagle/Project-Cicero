##### Vector - magnitude and direction
##### Scalar - magnitude only

_____
![[Pasted image 20240819094522.png]]
### $$\tilde{a} =\begin{pmatrix} x \\ y \\ z \end{pmatrix}\rightarrow \text{ column vector}$$
### $$\tilde{a} = xi+yj+zk\rightarrow \text{component vector}$$
### $$|\tilde{a}| = \sqrt{x^2 + y^2 + z^2}$$
_____
### Vector calculations
$$\tilde{a} = \begin{pmatrix}x\\ y\\ z\end{pmatrix}\quad \tilde{b}=\begin{pmatrix}u\\ v\\ w\end{pmatrix}$$
$$\tilde{a} \pm \tilde{b} = \begin{pmatrix}x\pm u\\ y\pm v\\ z\pm w\end{pmatrix}=(x\pm u)i + (y\pm v)j + (z\pm w)k$$
$$M\tilde{a}=\begin{pmatrix}Mx\\ My \\ Mz\end{pmatrix} = Mxi + Myi + Mzk$$
_____
### Unit vector
### $$\hat{a} = \text{symbol of unit vector}$$
### $$\tilde{a} = \begin{pmatrix}i\\ j\\ k\end{pmatrix} \quad \hat{a}=\frac{\tilde{a}}{|\tilde{a}|}$$
_______
### Angle between two vectors
[[Dot Product]]
### $$\cos\theta = \frac{a.b}{|a||b|} \quad a=\begin{pmatrix} a_1\\ a_2\\ a_3\end{pmatrix}\quad b=\begin{pmatrix} b_1\\ b_2\\ b_3\end{pmatrix}$$
### $$a.b = \text{ dot product of a and b}$$
![[Pasted image 20240819100842.png]]
Since $\cos(90^o) = 0$, it follows that is vector $a$ and $b$ are perpendicular then $a.b=0$
$$\cos\theta = \frac{a.b}{|a||b|} \quad 0=\frac{a.b}{|a||b|}$$
$$\therefore ab = 0$$
$$\therefore a_1b_1+a_2b_2 = 0 \text{ if }\perp$$
________
### Check if lines are parallel or intersect or skew
### $$L_1 : r_1 = a_1 + td_1\quad L_2:r_2 = a_2 + sd_2$$
### $$n = d_1 \times d_2\quad \text{cross product}$$
### $$d = \frac{|(a_2-a_1).n|}{|n|} \quad \text{shortest distance}$$
- **Parallel:** if $n = 0$
- **Intersecting:** if $d=0$ and $n\ne 0$
- **Skew:** if $d\ne 0$
_____
### Shortest distance between point $p$ and a line
Let $A$ be any point on the line
### $$AP = P-A$$
### $$|AP\times d| \quad \text{magnitude of cross product}$$
### $$d=\frac{|AP\times d|}{|d|}\quad \text{ shortest distance}$$
______
### Angle between two lines
**The angle between two lines is the same as the angle between their direction vectors (obviously)**
### $$L_1 : r_1 = a_1 + td_1\quad L_2:r_2 = a_2 + sd_2$$
### $$\cos\theta = \frac{d_1.d_2}{|d_1||d_2|} $$
____
