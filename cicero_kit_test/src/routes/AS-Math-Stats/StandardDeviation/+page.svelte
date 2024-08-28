<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>StandardDeviation</title></svelte:head><div class="note">
   <h1 class="title">Standard Deviation</h1>
<img src="/Attachements/Pastedimage20230804114524.png" alt="diagram">
<p></p>
<h1 class="heading"> <Katex math={"Symbol = \\sigma"} displayMode/></h1>
<p><b>Within 2 standard deviations there are 95% of the population.</b></p>
<p></p>
<h2 class="heading"> <Katex math={" \\sqrt{Varience} = Standard deviation"} displayMode/></h2>
<h2 class="heading"> <Katex math={" \\sqrt{\\sigma^2} = \\sigma"} displayMode/></h2>
<p>Measures of spread or variation.</p>
<p>Other measures of spread include: Range and IQR.</p>
<p><b>Standard deviation is the best measure of spread because all points are used.</b></p>
<p></p>
<p>Standard deviation compares all of the other values in a set to the mean.</p>
<p></p>
<h1 class="heading"> <Katex math={" Formulae"} displayMode/></h1>
<h2 class="heading"> <Katex math={"\\sigma = \\sqrt{\\frac{\\sum{x^2}}{n}-(\\bar{x})^2}"} displayMode/></h2>
<h2 class="heading"> <Katex math={" \\sigma = \\sqrt{\\frac{\\sum{fx^2}}{\\sum{f}} - (\\bar{x})^2}"} displayMode/></h2>
<h2 class="heading"> <Katex math={" \\sigma = \\sqrt{ \\frac{\\sum (x - \\bar{x})^2}{n} }"} displayMode/></h2>
<h2 class="heading"> <Katex math={" \\sigma = \\sqrt{ \\frac {\\sum (x-\\bar{x})^2f}{\\sum f} }"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
</div>