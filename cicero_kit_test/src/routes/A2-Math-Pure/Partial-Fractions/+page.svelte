<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Partial-Fractions</title></svelte:head><div class="note">
   <h1 class="title">Partial Fractions</h1>
<h2 class="heading"> <Katex math={"\\frac{px + q}{(ax + b)(cx + d)(ex + f)} \\equiv \\frac{A}{(ax + b)} + \\frac{B}{(cx + d)} + \\frac{C}{(ex + f)}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\frac{px^2 + qx + r}{(ax + b)(cx^2 + d)} \\equiv \\frac{A}{(ax + b)} + \\frac{Bx + C}{(cx^2 + d)}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\frac{px^2 + qx + r}{(ax + b)(cx + d)^2} \\equiv \\frac{A}{(ax + b)} + \\frac{B}{(cx + d)} + \\frac{C}{(cx + d)^2}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\frac{px^2 + qx + r}{(ax-b)(cx - d)} \\equiv A + \\frac{B}{(ax+b)} + \\frac{C}{cx + d} "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Express <Katex math={"\\frac{4 + x}{(1 + x)(2 - x)}"}/> as a sum of partial fractions.</p>
<p><Katex math={"\\frac{4 +x}{(1 + x)(2 -x)} = \\frac{A}{(1 + x)} + \\frac{B}{(2-x)}"} displayMode/></p>
<p>Multiply both sides by <Katex math={"(1 + x)(2-x)"}/>.</p>
<p><Katex math={"4 + x = A(2-x) + B(1 + x)"} displayMode/></p>
<p>Substitute in the only value of x that will make one of the brackets = 0.</p>
<p><Katex math={"x = -1"} displayMode/></p>
<p><Katex math={"4 + x = A(2-x)"} displayMode/></p>
<p><Katex math={"4 + (-1) = A(2 -(-1))"} displayMode/></p>
<p><Katex math={"3 = 3A"} displayMode/></p>
<p><Katex math={"A = 1"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"x = 2"} displayMode/></p>
<p><Katex math={"4 + (2) = B(1 + (2))"} displayMode/></p>
<p><Katex math={"6 = 3B"} displayMode/></p>
<p><Katex math={"B = 2"} displayMode/></p>
<p><Katex math={"\\therefore\\  = \\frac{1}{1 + x} + \\frac{2}{2-x}"} displayMode/></p>
<p></p>
<p>Or do simultaneous equations if you cannot make the brackets cancel.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>Express <Katex math={"\\frac{4x^3 + 10x + 4}{x(2x + 1)}"}/> in partial fractions.</p>
<p></p>
<p><Katex math={"2x^2 + x \\ \\ \\overline{)4x^3 + 10x + 4}"} displayMode/></p>
<p><Katex math={"= 2x - 1"} displayMode/></p>
<p><Katex math={"r = 11x + 4"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"2x -1 + \\frac{11x + 4}{2x^2 + x}"} displayMode/></p>
<p></p>
<p><Katex math={"\\frac{11x + 4}{x(2x + 1)} = \\frac{A}{x} + \\frac{B}{(2x + 1)}"} displayMode/></p>
<p><Katex math={"11x + 4 = A(2x +1) + B(x)"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"x = 0 "} displayMode/></p>
<p><Katex math={"A = 4"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"x = -\\frac12"} displayMode/></p>
<p><Katex math={"B = 3"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"= 2x -1 + \\frac4x + \\frac{3}{2x + 1}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>Express <Katex math={"\\frac4{(1-3x)(1-x)^2}"}/> as a sum of partial fractions.</p>
<p><Katex math={"= \\frac{A}{(1-3x)} + \\frac{B}{(1-x)} + \\frac{C}{(1-x)^2}"} displayMode/></p>
<p><Katex math={"4 = A(1-x)^2 + B(1-3x)(1-x)^2 + C(1-3x)"} displayMode/></p>
<p><Katex math={"when\\ x=1\\ \\rightarrow C = -2"} displayMode/></p>
<p><Katex math={"when\\ x=\\frac13 \\rightarrow A = 9"} displayMode/></p>
<p><Katex math={"Equate\\ the\\ coefficients\\ of\\ x^0"} displayMode/></p>
<p><Katex math={"4 = A + B + C"} displayMode/></p>
<p><Katex math={"B =  -3"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"= \\frac{9}{1-3x} - \\frac{3}{1-x} - \\frac{2}{(1-x)^2}"} displayMode/></p>
</div>