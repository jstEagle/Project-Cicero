<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>NormalDistribution</title></svelte:head><div class="note">
   <h1 class="title">Normal Distribution</h1>
<h2 class="heading"> <Katex math={" X \\sim N(\\mu, \\sigma^2)"} displayMode/></h2>
<p><Katex math={"\\mu = population\\ mean"} displayMode/></p>
<p><Katex math={" \\sigma^2 = population\\ variance"} displayMode/></p>
<p></p>
<div class="link-container"><a href="//">Z-Value Table</a></div>
<p></p>
<p>- Symmetrical</p>
<p>- Continuous data</p>
<p>- Infinite</p>
<p></p>
<img src="/Attachements/Pastedimage20230819100836.png" alt="diagram">
<p></p>
<h2 class="heading"> <Katex math={"\\mu = mean"} displayMode/></h2>
<p></p>
<img src="/Attachements/Pastedimage20230819101147.png" alt="diagram">
<p></p>
<p><Katex math={"p(X > a) = \\phi (-a)"}/></p>
<p></p>
<p><Katex math={"p(X < a) = \\phi (a)"}/> </p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Calculating Z-value</h2>
<p></p>
<h3 class="heading"> <Katex math={" z = \\frac{x - \\mu}{\\sigma}"} displayMode/></h3>
<p>Z - How many standard deviation the desired value is away from the mean.</p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p></p>
<p>In 2014, Americans spent on average 40 minutes per day on social media. If the distribution of these times is normally distributed and the standard deviation is 9.7 minutes:</p>
<p></p>
<p>1) Calculate the probability that an American spends less than 15 minutes a day on social media.</p>
<p></p>
<p><Katex math={"p(X < 15) = ?"} displayMode/></p>
<p><Katex math={"z = \\frac{15 - 40}{9.7} = -2.577"} displayMode/></p>
<p><Katex math={" p = 0.005"} displayMode/></p>
<p></p>
<p>2) Calculate the probability that an American spends between 30 minutes and 40 minutes a day on social media.</p>
<p></p>
<p><Katex math={" 0.5 - p(X < 30) = p(30<X <40)"} displayMode/></p>
<p><Katex math={"z = \\frac{30 - 40}{9.7} = -1.031\\ (3sf)"} displayMode/></p>
<p><Katex math={" 1 - (0.5 + \\phi(z)) = 0.3487"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Actual equation for Normal Distribution</h2>
<p></p>
<h2 class="heading"> <Katex math={"f(x | \\mu, \\sigma^2) = \\frac{1}{\\sqrt{2\\pi \\sigma^2}}e^{-\\frac{(x-\\mu)^2}{2\\sigma^2}}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>