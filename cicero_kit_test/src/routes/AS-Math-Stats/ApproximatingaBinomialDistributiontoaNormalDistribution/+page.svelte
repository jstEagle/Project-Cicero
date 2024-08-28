<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ApproximatingaBinomialDistributiontoaNormalDistribution</title></svelte:head><div class="note">
   <h1 class="title">Approximating a Binomial Distribution to a Normal Distribution</h1>
<p></p>
<p><Katex math={" X\\ \\tilde \\ \\  B(200, 0.3)"} displayMode/></p>
<p><Katex math={" p(x<150) = 0.7^{200} ..."} displayMode/></p>
<p><Katex math={" X\\ \\tilde \\ N(60, 42) "} displayMode/></p>
<p><Katex math={"np > 5"} displayMode/></p>
<p><Katex math={"nq > 5"} displayMode/></p>
<p></p>
<h1 class="heading"> Continuity Correction</h1>
<img src="/Attachements/Pastedimage20230804101800.png" alt="diagram">
<p></p>
<p>| value   | First number | Continuity Correction |</p>
<p>| ------- | ------------ | --------------------- |</p>
<p>| x <Katex math={">"}/>= 9  | 9            | 8.5 or 9.5            |</p>
<p>| x <Katex math={">"}/> 9   | 10           | 9.5 or 10.5           |</p>
<p>| x  <Katex math={"<"}/>= 9 | 9            | 8.5 or 9.5            |</p>
<p>| x <Katex math={"<"}/> 9   | 8            | 7.5 or 8.5            |</p>
</div>