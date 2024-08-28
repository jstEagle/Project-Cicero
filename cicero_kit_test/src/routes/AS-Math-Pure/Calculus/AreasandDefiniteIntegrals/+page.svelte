<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>AreasandDefiniteIntegrals</title></svelte:head><div class="note">
   <h1 class="title">Areas and Definite Integrals</h1>
<img src="/Attachements/Pastedimage20230815170913.png" alt="diagram">
<img src="/Attachements/Pastedimage20230815170930.png" alt="diagram">
<p><Katex math={"\\int 2x\\ dx = \\frac{2x^2}2 + c"} displayMode/></p>
<p><Katex math={"\\int<i>{1}^{4}2x\\ dx = [\\frac{2x^2}2 + c]^4</i>1"} displayMode/></p>
<p><Katex math={"(\\frac{2(4)^2}2 + c) - (\\frac{2(1)^2}2 + c)"} displayMode/></p>
<p><Katex math={"16 + c -1 -c"} displayMode/></p>
<p><Katex math={" = 15"} displayMode/></p>
<p></p>
<p><b>Area above y = 0 and area bellow the line y = 0 will cancel. If a graph has area both above and below, you have to split your working into 2 parts and flip the sign for the negative solution to add it to the total area.</b></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Example</h3>
<p><Katex math={"\\int_{1}^{\\infty} x^{-2}\\ dx"} displayMode/></p>
<p><Katex math={"\\int_{1}^{\\infty} x^{-2}\\ dx = \\frac{x^-1}{-1} = -\\frac{1}{x} = [-\\frac{1}{x}]^{\\infty}_{1}"}/></p>
<p><Katex math={" = (-\\frac{1}{\\infty}) - (-\\frac{1}1)"} displayMode/></p>
<p><i>Anything divided by infinity tends to zero because the fraction becomes so small</i></p>
<p><Katex math={"=0 + 1"} displayMode/></p>
<p><Katex math={"= 1"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Example</h3>
<p>Find the area between the curve <Katex math={"y = 2\\sqrt{x} + 1"}/>, the y-axis and the lines y = 3 and y = 5.</p>
<img src="/Attachements/Pastedimage20230815173346.png" alt="diagram">
<p>Option 1:</p>
<p>Make y the subject of the equation.</p>
<p></p>
<p><Katex math={" (\\frac{y-1}2)^2 = x"} displayMode/></p>
<p><Katex math={"\\int_{3}^{5} (\\frac{y-1}2)^2\\ dy = \\frac{(\\frac{y-1}2)^3}3 * \\frac1{\\frac12} + c"} displayMode/></p>
<p><Katex math={"\\frac{2(\\frac{y-1}2)^3}3 + c"} displayMode/></p>
<p><Katex math={"(\\frac{2(\\frac{5-1}2)^3}3) - (\\frac{2(\\frac{3-1}2)^3}3)"} displayMode/></p>
<p><Katex math={" = \\frac{14}3"} displayMode/></p>
<p></p>
<p>Option 2:</p>
<img src="/Attachements/Pastedimage20230815173831.png" alt="diagram">
<p>Calculate the total area, then remove the area under the curve between (1,0) and (4,0) and then the small black rectangle in the corner.</p>
<p></p>
</div>