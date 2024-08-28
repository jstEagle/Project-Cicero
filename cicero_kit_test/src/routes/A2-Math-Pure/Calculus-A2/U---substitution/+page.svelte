<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>U---substitution</title></svelte:head><div class="note">
   <h1 class="title">U substitution</h1>
<p><Katex math={"\\int 2x(x^2 + 1)^3*dx"} displayMode/></p>
<p><Katex math={"\\int 2x*u^3*dx"} displayMode/></p>
<p><Katex math={"x^2 + 1 = u"} displayMode/></p>
<p><Katex math={"\\frac{du}{dx} = 2x"} displayMode/></p>
<p><Katex math={"du = 2x * dx"} displayMode/></p>
<p><Katex math={"\\therefore \\int u^3 * du"} displayMode/></p>
<p>or </p>
<p><Katex math={"\\frac{du}{dx} = 2x"} displayMode/></p>
<p><Katex math={"dx = \\frac{du}{2x}"} displayMode/></p>
<p><Katex math={"\\therefore \\int \\cancel{2x} * u^3 * \\frac{du}{\\cancel{2x}}"} displayMode/></p>
<p><Katex math={" = \\int u^3*du"} displayMode/></p>
<p><Katex math={" = \\frac{u^4}4 + c"} displayMode/></p>
<p><Katex math={"= \\frac{(x^2 + 1)^4}4 + c"} displayMode/></p>
</div>