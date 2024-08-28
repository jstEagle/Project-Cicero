<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ImproperIntegrals</title></svelte:head><div class="note">
   <h1 class="title">Improper Integrals</h1>
<h2 class="heading"> Type 1</h2>
<p><Katex math={"Limits \\rightarrow \\infty "} displayMode/></p>
<p><Katex math={"\\int^{\\infty}_1\\ \\frac{1}{x^2}\\ dx"} displayMode/></p>
<p><Katex math={"\\int^{x}_1\\ x^{-2}\\  dx"} displayMode/></p>
<p><Katex math={"[\\frac{x^{-1}}{-1}]^{x}_1"} displayMode/></p>
<p><Katex math={"[\\frac{1}{-x}]^{x}_1"} displayMode/></p>
<p><Katex math={"= (-\\frac{1}{x}) - (-\\frac{1}{x})"} displayMode/></p>
<p><Katex math={"= -\\frac{1}{x} + 1"} displayMode/></p>
<p><Katex math={"= 1 - \\frac{1}{x}"} displayMode/></p>
<p><Katex math={"x \\rightarrow \\infty"} displayMode/></p>
<p><Katex math={"\\frac{1}{x} \\rightarrow \\infty"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Type 2</h2>
<p><Katex math={"\\int^{0}_2\\ \\frac5{x^2}\\ dx"} displayMode/></p>
<p><Katex math={"\\int^{0}_2\\ 5x^{-2}\\ dx"} displayMode/></p>
<p><Katex math={"= \\frac{5x^{-1}}{-1}"} displayMode/></p>
<p><Katex math={"= \\frac{5}{-x}"} displayMode/></p>
<p><Katex math={"[\\frac{5}{-x}]^0_2"} displayMode/></p>
<p><Katex math={"(\\frac5{-2}) - (\\frac{5}{-0})"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\int^2_{x}\\ 5x^{-2}\\ dx"} displayMode/></p>
<p><Katex math={"[\\frac{5}{-x}]^x_2"} displayMode/></p>
<p><Katex math={"-\\frac{5}{x} - \\frac{5}2"} displayMode/></p>
<p><Katex math={"x \\rightarrow 0"} displayMode/></p>
<p><Katex math={" -\\frac{5}{x} \\rightarrow \\infty"} displayMode/></p>
<p><Katex math={"= undefined"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>