<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>MinimumandMaximumProblems</title></svelte:head><div class="note">
   <h1 class="title">Minimum and Maximum Problems</h1>
<p></p>
<h3 class="heading"> <u>To solve maximum and minimum problems:</u></h3>
<p>- Write down the equation of the quantity you are asked to find the max/min value of.</p>
<p>- Write down an equation of an "extra" bit of information you are given.</p>
<p>- Rearrange the second equation and substitute into the first, so there is only one variable in the expression to be maximized or minimized. </p>
<p>- Differentiate and find the stationary point.</p>
<p>- Find the value of the other variable (if necessary) by substitution.</p>
<p>- Check to see if the value(s) is a maximum or minimum using the <Katex math={"2^{nd}"}/> derivative test.</p>
<p></p>
<p></p>
<p>A Farmer has <mark class="hltr-yellow">300m</mark> of fencing to fence a rectangular paddock for sheep. On one side is a river so he only needs three fences. Find the values of x and y so that the paddock has <mark class="hltr-blue">maximum</mark> area.</p>
<p></p>
<p><Katex math={" P = y + 2x = 300"} displayMode/></p>
<p><Katex math={" y = 300 -2x"} displayMode/></p>
<p>Always solve for one variable!</p>
<p></p>
<p>Area = <Katex math={"x*y"}/></p>
<p>Area = <Katex math={"x(300-2x)"}/></p>
<p>A = <Katex math={"300x - 2x^2"}/></p>
<p></p>
<p><Katex math={"\\frac{dA}{dx} = 300 - 4x"} displayMode/></p>
<p><Katex math={" 0 = 300 -4x"} displayMode/></p>
<p><Katex math={" 4x = 300"} displayMode/></p>
<p><Katex math={"x = 75"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"Maximum\\ area = 300(75) - 2(75)^2"} displayMode/></p>
<p><Katex math={" = 11250m^2"} displayMode/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<img src="/Attachements/Pastedimage20230810093917.png" alt="diagram">
<p>The diagram shows a right circular cone with radius 10cm and height 30cm. The cone is initially completely filled with water. Water leaks out of the cone through a small hole at the vertex at a rate of 4cm<Katex math={"^3"}/>s<Katex math={"^{-1}"}/> </p>
<p></p>
<p>1) Show that the volume of water in the cone, V cm<Katex math={"^3"}/>, when the height of the water is h cm is given by the formula <Katex math={"V = \\frac{\\pi h^3}{27}"}/> </p>
<p></p>
<p><Katex math={"By\\ similarity"} displayMode/></p>
<p><Katex math={" \\frac{r}{10} = \\frac{h}{30}"} displayMode/></p>
<p><Katex math={"r = \\frac{10h}{30}"} displayMode/></p>
<p><Katex math={"r = \\frac13h"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"V = \\frac13 \\pi r^2h"} displayMode/></p>
<p><Katex math={" = \\frac13 \\pi (\\frac13h)^2 h"} displayMode/></p>
<p><Katex math={" = \\frac{\\pi h^3}{27}"} displayMode/></p>
<p>2) Find the rate of change of h when h = 20</p>
<p></p>
<p><Katex math={" \\frac{dV}{dt} = 4cm^3/s"} displayMode/></p>
<p><Katex math={"Find\\ \\frac{dh}{dt}"} displayMode/></p>
<p><Katex math={" \\frac{dh}{dt} = \\frac{dh}{dV} * \\frac{dV}{dt}"} displayMode/></p>
<p><Katex math={" V = \\frac{\\pi h^3}{27}"} displayMode/></p>
<p><Katex math={"\\frac{dV}{dh} = \\frac{3\\pi}{27}h^2 = \\frac{\\pi}9 h^2 = \\frac{\\pi}9(400) = \\frac{400\\pi}9"} displayMode/></p>
<p><Katex math={"\\therefore \\frac{dh}{dV} = \\frac{9}{400\\pi} "} displayMode/></p>
<p><Katex math={"\\frac{dh}{dt} = \\frac{dh}{dV} * \\frac{dV}{dt} = \\frac{9}{400\\pi} * 4"} displayMode/></p>
<p><Katex math={" = \\frac9{100\\pi} "} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p>A farmer wants to construct 3 pens for his pigs as shown</p>
<img src="/Attachements/Pastedimage20230810152312.png" alt="diagram">
<p>Each pen has the same width, x. The farmer has 36m of material to make the pens. Find the dimensions of each pen so that the area of each pen is a maximum.</p>
<p></p>
<p><Katex math={" Perimeter = 6x+4y = 36"} displayMode/></p>
<p><Katex math={" Area = x*y"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"y = \\frac{36-6x}{4}"} displayMode/></p>
<p><Katex math={"y = 9-\\frac32 x"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"sub\\ into\\ Area\\ equation = x(9-\\frac32 x) = 9x-\\frac32 x^2"} displayMode/></p>
<p><Katex math={"\\frac{dA}{dx} = -3x+9"} displayMode/></p>
<p><Katex math={"\\frac{dA}{dx} = 0 = -3x+9"} displayMode/></p>
<p><Katex math={"-9 = -3x"} displayMode/></p>
<p><Katex math={"x = 3"} displayMode/></p>
<p><Katex math={"sub\\ into\\ Perimeter\\ equation = 6(3) + 4y = 36"} displayMode/></p>
<p><Katex math={"  4y = 18"} displayMode/></p>
<p><Katex math={"y = 4.5"} displayMode/></p>
<p><Katex math={"Answer: 3m * 4.5m"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p>The diagram shows a glass window frame consisting of a rectangle of width x m and height y m and equilateral triangle on top of the rectangle. The perimeter of the window is 10m.</p>
<img src="/Attachements/Pastedimage20230810161914.png" alt="diagram">
<p>1) Show that the height h, of the equilateral triangle is <Katex math={"\\frac{\\sqrt3}{2}x"}/></p>
<p><Katex math={"h^2 + (\\frac{x}2)^2 = x^2"} displayMode/></p>
<p><Katex math={"h^2 = x^2 - \\frac{x^2}4"} displayMode/></p>
<p><Katex math={"h = \\frac{\\sqrt3}2 x"} displayMode/></p>
<p></p>
<p>2) Show that the area of the window frame, <Katex math={"Am^2"}/>, is given by <Katex math={"A = 5x + \\frac{\\sqrt3 - 6}{4}x^2"}/></p>
<p><Katex math={"xy + \\frac{\\sqrt3}2x * \\frac{x}2 = A"} displayMode/></p>
<p><Katex math={"x(\\frac{10-3x}{2}) + \\frac{\\sqrt3}{2}x * \\frac{x}2 = A"} displayMode/></p>
<p><Katex math={"x(\\frac{10-3x}{2}) + \\frac{\\sqrt3x^2}4 = A"} displayMode/></p>
<p><Katex math={"\\frac{10x - 3x^2}2 + \\frac{\\sqrt3 x^2}4 = A"} displayMode/></p>
<p><Katex math={"\\frac{20x - 6x^2}4 + \\frac{\\sqrt3 x^2}4 = A"} displayMode/></p>
<p><Katex math={" \\frac{(\\sqrt3 - 6)x^2 + 20x}4 = A"} displayMode/></p>
<p><Katex math={"\\frac{\\sqrt3 - 6}4 x^2 + 5x = A"} displayMode/></p>
<p></p>
<p>3) Given that x can vary. Find the value of x for which A has a stationary value.</p>
<p><Katex math={"\\frac{\\sqrt3 - 6}4 x^2 + 5x = A"} displayMode/></p>
<p><Katex math={" = \\frac14 x^2(\\sqrt3 - 6)"} displayMode/></p>
<p><Katex math={"\\frac{dA}{dx} = \\frac12 x (\\sqrt3 - 6)"} displayMode/></p>
<p><Katex math={"\\frac{\\sqrt3 - 6}2 x + 5 = 0"} displayMode/></p>
<p><Katex math={"x = \\frac{-5}{\\frac{\\sqrt3 - 6}{2}} = 2.34m\\ (3sf)"} displayMode/></p>
<p></p>
<p>4) Determine whether the stationary value is a maximum or a minimum.</p>
<p><Katex math={"\\frac{d^2A}{dx^2} = \\frac {\\sqrt3 - 6}2 < 0"} displayMode/></p>
<p><Katex math={"\\therefore stationary\\ point\\ is\\ a\\ maximum"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>