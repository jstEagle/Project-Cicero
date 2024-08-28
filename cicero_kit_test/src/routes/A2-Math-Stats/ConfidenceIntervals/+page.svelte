<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ConfidenceIntervals</title></svelte:head><div class="note">
   <h1 class="title">Confidence Intervals</h1>
<p><b>The confidence interval for the mean can be defined as the range of values in which we would expect to find the population mean with a specified degree of certainty.</b></p>
<p></p>
<p><b>A 95% confidence interval means that if we know the population standard deviation <Katex math={"\\sigma"}/>, we could take a random sample of size n, find its mean <Katex math={"\\bar{x}"}/> and know that 95% of the times we did this, the interval <Katex math={"\\bar{x} \\pm 1.96\\frac{\\sigma}{\\sqrt{n}}"}/> would contain the population mean <Katex math={"\\mu"}/>.</b></p>
<p></p>
<p></p>
<h2 class="heading"> <Katex math={"\\bar{x} - z\\frac{\\sigma}{\\sqrt{n}} < \\mu < \\bar{x} + z\\frac{\\sigma}{\\sqrt{n}}"} displayMode/></h2>
<p>where the z value gives the degree of confidence.</p>
<p><b>Standard error:</b></p>
<h2 class="heading"> <Katex math={"SE = \\frac{\\sigma}{\\sqrt{n}}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Degree of confidence</h2>
<div class="link-container"><a href="//">The degree of confidence is given as a percentage probability changed into a z-score, using the standard List MF-19|normal distribution tables.</a></div>
<div class="link-container"><a href="//">The value of z will depend on the degree of confidence required. If the population standard deviation (<Katex math={"\\sigma"}/>) is not known the sample standard deviation (Biased and Unbiased estimates of population parameters|S) can be used as an estimate.</a></div>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>A dairy factory produces blocks of cheese for export whose weights are known to be normally distributed with a standard deviation of 1.4kg. A random sample of 25 blocks of cheese has a mean weight of 22.3kg. Find 99% confidence intervals for the population.</p>
<p><Katex math={"\\bar{x} = 22.3"} displayMode/></p>
<p><Katex math={"\\sigma = 1.4"} displayMode/><Katex math={"n = 25 "} displayMode/><Katex math={"SE = \\frac{\\sigma}{\\sqrt{n}} = \\frac{1.4}{\\sqrt{25}} = \\frac{1.4}{5}"} displayMode/></p>
<p><Katex math={"z = \\Phi(2.574) \\rightarrow 0.995"} displayMode/></p>
<p><Katex math={"\\therefore z = 2.574 "} displayMode/></p>
<p><Katex math={"22.3-(2.574)(\\frac{1.4}{5}) < \\mu < 22.3+(2.574)(\\frac{1.4}{5})"} displayMode/></p>
<p><Katex math={"21.6 < \\mu < 23.0"} displayMode/></p>
<p>If we took 100 samples, the true population mean would occur in 99% of estimates.</p>
</div>