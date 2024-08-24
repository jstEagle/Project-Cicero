<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>R---Method</title></svelte:head><div class="note">
   <h1 class="title">R---Method</h1>
<h2 class="heading"> <Katex math={"4\\sin \\theta + 3\\cos \\theta"} displayMode/></h2>
<h2 class="heading"> <Katex math={" r \\sin(\\theta + \\alpha)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"r(\\sin\\theta\\cos\\alpha + \\cos\\theta\\sin\\alpha)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\downarrow"} displayMode/></h2>
<h2 class="heading"> <Katex math={" 4 = r\\cos\\alpha\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ 3 = r\\sin\\alpha"} displayMode/></h2>
<h2 class="heading"> <Katex math={"Find\\ r"} displayMode/></h2>
<h2 class="heading"> <Katex math={"r = \\sqrt{3^2 + 4^2} = 5"} displayMode/></h2>
<h2 class="heading"> <Katex math={"or\\ \\tan\\alpha = \\frac{B}A = \\frac34"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos\\alpha = \\frac45"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\sin\\alpha = \\frac35"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\therefore \\alpha = 36.9^o"} displayMode/></h2>
<h2 class="heading"> <Katex math={"4\\sin\\theta + 3\\cos\\theta = 5\\sin(\\theta + 36.9^o)"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<h2 class="heading"> <Katex math={"\\cos\\theta + \\sin\\theta"} displayMode/></h2>
<p><Katex math={"1\\cos\\theta + 1\\sin\\theta"} displayMode/></p>
<p><Katex math={"r\\cos\\alpha\\cos\\theta + r\\sin\\alpha\\sin\\theta"} displayMode/></p>
<p><Katex math={"r\\cos\\alpha = 1"} displayMode/></p>
<p><Katex math={"r \\sin\\alpha = 1"} displayMode/></p>
<p><Katex math={"r = \\sqrt{2}"} displayMode/></p>
<p><Katex math={"= \\sqrt{2}\\cos(\\theta - 45^o)"} displayMode/></p>
<p></p>
<h2 class="heading"> Notes</h2>
<div class="link-container"><a href="//">It uses Compound Angles formula! Remember to put it in the right format.</a></div>
</div>