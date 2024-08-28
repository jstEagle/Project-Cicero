<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Length,Gradient,Midpoint</title></svelte:head><div class="note">
   <h1 class="title">Length, Gradient, Midpoint</h1>
<div class="link-container"><a href="//">Straight line</a></div>
<h2 class="heading"> Midpoint of a straight line</h2>
<h3 class="heading"> <Katex math={" (\\frac{x<i>1 + x</i>2}2, \\frac{y<i>1 + y</i>2}2)"} displayMode/></h3>
<p></p>
<h2 class="heading"> Length of a straight line joining 2 points</h2>
<h3 class="heading"> <Katex math={" \\sqrt{(x<i>2-x</i>1)^2 + (y<i>2 - y</i>1)^2}"} displayMode/></h3>
<p>(Pythagorean theorem)</p>
<p></p>
<h2 class="heading"> Gradient of a straight line</h2>
<h3 class="heading"> <Katex math={"m = \\frac{y<i>2 - y</i>1}{x<i>2 - x</i>1}"} displayMode/></h3>
<h2 class="heading"> Gradient of perpendicular line</h2>
<h3 class="heading"> <Katex math={"m = -\\frac1m"} displayMode/></h3>
<h2 class="heading"> Point-gradient form of equation of a line</h2>
<h3 class="heading"> <Katex math={"y - b = m(x+a)"} displayMode/></h3>
<p><i>(a,b) is a point the line passes through</i></p>
<p></p>
</div>