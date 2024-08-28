<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Quadratics</title></svelte:head><div class="note">
   <h1 class="title">Quadratics</h1>
<div class="link-container"><a href="//">- Parabola</a></div>
<h1 class="heading"> Quadratic Inequalities</h1>
<p></p>
<p><Katex math={"x^2 + 5x -6 \\le 0"} displayMode/></p>
<p><Katex math={"(x+6)(x-1)\\le 0"} displayMode/></p>
<p><Katex math={"sketch\\ graph"} displayMode/></p>
<p><Katex math={"-6 \\le x \\le 1"} displayMode/></p>
<p>y is negative or zero</p>
<p></p>
<p>Test with zero</p>
<p><Katex math={"(x+6)(x-1)"} displayMode/></p>
<p><Katex math={"(0+6)(0-1)"} displayMode/></p>
<p><Katex math={"(6)(-1)"} displayMode/></p>
<p><Katex math={"= -6"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> The form <Katex math={"a-b(x-c)^2"}/> or <Katex math={"a(x-p)^2+q"}/>  (Completing the square)</h2>
<p></p>
<p><Katex math={" f(x) = 7 + 8x -2x^2  "} displayMode/></p>
<p><Katex math={"= -2x^2 + 8x + 7"} displayMode/></p>
<p><Katex math={" = -2(x^2-4x+(-2)^2-(-2)^2) + 7"} displayMode/></p>
<p><Katex math={" = -2[(x-2)^2 - 4] + 7"} displayMode/></p>
<p><Katex math={" = -2(x-2)^2 + 15"} displayMode/></p>
<p><Katex math={"-2 - Reflection\\ in\\ x\\ and\\ vertical\\ stretch\\ SF\\ *2"} displayMode/></p>
<p><Katex math={"Translation - Right\\ 2,\\ Up\\ 15"} displayMode/></p>
<p></p>
<h3 class="heading"> Finding the turning point from form <Katex math={"ax^2 + bx +c"}/> </h3>
<p></p>
<p>1) <Katex math={"\\frac{-b}{2a}"}/></p>
<h3 class="heading"> <Katex math={"p = \\frac{-b}{2a} = \\frac{-8}{2(-2)} = 2"} displayMode/></h3>
<p><Katex math={" Sub\\ into\\ f(x)\\ to\\ get\\ q"} displayMode/></p>
<p></p>
<p>2) Finding the first derivative - <Katex math={"f'(x)"}/></p>
<p></p>
<h3 class="heading"> <Katex math={" f'(x) = -4x + 8"} displayMode/></h3>
<p><Katex math={" 0  = -4x + 8"} displayMode/></p>
<p><Katex math={"-8 = -4x"} displayMode/></p>
<p><Katex math={"x = 2"} displayMode/></p>
</div>