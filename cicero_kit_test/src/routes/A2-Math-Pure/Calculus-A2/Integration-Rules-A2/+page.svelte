<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Integration-Rules-A2</title></svelte:head><div class="note">
   <h1 class="title">Integration Rules A2</h1>
<h2 class="heading"> <Katex math={"\\int \\sin x \\rightarrow -\\cos x"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int \\cos x \\rightarrow \\sin x"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int \\sec^2x \\rightarrow \\tan x"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"\\int \\sin(ax+b)*dx = -\\frac1a\\cos(ax+b) + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int \\cos(ax+b)*dx = \\frac1a\\sin(ax+b)+c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int\\sec^2(ax+b)*dx = \\frac1a\\tan(ax+b)+c "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"\\int e^{ax + b} *dx= \\frac1ae^{ax+b} + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int e^{f(x)}*dx = \\frac{e^{f(x)}}{f'(x)} + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={" f(x)\\ has\\ to\\ be\\ linear!"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"\\int \\frac1x * dx = \\ln x + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int \\frac{a}{ax + b}*dx = \\ln|ax+b| + c "} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int \\frac{1}{ax+b}*dx = \\frac1a\\ln|ax+b| + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int\\frac{f'(x)}{f(x)}*dx = \\ln|f(x)| + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int \\frac{1}{2x+5}*dx = \\frac{\\ln(2x+5)}{2} + c"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"\\int \\ln x*dx = x\\ln x - x + c"} displayMode/></h2>
</div>