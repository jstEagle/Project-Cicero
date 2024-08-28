<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ChainRule</title></svelte:head><div class="note">
   <h1 class="title">Chain Rule</h1>
<p><Katex math={" y = \\frac{2}{\\sqrt{3x+1}}"} displayMode/></p>
<p><Katex math={" y = 2(3x+1)^{-\\frac12}"} displayMode/></p>
<p><Katex math={" let = 3x+1 = u"} displayMode/></p>
<p><Katex math={"y = 2u^{-\\frac12}"} displayMode/></p>
<p></p>
<p><Katex math={"\\frac{dy}{du} = -1u^{-\\frac32}"} displayMode/></p>
<p><Katex math={"\\frac{du}{dx} = 3"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = \\frac{dy}{du} * \\frac{du}{dx}"} displayMode/></p>
<p><Katex math={" = -1u^{-\\frac32}(3) = -3u^{-\\frac32}"} displayMode/></p>
<p><Katex math={" = -3(3x+1)^{-\\frac32}"} displayMode/></p>
<p></p>
<p></p>
<p></p>
<p></p>
<p></p>
<p><Katex math={"f(x) = \\frac{3}{x^2+4x-2}"} displayMode/></p>
<p><Katex math={" = 3(x^2+4x-2)^{-1}"} displayMode/></p>
<p><Katex math={"x^2 + 4x - 2 = u"} displayMode/></p>
<p><Katex math={" y = 3u^{-2}"} displayMode/></p>
<p><Katex math={"\\frac{dy}{du} = -3u^{-2}"} displayMode/></p>
<p><Katex math={"\\frac{du}{dx} = 2x + 4"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = \\frac{dy}{du} * \\frac{du}{dx}"} displayMode/></p>
<p><Katex math={"= -3u^{-2} (2x+4)"} displayMode/></p>
<p><Katex math={"= \\frac{-3(2x+4)}{(x^2+4x-2)^2}"} displayMode/></p>
<p></p>
<h3 class="heading"> Simpler way:</h3>
<p></p>
<p>differentiate the outer function and then the inner function and then multiply them together.</p>
<p></p>
<p><Katex math={" f'(x) = -3(x^2+4x-2)^{-2}*(2x+4)"} displayMode/></p>
<p></p>
<h2 class="heading"> Important!</h2>
<div class="link-container"><a href="//">The number on the outside of the bracket is a constant. If it contains a variable then you must use Product Rule.</a></div>
</div>