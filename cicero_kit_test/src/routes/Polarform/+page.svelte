<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Polarform</title></svelte:head><div class="note">
   <h1 class="title">Polarform</h1>
<h2 class="heading"> The modulus-argument form of complex numbers</h2>
<p>The position of the point <Katex math={"z"}/> in an Argand diagram can be described by means of the length of the line connecting this point to the origin, and the angle which this line makes with the positive real axis.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"\\arg(zw) = \\arg(z) + \\arg(w)"} displayMode/></p>
<p><Katex math={"\\arg(\\frac{z}{w}) = \\arg(z) - \\arg(w)"} displayMode/></p>
<p><Katex math={"|zw| = |z|*|w|"} displayMode/></p>
<p><Katex math={"|\\frac{z}{w}| = \\frac{|z|}{|w|}"} displayMode/></p>
<p><Katex math={"\\text{If } x+iy = r(\\cos\\theta + i\\sin\\theta)"} displayMode/></p>
<p><Katex math={"\\text{then } \\sqrt{x+iy} = \\sqrt{r}(\\cos(\\frac{\\theta}2) + i\\sin(\\frac{\\theta}2))"} displayMode/></p>
<p><Katex math={"\\text{second root } = \\sqrt{r}(\\cos(\\frac{\\theta}2 +\\pi) + i\\sin(\\frac{\\theta}2+\\pi))"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<img src="/Attachements/Pastedimage20240807091253.png" alt="diagram">
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"arg(x+iy)"}/> means the angle <Katex math={"\\phi"}/> created for this point</h2>
<p><Katex math={"\\phi = phi"} displayMode/></p>
<p><Katex math={"z=x+iy"} displayMode/></p>
<p><Katex math={"=r\\cos\\phi+ir\\sin\\phi"} displayMode/></p>
<p><Katex math={"=r(\\cos\\phi + i\\sin\\phi)"} displayMode/></p>
<p><Katex math={"-\\pi < \\phi \\le \\pi"} displayMode/></p>
<p>The angle measured in radians. It is usual to choose that value of <Katex math={"\\alpha"}/> for which <Katex math={"-\\pi <\\alpha\\le\\pi"}/>. This is called the principal argument of <Katex math={"z"}/>, denoted <Katex math={"arg(z)"}/>. _The argument of zero is undefined_</p>
<p><Katex math={"arg(-4) = \\pi"} displayMode/></p>
<p><Katex math={"arg(-4)\\text{ means find the angle for }(-4+0i)"} displayMode/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>If you know the length of the line & its angle then you can easily find its co-ordinates <Katex math={"(x+iy)"}/> and vice versa.</p>
<p></p>
<h2 class="heading"> Polar form - <Katex math={"z = r(\\cos\\theta + i\\sin\\theta)"}/></h2>
<p>Angles must be the same & you must be adding!</p>
<p><b>These are NOT polar form <Katex math={"z = r(\\cos\\theta - i\\sin\\theta)"}/> or <Katex math={"z = -2(\\cos\\theta+i\\sin\\theta)"}/></b></p>
<p><Katex math={"\\cos \\phi = \\frac{x}r"} displayMode/></p>
<p><Katex math={"x = r\\cos\\phi"} displayMode/></p>
<p><Katex math={"\\sin\\phi = \\frac{y}r"} displayMode/></p>
<p><Katex math={"y = r\\sin\\phi"} displayMode/></p>
<p></p>
<h2 class="heading"> Z to Polar form</h2>
<p><Katex math={"1+i"} displayMode/></p>
<p><Katex math={"|z| = \\sqrt{2} \\quad \\arg(z) = \\frac{\\pi}4"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\sqrt{2}(\\cos(\\frac{\\pi}4) + i\\sin(\\frac{\\pi}4)) "} displayMode/></p>
<h2 class="heading"> Polar form to Z</h2>
<p>given <Katex math={"|z|"}/> and <Katex math={"\\arg(z)"}/> either fill the polar form equation in on calculator or use <Katex math={"\\sin"}/> and <Katex math={"\\cos"}/></p>
<p><Katex math={"2(\\cos(\\frac{\\pi}2) + i\\sin(\\frac{\\pi}2))"} displayMode/></p>
<p><Katex math={"|z| = 2"} displayMode/></p>
<p><Katex math={"\\arg(z) = \\frac{\\pi}{2}"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"2\\cos(\\frac{\\pi}2) = x "} displayMode/></p>
<p><Katex math={"2\\sin(\\frac{\\pi}2) = y "} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"= 2i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Sets of points using the polar form</h2>
<img src="/Attachements/Pastedimage20240807093430.png" alt="diagram">
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p><Katex math={"z = -4"} displayMode/></p>
<p><Katex math={"z = 0i - 4"} displayMode/></p>
<p><Katex math={"arg(-4) = \\pi"} displayMode/></p>
<p><Katex math={"mod(-4) = |0i-4| = 4"} displayMode/></p>
<p><Katex math={"polar\\ form = 4(\\cos\\pi + \\sin\\pi)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Convert the following to polar form</p>
<p>1. <Katex math={"z = -2(\\cos\\alpha+i\\sin\\alpha)"}/></p>
<p>2. <Katex math={"z = -2(\\cos\\alpha - i\\sin\\alpha)"}/></p>
<p>3. <Katex math={"z = 2(\\cos\\alpha-i\\sin\\alpha)"}/></p>
<p></p>
<p></p>
<p>1.  </p>
<p>   <Katex math={"z = 2(-\\cos\\alpha - i \\sin\\alpha)"} displayMode/></p>
<p>   <Katex math={"third\\ quadrant"} displayMode/></p>
<p>   <Katex math={"\\downarrow"} displayMode/></p>
<p>   <Katex math={"= 2(\\cos(\\alpha-\\pi) + \\sin(\\alpha-\\pi))"} displayMode/></p>
<p></p>
<p>2. </p>
<p><Katex math={"z = 2(-\\cos\\alpha + i\\sin\\alpha) "} displayMode/></p>
<p><Katex math={"=2(\\cos(\\pi-\\alpha) + i\\sin(\\pi-\\alpha))"} displayMode/></p>
<p></p>
<p>3. </p>
<p>   <Katex math={"z=2(\\cos(-\\alpha) + i\\sin(-\\alpha))"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof <Katex math={"\\arg(zw) = arg(z) + arg(w)"}/></h2>
<p><Katex math={"z_1 = r_1 (\\cos\\theta + i\\sin\\theta) \\quad z_2 = r_2(\\cos\\alpha+i\\sin\\alpha)"} displayMode/></p>
<p><Katex math={"z_1 * z_2 = r_1(\\cos\\theta + i\\sin\\theta) * r_2(\\cos\\alpha + i\\sin\\alpha)"} displayMode/></p>
<p><Katex math={"= r_1r_2(\\cos\\theta\\cos\\alpha + i\\sin\\theta\\cos\\alpha + i\\sin\\alpha\\cos\\theta + i^2\\sin\\theta\\sin\\alpha)"} displayMode/></p>
<p><Katex math={"=r_1r_2(\\cos\\theta\\cos\\alpha + i^2\\sin\\theta\\sin\\alpha + i(\\sin\\theta\\cos\\alpha + \\sin\\alpha\\cos\\theta))"} displayMode/></p>
<p><Katex math={"=r_1r_2((\\cos\\theta\\cos\\alpha -\\sin\\theta\\sin\\alpha) + i(\\sin\\theta\\cos\\alpha + \\sin\\alpha\\cos\\theta))"} displayMode/></p>
<p><Katex math={"\\underbrace{z_1 * z_2}_{\\text{new number}} = \\overbrace{r_1*r_2}^{\\text{new modulus}}(\\cos(\\underbrace{\\theta + \\alpha}_\\text{new arg}) + i\\sin(\\theta + \\alpha))"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof <Katex math={"\\arg(\\frac{u}{v}) = \\arg(u) - \\arg(v)"}/></h2>
<p></p>
<p></p>
<p></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof <Katex math={"\\sqrt{z}"}/></h2>
<p><Katex math={"\\text{If the root }z = r(\\cos\\theta + i\\sin\\theta)"} displayMode/></p>
<p><Katex math={"z^2 = r(\\cos^2\\theta+2i\\cos\\theta\\sin\\theta - \\sin^2\\theta)"} displayMode/></p>
<p><Katex math={"=r^2(\\cos^2\\theta - \\sin^2\\theta + 2i\\cos\\theta\\sin\\theta)"} displayMode/></p>
<p><Katex math={"\\text{Sub in double angle identities }\\cos2\\theta = \\cos^2-\\sin^2\\theta \\text{ and } \\sin2\\theta = 2\\sin\\theta\\cos\\theta"} displayMode/></p>
<p><Katex math={"z^2 = r^2(\\cos2\\theta + i\\sin2\\theta)"} displayMode/></p>
<p><Katex math={"z^2 = r^2(\\cos2\\theta + i\\sin2\\theta) \\text{ or } r^2(\\cos(2\\theta + 2\\pi) + i\\sin(2\\theta + 2\\pi))"} displayMode/></p>
<p><Katex math={"\\text{but }z = r(\\cos\\theta + i\\sin\\theta)"} displayMode/></p>
<p><Katex math={"\\text{So to get to }z = \\sqrt{r^2}(\\cos\\frac{2\\theta}{2} + \\sin\\frac{2\\theta}{2})"} displayMode/></p>
<p><Katex math={"\\text{and } z = \\sqrt{r^2}(\\cos(\\frac{2\\theta}{2}+\\pi) + \\sin(\\frac{2\\theta}{2}+\\pi))"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>