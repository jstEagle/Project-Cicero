<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Double-Angles</title></svelte:head><div class="note">
   <h1 class="title">Double-Angles</h1>
<h2 class="heading"> <Katex math={" \\sin(2A) = 2\\sin(A)\\cos(A)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos(2A) = 1 - 2\\sin^2(A)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos(2A) = 2\\cos^2(A) - 1"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos(2A) = \\cos^2(A) - \\sin^2(A)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\tan(2A) = \\frac{2\\tan(A)}{1-\\tan^2(A)}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Proofs</h2>
<p>1) <Katex math={"\\sin2A = \\sin(A + A)"} displayMode/></p>
<p><Katex math={"= \\sin A\\cos A + \\sin A \\cos A"} displayMode/></p>
<p><Katex math={"= 2\\sin A \\cos A"} displayMode/></p>
<p></p>
<p>2) <Katex math={" \\cos 2A = \\cos(A + A)"} displayMode/></p>
<p><Katex math={"\\cos A \\cos A + \\sin A \\sin A"} displayMode/></p>
<p><Katex math={"\\cos^2A - \\sin^2A"} displayMode/></p>
<p></p>
<p>3) <Katex math={"(1-\\sin^2A) - \\sin^2 A"} displayMode/></p>
<p><Katex math={"1 - 2\\sin^2A"} displayMode/></p>
<p>4) <Katex math={"\\cos 2A = \\cos^2 A - (1 - \\cos^2 A)"} displayMode/></p>
<p><Katex math={" = 2\\cos^2A - 1"} displayMode/></p>
<p></p>
<p>5) <Katex math={"\\tan 2A = \\tan(A + A)"} displayMode/></p>
<p><Katex math={" = \\frac{\\tan A + \\tan A}{1 - \\tan A \\tan A}"} displayMode/></p>
<p><Katex math={" = \\frac{2\\tan A}{1 - \\tan^2 A}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<h1 class="heading">WS 2, Q7</h1>
<p></p>
<p><Katex math={"\\frac{1 - \\sin2x}{\\sin x - \\cos x}"} displayMode/></p>
<p><Katex math={"=\\frac{1 - 2\\sin x \\cos x}{\\sin x - \\cos x}"} displayMode/></p>
<p><Katex math={" = \\frac{\\cos^2x + \\sin^2x - 2\\sin x \\cos x}{\\sin x - \\cos x}"} displayMode/></p>
<p><Katex math={" = \\frac{(\\cos x - \\sin x)(\\cos x - \\sin x)}{\\sin x - \\cos x}"} displayMode/></p>
<p><Katex math={" = \\frac{-(\\sin x - \\cos x) (\\cos x - \\sin x)}{(\\sin x - \\cos x)}"} displayMode/></p>
<p><Katex math={" = -\\cos x + \\sin x \\rightarrow \\sin x - \\cos x"} displayMode/></p>
<p><Katex math={"\\therefore LHS\\ =\\ RHS"} displayMode/></p>
</div>