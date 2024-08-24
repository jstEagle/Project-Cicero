<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Differentiating-inverse-tangent</title></svelte:head><div class="note">
   <h1 class="title">Differentiating-inverse-tangent</h1>
<h2 class="heading"> <Katex math={"y = \\tan^{-1}(kx) \\rightarrow \\frac{dy}{dx} = \\frac{k}{k^2x^2 + 1}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\sin^{-1}(kx) \\rightarrow \\frac{dy}{dx} = \\frac{k}{\\sqrt{1 - k^2x^2}}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\cos^{-1}(kx) \\rightarrow \\frac{dy}{dx} = \\frac{-k}{\\sqrt{1 - k^2x^2}}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\frac1k\\tan^{-1}(\\frac{x}k) \\rightarrow \\frac{dy}{dx} = \\frac{1}{x^2 + k^2}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p><Katex math={"\\int \\frac{6}{16x^2 + 1} * dx"} displayMode/> <Katex math={"\\int\\frac64*\\frac{4}{16x^2+1}*dx"} displayMode/></p>
<p> <Katex math={"\\frac64 \\int\\frac{4}{16x^2 + 1}*dx"} displayMode/> <Katex math={"\\frac32 \\tan^{-1}(4x) + c"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>