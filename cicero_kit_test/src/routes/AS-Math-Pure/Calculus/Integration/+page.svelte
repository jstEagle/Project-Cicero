<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Integration</title></svelte:head><div class="note">
   <h1 class="title">Integration</h1>
<h2 class="heading"> <Katex math={"\\int x^n\\ dx = \\frac{x^{n+1}}{n+1} + c"} displayMode/></h2>
<h3 class="heading"> General Rule</h3>
<p>Add one to the power then divide by the new power.</p>
<p>The c stands for the value that was lost when differentiating.</p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Find <Katex math={"f(x)"}/> if <Katex math={"f'(x)"}/> = <Katex math={"3\\sqrt{x}  -2x"}/>  and <Katex math={"f(40) = 30"}/></p>
<p></p>
<p><Katex math={"\\int (3\\sqrt{x} - 2x)\\ dx = 3x^{\\frac12} - 2x"} displayMode/></p>
<p><Katex math={" = \\frac{3x^{\\frac32}}{\\frac32} - \\frac{2x^2}2 + c"} displayMode/></p>
<p><Katex math={"= \\frac{6\\sqrt{x^3}}3 - x^2 + c"} displayMode/></p>
<p><Katex math={"=2\\sqrt{x^3} - x^2 + c"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"30 = 2\\sqrt{(4)^3} - (4)^2 + c"} displayMode/></p>
<p><Katex math={"c = 30"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"f(x) = 2\\sqrt{x^3} - x^2 + 30"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>