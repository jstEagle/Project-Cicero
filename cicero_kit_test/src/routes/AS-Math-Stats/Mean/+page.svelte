<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Mean</title></svelte:head><div class="note">
   <h1 class="title">Mean</h1>
<h1 class="heading"> <Katex math={"E(x)"} displayMode/></h1>
<h1 class="heading"> <Katex math={" x̄ "} displayMode/></h1>
<h1 class="heading"> <Katex math={" \\mu"} displayMode/></h1>
<h2 class="heading"> <Katex math={"Average = \\frac{\\sum{x}}{n}"} displayMode/></h2>
<p><Katex math={"n - Number\\ of\\ values"} displayMode/></p>
<p></p>
<p></p>
<p></p>
<p>| Marks /50        | n of Students | mid pt. x | fx  |</p>
<p>| ---------------- | ------------- | --------- | --- |</p>
<p>| 10 <Katex math={"\\le"}/> x <Katex math={"<"}/> 20     | 2             | 15        | 30  |</p>
<p>| 20 <Katex math={"\\le"}/> x <Katex math={"<"}/> 30     | 3             | 25        | 75  |</p>
<p>| 30 <Katex math={"\\le"}/> x <Katex math={"<"}/> 40     | 13            | 35        | 455 |</p>
<p>| 40 <Katex math={"\\le"}/> x <Katex math={"<"}/> 50     | 2             | 45        | 90  |</p>
<p>| Class Boundaries | <Katex math={"\\sum"}/>f = 20       |           | <Katex math={"\\sum"}/> fx = 650    |</p>
<p></p>
<p>Mean = <Katex math={"\\frac{650}{20}"}/> = 32.5</p>
<p></p>
<p>Mean is abstract by nature and will rarely be a whole number.</p>
<p></p>
<p></p>
<h2 class="heading"> Example</h2>
<p>The heights x cm, of a group of 28 people is measured. The mean height is found to be 172.6cm</p>
<p>and the standard deviation is found to be <Katex math={"\\sigma"}/> = 4.58cm. A person of height 161.8cm is removed from the group.</p>
<p></p>
<p>Find the mean height of the remaining 27 people:</p>
<p></p>
<p><Katex math={"\\frac{172.6 * 28 - 161.8}{27} = 173cm"} displayMode/></p>
<p></p>
<p>**The average of a set multiplied by n is the <Katex math={"\\sum x"}/></p>
</div>