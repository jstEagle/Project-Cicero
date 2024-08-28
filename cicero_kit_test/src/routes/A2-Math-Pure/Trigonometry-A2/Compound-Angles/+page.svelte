<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Compound-Angles</title></svelte:head><div class="note">
   <h1 class="title">Compound Angles</h1>
<h2 class="heading"> <Katex math={"\\sin(A+B) = \\sin A\\cos B + \\cos A\\sin B"} displayMode/></h2>
<h2 class="heading"> <Katex math={" \\sin(A-B) = \\sin A\\cos B - \\sin B \\cos A"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos(A + B) = \\cos A \\cos B - \\sin A \\sin B"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos(A - B) = \\cos A \\cos B + \\sin A \\sin B"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\tan(A+B) = \\frac{\\tan A + \\tan B}{1-\\tan A \\tan B}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\tan(A-B) = \\frac{\\tan A - \\tan B}{1 + \\tan A \\tan B}"} displayMode/></h2>
</div>