<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>CentralLimittheorem</title></svelte:head><div class="note">
   <h1 class="title">Central Limit theorem</h1>
<img src="/Attachements/Pastedimage20240624114357.png" alt="diagram">
<p>The central limit theorem (CLT) states that as the sample size increases, the distribution of sample means approaches a normal distribution. Mathematically, for a sample mean <Katex math={"\\bar{X}"}/> of size <Katex math={"n"}/>, where <Katex math={"X"}/> is a random variable, it follows a normal distribution with a mean of <Katex math={"\\mu"}/> (population mean) and a variance of <Katex math={"\\frac{\\sigma^2}{n}"}/> (population variance divided by sample size). The CLT is illustrated by the example of rolling a fair six-sided die multiple times, where the distribution of sample means becomes more bell-shaped as the number of rolls increases.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> The theorem</h2>
<p>For any sequence of independent random variables <Katex math={"\\bar{x<i>1},\\bar{x</i>2},\\dots,\\bar{x<i>n}"}/> with finite mean <Katex math={"\\mu"}/> and non-zero variance <Katex math={"\\sigma^2"}/>, then provided <Katex math={"n"}/> is sufficiently large (<Katex math={"n > 50"}/>), <Katex math={"\\bar{x}"}/> has approximately a normal distribution with mean <Katex math={"\\mu"}/> and variance <Katex math={"\\frac{\\sigma^2}{n}"}/>, where <Katex math={"\\bar{x} = \\frac{\\bar{x</i>1},\\bar{x<i>2},\\dots,\\bar{x</i>n}}{n}"}/></p>
<p>or in symbols</p>
<p><Katex math={"\\bar{X} \\approx N(\\mu, \\frac{\\sigma^2}{n})"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>