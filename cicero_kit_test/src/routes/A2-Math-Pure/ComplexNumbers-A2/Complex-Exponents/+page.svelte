<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Complex-Exponents</title></svelte:head><div class="note">
   <h1 class="title">Complex-Exponents</h1>
<h2 class="heading"> <Katex math={"e^{i\\theta} = \\cos\\theta + i\\sin\\theta "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<p>Let <Katex math={"\\cos\\theta + i\\sin\\theta = z"}/></p>
<p><Katex math={"\\frac{dz}{d\\theta} = -\\sin\\theta + i\\cos\\theta"} displayMode/></p>
<p><Katex math={"i^2\\sin\\theta + i\\cos\\theta\\quad i^2=-1"} displayMode/></p>
<p><Katex math={"=i(i\\sin\\theta + \\cos\\theta)"} displayMode/></p>
<p><Katex math={"=iz"} displayMode/></p>
<p>If <Katex math={"z = e^{i\\theta + c}"}/> </p>
<p><Katex math={"\\frac{dz}{d\\theta} =ie^{i\\theta + c}"} displayMode/></p>
<p><Katex math={"=iz"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>