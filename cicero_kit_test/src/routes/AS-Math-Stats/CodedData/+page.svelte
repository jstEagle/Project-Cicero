<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>CodedData</title></svelte:head><div class="note">
   <h1 class="title">Coded Data</h1>
<p><Katex math={"\\sum(x - 340) = -200"} displayMode/></p>
<p><Katex math={"\\sum(x-340)^2 = 962"} displayMode/></p>
<p></p>
<p>| x               | x - 340              |</p>
<p>| --------------- | -------------------- |</p>
<p>| 344             | 4                    |</p>
<p>| 336             | -4                   |</p>
<p>| 328             | -12                  |</p>
<p>| <Katex math={"\\sum x = 1008"}/> | <Katex math={"\\sum (x-340) = -12"}/> |</p>
<p></p>
<p><Katex math={"x̄_{uncoded} - 340 = Mean\\ of\\ coded"}/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Tien measured the arm lengths, x cm, of 20 people in his class. He found that <Katex math={"\\sum x=1218"}/> and the standard deviation of x was 4.2. Calculate <Katex math={"\\sum (x-45)"}/> and <Katex math={"\\sum(x-45)^2"}/>.</p>
<p></p>
<p><Katex math={"\\bar{x} = 1218 \\div 20 = 60.9"} displayMode/></p>
<p><Katex math={"60.9 - 45 = 15.9 * 20 = 318 = \\sum (x-45)"} displayMode/></p>
<p></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"plug\\ into\\ std.\\ eq = \\frac{\\sum(x-45)^2}{20} - (\\frac{\\sum(x-45)}{20})^2 = 4.2^2"} displayMode/></p>
<p><Katex math={"\\sum (x-45)^2 = 5409"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>