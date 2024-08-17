<script>
    import Katex from './Katex.svelte';
</script>

<h3> Example</h3>
<p>Convert the following to polar form</p>
<p>1. <Katex math={"z = -2(\\cos\\alpha+i\\sin\\alpha)"}/></p>
<p>2. <Katex math={"z = -2(\\cos\\alpha - i\\sin\\alpha)"}/></p>
<p>3. <Katex math={"z = 2(\\cos\\alpha-i\\sin\\alpha)"}/></p>
<p></p>
<p></p>
<p>1.  </p>
<p>   <Katex math={"z = 2(-\\cos\\alpha - i \\sin\\alpha)"} displayMode/></p>
<p>   <Katex math={"third\\ quadrant"} displayMode/></p>
<p>   <Katex math={"\\downarrow"} displayMode/></p>
<p>   <Katex math={"= 2(\\cos(\\alpha-\\pi) + \\sin(\\alpha-\\pi))"} displayMode/></p>
<p></p>
<p>2. </p>
<p><Katex math={"z = 2(-\\cos\\alpha + i\\sin\\alpha) "} displayMode/></p>
<p><Katex math={"=2(\\cos(\\pi-\\alpha) + i\\sin(\\pi-\\alpha))"} displayMode/></p>
<p></p>
<p>3. </p>
<p>   <Katex math={"z=2(\\cos(-\\alpha) + i\\sin(-\\alpha))"} displayMode/></p>
<p></p>
<h5> Always:</h5>
<p>- Use algebra if possible</p>
<p>- Sketch graph to see roots easier</p>
<p>- Always state the degree of accuracy</p>
