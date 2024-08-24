<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Complex-Numbers-intro</title></svelte:head><div class="note">
   <h1 class="title">Complex-Numbers-intro</h1>
<p>The ancient Greeks thought <Katex math={"x+10=9"}/> had no solution because no one had thought of negative numbers. <b>All real numbers are complex numbers but only some complex numbers are real</b></p>
<h2 class="heading"> <Katex math={"i = \\sqrt{-1}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"i^2 = -1"} displayMode/></h2>
<h2 class="heading"> <Katex math={"i * i = -1"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"If\\ x^2 + 196 = 0"} displayMode/></p>
<p><Katex math={"x^2 = -196"} displayMode/></p>
<p><Katex math={"x = \\pm \\sqrt{-196}"} displayMode/></p>
<p><Katex math={"x = \\pm\\sqrt{196 * -1}"} displayMode/></p>
<p><Katex math={"x = \\pm 14i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"(6+5i)(3-2i)"} displayMode/></p>
<p><Katex math={"= 18 - 12i + 15i + 10"} displayMode/></p>
<p><Katex math={"28 + 3i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Conjugate pair</h2>
<p><Katex math={"\\text{Solve the equation } z^2 - 6z + 58 = 0"} displayMode/></p>
<p><Katex math={"use\\ quadratic\\ formula"} displayMode/></p>
<p><Katex math={"\\frac{6\\pm \\sqrt{36 - 4(1)(58)}}{2}"} displayMode/></p>
<p><Katex math={"z = \\frac{6\\pm\\sqrt{-196}}{2}"} displayMode/></p>
<p><Katex math={"z = \\underbrace{3 + 7i\\quad or \\quad 3-7i}_{\\text{Conjugate pair}}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"i^{something}"}/></h2>
<p><Katex math={"i^2 = -1"} displayMode/></p>
<p><Katex math={"i^3 = i^2*i = -1i = -i"} displayMode/></p>
<p><Katex math={"i^4 = i^2*i^2 = 1"} displayMode/></p>
<p><Katex math={"i^5 = i^2*i^2*i = i"} displayMode/></p>
<p><Katex math={"\\dots"} displayMode/></p>
<p><Katex math={"i^{4n} = 1"} displayMode/></p>
<p><Katex math={"i^{4n+1} = i"} displayMode/></p>
<p><Katex math={"i^{4n + 2} = -1"} displayMode/></p>
<p><Katex math={"i^{4n+3} = -i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Equality</h2>
<p><Katex math={"z = x + iy"} displayMode/></p>
<p><Katex math={"w = u+iv"} displayMode/></p>
<p><Katex math={"\\text{If } z=w"} displayMode/></p>
<p><Katex math={"\\text{Then }x = u \\ \\text{and }y=v\\quad\\text{Always!}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Complex quadratics</h2>
<p>If <Katex math={"4-5i"}/> is one root of a quadratic equation with real coefficients. Write down the second root of the equations and hence find the equation.</p>
<p><Katex math={"\\text{This means automaticaly use conjugate}"} displayMode/></p>
<p><Katex math={"(z-(4-5i))(z-(4+5i))"} displayMode/></p>
<p><Katex math={"(z-4)^2 + 25"} displayMode/></p>
<p><Katex math={"z^2-8z+16+25"} displayMode/></p>
<p><Katex math={"z^2-8z+41"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>