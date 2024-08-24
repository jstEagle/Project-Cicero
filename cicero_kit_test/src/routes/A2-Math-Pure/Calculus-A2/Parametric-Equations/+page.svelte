<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Parametric-Equations</title></svelte:head><div class="note">
   <h1 class="title">Parametric-Equations</h1>
<h2 class="heading"> <Katex math={"\\frac{dy}{dx} = \\frac{dy}{\\cancel{dt}} * \\frac{\\cancel{dt}}{dx}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"Since\\ \\frac{dt}{dx} = \\frac{1}{\\frac{dx}{dt}} \\rightarrow \\frac{dy}{dx} = \\frac{\\frac{dy}{dt}}{\\frac{dx}{dt}} \\ \\ if\\ \\frac{dx}{dt} \\ne 0"} displayMode/></h2>
<h2 class="heading"> <Katex math={" ax + by + c = 0\\ \\ \\ \\ \\ a \\in \\mathbb{z} "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>Parametric equations do not give a relationship between x and y directly in the form <Katex math={"y = f(x)"}/> but use a third variable <Katex math={"\\vartheta"}/>, to do so. This third variable is called the parameter.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p></p>
<p>A curve has the parametric equations <Katex math={"x = t^2"}/> and <Katex math={"y = 2t"}/></p>
<p>1) Find <Katex math={"\\frac{dy}{dx}"}/> in terms of the parameter t.</p>
<p>2) Find the equation of the tangent to the curve at the general point (<Katex math={"t^2"}/>, <Katex math={"2t"}/>)</p>
<p>3) Find the equation of the tangent at the point where <Katex math={"t"}/> = 3</p>
<p>4) Eliminate the parameter, and hence sketch the curve and the tangent at the point where <Katex math={"t"}/> = 3</p>
<p></p>
<p>1) <Katex math={"\\frac{dx}{dt} = 2t \\ \\ \\ \\ \\ \\ \\frac{dy}{dt} = 2"} displayMode/></p>
<p><Katex math={"\\frac{\\frac{dy}{dt}}{\\frac{dx}{dt}} = \\frac{2}{2t} = \\frac1t"} displayMode/></p>
<p></p>
<p></p>
<p>2) <Katex math={"(t^2, 2t) \\ \\ \\ \\ m = \\frac{1}t"} displayMode/></p>
<p><Katex math={"y - y = m(x - x)"} displayMode/></p>
<p><Katex math={"y - 2t = m(x - t^2)"} displayMode/></p>
<p><Katex math={"ty - 2t^2 = x - t^2"} displayMode/></p>
<p><Katex math={"ty - x -t^2 = 0"} displayMode/></p>
<p><Katex math={"t^2 - ty + x = 0"} displayMode/></p>
<p></p>
<p></p>
<p>3) <Katex math={"(3)^2 - 3(y) + x = 0"} displayMode/></p>
<p><Katex math={"9 - 3y + x = 0"} displayMode/></p>
<p><Katex math={"y = \\frac{x}3 + 3"} displayMode/></p>
<p></p>
<p></p>
<p>4) <Katex math={"x = t^2 \\ \\ \\ \\ \\ y = 2t"} displayMode/></p>
<p><Katex math={"x = (\\frac{y}2)^2 \\ \\ \\ \\ \\ \\frac{y}2 = t"} displayMode/></p>
<p><Katex math={"x = \\frac{y^2}{4}"} displayMode/></p>
<p><Katex math={"y^2 = 4x"} displayMode/></p>
<p><Katex math={"when\\ t = 3\\ \\ \\ \\ \\ \\ (9, 6)"} displayMode/></p>
<p><Katex math={"y = \\frac{x}3 + 3"} displayMode/></p>
<img src="/graphs/ParametricEquations0.png" alt="graph">
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p></p>
<p>A curve has parametric equations <Katex math={"x=4\\cos\\vartheta"}/>, <Katex math={"y=3\\sin\\vartheta"}/>.</p>
<p>1) Find <Katex math={"\\frac{dy}{dx}"}/> at the point with parameter <Katex math={"\\vartheta"}/></p>
<p>2) Find the equation of the normal a the general point <Katex math={"(4\\cos\\vartheta, 3\\sin\\vartheta)"}/>.</p>
<p>3) Find the equation of the normal at the point where <Katex math={"\\vartheta = \\frac{\\pi}{4}"}/>.</p>
<p>4) Find the co-ordinates of the point where <Katex math={"\\vartheta = \\frac{\\pi}{4}"}/>.</p>
<p>5) Show the curve and the normal on a sketch</p>
<p></p>
<p>1) <Katex math={"\\frac{dx}{d\\vartheta} = 4\\sin\\vartheta \\ \\ \\ \\ \\ \\ \\frac{dy}{d\\vartheta} = 3\\cos\\vartheta"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = \\frac{\\frac{dy}{d\\vartheta}}{\\frac{dx}{d\\vartheta}} = -\\frac{3\\cos\\vartheta}{4\\sin\\vartheta}"} displayMode/></p>
<p></p>
<p></p>
<p>2) <Katex math={"y - y = m(x - x)"} displayMode/></p>
<p><Katex math={"m\\ of\\ normal = \\frac{4\\sin\\vartheta}{3\\cos\\vartheta}"} displayMode/></p>
<p><Katex math={"\\therefore y - 3\\sin\\vartheta = \\frac{4\\sin\\vartheta}{3\\cos\\vartheta}(x - 4\\cos\\vartheta)"} displayMode/></p>
<p><Katex math={"y - 3\\sin\\vartheta = \\frac{4\\sin\\vartheta}{3\\cos\\vartheta} * - \\frac{16\\sin\\vartheta\\cos\\vartheta}{3\\cos\\vartheta}"} displayMode/></p>
<p><Katex math={"3y\\cos\\vartheta - 9\\sin\\vartheta\\cos\\vartheta = 4x\\sin\\vartheta - 16\\sin\\vartheta\\cos\\vartheta"} displayMode/></p>
<p><Katex math={"3y\\cos\\vartheta + 7\\sin\\vartheta\\cos\\vartheta - 4x\\sin\\vartheta = 0"} displayMode/></p>
<p></p>
<p></p>
<p>3) <Katex math={"\\vartheta = \\frac{\\pi}4"} displayMode/></p>
<p><Katex math={"3y\\cos\\frac{\\pi}{4} + 7\\sin\\frac{\\pi}{4}\\cos\\frac{\\pi}{4} - 4x\\sin\\frac{\\pi}{4} = 0"} displayMode/></p>
<p><Katex math={"3y * \\frac{\\sqrt2}{2} + 7 * \\frac{\\sqrt2}{2} * \\frac{\\sqrt2}{2} - 4x*\\frac{\\sqrt2}{2} = 0"} displayMode/></p>
<p><Katex math={"3y*\\frac{\\sqrt2}{2} + \\frac72 - 4x*\\frac{\\sqrt2}{2} = 0"} displayMode/></p>
<p><Katex math={"\\frac{3y}{\\sqrt{2}} + \\frac72 - \\frac{4x}{\\sqrt{2}} = 0"} displayMode/></p>
<p><Katex math={"3y - 4x + 7\\sqrt{2} = 0"} displayMode/></p>
<p></p>
<p></p>
<p>4) <Katex math={"x = 4\\cos\\frac{\\pi}4\\ \\ \\ \\ \\ \\ y = 3\\sin\\frac{\\pi}4 "} displayMode/></p>
<p><Katex math={"x = 2\\sqrt2 \\ \\ \\ \\ \\ y = \\frac{3\\sqrt2}{2}"} displayMode/></p>
<p><Katex math={"(2\\sqrt2, \\frac{3\\sqrt2}{2})"} displayMode/></p>
<p></p>
<p></p>
<p>5) </p>
<img src="/Attachements/Pastedimage20240311094557.png" alt="diagram">
</div>