<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Division-of-Complex-Numbers</title></svelte:head><div class="note">
   <h1 class="title">Division-of-Complex-Numbers</h1>
<p>Two complex numbers <Katex math={"z = x+iy"}/> and <Katex math={"w=u+iv"}/> are equal if both <Katex math={"x=u"}/> and <Katex math={"y=v"}/>. If <Katex math={"u\\ne x"}/> and <Katex math={"v\\ne y"}/>, or both, then z and w are not equal.</p>
<p>So for two complex numbers to be equal, the real parts must be equal and the imaginary parts must be equal. When we use this result we say that we are equating real and imaginary parts.</p>
<p>Equating real and imaginary parts is a very useful method which often yields 'two for the price of one' when working with complex numbers.</p>
<p></p>
<p><b>To find the reciprocal of a complex number you multiply numerator and denominator by the complex conjugate of the denominator</b></p>
<p></p>
<p><Katex math={"\\text{By writing }\\frac{1}{x+iy} = p+iq"} displayMode/></p>
<p><Katex math={"\\text{show that }\\frac{1}{x+iy}=\\frac{x-iy}{x^2+y^2}"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\frac{1}{x+iy} * \\frac{x-iy}{x-iy} \\left. \\right\\} = 1"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p><Katex math={"\\text{Express } \\frac{9-4i}{2+3i}\\text{ as a complex number in the form }x+iy"} displayMode/></p>
<p><Katex math={"\\frac{9-4i}{2+3i}*\\frac{2-3i}{2-3i}"} displayMode/></p>
<p><Katex math={"\\frac{(9-4i)(2-3i)}{13}"} displayMode/></p>
<p><Katex math={"\\frac{18 - 27i - 8i -12}{13}"} displayMode/></p>
<p><Katex math={"\\frac{6-35i}{13}"} displayMode/></p>
<p><Katex math={"=\\frac{6}{13} - \\frac{35}{13}i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>