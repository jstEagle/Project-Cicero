<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Reciprocal-Trigonometry-Functions</title></svelte:head><div class="note">
   <h1 class="title">Reciprocal Trigonometry Functions</h1>
<h2 class="heading"> Cosecant</h2>
<img src="/graphs/ReciprocalTrigonometryFunctions0.png" alt="graph">
<p>On the graph above, the reciprocal of <Katex math={"\\sin \\theta = y"}/> is drawn (in blue) as <Katex math={"\\csc \\theta = \\frac{1}{\\sin \\theta} = \\frac{H}O = \\frac{r}{y}"}/></p>
<p>_This is not the inverse <Katex math={"\\sin^{-1}(x)"}/>_</p>
<p></p>
<p>Period: 2<Katex math={"\\pi"}/></p>
<p>Range: <Katex math={"y \\ge 1 \\cap y \\le -1"}/></p>
<p>Domain: <Katex math={"x \\in \\mathbb{R}"}/></p>
<p><Katex math={"x \\ne k\\pi\\ \\ k \\in \\mathbb{Z}"}/></p>
<p></p>
<p>| <Katex math={"\\theta"}/>                  | -2<Katex math={"\\pi"}/> | <Katex math={"-\\frac{3\\pi}2"}/> | <Katex math={"-\\pi"}/> | <Katex math={"-\\frac{\\pi}2"}/> | 0   | <Katex math={"\\frac{\\pi}2"}/> | <Katex math={"\\pi"}/> | <Katex math={"\\frac{3\\pi}2"}/> | <Katex math={"2\\pi"}/> |</p>
<p>| ------------------------- | ------- | --------------- | ------ | -------------- | --- | ------------- | ----- | -------------- | ------ |</p>
<p>| <Katex math={"y = \\sin \\theta"}/>         | 0       | 1                | 0       | -1               | 0    | 1              | 0      | -1               | 0       |</p>
<p>| <Katex math={"y=\\frac{1}{\\sin \\theta}"}/> | <i></i>        | 1                | <i></i>       | -1               | <i></i>    | 1              | <i></i>      | -1               | <i></i>       |</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Secant</h2>
<p><Katex math={"\\sec \\theta = \\frac{1}{\\cos \\theta}"}/> and <Katex math={"\\cos \\theta"}/>             <Katex math={"\\sec \\theta = \\frac{H}{A} = \\frac{r}{x}"}/></p>
<p></p>
<img src="/graphs/ReciprocalTrigonometryFunctions1.png" alt="graph">
<p></p>
<p>| <Katex math={"\\theta"}/> | -2<Katex math={"\\pi"}/> | <Katex math={"-\\frac{3\\pi}2"}/> | <Katex math={"-\\pi"}/> | <Katex math={"-\\frac{\\pi}2"}/> | 0 | <Katex math={"\\frac{\\pi}2"}/> | <Katex math={"\\pi"}/> | <Katex math={"\\frac{3\\pi}2"}/> | <Katex math={"2\\pi"}/> |</p>
<p>| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |</p>
<p>| <Katex math={"y = \\cos \\theta"}/> | 1 | 0 | -1 | 0 | 1 | 0 | -1 | 0 | 1 |</p>
<p>| <Katex math={"y=\\frac{1}{\\cos \\theta}"}/> | 1 | <i></i> | -1 | <i></i> | 1 | <i></i> | -1 | <i></i> | 1 |</p>
<p>Period: 2<Katex math={"\\pi"}/></p>
<p>Range: <Katex math={"y \\ge 1 \\cap y \\le -1"}/></p>
<p>Domain: <Katex math={"x = \\frac{\\pi}2 + k\\pi\\ \\ \\ k \\in \\mathbb{Z}"}/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Cotangent</h2>
<p><Katex math={"y = \\cot \\theta = \\frac{1}{\\tan \\theta}"}/></p>
<img src="/graphs/ReciprocalTrigonometryFunctions2.png" alt="graph">
<p><Katex math={"y = \\tan(x)"}/> in green</p>
<p><Katex math={"y = \\cot(x)"}/> in blue</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Theory</h2>
<h2 class="heading"> <Katex math={"\\cot \\theta = \\frac{1}{\\tan \\theta} = \\frac{A}{O} = \\frac{x}{y}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\sec \\theta = \\frac{1}{\\cos \\theta} = \\frac{H}A = \\frac{r}{x}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\csc \\theta = \\frac{1}{\\sin\\theta} = \\frac{H}{O} = \\frac{r}y"} displayMode/></h2>
<p></p>
<h2 class="heading"> Identities</h2>
<p></p>
<h2 class="heading"> <Katex math={"\\sin^2\\theta + \\cos^2\\theta \\equiv 1"} displayMode/></h2>
<p><Katex math={"Dividing\\ both\\ sides\\ by\\ \\cos^2\\theta"} displayMode/></p>
<p><Katex math={"\\frac{\\sin^2\\theta + \\cos^2\\theta}{\\cos^2\\theta} = \\frac{1}{\\cos^2\\theta}"} displayMode/></p>
<p><Katex math={"\\frac{\\sin^2\\theta}{cos^2\\theta} + \\frac{\\cos^2\\theta}{\\cos^2\\theta} = \\frac{1}{\\cos^2\\theta}"} displayMode/></p>
<p></p>
<p><Katex math={"\\tan^2\\theta + 1 = \\frac{1}{\\cos^2\\theta}"} displayMode/></p>
<p><Katex math={"\\therefore \\tan^2\\theta + 1 = \\sec^2\\theta"} displayMode/></p>
<p></p>
<h2 class="heading"> <Katex math={"\\sin^2\\theta + \\cos^2\\theta \\equiv 1"} displayMode/></h2>
<p><Katex math={"Dividing\\ both\\ sides\\ by\\ \\sin^2\\theta"} displayMode/></p>
<p><Katex math={"\\frac{\\sin^2\\theta + \\cos^2\\theta}{\\sin^2\\theta} = \\frac{1}{\\sin^2\\theta}"} displayMode/></p>
<p><Katex math={"\\frac{1}{\\tan^2\\theta} + 1 = \\csc^2\\theta"} displayMode/></p>
<p><Katex math={"\\cot^2\\theta + 1 = \\csc^2\\theta"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Examples</h2>
<p>Find <Katex math={"\\csc 120^o"}/> leaving your answer in surd form.</p>
<p><Katex math={"\\sin120^o = \\sin(180^o - 60^o)"} displayMode/></p>
<p><Katex math={"\\sin60^o = \\frac{\\sqrt{3}}2"} displayMode/></p>
<p><Katex math={"\\therefore \\csc120^o = \\frac{2}{\\sqrt3}"} displayMode/></p>
<p></p>
<p></p>
<p></p>
<p>Find the values of <Katex math={"\\theta"}/> in the interval <Katex math={"0^o \\le \\theta \\le 360^o"}/> for which <Katex math={"\\sec^2\\theta = 4 + 2\\tan\\theta"}/></p>
<p><Katex math={"\\sec^2\\theta = 4 + 2\\tan\\theta"} displayMode/></p>
<p><Katex math={"1 + \\tan^2\\theta = 4 + \\tan\\theta"} displayMode/></p>
<p><Katex math={"\\tan^2\\theta - 2\\tan\\theta - 3 = 0"} displayMode/></p>
<p><Katex math={"(\\tan\\theta - 3)(\\tan\\theta + 1) = 0"} displayMode/></p>
<p><Katex math={"\\tan\\theta = 3"} displayMode/></p>
<p><Katex math={"\\tan\\theta = -1"} displayMode/></p>
<p><Katex math={"\\theta \\in \\set{71^o...}"} displayMode/></p>
</div>